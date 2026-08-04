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




}


public class PersonalJavaPractice {

    public static void main(String[] args) {
        System.out.println("=====Student Management Application====");
        Student student1 = new Student("ST001","Marylove",20,"female",19.5,true);
        UndergraduateStudent student2 = new UndergraduateStudent("level1",
        "ST002","Esther",25,"female",18.5,true);
        PostgraduateStudent student3 = new PostgraduateStudent("Artificial Intelligence",
        "ST003","Ruth",24,"female",18.68,true);
        
        Student student4 = new UndergraduateStudent("Level2","ST004",
        "Hans",18,"male",12.25,false);//UPCASTING
        
        student4.displayStudentInfo();
        
        
//        Student stud2 = new Student("ST002","Isabelle",20,"female",18.5,true);

           
//        stud1.displayStudentInfo();
//        System.out.println("\n");
//        stud2.displayStudentInfo();
//        System.out.println("original name: "+ stud1.getName() );
//        
//         stud1.setName("hans");
//        System.out.println("changing name "+ stud1.getName());
//        
//        UndergraduateStudent underStudent1 = new UndergraduateStudent("level 1",
//        "St003",
//        "Esther",
//        20,
//        "female",
//        19.5,
//        true);
//        
//        underStudent1.displayStudentInfo();
////        System.out.println(underStudent1.getName());
////        underStudent1.setName("Queen");
////         System.out.println(underStudent1.getName());
//     stud1.displayStudentInfo(true);




    }
    
    
    
    
}
