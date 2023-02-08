use birds;
db.dropDatabase();

db.sightings.insertMany([
  {
    name: "Faisal",
    email: "Sutherland",
    checkedin: "yes"
  },
  {
    name: "Bob",
    email: "Bob",
    checkedin: "no"
  },
  
]);
