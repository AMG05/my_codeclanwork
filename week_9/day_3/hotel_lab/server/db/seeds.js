use hotel;
db.dropDatabase();

db.bookings.insertMany([
  {
    guest_name: "Anne McGinness",
    email_address: "amazingatreact@gmail.com",
    checkedIn: false
  },
  {
    guest_name: "Lucas Meechan",
    email_address: "lucas@gmail.com",
    checkedIn: true
  }
]);