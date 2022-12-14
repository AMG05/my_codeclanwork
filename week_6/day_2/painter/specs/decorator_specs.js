const assert = require('assert');
const Decorator = require('../decorator.js');
const Paint = require('../paint.js');

describe('Decorator', function(){
    let decorator;
    this.beforeEach(function(){
        decorator = new Decorator('Jack');
    })
    
describe('paint stock', function(){
    it('should start with no stock', function(){
        const actual = decorator.stock;
        assert.deepStrictEqual(actual, []);
    })
    it('should be return the number of paint pots', function(){
        const actual = decorator.numberOfPaintPots();
        assert.strictEqual(actual, 0)
    })
    it('should add a paint pot', function(){
        paint1 = Paint(20)
        decorator.addPaint(paint1);
        const actual = decorator.numberOfPaintPots();
        assert.strictEqual(actual, 1)
    })
    it('should add up litres in stock', function(){
            let paint1 = new Paint(20)
            decorator.addPaint(paint1);
            let paint2 = new Paint(15)
            decorator.addPaint(paint2);
            const actual = decorator.totalLitres();  
            assert.strictEqual(actual, 35);
        })
    })
})
});
