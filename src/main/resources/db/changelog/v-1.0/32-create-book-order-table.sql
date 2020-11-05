CREATE TABLE book_order(
	order_id int,
	book_id int,
    quantity int
);
GO

ALTER TABLE     book_order
    ADD CONSTRAINT  FK_book_order_book_id
    FOREIGN KEY (book_id) REFERENCES books
GO

ALTER TABLE  book_order
    ADD CONSTRAINT FK_book_order_order_id
    FOREIGN KEY (order_id) REFERENCES orders
GO

