# JAVA-DB-Series
This is a basic gilde on how to setup a MySQL database using PHP My admin and also how o use H2 in-memory database.
The projects focus on Implementing JDBC connection with Plain Java and Making an Api With Spring Boot and Spring FrameWork.

## [SQL Script](https://github.com/yashpatel007/JAVA-DB-Series/tree/master/SQL%20script)
This Contains a basic SQl Script to create table Todo and insert few records into it, if you wish to work with your own datbase,
please copy the schema or run the **todo.sql** file to create table and insert records. To run the sql using cmd, navigate to the
folder containing todo.sql and type following command, this will create the table and insert few dummy records.
    
```cmd
>>> <your sql cmd tool> todo.sql
```
Query the DB with basic queries listed in [query.sql](https://github.com/yashpatel007/JAVA-DB-Series/blob/master/SQL%20script/query.sql)
```cmd
>>> <your sql cmd tool> query.sql
```


## [Make Java Database Connection](https://github.com/yashpatel007/JAVA-DB-Series/tree/master/PlainJava-DB-Connect)
This project use maven for dependency management, so you do not need to worry about driver downdolad and compatiblity,
You can compile this project in two ways

1. **With IDE**
    * If you have an IDE fro Java  example [Eclips](https://www.eclipse.org/downloads/), [Netbeans](https://netbeans.org/downloads/)
    or any IDE of your choice simply open the project and run. 
    
2. **Using Maven Tool** 
    * Navigate to the project folder containing **pom.xml** then write the following command.
    * ```cmd
          >> make all 
    ```
    
**Note :** This connect to an external free database service, It may take a bit to connect to database.
 
## [Spring REST API](https://github.com/yashpatel007/JAVA-DB-Series/tree/master/SpringRestApi)
This project Uses Spring Boot and Spring Framework to create a REST API, Database used is H2 in-memory database to faster load the server content. The Table is created by Hybernate and have **ORM**(Object-relational mapping). The data is pushed into this DB by [data.sql](https://github.com/yashpatel007/JAVA-DB-Series/blob/master/SpringRestApi/src/main/resources/data.sql).
* #### How to Compile
    * Navigate to [Target](https://github.com/yashpatel007/JAVA-DB-Series/tree/master/SpringRestApi/target) folder and open cmd there
      and type the following command
    * ```cmd
          >> make all
    ```
* #### API Details
    * API Can be tested either by Browser( make sure you have [Json Viewer](https://chrome.google.com/webstore/detail/json-viewer/gbmdgpbipfallnflgajpaliibnhdgobh?hl=en-US) chrome extension ) or POSTMAN 
    { I recommend using postman because it is a powerful tool and can generate all queries without any error. }
    * ##### GET All Records
        * [localhost:8080/todo](http://localhost:8080/todo), gets all records in the table
    * ##### GET By Id
        * [localhost:8080/todo/{id}](http://localhost:8080/todo/1), get todo record by id
    * ##### GET By Title
        * [localhost:8080/todo/title/{title}](http://localhost:8080/todo/title/Helloworld), get record with title Hello world
    * ##### GET By status (Completed --> 1, Incomplete --> 0 )
        * [localhost:8080/todo/status/{status}](http://localhost:8080/todo/status/0), get all incompleted tasks.
    * ##### POST 
        * [localhost:8080/todo](http://localhost:8080/todo), Insert new record, please make sure all fields are set correctly    
    * ##### PUT in Id
        * [localhost:8080/todo/{id}](http://localhost/todo/1), Update Id 1 please make sure all fields are set correctly
    * ##### Delete by ID
        * [localhost:8080/todo/{id}](http://localhost/todo/1) delete task with id 1
    * ##### Delete by Status
        * [localhost:8080/todo/status/{status}](http://localhost/todo/status/1) delete all the completed task
        
**Note :** Because this an In-Memory Database any operations will not be permanent and any changes will be erased as soon as you shutdown spring server. 

## [QuickAPI-Spring](https://github.com/yashpatel007/JAVA-DB-Series/tree/master/QuickAPI)
This is a very simple implementation of REST Api which supports only GET, POST, DELETE this is By Annotationg Spring data repository as 
[@RepositoryRestResource](https://docs.spring.io/spring-data/rest/docs/current/reference/html/#reference) which takes care of all GET POST, DELETE request.

