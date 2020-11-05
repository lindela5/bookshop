CREATE TABLE publishing_house
(
    publishing_house_id       int          NOT NULL,
    name_publisher VARCHAR(100) NOT NULL,
    address  VARCHAR(100),
    PRIMARY KEY (publishing_house_id)
);
GO

ALTER TABLE publishing_house
   ADD CONSTRAINT FK_books_publishing_house_id unique (name_publisher)
GO

