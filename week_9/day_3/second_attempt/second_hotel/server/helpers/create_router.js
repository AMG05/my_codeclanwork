const express = require('express');
const ObjectID = require('mongodb').ObjectID;

const createRouter = function (collection) {

  const router = express.Router();

  //Handle index route

  router.get('/', (req, res) => {
    collection
      .find()
      .toArray()
      .then((docs) => res.json(docs))
      .catch((err) => {
        console.error(err);
        res.status(500);
        res.json({ status: 500, error: err });
      });
  });

  //Handle show( individual sighting) route

  router.get('/:id', (req, res) => {
    const id = req.params.id;
    collection
      .findOne({ _id: ObjectID(id) })
      .then((doc) => res.json(doc))
      .catch((err) => {
        console.error(err);
        res.status(500);
        res.json({ status: 500, error: err });
      });
  });

  //Handle the POST (create) request

  router.post('/', (req, res) => {
    const newSightingData = req.body;

    collection
      .insertOne(newSightingData)
        .then(result => {
          res.json(result.ops[0])
        })
        .catch(error => {
          console.error(error);
          res.status(500);
          res.json({ status:500, error: error})
        });

  });

  //Handle delete method

  router.delete('/:id', (req, res) => {
    const id = req.params.id;
    collection
      .deleteOne({ _id: ObjectID(id)})
        .then(result => res.json(result))
          .catch(error => {
            res.status(500);
              res.json({ status: 500, error: error});
          });
  });

  return router;
};

module.exports = createRouter;
