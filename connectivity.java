
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DHARUN
 */
public class connectivity 
{
    public static Connection getConnection() 
  {
     Connection task=null;
     try{
     Class.forName("com.mysql.cj.jdbc.Driver");
 task=DriverManager.getConnection("jdbc:mysql://localhost/cash","root","1234");
     }catch(Exception exam)
     {
         System.out.println(exam.getMessage());
     }
     return task;
     
    
}
}