const Taxi = function(manufacturer, model, driver){
    this.manufacturer = manufacturer;
    this.model = model;
    this.driver = driver;
    this.passenger = [];
}


Taxi.prototype.numberOfPassengers = function(){
    return this.numberOfPassengers.length;
}

Taxi.prototype.addPassenger = function(){
    this.passenger.push(passenger)
}

Taxi.prototype.removePassengerByName = function(name){
    const indexOfPassenger = this.passengers.indexOf(name);
    this.passenger.splice(indexOfPassenger, 1)
}

Taxi.prototype.removeAllPassengers = function(){
    this.passengers.splice(0, this.numberOfPassengers())
}
module.exports = Taxi;