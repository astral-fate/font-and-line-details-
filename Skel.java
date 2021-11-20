
package skel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.LineMetrics;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

class Skel extends JApplet {
    public static void main(String[] args) {
        JApplet applet = new Skel();
        JFrame frame = new JFrame();
        frame.getContentPane().add(applet);
        applet.init();
        frame.setTitle("Hello to TM 240 course");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }// end of main method

    public void init() {
        JPanel panel = new Q1Panel();
        getContentPane().add(panel);
    }

}// end of class

class Q1Panel extends JPanel {
    public Q1Panel() {
        setPreferredSize(new Dimension(600, 200));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        Font font = new Font("Serif", Font.BOLD, 36);

        AffineTransform tx = new AffineTransform();
        tx.shear(0.5, 0);
        g2.setFont(font.deriveFont(tx));
        g2.drawString("Derived font", 100, 100);


        g2.setFont(font);
        FontRenderContext frc = g2.getFontRenderContext();
        String str = "String bounds";

        Rectangle2D bounds = font.getStringBounds(str, frc);
        g2.translate(100, 200);
        g2.draw(bounds);
        g2.drawString(str, 0, 0);


        str = "Baseline, ascent, descent, leading";
        g2.translate(0,100);
        int w = (int)font.getStringBounds(str, frc).getWidth();

        LineMetrics lm = font.getLineMetrics(str, frc);
        g2.drawLine(0, 0, w, 0);
        int y = -(int)lm.getAscent();
        g2.drawLine(0, y, w, y);
        y = (int)lm.getDescent();
        g2.drawLine(0, y, w, y);
        y = (int)(lm.getDescent()+lm.getLeading());
        g2.drawLine(0, y, w, y);

        g2.drawString(str,0,0);





        //creting a new shape

        /*
        Font font;
        font = new Font("Serif", Font.BOLD, 80);

        FontRenderContext fontline;
        fontline = g2.getFontRenderContext();



        GlyphVector movin;
        movin = font.createGlyphVector(fontline, "hey, its 3am");

        Shape glyph_Shape ;
       glyph_Shape= movin.getOutline(50, 200);

       g2.draw(glyph_Shape);
        //g2.draw(movin);

       // String StringLine = "This is just a test Message";

//FontRenderContext name_of_the_var = g2.FontRenderContext()

        //for priting this we code:

        //g2.draw(StringLine);

//        g2.drawString(StringLine, 200, 200);



        /*
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, 0.4f);
        g2.setComposite(ac);

        Shape rec1 = new Rectangle2D.Double(200, 200, 200, 400);
        //g2.setColor(Color.PINK);

        //g2.fill(rec1);
        Shape rec2 = new Rectangle2D.Double(200, 400, 200, 400);
        // g2.setColor(Color.cyan);
        // g2.fill(rec2);


        Area a1 = new Area(rec1);
        Area a2 = new Area(rec2);
        a1.intersect(a2);
        g2.clip(a1);
        g2.setColor(Color.PINK);
        g2.fill(a1);
        g2.setColor(Color.cyan);
        g2.fill(rec2);

        g2.fill(a2);


        //g2.clip(rec2);


        //a1.add(a2);
        /*
        //Shape clipShape = new Rectangle2D.Double(400, 600, 400, 200);
        Rectangle2D cp=new Rectangle2D.Double(200, 200, 200, 200);
        g2.setClip(cp);
        g2.draw(a1);

        g2.setClip(a2);
        //g2.fill(a1);



       // g2.setColor(Color.green);
       // Font font = new Font("Serif", Font.BOLD, 144);
        //g2.setFont(font);
        //g2.drawString("CS240", 80, 240);


        //transparency

        //AlphaComposite cp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5F);
        //g2.setComposite(cp);

        /*

        Shape s1 = new Rectangle2D.Double(200, 200, 400, 200);
        g2.setColor(Color.GREEN);
        g2.fill(s1);
        Shape s2 = new Rectangle2D.Double(400, 200, 200, 400);
        g2.setColor(Color.ORANGE);


         */


    }




/*
//clipping the ellipse
        GeneralPath path = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        Shape s2 = new Ellipse2D.Double(100,100,40,100);
        path.moveTo(100, 100);
        path.quadTo(250, 50, 400, 100);
        path.lineTo(400, 400);
        path.quadTo(250, 250, 100, 400);
        path.closePath();
        g2.clip(s2);
        g2.setColor(new Color(100, 100, 0));
        g2.fill(path);
        g2.setColor(Color.black);
        g2.setFont(new Font("Serif", Font.BOLD, 60));
        g2.drawString("CS240  TMA Fall DEMO", 80, 200);

 */
    }
