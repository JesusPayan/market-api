-------------------------
#CREATE A NEW DATABASE
create database marketapi;
-------------------------
#CREATE USE A CREATED DATABASE
use marketapi;
------------------------------------------------
#CRATE A NEW TABLE
CREATE TABLE CATEGORIES(category_id SERIAL NOT NULL, category_description VARCHAR (45)NOT NULL,category_state BOOLEAN NOT NULL, PRIMARY KEY (category_id)); 
------------------------------------------------
#ADDING NEW ROW TO THE TABLE
INSERT INTO CATEGORIES (category_description, category_state) VALUES("Lacteos",true);
------------------------------------------------
#DISPLAY TABLE DATA
select * from CATEGORIES;
------------------------------------------------
#DELETE A TABLE FROM THE DATABASE
#drop table CATEGORIES;


CREATE TABLE  PRODUCTS (product_id SERIAL NOT NULL,product_name VARCHAR(45) NULL,category_id INT NOT NULL,product_barcode VARCHAR(150) NULL, sold_price DECIMAL(16,2) NULL,  products_stock INT NOT NULL,  product_status BOOLEAN NULL,  PRIMARY KEY (product_id),  CONSTRAINT fk_CATEGORY_PRODUCTS   FOREIGN KEY (category_id) REFERENCES CATEGORIES (category_id) ON DELETE NO ACTION ON UPDATE NO ACTION);