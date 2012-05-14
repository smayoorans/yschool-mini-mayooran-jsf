/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yarlithub.yschool.mayooranjsf.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author GuruMayoo
 */
public class StudentDB {
    
    private static final List<Student> students;

    public StudentDB() {
    }
    
    
    static{
        Student s1=new Student("001","Mayooran","Somasundaram","Velanai",getDate(29, 5, 1987),6);
        Student s2=new Student("002","Thenuzan","Sriskanthan","Vavuniya",getDate(13, 5, 1987),9);
        Student s3=new Student("003","Nilashan","Namasivayam","Vavuniya",getDate(2, 6, 1987),7);
        Student s4=new Student("004","Lukshica","Dhayaparan","Moolai",getDate(20, 8, 1987),4);
        Student s5=new Student("005","Vanaja","Kirusnathasan","Punnalai kadduvan",getDate(12, 9, 1987),1);
        Student s6=new Student("006","Niroshan","Sepastiyampilai","Chunddukkuli",getDate(22, 7, 1987),12);
        Student s7=new Student("007","Keerthika","Mahendralingam","Kopay",getDate(4, 3, 1987),4);
        Student s8=new Student("008","Meera","Velauthappila","Alaveddy",getDate(26, 9, 1987),5);
        Student s9=new Student("009","Logarajah","Ramachanthiran","Mullaitheevu",getDate(21, 11, 1987),6);
        Student s10=new Student("010","Ramanan","Velummylum","Point Perdro",getDate(2, 5, 1987),7);
         
        students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);     
    }
    
    private static Date getDate(int date, int month, int year){
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date, 0,0,0);
		return cal.getTime();
    }
    
    public static List<Student> getStudents() {
        return students;
    }
    
    public static void insertStudent(Student student){
        Student s=new Student();
        s.setAdmissionno(student.getAdmissionno());
        s.setFirstname(student.getFirstname());
        s.setLastname(student.getLastname());
        s.setAddress(student.getAddress());
        s.setDateOfBirth(student.getDateOfBirth());        
        students.add(s);
        
    }
    public static void updateStudent(Student student){
            for(Student s : students){
                if(s.getAdmissionno().equals(student.getAdmissionno())){
                    s.setFirstname(student.getFirstname());
                    s.setLastname(student.getLastname());
                    s.setDateOfBirth(student.getDateOfBirth());
                    s.setAddress(student.getAddress());
                    s.setGrade(student.getGrade());
                    
                    
                }
            }
	}
    
    public Student findStudent(String firstname,int grade){
       Student s=null;
       for(int i=0;i<students.size();i++){
            if(students.get(i).getFirstname().equals(firstname) && students.get(i).getGrade()==grade){
                  s=students.get(i);                   
              }
          }
          return s;
      }
       
    
}
