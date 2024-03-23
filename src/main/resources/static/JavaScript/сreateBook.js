"use strict";

document.getElementById("createBook").addEventListener("submit", function(event) {
    event.preventDefault();
    var formData = {
        title: document.getElementById("title").value,
        author: document.getElementById("author").value,
        description: document.getElementById("description").value,
        year: document.getElementById("year").value
    };

    fetch("/api/v1/create_books", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(formData)})
    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return response.json();
    })
    .then(data => {
        console.log("Book created successfully:", data);
    })
    .catch(error => {
        console.error('Error:', error);
    });
});