# Introduce myself
Hi, my name is Tianyuan Deng. I am software engineer. After spending 4 years as a undergraduate in Computer Science and earning a Minor in Information Security, I developed a strong programming skills from theories to work, which effectively reduce development time.

As a web developer, I pay attention on details. I believe it's important for me to keep reviewing works I have done and to maintain a good feeling, habit, or style of writing code.  

## JDBC API
Java database connectivity is an API for connecting to a RDBMS such as **postgreSQL** 

In order to make a connection to database, we need to have a DriverManager
Connection connection = DriverManager.getConnection(url, username, password)

## SQL
### Candidate Key
- A column that can uniquely identify a row and thus is a potential candidate for a primary key
### Composite Key 
- A primary key consisting of multiple columns
### Primary Key
- Unique (in that table), non-null candidate key.
### Foreign Key 
- A key that points to another primary key of a row (either in another table, or the same).

## Normalization

- 1stNF no duplication
- 2ndNF no Partial dependencies
- 3rdNF no transitive dependencies

## DDL
Data definition language
- Create 
- Alter 
- Drop 
- Truncate

## DML
Data manipulation language
- Insert
- Update
- Delete

## DQL
Data query language
- Selete
- Where

## Java Wrapper class definition 
Wrapper class is like a container for primatitive data.
We can wrap a primitive value into a wrapper class.
They convert primitive data types into object.
For example ArrayList store only objects and not primitive types.

## set
add (integer e)
remove( Object o)

## Servlet
They are used to handle the request obtained from the web server, process the request, produce the response, then send response back to the web server. 

## Servlet class hierarchy
To develop a servlet that communicates using HTTP, we need to extend the HttpServlet class in our servlet. The HttpServlet class extends the GenericServlet class and provides built-in HTTP functionality.

## Life Cycle of a thread
- new thread
- runnable state
- blocked/waiting state
- time waiting
- terminated state

## Redux

- reducer descripes how does the state transfer from current state to next state.
- logged in, log out.
- When action is been called, reducer will check action type and modifly the store.

## Server-side Load Balancing
A load balancer acts as the “traffic cop” sitting in front of your servers and routing client requests across all servers capable of fulfilling those requests in a manner that maximizes speed and capacity utilization and ensures that no one server is overworked

## RESTful API
A RESTful API is an architectural style for an application program interface (API) that uses HTTP requests to access and use data.
- GET
- POST
- PUT
- DELETE

REST API leads us to the endpoint URI construction

### REST Architectural
It is an architecture style for designing loosely coupled applications over HTTP, that is often used in the development of web services. 

## Transaction Propagation
### REQUIRED (default)
●same transaction will be used if one already exists
●otherwise a new transaction will be opened
### REQUIRES_NEW
●a new physical transaction will be created
●inner transaction can commit or rollback independently of the outer transaction
### NESTED
●inner and outer use the same transaction, but are separated by savepoints
●inner can rollback or commit with the second
### MANDATORY
●existing transaction must already be open or container will throw an IllegalTransactionException
### NEVER
●an existing cannot already be open; exception will be thrown if one is
●must execute non-transactionally
### SUPPORTS
●executes within the scope of existing transaction, otherwise will execute non-transactionally
### NOT_SUPPORTED
●executes outside any existing transaction, existing transaction will be paused

## RESTful Constrains
Uniform interface
- should have only one logical URI, and that should provide a way to fetch related or additional data

Client–server
- A client should know only resource URIs, and that’s all

Stateless
- It will treat every request as new. No session, no history.

Cacheable
- The webpage you are reading here is also a cached version of the HTML page.

Layered system
- REST allows you to use a layered system architecture where you deploy the APIs on server A, and store data on server B and authenticate requests in Server C,


type except in javaand loop
servelet
section manger techolign 
typescript
aws scaling

Htp state serious
Java prevent bubble and freedom function
MSA
container agstrainion
react life csyle.
J unit test be
dcl tCl