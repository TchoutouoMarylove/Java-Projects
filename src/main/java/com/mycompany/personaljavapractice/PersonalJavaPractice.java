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


}



public class PersonalJavaPractice {

    public static void main(String[] args) {
        System.out.println("=====Student Management Application====");
        Student stud1 = new Student("ST001","Marylove",20,"female",19.5,true);
        Student stud2 = new Student("ST002","Isabelle",20,"female",18.5,true);
        
     stud1.displayStudentInfo();
        System.out.println("\n");
     stud2.displayStudentInfo();
     
        
     
    }
    
    
    
    
}
