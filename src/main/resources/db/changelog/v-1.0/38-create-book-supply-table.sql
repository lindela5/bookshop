CREATE TABLE book_supply(
	supply_id int,
	book_id int,
    quantity int
);
GO

ALTER TABLE     book_supply
    ADD CONSTRAINT  FK_book_supply_book_id
    FOREIGN KEY (book_id) REFERENCES books
GO

ALTER TABLE  book_supply
    ADD CONSTRAINT FK_book_supply_supply_id
    FOREIGN KEY (supply_id) REFERENCES supply
GO