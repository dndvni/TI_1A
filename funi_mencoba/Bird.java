import javax.swing.*;
import java.awt.*;

public class Bird extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        // Menggambar tubuh burung (elips)
        g.setColor(Color.RED);
        g.fillOval(100, 150, 100, 60);

        // Menggambar kepala burung (elips)
        g.setColor(Color.YELLOW);
        g.fillOval(200, 140, 40, 40);

        // Menggambar mata burung 
        g.setColor(Color.BLACK);
        g.fillOval(215, 155, 10, 10);

        // Menggambar paruh burung (segitiga)
        int[] xPoints = {235, 245, 255};
        int[] yPoints = {165 ,150, 165};
        g.fillPolygon(xPoints, yPoints, 3);

        // Menggambar sayap burung (elips)
        g.setColor(Color.RED);
        g.fillOval(90, 155, 40,20);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("gambar Burung");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Bird());
            frame.setSize(400, 300);
            frame.setVisible(true);
        });
    }
}