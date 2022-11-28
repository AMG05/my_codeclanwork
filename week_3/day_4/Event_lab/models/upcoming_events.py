from models.event import Event

event1 = Event('12 December', 'Christmas concert', 5, 'Ballroom', 'Music')
event2 = Event('1 January', 'New Year Party', 15, 'Radisson', 'Dance')
event3 = Event('3 December', 'Panto', 20, 'Kings', 'Comedy show')

events=[event1, event2, event3]

def add_event(event):
    events.append(event)

