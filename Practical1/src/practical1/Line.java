package practical1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lily
 */
public class Line {
    private String text;
    private int num;

    public Line(String text, int num) {
        this.text = text;
        this.num = num;
    }

    public String getText() {
        return text;
    }

    public int getNum() {
        return num;
    }
    
    public String toString(){
        return num+": "+ text+" ";
    }
}
