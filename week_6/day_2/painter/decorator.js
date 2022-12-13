const Paint = require('./paint.js');


const Decorator = function(name){
    this.name = name;
    this.stock = [];
}

Decorator.prototype.numberOfPaintPots = function (){
    return this.stock.length;
}

Decorator.prototype.addPaint = function(paint){
    return this.stock.push(paint);
}

Decorator.prototype.totalLitres = function(){
    let result = 0
    for (let paint of this.stock){
        result += paint.litres
    }
    return result
}

module.exports = Decorator;