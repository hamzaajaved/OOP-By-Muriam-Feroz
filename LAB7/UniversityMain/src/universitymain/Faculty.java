
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymain;
import java.util.Scanner;

/**
 *
 * @author Hamza
 */
public class Faculty {
    Scanner sc = new Scanner(System.in);
    
    String Name;
    Department[] dpt;

    public Faculty(String Name, Department[] dpt, int dptCount) {
        this.Name = Name;
        for (int i = 0; i < dptCount; i++) {
            System.out.println("Enter Department "+ (i + 1) +" Name: ");
            String dptName = sc.next();
            
            System.out.println("Enter Students in Department:"+ (i + 1) +" ");
            int dptStd = sc.nextInt();
            
            String[] dptCourses = {"Computer Science", "Software Engineering"};
            
            System.out.println("Enter No of Teachers in Department: "+ (i + 1) +"");
            int dptTeacherCount = sc.nextInt();
            
            String[] degrees = {"BSCS", "BSSE" ,"MCS"};
            
            dpt[i] = new Department(dptName, dptStd, dptCourses, dptTeacherCount, degrees);
        }
    }
    
    public Faculty(String Name,Department[] dpt){
        this(Name,dpt,3);
    }    
}
