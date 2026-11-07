package com.kodewala.jdbc;
import java.sql.*; // we can * --> all method is static , all are the utilty class

class JdbcConnection1{
	 
	 public static void main(String[] args) throws Exception{
		 
		   //1  Load And Register the Driver  --> we have to import java.sql.DriverManager;
	       //public static void registerDriver(Driver) throws SQLException;
		   
           DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
           System.out.println("Driver Loaded Succesfully...");
		   
		   // Understaind how to compile and run using cmd --> 
		   
		   //2. Establish the connection b/w java application and database
           /*
                 public static Connection getConnection(String,String,String) throws SQLException;
                 public static Connection getConnection(String) throws SQLException;      
				 
                 String dbProtocol = "jdbc:mysql://localhost:3306/kodewala?user=root&password=Suraj1210@";
           */
             String dbProtocol = "jdbc:mysql://localhost:3306/kodewala";
             String userName = "root";
             String password = "Suraj1210@";
             Connection con = DriverManager.getConnection(dbProtocol,userName,password);
             System.out.println("Connection is established to ::"+dbProtocol);
             System.out.println("Connection :: "+con.getClass().getName());
		     
	 }
	 
 }
 
/*
    //Simple way to do it 
	
	C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>set classpath=.;lib\mysql-connector-j-26.7.0.jar

    C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>javac com\kodewala\jdbc\Jdbc_Connection_Porgram.java

    C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>java com.kodewala.jdbc.JdbcConnection
     Driver Loaded Succesfully...

    C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>


*/

/*

   C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>javac com\kodewala\jdbc\Jdbc_connection_02.java

   C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>java com.kodewala.jdbc.JdbcConnection1
      
	  Driver Loaded Succesfully...
      Connection is established to ::jdbc:mysql://localhost:3306/kodewala
      Connection :: com.mysql.cj.jdbc.ConnectionImpl

   C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>

*/