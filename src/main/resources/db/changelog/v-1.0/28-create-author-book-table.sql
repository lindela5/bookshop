CREATE TABLE author_book(
	book_id int,
    author_id int
);
GO

ALTER TABLE     author_book
    ADD CONSTRAINT  FK_author_books_author_id
    FOREIGN KEY (author_id) REFERENCES author
GO

ALTER TABLE  author_book
    ADD CONSTRAINT FK_author_books_books_id
    FOREIGN KEY (book_id) REFERENCES books
GO