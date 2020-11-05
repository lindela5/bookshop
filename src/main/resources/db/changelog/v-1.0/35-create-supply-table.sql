 CREATE TABLE supply(
    supply_id         int NOT NULL,
    supplier_id   int NOT NULL,
    supply_date date ,
    supplier_price    DECIMAL NOT NULL,
    PRIMARY KEY (supply_id)
);
GO

ALTER TABLE supply
    ADD CONSTRAINT FK_supply_supplier_id
        FOREIGN KEY (supplier_id) REFERENCES supplier(id);
GO




