package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    /*
    1. Creat dataSource
    2. Open con ------------|
    3. PrepStat.           |--->  in a try-catch (exception handler)
    4. Query -------------|______________________ +
    5. ResultSet : the display/result from query  |---->  while loop w next();
    6. close resource. (Auto)            _________|
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

        try(Connection connection = dataSource.getConnection();
            PreparedStatement prepStat = connection.prepareStatement(sql);
            ResultSet result = prepStat.executeQuery();){

            System.out.println("""
                    PRODUCT ID  |  PRODUCT NAME
                    -------------------------""");

            while(result.next()){
                int productId = result.getInt("ProductID");
                String productName = result.getString("ProductName");

                System.out.printf("%6d      |  %s \n", productId, productName);
                System.out.println("  ------    +  ------");

            }

        }catch(SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
