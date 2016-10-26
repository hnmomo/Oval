/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ovaltester;

/**
 * Oval class
 * @author jihua5758
 */
public class Oval {
    private double l,w;//l is length, w is width
    /**
     * constructor
     * pre:none
     * post:a Oval object created with length and width of 1
     */
    public Oval(){
        this(1,1);
    }
    /**
     * constructor
     * pre:none
     * post:a Oval object created with length l and width w
     */
    public Oval(double l,double w){
        this.l=l;
        this.w=w;
    }
    /**
     * changes width
     * pre:none
     * post:the width is changed to a
     */
    public void setWidth(double a){
        w=a;
    }
    /**
     * changes length
     * pre:none
     * post:the length is changed to a
     */
    public void setLength(double a){
        l=a;
    }
    /**
     * returns length
     * pre:none
     * post:the length is displayed to console
     */
    public double getLength(){
        return l;
    }
    /**
     * returns width
     * pre:none
     * post:the width is displayed to console
     */
    public double getWidth(){
        return w;
    }
    /**
     * returns area
     * pre:none
     * post:the area is displayed to console
     */
    public double area(){
        return 0.8*l*w;
    }
}
