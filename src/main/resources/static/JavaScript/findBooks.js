"use strict";

// Find by Author name
document.getElementById("searchFormByAuthor").addEventListener("submit", function(event) {
    event.preventDefault(); 

    var author = document.getElementById("author").value;
    fetch("/api/v1/find_book/by_author/" + author)
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(books => displayBooks(books))
        .catch(error => console.error('Error:', error));
});

function displayBooks(books) {
    var bookListAuthor = document.getElementById("bookListAuthor");
    bookListAuthor.innerHTML = "";

    if (books.length > 0) {
        var ul = document.createElement("ul");
        books.forEach(function(book) {
            var li = document.createElement("li");
            li.textContent = book.title + " by " + book.author;
            ul.appendChild(li);
        });
        bookListAuthor.appendChild(ul);
    } else {
        bookListAuthor.textContent = "No books found";
    }
}

// Find by ID 
document.getElementById("searchFormById").addEventListener("submit", function(event) {
    event.preventDefault();

    var bookId = document.getElementById("bookId").value;
    fetch("/api/v1/find_book/by_id/" + bookId)
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(books => displayBooksById(books))
        .catch(error => console.error('Error:', error));
});

function displayBooksById(books) {
    var bookListById = document.getElementById("bookListId");
    bookListById.innerHTML = ""; 

    if (books.length > 0) {
        var ul = document.createElement("ul");
        books.forEach(function(book) {
            var li = document.createElement("li");
            li.textContent = book.title + " by " + book.author;
            ul.appendChild(li);
        });
        bookListById.appendChild(ul);
    } else {
        bookListById.textContent = "No books found";
    }
}