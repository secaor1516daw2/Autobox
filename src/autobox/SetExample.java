/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobox;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author sergio
 */
public class SetExample {
    public static void main(String[] args){
        Set<String> set = new TreeSet<>();

        set.add("one");
        set.add("two");
        set.add("three");
        set.add("three"); // not added, only unique

        for (String item:set){
            System.out.println("Item: " + item);
       }    
    }
}
