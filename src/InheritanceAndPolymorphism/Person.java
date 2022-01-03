
/*
*
* (The Person , Student , Employee , Faculty , and Staff classes) Design a
class named Person and its two subclasses named Student and Employee .
Make Faculty and Staff subclasses of Employee . A person has a name,
address, phone number, and e-mail address. A student has a class status (fresh-
man, sophomore, junior, or senior). Define the status as a constant. An employee
has an office, salary, and date hired. Use the MyDate class defined in Program-
ming Exercise 10.14 to create an object for date hired. A faculty member has
office hours and a rank. A staff member has a title. Override the toString
method in each class to display the class name and the person’s name.
Draw the UML diagram for the classes and implement them. Write a test program
that creates a Person , Student , Employee , Faculty , and Staff , and invokes
their toString() methods.
* */


package InheritanceAndPolymorphism;

import ObjectOrientedThinking.MyDate;


public class Person {

    public static void main(String[] args) {
        Person person1 = new Person("Pegasus", "29 Cooper St. South Ozone Park, NY 11420", "989-321-9900", "thatboypegasus@theshadowrealm");
        System.out.println(person1.toString());
        Student student1 = new Student();
        student1.setName("Bob Odenkirk");
        System.out.println(student1.toString());
        Employee employee1 = new Employee(213,30000);
        employee1.setName("Tom Hanks");
        System.out.println(employee1.toString());
        Faculty faculty1 = new Faculty("8:00 - 9:00", "Dean");
        faculty1.setName("Johnny Bravo");
        System.out.println(faculty1.toString());
        Staff staff1 = new Staff("Coordinator");
        staff1.setName("Lilly Amber");
        System.out.println(staff1.toString());

    }
    String name, address, phoneNum, email;
    Person(){}
    Person(String name,String address,String phoneNum, String email){
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String toString(){
        //Display class name and person's name

        return "person class. person: "+ name;
    }
}

class Student extends Person{

    final String class_Status = "Freshman";

    public Student(){

    }



    public String toString(){
      //Display class name and person's name

      return "Student class. Student: "+ name;
  }
}

class Employee extends Person{
    int office, salary;
    MyDate dateHired = new MyDate();

    public Employee(){

    }
    public Employee(int office, int salary){
        this.office = office;
        this.salary = salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setOffice(int office){
        this.office = office;
    }


    public String toString(){

        //Display class name and person's name

        return "Employee class. Employee: "+ name;
    }
}

class Faculty extends Employee {
    String officeHours, rank;

    public Faculty(){

    }

    public Faculty(String officeHours, String rank){
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }

    public void setRank(String rank){
        this.rank = rank;
    }
    public String toString(){
        //Display class name and person's name

        return "Faculty class. Faculty: "+ name;
    }
}

class Staff extends Employee{
    String title;

    public Staff(){

    }
    public Staff(String title){
        this.title = title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String toString(){
        //Display class name and person's name
        return "Staff class. Staff: "+ name;
    }
}
