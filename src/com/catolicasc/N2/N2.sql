create table Category (CategoryID integer, CategoryName varchar(50), Description varchar(50), Primary key (CategoryID));

create table Product (ProductID integer, ProductName varchar(50), CategoryID integer, QuantityPerUnit integer, UnitPrice float(2), Primary key(ProductID));
