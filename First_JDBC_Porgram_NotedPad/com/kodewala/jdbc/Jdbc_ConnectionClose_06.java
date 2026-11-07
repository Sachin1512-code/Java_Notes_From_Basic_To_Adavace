package com.kodewala.jdbc;
import java.sql.*; // we can * --> all method is static , all are the utilty class

class JdbcConnection5{
	 
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
		   
		     
			 //3. Creating a Statement Object
             //public abstract Statement createStatement() throws SQLException;
               Statement stmt = con.createStatement();
               System.out.println("Statement Object got created...");
               System.out.println("Statement :: "+stmt.getClass().getName());
		   
		     
			 //4. Execute the Query
            //public abstract ResultSet executeQuery(String) throws SQLException;
              
			  String selectQuery="select sid,sname,sage,saddress from student";
              ResultSet result = stmt.executeQuery(selectQuery);
              System.out.println("ResultSet Object got created...");
              System.out.println("ResultSet :: "+result.getClass().getName());
			  
			  
			//5. Processing the result
              System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
              
			  while (result.next())
              {
                   int sid = result.getInt("sid");
                   int sage = result.getInt("sage");
                   String sname = result.getString("sname");
                   String saddress = result.getString("saddress");
                    System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+saddress);
              }
			  
			  			  
			  
			  //6. Close the resources
			       System.out.println("Closing the resources...");
                   result.close();
                   stmt.close();
                   con.close();
                   
				   System.out.println("Closed the resources...");
			
			
	 }
	 
 }
 
 /*
 
  C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>javac com\kodewala\jdbc\Jdbc_TheResult_05.java
      C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>java com.kodewala.jdbc.JdbcConnection4
         
		 Driver Loaded Succesfully...
         Connection is established to ::jdbc:mysql://localhost:3306/kodewala
         Connection :: com.mysql.cj.jdbc.ConnectionImpl
         Statement Object got created...
         Statement :: com.mysql.cj.jdbc.StatementImpl
         ResultSet Object got created...
         ResultSet :: com.mysql.cj.jdbc.result.ResultSetImpl
         
		 SID     SNAME   SAGE    SADDRESS
         10      sachin  51      MI
         7       dhoni   41      CSK
         18      kohli   36      RCB
         45      rohith  38      MI
		 
         Closing the resources...
         Closed the resources...

    C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>
 
 
 
 */
 
 /* 05
      C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>javac com\kodewala\jdbc\Jdbc_TheResult_05.java
      C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>java com.kodewala.jdbc.JdbcConnection4
         
		 Driver Loaded Succesfully...
         Connection is established to ::jdbc:mysql://localhost:3306/kodewala
         Connection :: com.mysql.cj.jdbc.ConnectionImpl
         Statement Object got created...
         Statement :: com.mysql.cj.jdbc.StatementImpl
         ResultSet Object got created...
         ResultSet :: com.mysql.cj.jdbc.result.ResultSetImpl
         
		 SID     SNAME   SAGE    SADDRESS
         10      sachin  51      MI
         7       dhoni   41      CSK
         18      kohli   36      RCB
         45      rohith  38      MI

          C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>
		  
		  
 */
 
 /* 04 
 
   C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>javac com\kodewala\jdbc\Jdbc_ExecuteQuery_04.java
   C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>java com.kodewala.jdbc.JdbcConnection3
   
   Driver Loaded Succesfully...
   Connection is established to ::jdbc:mysql://localhost:3306/kodewala
   Connection :: com.mysql.cj.jdbc.ConnectionImpl
   Statement Object got created...
   Statement :: com.mysql.cj.jdbc.StatementImpl
   ResultSet Object got created...
   ResultSet :: com.mysql.cj.jdbc.result.ResultSetImpl


C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>
 
 
 */
 /* 03
 
     C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>
	 
     C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>javac com\kodewala\jdbc\Jdbc_Statement_03.java
     C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>java com.kodewala.jdbc.JdbcConnection2
	 
       Driver Loaded Succesfully...
       Connection is established to ::jdbc:mysql://localhost:3306/kodewala
       Connection :: com.mysql.cj.jdbc.ConnectionImpl
       Statement Object got created...
       Statement :: com.mysql.cj.jdbc.StatementImpl

     C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>
 
 
 
 
 
 *
 
 
 
/*  01
 
    //Simple way to do it 
	
	C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>set classpath=.;.lib\mysql-connector-j-26.7.0.jar   -->(BEST)
	
	                                VS 
					
	C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>set classpath=.;lib\mysql-connector-j-26.7.0.jar

    C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>javac com\kodewala\jdbc\Jdbc_Connection_Porgram.java

    C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>java com.kodewala.jdbc.JdbcConnection
     Driver Loaded Succesfully...

    C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>


*/

/* 02

   C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>javac com\kodewala\jdbc\Jdbc_connection_02.java

   C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>java com.kodewala.jdbc.JdbcConnection1
      
	  Driver Loaded Succesfully...
      Connection is established to ::jdbc:mysql://localhost:3306/kodewala
      Connection :: com.mysql.cj.jdbc.ConnectionImpl

   C:\Users\HP\Desktop\Project_\First_JDBC_Porgram>

*/