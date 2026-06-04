package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    /*
    1. Creat dataSource
    2. Open con
    3. PrepStat.
    4. Query
    5. ResultSet : the display/result from query
    6. close res.
     */
    public static void main(String[] args) {

        //set dataSource
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUrl("jdbc:mysql://LocalHost:3306/northwind");
        dataSource.setUsername("root");
        dataSource.setPassword("root@88");


        //query
        String sql = """
                SELECT ProductID,
                ProductName
                FROM products""";

        //try
        //connect
        //prepare
        //resultset
        //next
        //catch



    }
}
