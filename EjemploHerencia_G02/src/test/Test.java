/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import modelo.*;

/**
 *
 * @author jairo
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person(123, "Jairo", "Seoanes", 25);
        System.out.println(p.retornarDatos());
        
        Doctor d = new Doctor(234, "Elkin", "Patarroyo", 60, "Patologo", "Head");
        System.out.println(d.retornarDatos());
        
        Teacher t = new Teacher(345, "Braulio", "Barrios", 40, "Sistemas", "Unicesar");
        System.out.println(t.retornarDatos());
        
    }
}
