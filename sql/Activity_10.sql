REM   Script: Activity_10
REM   Activity_10


SELECT * FROM orders WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

SELECT COUNT(*) FROM customers where grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT * FROM orders WHERE salesman_id IN( SELECT salesman_id FROM salesman WHERE commission=( SELECT MAX(commission) FROM salesman));

