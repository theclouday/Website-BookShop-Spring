"use strict";

function fetchBooks() {
    fetch('/api/v1/all_books')
        .then(response => response.json())
        .then(books => displayBooks(books))
        .catch(error => console.error('Error fetching books:', error));
}

function displayBooks(books) {
    var bookList = document.getElementById('bookList');
    books.forEach(function(book) {
        var listItem = document.createElement('li');
        listItem.textContent = book.title + ' by ' + book.author + ', year of issue - ' + book.yearOfIssue + '. ' + 'Description: ' + book.description + '.';
        bookList.appendChild(listItem);
    });
}

fetchBooks();