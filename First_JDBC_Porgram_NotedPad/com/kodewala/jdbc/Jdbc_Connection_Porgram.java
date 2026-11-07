package com.kodewala.jdbc;
import java.sql.*; // we can * --> all method is static , all are the utilty class

class JdbcConnection{
	 
	 public static void main(String[] args) throws Exception{
		 
		   //1  Load And Register the Driver  --> we have to import java.sql.DriverManager;
	       //public static void registerDriver(Driver) throws SQLException;
		   
		   /*
		   
           DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
           System.out.println("Driver Loaded Succesfully...");
		   
		   */
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   System.out.println("Driver Loaded Succesfully...");
		   
		   // Understaind how to compile and run using cmd --> 
		   
		   // Different between both Class.forName() and DriverManager ? at the time of interview 
		   
		   
		   
	 }
	 
 }
 
 /*
    com.mysql.cj.jdbc.Driver() --> is not the part of java jar file    , It is the part of my sql jar , so we need to informatin 
 
 
 */
 
 /*
 
     To: Compile it
	 --------------
	 
     C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>javac -cp "lib\mysql-connector-j-26.7.0.jar" com\kodewala\jdbc\Jdbc_Connection_Porgram.java
	 
*/

/*
 
     To: Run it
	 -------------- 
     C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>java -cp ".;lib\mysql-connector-j-26.7.0.jar" com.kodewala.jdbc.JdbcConnection
	 
	 
	 second way --> first set path like 
	 
	   
        --> only one time we need to set that path where it is -->          
		  
		C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>set classpath=.;lib\mysql-connector-j-26.7.0.jar
	 
	 
	 referDiagram::
	 
	               cp --> classpath
				   
				   .; --> it means search .class file in currentWorkingDrectory(CWD)
				   
				   lib\mysql-connector-j-26.7.0.jar --> "it means search .class file in jar "
					
*/


/*
    //Simple way to do it 
	
	
	
	C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>set classpath=.;.lib\mysql-connector-j-26.7.0.jar   (BEST --> AUTO LOAD SUPPORT)
	
	                                         VS
											 
											 
	C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>set classpath=.;.lib\mysql-connector-j-26.7.0.jar   



    C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>javac com\kodewala\jdbc\Jdbc_Connection_Porgram.java

    C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>java com.kodewala.jdbc.JdbcConnection
     Driver Loaded Succesfully...

    C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>




*/