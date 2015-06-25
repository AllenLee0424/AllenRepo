/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author lily
 */
public class Words {

    public static void main(String[] args) {
        WordList ws = new WordList();
        String in = JOptionPane.showInputDialog(
                "Click cancel to end or enter a word and click OK");
        while (in != null) {
            ws.addWord(in);
            in = JOptionPane.showInputDialog(
                    "Click cancel to end or enter a word and click OK");
        }
        JOptionPane.showMessageDialog(null, "Word list = " + ws.toString());
      //  JOptionPane.showMessageDialog(null, "First word = " + ws.getFirst());
      //  JOptionPane.showMessageDialog(null, "Last word = " + ws.getLast());
       
        ws.sort();
         JOptionPane.showMessageDialog(null, "Last word = " + ws.toString());
        JOptionPane.showMessageDialog(null, "the average length (a Double) of words in the list "
                + "is " + ws.getAvg());
       ws.sortLength();
         JOptionPane.showMessageDialog(null, "Last word = " + ws.toString());
                
    }
}
