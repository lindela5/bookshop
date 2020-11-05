ALTER TABLE author_book
   DROP CONSTRAINT FK_author_books_books_id
GO

ALTER TABLE author_book
   DROP CONSTRAINT FK_author_books_author_id
GO

DROP TABLE IF EXISTS author_book CASCADE;
GO