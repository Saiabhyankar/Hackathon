from config import db

class Place(db.Model):
    id=db.Column(db.Integer,primary_key=True)
    isFilled=db.Column(db.String(15),default='False')
    filledTime=db.Column(db.Time)
    token=db.Column(db.String(255))
    