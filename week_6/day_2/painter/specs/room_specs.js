const assert = require('assert');
const Room = require('../room.js');

describe('Room', function(){
    let room;
    this.beforeEach(function(){
        room = new Room(16, false)
    })
    
    it('should have an area in square meters',function(){
        const actual = room.area;
        assert.strictEqual(actual, 16);
    });

    it('should start not painted', function(){
        const actual = room.painted;
        assert.strictEqual(actual, false);
    });

    it('should be able to be painted', function(){
        room.paintRoom();
        const actual = room.painted;
        assert.strictEqual(actual, true);
    })
    
})