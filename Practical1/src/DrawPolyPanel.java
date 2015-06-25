import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPolyPanel extends JPanel {
    
    private Point point ;
  public void paintComponent(Graphics g) {
       LineListener listener = new LineListener();
      addMouseListener (listener);
      addMouseMotionListener (listener);
    super.paintComponent(g);

    int lenght = 10;
    int startHeight = 1;
    int endHeight = 2;
    
    Polygon p = new Polygon();
  //  p.addPoint(10, 10);
     p.addPoint(10+20*(lenght-2), 10);
     p.addPoint(10+20*lenght, 10);
   p.addPoint(10+20*lenght, 10+20*endHeight);
    p.addPoint(10, 10+20*endHeight);
   p.addPoint(10, 10+20*(endHeight-startHeight));
     g.drawPolygon(p);
  }
   //*****************************************************************
   //  Represents the listener for all mouse events.
   //*****************************************************************
   private class LineListener implements MouseListener,
                                         MouseMotionListener
   {
      //--------------------------------------------------------------
      //  Captures the initial position at which the mouse button is
      //  pressed.
      //--------------------------------------------------------------
      public void mousePressed (MouseEvent event)
      {
         point = event.getPoint();
      }

      //--------------------------------------------------------------
      //  Gets the current position of the mouse as it is dragged and
      //  redraws the line to create the rubberband effect.
      //--------------------------------------------------------------
      public void mouseDragged (MouseEvent event)
      {
         point = event.getPoint();
         repaint();
      }

      //--------------------------------------------------------------
      //  Provide empty definitions for unused event methods.
      //--------------------------------------------------------------
      public void mouseClicked (MouseEvent event) {}
      public void mouseReleased (MouseEvent event) {}
      public void mouseEntered (MouseEvent event) {}
      public void mouseExited (MouseEvent event) {}
      public void mouseMoved (MouseEvent event) {}
   }

 
  
  public static void main(String[] args) {
      
    JFrame frame = new JFrame();
    frame.setTitle("DrawPoly");
   frame.setSize(500, 500);
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    Container contentPane = frame.getContentPane();
    contentPane.add(new DrawPolyPanel());

    frame.show();
  }
}