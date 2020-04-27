# JAVA-DB-Series
This is a basic gilde on how to setup a MySQL database using PHP My admin and also how o use H2 in-memory database.
The projects focus on Implementing JDBC connection with Plain Java and Making an Api With Spring Boot and Spring FrameWork.

## [SQL Script](https://github.com/yashpatel007/JAVA-DB-Series/tree/master/SQL%20script)
This Contains a basic SQl Script to create table Todo and insert few records into it, if you wish to work with your own datbase,
please copy the schema or run the **todo.sql** file to create table and insert records. To run the sql using cmd, navigate to the
folder containing todo.sql and type following command
    
```
>>> <your sql cmd tool> todo.sql
```

## [Make Java Database Connection](https://github.com/yashpatel007/JAVA-DB-Series/tree/master/PlainJava-DB-Connect)
This project use maven for dependency management, so you do not need to worry about driver downdolad and compatiblity,
You can compile this project in two ways

1. With IDE
    * If you have an IDE fro Java  example [Eclips](https://www.eclipse.org/downloads/), [Netbeans](https://netbeans.org/downloads/)
    or any IDE of your choice simply open the project and run. 
    
2. Using Maven Tool 
    * Navigate to the project folder containing **pom.xml** then write the following command.
    * ```cmd
          >> make all 
    ```
3. Jar file Compilation
    * Navigate to [Target]() folder
