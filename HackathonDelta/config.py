from flask import Flask
from flask_socketio import SocketIO, emit
from flask_sqlalchemy import SQLAlchemy

from flask_cors import CORS

app= Flask(__name__)

CORS(app)

app.config["SQLALCHEMY_DATABASE_URI"]="mysql+pymysql://root:saiabhi123@localhost:3306/DPlace"
app.config["SQLALCHEMY_TRACK_MODIFICATIONS"]=False

db=SQLAlchemy(app)


