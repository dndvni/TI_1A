import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BurungGame extends JPanel implements ActionListener, KeyListener {
    private int burungY;
    private int rintanganX;
    private int rintanganY;
    private Timer timer;

    public BurungGame() {
        burungY = 200;
        rintanganX = 600;
        rintanganY = 200;

        timer = new Timer(10, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Gambar Burung 
        g.setColor(Color.RED);
        g.fillRect(100, burungY, 30, 30);

        // Gambar rintangan 
        g.setColor(Color.GREEN);
        g.fillRect(rintanganX, rintanganY, 50, 50);
    }

    public void actionPerformed(ActionEvent e) {
        // Update posisi rintangan 
        rintanganX -= 2;
        if (rintanganX < 0) {
            rintanganX = 600;
            rintanganY = (int) (Math.random() * 400);
        }

        // Update posisi burung
        burungY += 1;

        // Cek tabrakan 
        if (burungY > rintanganY && burungY < rintanganY + 50 && rintanganX < 130 && rintanganX + 50 > 100) {
            timer.stop();
            JOptionPane.showMessageDialog(this, "Game Over!");
            System.exit(0);
        }

        repaint();

    }

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            burungY -= 40;
        }
    }

    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Burung Game");
        BurungGame game = new BurungGame();
        frame.add(game);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}