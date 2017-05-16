# How to run server

### run server
in one terminal window run:
```sh
$ cd /path/to/this/project/eet;
$ mvn spring-boot:run;
```
-> server is running on port 8090
-> port can be changed in src/main/properties/application.properties

### init DB with data
in another terminal window run:
```sh
$ cd /path/to/this/project/eet/;
$ sh initdb.sh
```
DB will be initialized with tje following data: 

### Customers
```sh
curl -X POST -H "Content-Type:application/json" -d '{ "firstName" : "Karl", "lastName" : "Penzhorn" }' localhost:8090/customers;
curl -X POST -H "Content-Type:application/json" -d '{ "firstName" : "Zuza", "lastName" : "Hrusovska" }' localhost:8090/customers;
```
### Products
```sh
curl -X POST -H "Content-Type:application/json" -d '{ "name" : "eetPRO", "price" : "5000" }' localhost:8090/products;
curl -X POST -H "Content-Type:application/json" -d '{ "name" : "product1", "price" : "1000" }' localhost:8090/products;
curl -X POST -H "Content-Type:application/json" -d '{ "name" : "product2", "price" : "1500" }' localhost:8090/products;
curl -X POST -H "Content-Type:application/json" -d '{ "name" : "product3", "price" : "1800" }' localhost:8090/products;
```
### Invoices
```sh
curl -X POST -H "Content-Type:application/json" -d '{ "customer" : "http://localhost:8090/customers/1", "product" : "http://localhost:8090/products/1", "date" : "2016-11-21" }' localhost:8090/invoices;
curl -X POST -H "Content-Type:application/json" -d '{ "customer" : "http://localhost:8090/customers/2", "product" : "http://localhost:8090/products/3", "date" : "2011-11-21" }' localhost:8090/invoices;
```

# Entity objects

### Customer
- id
- firstName, lastName
- email 

### Invoice
- id
- customer
- product
- datetime

### Product
- name
- price

# REST API

## Crude repostiory
All the enities, mentioned above, implement Rest Crude reporsitory http://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html.
So you can use methods specified in the link.
e.g.: return all the invoices in the system, ...
```sh
$  curl -X GET  localhost:8090/invoices
$  curl -X GET  localhost:8090/persons
$  curl -X GET  localhost:8090/products
```
## Standard resources
## Invoice resource - process 1 Reclamation - is invoice still in reclamation time:
Reclamation period is 2 years. Invoice 1 is ibn, invoice 2 is not.

path:
```sh
curl -X GET localhost:8090/invoices/isInReclamationTime?idInvoice=INVOCIE_ID;
curl -X GET localhost:8090/invoices/INVOCIE_ID/isInReclamationTime;
```

example: 2 options
```sh
curl -X GET localhost:8090/invoices/isInReclamationTime?idInvoice=2;
curl -X GET localhost:8090/invoices/2/isInReclamationTime;
```
## Best solution resource
under construction

