-- SQL script to create Book Table -- 
CREATE TABLE books (
  id int NOT NULL,
  book_name varchar(250) DEFAULT NULL,
  book_author varchar(250) DEFAULT NULL,
  expected_return_date datetime(6) DEFAULT NULL,
  receiver_name varchar(255) DEFAULT NULL,
  delet_status int DEFAULT NULL,
  description varchar(255) DEFAULT NULL,
  gener_id int DEFAULT NULL,
  isbn int DEFAULT NULL,
  language varchar(255) DEFAULT NULL,
  status int DEFAULT NULL,
  user_id int DEFAULT NULL,
  PRIMARY KEY (id)
);

-- SQL script to create Borrowedbooks Table -- 
CREATE TABLE borrowedbooks (
  id int NOT NULL,
  book_id int DEFAULT NULL,
  book_return_status varchar(255) DEFAULT NULL,
  borrow_from varchar(255) DEFAULT NULL,
  date datetime(6) DEFAULT NULL,
  due_date datetime(6) DEFAULT NULL,
  phone_no int DEFAULT NULL,
  user_id int DEFAULT NULL,
  PRIMARY KEY (id)
); 

-- SQL script to create Gener Table -- 
CREATE TABLE gener (
  id int NOT NULL,
  gener_name varchar(255) DEFAULT NULL,
  gener_status int DEFAULT NULL,
  PRIMARY KEY (id)
);

-- SQL script to create LentBooks Table -- 
CREATE TABLE lentbook (
  id int NOT NULL,
  book_return_status varchar(255) DEFAULT NULL,
  date datetime(6) DEFAULT NULL,
  due_date datetime(6) DEFAULT NULL,
  lent_to varchar(255) DEFAULT NULL,
  phone_no int DEFAULT NULL,
  user_id int DEFAULT NULL,
  book_id int DEFAULT NULL,
  PRIMARY KEY (id)
);

-- SQL script to create Login Table -- 
CREATE TABLE login (
  id int NOT NULL,
  email varchar(255) DEFAULT NULL,
  first_name varchar(255) DEFAULT NULL,
  last_name varchar(255) DEFAULT NULL,
  password varchar(255) DEFAULT NULL,
  phone_number int DEFAULT NULL,
  PRIMARY KEY (id)
);