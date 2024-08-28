package oopsJava;

import java.util.ArrayList;
import java.util.List;

/*
If a class has an entity reference it is known as Aggregation.
Aggregation represents HAS-A relationship

Contained objects can exist independently of the container object
*/


/*
class Student {

    // Attributes of Student
    private String studentName;
    private int studentId;

    // Constructor of Student class
    public Student(String studentName, int studentId)
    {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public int getstudentId() { 
      return studentId; 
    }

    public String getstudentName() {
      return studentName; 
    }
}

//Class 2
//Department class 
//Department class contains list of Students
class Department {

 // Attributes of Department class
 private String deptName;
 private List<Student> students;

 // Constructor of Department class
 public Department(String deptName, List<Student> students)
 {
     this.deptName = deptName;
     this.students = students;
 }

 public List<Student> getStudents() {
   return students; 
 }

 public void addStudent(Student student)
 {
     students.add(student);
 }
}


//Class 3
//Institute class
//Institute class contains the list of Departments
class Institute {

 // Attributes of Institute
 private String instituteName;
 private List<Department> departments;

 // Constructor of Institute class
 public Institute(String instituteName,
                  List<Department> departments)
 {
     // This keyword refers to current instance itself
     this.instituteName = instituteName;
     this.departments = departments;
 }

 public void addDepartment(Department department)
 {
     departments.add(department);
 }

 // Method of Institute class
 // Counting total students in the institute
 public int getTotalStudentsInInstitute()
 {
     int noOfStudents = 0;
     List<Student> students = null;

     for (Department dept : departments) {
         students = dept.getStudents();

         for (Student s : students) {
             noOfStudents++;
         }
     }
     return noOfStudents;
 }
}


//Class 4
//main class
public class Aggregation {

 // main driver method
 public static void main(String[] args)
 {
     // Creating independent Student objects
     Student s1 = new Student("Parul", 1);
     Student s2 = new Student("Sachin", 2);
     Student s3 = new Student("Priya", 1);
     Student s4 = new Student("Rahul", 2);

     // Creating an list of CSE Students
     List<Student> cse_students = new ArrayList<Student>();
     cse_students.add(s1);
     cse_students.add(s2);

     // Creating an initial list of EE Students
     List<Student> ee_students = new ArrayList<Student>();
     ee_students.add(s3);
     ee_students.add(s4);

     // Creating Department object with a Students list
     // using Aggregation (Department "has" students)
     Department CSE = new Department("CSE", cse_students);
     Department EE = new Department("EE", ee_students);

     // Creating an initial list of Departments
     List<Department> departments = new ArrayList<Department>();
     departments.add(CSE);
     departments.add(EE);

     // Creating an Institute object with Departments list
     // using Aggregation (Institute "has" Departments)
     Institute institute = new Institute("BITS", departments);

     // Display message for better readability
     System.out.print("Total students in institute: ");

     // Calling method to get total number of students
     // in the institute and printing on console
     System.out.print(
         institute.getTotalStudentsInInstitute());
 }
}
*/

class Address {  
String city,state,country;  
  
public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
  
} 


class Emp {  
int id;  
String name;  
Address address;  
  
public Emp(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
}
public class Aggregation {
public static void main(String[] args) {  
Address address1=new Address("London","England","UK");  
Address address2=new Address("Edinburgh","Scotland","UK");  
  
Emp e=new Emp(111,"rutuja",address1);  
Emp e2=new Emp(112,"wayase",address2);  
      
e.display();  
e2.display();  
      
}  
}  

