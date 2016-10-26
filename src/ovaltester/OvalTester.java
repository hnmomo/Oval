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
public class OvalTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Oval o=new Oval(3,2);
        System.out.println("the length is "+o.getLength());
        o.setWidth(3.4);
        System.out.println("the width is "+o.getWidth());
        System.out.println("the area is "+o.area());
    }
}
