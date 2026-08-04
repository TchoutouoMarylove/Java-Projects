/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personaljavapractice;

/**
 *
 * @author USER
 */

class Student{
private String studentId;
private String name;
private int age;
private String gender;
private double avgScore;
private boolean enrolled;

public Student(String studentId, String name, int age, String gender,
double avgScore,boolean enrolled){
this.studentId = studentId;
this.name = name;
this.age = age;
this.gender = gender;
this.avgScore = avgScore;
this.enrolled = enrolled;
}

public void displayStudentInfo(){
System.out.println("ID: "+ studentId);
System.out.println("Name: "+ name);
System.out.println("Age:"+ age);
System.out.println("Gender: "+ gender);
System.out.println("Average: "+avgScore );
System.out.println("Enrolled: "+ enrolled);
}
public void displayStudentInfo(boolean showEnroll ){
    if(showEnroll){
    System.out.println("Enrolled: "+ enrolled);
    }else{
        System.out.println("Enrollment status are hidden");
    }

}






public String getName(){
return name;

}

public void setName(String name){
 this.name = name;

}


}

class UndergraduateStudent extends Student{
private String level;

 public UndergraduateStudent(String level,
 String studentId, 
  String name,
  int age,
  String gender,
 double avgScore,
 boolean enrolled
 ){
super( studentId, name,  age,  gender,avgScore, enrolled);
 
this.level = level;
 
 
 }
// method overriding
 @Override
  public void displayStudentInfo(){
 super.displayStudentInfo();
 
 System.out.println("level: "+ level);
 }
 }


class  PostgraduateStudent  extends Student{
    
private String researchTopic;

public  PostgraduateStudent( String researchTopic,
String studentId, String name, int age, String gender,
double avgScore, boolean enrolled){
super(studentId,name,age,gender,avgScore,enrolled);
this.researchTopic = researchTopic;

}

public void displayStudentInfo(){
super.displayStudentInfo();
    System.out.println("research topic: "+ researchTopic);

}


}


public class PersonalJavaPractice {

    public static void main(String[] args) {
        System.out.println("=====Student Management Application====");
       Student [] students = new Student[5];
        // Student [] = an array can store references of type students
        students[0] = new Student(
        "St001",
        "Esther",
        26,
        "Female",
        19.5,
        true      
        );
     
        students[1] = new UndergraduateStudent(
        "Level1",
        "St001",
        "Ruth",
        24,
        "Female",
        18.5,
        true
        );
        
         students[2] = new PostgraduateStudent(
        "Artificial Intelligence",
        "St001",
        "Ruth",
        24,
        "Female",
        18.5,
        true
        );

     for(Student student: students){
         //NullPointerException
         if(student!=null){
         student.displayStudentInfo();
         System.out.println("----------");}
     }


    }
    
    
    
    
}
