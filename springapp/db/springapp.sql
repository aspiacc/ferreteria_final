GRANT ALL ON springapp.* TO root@'%' IDENTIFIED BY 'admin';
GRANT ALL ON springapp.* TO root@localhost IDENTIFIED BY 'admin';

USE springapp;

CREATE TABLE products (
  id INTEGER PRIMARY KEY,
  description varchar(255),
  price decimal(15,2)
);
CREATE INDEX products_description ON products(description);