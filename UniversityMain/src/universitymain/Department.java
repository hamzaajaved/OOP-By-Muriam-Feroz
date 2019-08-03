/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymain;

/**
 *
 * @author TUSER
 */
public class Department {
    public String Name;
    int stdCount;
    int teacherCount;
    int totalCourses;
    int totalDegrees;
    String[] Courses;
    String[] Degrees;

    public Department(String Name, int stdCount, int teacherCount, int totalCourses, int totalDegrees, String[] Courses, String[] Degrees) {
        this.Name = Name;
        this.stdCount = stdCount;
        this.teacherCount = teacherCount;
        this.totalCourses = totalCourses;
        this.totalDegrees = totalDegrees;
        this.Courses = Courses;
        this.Degrees = Degrees;
    }

    public Department() {
    }
    
    
    

    
}
