from flask import render_template
from app import app
from models.customer_orders import orders

@app.route('/')
def index():
    return "Welcome to our shop"

@app.route('/orders')
def show_orders():
    return render_template('index.html', title="Orders", orders=orders)

