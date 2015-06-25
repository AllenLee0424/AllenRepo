/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

/**
 *
 * @author lily
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WordList {

    private ArrayList<String> theWordList = new ArrayList<String>();

    public void addWord(String s) {
        theWordList.add(s);
    }

    /**
     *
     * @return the ArrayList
     */
    ArrayList getList() {
        return this.theWordList;
    }
    /* Check point 5: complete the method below */

    public String getFirst() {
        /* Replace the return statement below with a statement
         * that returns
         * the first word of theWordList (the word at index 0).
         * Hint: use the ArrayList method "get".
         * If there is no first word (theWordList has no words in it),
         * "-" should be returned.
         */
        if (theWordList.isEmpty()) {
            return "-";
        } else {
            return theWordList.get(0);
        }
    }
    /* Check point 6: complete the method below */

    public String getLast() {
        /* Replace the string "junk" with the
         * last word of theWordList (the word
         * at index size()-1). Hint: use the ArrayList method "get".
         * If there is no last word (theWordList has no words in it),
         * "-" should be returned.
         */
        if (theWordList.isEmpty()) {
            return "-";
        } else {
            return theWordList.get(theWordList.size() - 1);
        }

    }

    double getAvg() {
        double sum = 0;
        for (String theWordList1 : this.theWordList) {
            sum += theWordList1.length();
        }

        return sum / theWordList.size();

    }

    public String toString() {

        return theWordList.toString();
    }

    void sort() {
        Collections.sort(theWordList);

    }

    void sortLength() {
        Collections.sort(theWordList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - (s2.length());
            }

        });
    }

}
/*@Override
 public int compareTo(WordList o) {
        
 return this.theWordList.toString().compareTo(o.toString());
    
 */
