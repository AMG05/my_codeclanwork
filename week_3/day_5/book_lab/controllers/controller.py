from flask import render_template, request
from models.library import books, get_book, add_book
from models.book import Book
from app import app
import pdb

@app.route('/')
def library():
    return render_template('library.html', books=books)

@app.route('/library/<int:book_index>')
def book(book_index):
    my_book = get_book(book_index)
    return render_template('book.html', book=my_book)

@app.route('/books/new')
def new_book():
    return render_template('new_book.html')

@app.route('/books', methods =['POST'])
def save_book():
    form_data = request.form
    book_title=form_data['book_title']
    book_author=form_data['book_author']
    book_genre=form_data['book_genre']
    new_book = Book(book_title, book_author, book_genre)
    add_book(new_book)

    return render_template('library.html', books=books)

# @app.route('/books/delete/<name>', methods=['POST'])
# def delete(name):
#   delete_book(name)

#   return redirect('/books')