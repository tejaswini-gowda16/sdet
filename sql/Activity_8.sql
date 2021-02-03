REM   Script: Activity_8
REM   Activity_8

select CUSTOMER_ID, MAX(PURCHASE_AMOUNT) as "Max Purchase By a Customer" from orders group by CUSTOMER_ID;

select SALESMAN_ID, MAX(PURCHASE_AMOUNT) as "Max Purchase on this day" from orders where order_date=To_DATE('2012/08/17', 'YYYY/MM/DD')
group by SALESMAN_ID;

select CUSTOMER_ID, ORDER_DATE, MAX(PURCHASE_AMOUNT) from orders GROUP BY customer_id, order_date
having MAX(PURCHASE_AMOUNT) in (2030, 3450, 5760, 6000);

