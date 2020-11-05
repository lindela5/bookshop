CREATE TABLE books (
    book_id  int NOT NULL,
    title  VARCHAR(100) NOT NULL,
    isbn   VARCHAR(100),
    section_id int NOT NULL,
    year_of_issue int ,
    publishing_house_id int NOT NULL,
    price     DECIMAL,
    stock_balances int,
    PRIMARY KEY (book_id)
);
GO


   ALTER TABLE books
   ADD CONSTRAINT FK_books_publishing_house_id
   FOREIGN KEY (publishing_house_id)
   REFERENCES publishing_house
GO

ALTER TABLE books
   ADD CONSTRAINT FK_books_sections_id
   FOREIGN KEY (section_id)
   REFERENCES sections
GO

