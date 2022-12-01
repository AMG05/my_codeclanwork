from models.author import Author
from models.book import Book

from repositories import author_repository
from repositories import book_repository

author1=Author("Emily Bronte")
author_repository.save(author1)

author2=Author("Thomas Hardy")
author_repository.save(author2)



book1=Book("Rebecca", 5, author1)
book_repository.save(book1)
book2=Book("The Mayor", 7, author1)
book_repository.save(book2)


author_repository.select_all()
book_repository.select_all()

