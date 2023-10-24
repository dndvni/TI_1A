import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class Bunga extends JPanel{


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Gambar bunga 
        g2d.setColor(Color.RED);

        Ellipse2D.Double bunga1 = new Ellipse2D.Double(100, 100, 50, 50);
        Ellipse2D.Double bunga2 = new Ellipse2D.Double(120, 70, 50, 50);
        Ellipse2D.Double bunga3 = new Ellipse2D.Double(150, 100, 50, 50);
        Ellipse2D.Double bunga4 = new Ellipse2D.Double(120, 130, 50, 50);
        
        g2d.fill(bunga1);
        g2d.fill(bunga2);
        g2d.fill(bunga3);
        g2d.fill(bunga4);

        GeneralPath tangkai = new GeneralPath();
        tangkai.moveTo(135, 160);
        tangkai.lineTo(135, 200);
        g2d.setColor(Color.GREEN);
        g2d.setStroke(new BasicStroke(4));
        g2d.draw(tangkai);

        };
        public static void main(String[] args){
            SwingUtilities.invokeLater(() ->{
                JFrame frame = new JFrame("Bunga");
                frame.add(new Bunga());
                frame.setSize(300, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            });
            }
        }
    
