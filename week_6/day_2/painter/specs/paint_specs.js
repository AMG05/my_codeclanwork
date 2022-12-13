const assert = require('assert');
const Paint = require('../paint.js');

describe('Paint', function(){
    let paint;
    this.beforeEach(function(){
        paint = new Paint(10)
    })

    it('should have a number of litres of paint', function(){
        const actual = paint.litres;
        assert.strictEqual(actual, 10);
    })

    it('should check it is empty', function(){
        const actual = paint.checkIfEmpty();
        assert.strictEqual(actual, 'This is full');
    })

    it('should be able to empty itself of paint', function(){
        paint.emptyItself()
        const actual = paint.checkIfEmpty();
        assert.strictEqual(actual, "This pot is empty");
    })
})

