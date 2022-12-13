const Paint = function(litres){
    this.litres = litres;
    this.empty = false;
}


Paint.prototype.checkIfEmpty = function(){
    if (this.empty === true){
        return ('This pot is empty');
    }
    else {
        return ('This is full');
    }
}

Paint.prototype.emptyItself = function(){
    return this.empty = true;
}
module.exports = Paint;