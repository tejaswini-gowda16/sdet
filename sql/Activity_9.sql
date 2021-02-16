REM   Script: Activity_9
REM   Activity_9

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert all 
into customers values (3002, 'Nick Rimando', 'New York', 100, 5001)  
into customers values (3007, 'Brad Davis', 'New York', 200, 5001) 
into customers values (3005, 'Graham Zusi', 'California', 200, 5002)  
into customers values (3008, 'Julian Green', 'London', 300, 5002) 
into customers values (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
into customers values (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
into customers values (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

SELECT a.customer_name, b.SALESMAN_NAME FROM customers a INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.grade, b.salesman_name FROM customers a LEFT OUTER JOIN salesman b ON 
a.salesman_id=b.salesman_id where a.grade<300 order by customer_id asc;

SELECT a.customer_name, b.salesman_name, b.commission FROM customers a INNER JOIN salesman b ON a.salesman_id=b.salesman_id and b.commission>12;

select ORDER_NO, ORDER_DATE, PURCHASE_AMOUNT, c.customer_name, s.SALESMAN_NAME, s.commission from orders o
INNER JOIN customers c ON o.customer_id=c.customer_id
INNER JOIN salesman s ON o.salesman_id=s.salesman_id;
