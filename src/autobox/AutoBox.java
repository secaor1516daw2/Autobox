/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobox;

/**
 *
 * @author sergio
 */
 public class AutoBox {
    public static void main(String[] args){
        Integer intObject = new Integer(1);
        int intPrimitive = 2;
        Integer tempInteger;
        int tempPrimitive;

        tempInteger = new Integer(intPrimitive); //Evitando Auto unbox
        tempPrimitive = intObject.intValue(); //Evitando Auto box

        tempInteger = intPrimitive; // Auto box
        tempPrimitive = intObject;  // Auto unbox     
        
        System.out.println("TempInteger (Autobox) = " + tempInteger + "\nTempPrimitive (Auto unBox) = " + tempPrimitive);
    }
    
}
