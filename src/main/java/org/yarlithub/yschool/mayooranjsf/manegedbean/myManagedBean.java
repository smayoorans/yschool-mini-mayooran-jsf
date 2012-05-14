/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yarlithub.yschool.mayooranjsf.manegedbean;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.yarlithub.yschool.mayooranjsf.model.Student;
import org.yarlithub.yschool.mayooranjsf.model.StudentDB;

/**
 *
 * @author GuruMayoo
 */
@ManagedBean
@RequestScoped
public class myManagedBean {
    private Student searchedStudent;
    private Student insertStudent;
    private Student selectedStudent;
    private List<Student> students;
    private String sname;
    private int grade;
    
    public myManagedBean() {      
        
          students=StudentDB.getStudents();
          
          searchedStudent=new Student();
          insertStudent=new Student();
          selectedStudent=new Student();
          sname=searchedStudent.getFirstname();
          grade=searchedStudent.getGrade();
   }
    
    public String responsePage(){
        if(searchedStudent==null)
        {
            return "errorresponse";
        }
        else{
            return "searchresponse";
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Student getSelectedStudent() {
        return selectedStudent;
    }

    public void setSelectedStudent(Student selectedStudent) {
        this.selectedStudent = selectedStudent;
    }

    public Student getInsertStudent() {
        return insertStudent;
    }

    public void setInsertStudent(Student insertStudent) {
        this.insertStudent = insertStudent;
    }    
    
    public Student getSearchedStudent() {
        return searchedStudent;
    }

    public void setSearchedStudent(Student searchedStudent) {
        this.searchedStudent = searchedStudent;
    }   

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
     
    public void Search(){        
        StudentDB sd=new StudentDB();
        searchedStudent=sd.findStudent(sname,grade);       
   }
    public void prepareCreate(){
        StudentDB.insertStudent(insertStudent);
        setSelectedStudent(insertStudent); 
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "User successfully inserted.", null));
        
    }
    public void update(){
        StudentDB.updateStudent(searchedStudent);
        
        //Show the success message 
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Student successfully updated.", null));        
    }
}
