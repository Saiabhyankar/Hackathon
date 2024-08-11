from flask import request,jsonify
from sqlalchemy import or_,text
from config import db,app
from models import Place
from datetime import datetime



@app.route("/")
def check():
    return "Hi"
@app.route("/add",methods=['POST'])
def addToTable():
    current_time = datetime.now()
    _id=request.json.get("id")
    _token=request.json.get("token")
    pixelGrid=Place(
        id=_id,
        isFilled='true',
        filledTime=current_time,
        token=_token
    )
    db.session.add(pixelGrid)
    db.session.commit()
    return("Done")
@app.route("/checkTurn",methods=['POST'])
def checkTurn():
    userToken=request.json.get("token")
    time=request.json.get("time")
    query=text("Select filledTime from Place Where token=:userToken")
    params={"userToken":userToken}
    results=db.session.execute(query,params=params)
    for result in results:
            _time=result[0]
            return (str(type(_time)))
            # if(_time<time):
            #      return jsonify({"method":"possible"})
    return jsonify({"method":"not Possible"})
if(__name__=='__main__'):
    with app.app_context():
        db.create_all()
    app.run(debug=True)