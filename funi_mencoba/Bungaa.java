import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Bungaa extends JPanel {

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        int petalCount = 8; // Jumlah kelopak bunga
        int petalLength = 100;
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Gambar kelopak bunga dengan warna acak 
        for (int i = 0; i < petalCount; i++){
            double angle = 2 * Math.PI * i / petalCount;
            int x = (int) (centerX + petalLength * Math.cos(angle));
            int y = (int) (centerY + petalLength * Math.sin(angle));

            g2d.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
            Ellipse2D.Double petal = new Ellipse2D.Double(x - 50, y - 50, 100, 100);
            g2d.fill(petal);
        }

        // Gambar tengah bunga
        g2d.setColor(Color.YELLOW);
        Ellipse2D.Double centerCircle = new Ellipse2D.Double(centerX - 30, centerY - 30, 60,60);
        g2d.fill(centerCircle);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Bunga");
            frame.add(new Bunga());
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}