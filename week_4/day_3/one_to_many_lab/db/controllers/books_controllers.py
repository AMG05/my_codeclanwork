from flask import render_template, Blueprint
from repositories import author_repository, book_repository
from models.book import Book
import pdb

book_blueprint = Blueprint("books", __name__)

#INDEX
#GET '/tasks'
@book_blueprint.route('/books')
def books():
    all_books_list = book_repository.select_all()
    return render_template('books/index.html', all_books_key=all_books_list)