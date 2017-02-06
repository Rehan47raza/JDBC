
create table TBL_1190848_EMPLOYEE(
EMPLOYEE_ID Integer not null,
EMPLOYEE_NAME varchar2(256),
GENDER varchar2(256),
DESIGNATION varchar2(256),
EMAIL varchar2(256),
Primary key(EMPLOYEE_ID)
);

DROP TABLE TBL_1190848;
SELECT * FROM TBL_1190848_EMPLOYEE;
INSERT INTO TBL_1190848_EMPLOYEE VALUES(1,'abc','M','ASE','abc@xyz.com');
INSERT INTO TBL_1190848_EMPLOYEE VALUES(2,'abcde','F','ASE','abc@xyz.com');


CREATE TABLE Test_1190848
(
empId Integer not null,
empName varchar2(256),
gender varchar2(256),
desig varchar2(256),
email varchar2(256),
Primary key(empId)
);
DESC Test_1190848;

CREATE TABLE tbl_test_1190848(
test_id NUMBER(5) PRIMARY KEY,
test_name VARCHAR(100)
);

SELECT * FROM tbl_test_1190848 WHERE (TEST_ID>2);
INSERT INTO Test_1190848 VALUES(1,'Rehan');
INSERT INTO tbl_test_1190848 VALUES(1,'Rehan');

INSERT INTO tbl_test_1190848 VALUES(2,'Raza');
INSERT INTO tbl_test_1190848 VALUES(3,'Nikhil');
INSERT INTO tbl_test_1190848 VALUES(4,'Ajay');
INSERT INTO tbl_test_1190848 VALUES(5,'Abhishek');
INSERT INTO tbl_test_1190848 VALUES(6,'Abhishek');
SELECT count(*) FROM tbl_test_1190848;

