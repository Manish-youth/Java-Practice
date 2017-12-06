import java.util.Scanner;
interface College
{   
    int  x =5;
    final String Name_Of_College = " B N College";
    final String Address_Of_College ="Ashok RajPath Near Gandhi Maidan \nPatna - 800004 ";
    
}
class Teacher implements College
{
    String Name_of_teacher;
    String Qualification;
    void getTeacher(String name,String quali )
    {
       Name_of_teacher = name;
       Qualification = quali; 
    }
    
}
class Department extends Teacher implements College
{
    int Departmant_Number;
    String Department_Name;
    void getDepartment(int no , String name)
    {
        Departmant_Number = no;
        Department_Name = name;  
    }
    
}
public class CollegeMain implements College {
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Welcome to" +Name_Of_College +"\n" +Address_Of_College);
        System.out.println("Enter Name of Department");
        String dept = sc.nextLine();
        System.out.println("Enter Department Number");
        int no =  sc.nextInt();
        Department d = new Department();
        d.getDepartment(no , dept);
        System.out.println("Enter Teacher's name :");
        String tname = sc.next();
        System.out.println("Enter Teacher's qualification:");
        String tqual= sc.next();
        Teacher t = new Teacher();
        t.getTeacher(tname , tqual);
        System.out.println("College Name : "+Name_Of_College +"\n" +Address_Of_College);
        System.out.println("Department Name :"+d.Department_Name +"\tDepatment Number: "+d.Departmant_Number);
        System.out.println("Teacher Name :"+t.Name_of_teacher +"\nQualification: "+t.Qualification+"\nThank You");     
        
    }
    
}
