/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;
/**
 *
 * @author Hamza
 */
public class shape {
    private String color;
    private boolean isFilled;

    protected void setColor(String color) {
        this.color = color;
    }

    protected String getColor() {
        return color;
    }

    protected void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
    
    protected boolean getIsFilled(){
        return isFilled;
    }
    protected shape() {
        color = "black";
        isFilled = false;
    }
    
    protected shape(String color,boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }
    
    protected shape(String color){
        this.color = color;
        this.isFilled = true;
    }
    
    protected shape(boolean isFilled){
        this.isFilled = isFilled;
        this.color = "black";
    }
}
