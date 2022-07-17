# JDBC Example
> This code explains how we can connect Java to SQL Server Database through JDBC

> To enable a Java program connects to Microsoft SQL Server database, we need to have a suitable JDBC driver present in the classpath. Click here to download the latest version of Microsoft JDBC Driver for SQL Server. Currently, the latest version is Microsoft JDBC driver 8.2 which supports Java 8, 11 and 13.
```xml
<dependency>
    <groupId>com.microsoft.sqlserver</groupId>
    <artifactId>mssql-jdbc</artifactId>
    <version>8.2.1.jre13</version>
</dependency>
```

> The syntax of database URL for SQL Server is as follows:
```properties
jdbc:sqlserver://[serverName[\instanceName][:portNumber]][;property=value[;property=value]]
```
Where:
- serverName: host name or IP address of the machine on which SQL server is running.
- instanceName: name of the instance to connect to on serverName. The default instance is used if this parameter is not specified.
- portNumber: port number of SQL server, default is 1433. If this parameter is missing, the default port is used.
- property=value: specify one or more additional connection properties. To see the properties specific to SQL server, visit <link href = "https://docs.microsoft.com/en-us/previous-versions/sql/legacy/ms378988(v=sql.90)?redirectedfrom=MSDN">Setting the Connection Properties.</link>