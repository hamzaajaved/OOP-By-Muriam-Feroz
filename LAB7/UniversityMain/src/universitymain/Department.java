/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymain;

/**
 *
 * @author Hamza
 */
public class Department {
    public String Name;
    public int stdCount;
    public String[] Courses;
    public int teacherCount;
    public String[] Degrees;
    
    
    public Department(String Name,int stdCount,String[] Courses,int teacherCount,String[] Degrees){
        this.Name = Name;
        this.stdCount = stdCount;
        this.Courses = Courses;
        this.teacherCount = teacherCount;
        this.Degrees = Degrees;   
    }
    
    @Override
    public String toString(){
        return "Department Name = " + this.Name + "\nStdCount = " + this.stdCount + "\nCourses = " + this.Courses + "n\teacherCount = " + this.teacherCount + "\nDegrees = " + this.Degrees;
    }
    
    
    
}
