package com.ramn.bms;
//package com.ramn.bms.main;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class H2DatabaseReader {
//
//    public static void main(String[] args) {
//        // JDBC connection properties for H2 database
//        String jdbcUrl = "jdbc:h2:~/test"; // Replace with your H2 database URL
//        String username = "sa"; // Replace with your H2 database username
//        String password = ""; // Replace with your H2 database password
//
//        try {
//            // Load the H2 database driver
//            Class.forName("org.h2.Driver");
//
//            // Establish a connection to the H2 database
//            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
//
//            // Create a statement
//            Statement statement = connection.createStatement();
//
//            // Execute a query to fetch data from the "Lift" table
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM Lift");
//
//            // Process the query result
//            while (resultSet.next()) {
//                int liftNumber = resultSet.getInt("liftNumber");
//                String building = resultSet.getString("building");
//                String wing = resultSet.getString("wing");
//                String liftNowAt = resultSet.getString("liftNowAt");
//                boolean isGood = resultSet.getBoolean("isGood");
//
//                // Print the retrieved data
//                System.out.println("Lift Number: " + liftNumber);
//                System.out.println("Building: " + building);
//                System.out.println("Wing: " + wing);
//                System.out.println("Lift Now At: " + liftNowAt);
//                System.out.println("Is Good: " + isGood);
//                System.out.println("--------------");
//            }
//
//            // Close the resources
//            resultSet.close();
//            statement.close();
//            connection.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
