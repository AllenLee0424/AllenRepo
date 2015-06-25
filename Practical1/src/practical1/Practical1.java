/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author lily
 */
public class Practical1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       Line msg1, msg2, msg3;
       
       
       String s = "abcdefg";
           s=  s.substring(s.length()-1);
               
       System.out.println(s);
      /*  
         
        int numbered=1;
        System.out.println((numbered)+ ": Enter a line");
        msg1 = new Line(in.nextLine(),numbered);
        numbered++;
        System.out.println((numbered)+": Enter another line");
      msg2 = new Line(in.nextLine(),numbered);
        numbered++;
        System.out.println((numbered)+": Enter the last line");
       msg3 = new Line(in.nextLine(),numbered);
        System.out.println(msg3.getNum()+": "+ msg3.getText() + ","+ msg3.getNum()+": " + msg2.getText() + "," +msg3.getNum()+": " + msg1.getText());

        
        ArrayList<Line> array = new ArrayList<>();
        int numbered=1;
       String input;
           
       do{
             System.out.println(numbered+ ": Enter a line");
             
             
             input = in.nextLine();
             if(!(input.equals(""))){
             array.add(new Line(input,numbered));
             numbered++;
             }
        }  while(!(input.equals("")));
          
       for(int i =array.size(); i>0;i-- ){
          // System.out.print(array.get(i-1).getNum()+": "+array.get(i-1).getText()+" ");
          System.out.println(array.get(i-1).toString());
       }*/ 
    }
     
}

