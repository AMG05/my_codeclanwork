use zoo;

//Reading from db

const id = ObjectId('63c55a64a6ace49b9ed16b36');
db.animals.findOne({_id: id})


//Update entry

db.animals.updateOne(
    {_id: ObjectId('63c55a64a6ace49b9ed16b37')},
    {$set:{name:"Anne"}}
)

db.animals.findOne({_id: ObjectId('63c55a64a6ace49b9ed16b37')})

//Delete entry

db.animals.deleteOne({_id: ObjectId('63c55a64a6ace49b9ed16b37')})