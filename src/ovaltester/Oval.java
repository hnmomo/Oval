/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ovaltester;

/**
 *
 * @author jihua5758
 */
public class Oval {
    private double l,w;
    public Oval(){
        this(1,1);
    }
    public Oval(double l,double w){
        this.l=l;
        this.w=w;
    }
    public void setWidth(double a){
        w=a;
    }
    public void setLength(double a){
        l=a;
    }
    public double getLength(){
        return l;
    }
    public double getWidth(){
        return w;
    }
    public double area(){
        return 0.8*l*w;
    }
}
