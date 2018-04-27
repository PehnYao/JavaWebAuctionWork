Create DATABASE auction;
Create Table goods(
    id Int Identity(1,1) Not Null,
    price Int Not NUll,
    Primary Key(id)
)
Create Table user(
    id int Identity(1,1) Not Null,
    password int Not Null,
    Primary Key(id)
)
