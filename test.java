import java.util.*;
class Course{
String cname;
int cid;
String cslot;
}
class Student {
  int Student_id;
  String Student_name;
  int Student_regno;
  private Course[] c=new Course[4];
  Scanner sc=new Scanner(System.in);
void getInfo()
  {   int i=0;
      System.out.println("Enter the details for 4 course");
      String g;
      for(i=0;i<4;i++)
      {  c[i]=new Course();
          System.out.println("For course number"+(i+1));
          System.out.println("course name");
         c[i].cname=sc.nextLine();
         System.out.println("course Id");
         c[i].cid=sc.nextInt();
         System.out.println("course Slot");
         c[i].cslot=sc.nextLine();
         g=sc.nextLine();
   }
}
void Display()
{   int i=0;
    System.out.println("Student Id"+ Student_id);
    System.out.println("Student name"+ Student_name);
    System.out.println("Student Registration number"+ Student_regno);
    for(i=0;i<4;i++)
    {   System.out.println("For course no"+(i+1));
        System.out.println("Course Name"+ c[i].cname);
         System.out.println("Course Id"+ c[i].cid);
          System.out.println("Course Slot"+ c[i].cslot);
    }
}
}
public class Test{
public static void main(String[] args)
{
    Student[] s=new Student[4];
    int n;
    int i=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Print the number of students:");
       n=sc.nextInt();
    for(i=0;i<n;i++)
    {  s[i]=new Student();
        System.out.println("Enter for Student"+(i+1));
        System.out.println("Student Id:");
        s[i].Student_id=sc.nextInt();
        System.out.println("Student Name:");
        s[i].Student_name=sc.nextLine();
        System.out.println("Student Registration number:");
        s[i].Student_regno=sc.nextInt();
        s[i].getInfo();
    }
}
}


