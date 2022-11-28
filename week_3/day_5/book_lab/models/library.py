from models.book import Book

book1 = Book("The Night Ship", "Jess Kidd", "Historical")
book2 = Book("The Midnight Library", "Matt Haig", "Fiction")
book3 = Book("Bluey christmas special", "Bluey", "Children's Fiction")

books=[book1, book2, book3]

def get_book(book_index):
    return books[book_index]

def add_book(book):
    books.append(book)



# def delete_book(book_name):
#     book_to_delete = None
#     for book in books:
#         if book.name == book_name:
#             book_to_delete = book
#             break

#     books.remove(book_to_delete)
