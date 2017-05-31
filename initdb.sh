curl -X POST -H "Content-Type:application/json" -d '{ "firstName" : "Karl", "lastName" : "Penzhorn", "email" : "email1@email.com" }' localhost:8090/customers;
curl -X POST -H "Content-Type:application/json" -d '{ "firstName" : "Zuza", "lastName" : "Hrusovska", "email" : "email1@email.com" }' localhost:8090/customers;
curl -X POST -H "Content-Type:application/json" -d '{ "name" : "eetPRO", "price" : "5000" }' localhost:8090/products;
curl -X POST -H "Content-Type:application/json" -d '{ "name" : "product1", "price" : "1000" }' localhost:8090/products;
curl -X POST -H "Content-Type:application/json" -d '{ "name" : "product2", "price" : "1500" }' localhost:8090/products;
curl -X POST -H "Content-Type:application/json" -d '{ "name" : "product3", "price" : "1800" }' localhost:8090/products;
curl -X POST -H "Content-Type:application/json" -d '{ "customer" : "http://localhost:8090/customers/1", "product" : "http://localhost:8090/products/1", "date" : "2016-11-21" }' localhost:8090/invoices;
curl -X POST -H "Content-Type:application/json" -d '{ "customer" : "http://localhost:8090/customers/2", "product" : "http://localhost:8090/products/3", "date" : "2011-11-21" }' localhost:8090/invoices;

