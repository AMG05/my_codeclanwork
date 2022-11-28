from flask import render_template, request
from models.upcoming_events import events, add_event
from models.event import Event
from app import app

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/events')
def all_events():
    return render_template('events.html', events=events)

@app.route('/events/new')
def new_event():
    return render_template('new_event.html')

@app.route('/events', methods=['POST'])
def save_event():
    form_data = request.form
    event_date = form_data['event_date']
    event_name = form_data['event_name']
    number_of_guests = form_data['number_of_guests']
    event_location = form_data['event_location']
    event_description = form_data['event_description']

    new_event = Event(event_date, event_name, number_of_guests,event_location, event_description)
    add_event(new_event)
    return render_template('events.html', events=events)



