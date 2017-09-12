package dkff;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class CoinTest extends JPanel
   implements ActionListener
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Coinflip coin;

  public CoinTest ()
  {
    Image heads = (new ImageIcon("/Users/muditchandna/Desktop/ /Personal/US TRIP/Mudit C/Hello World/src/dkff/g95.jpg")).getImage();
    Image tails = (new ImageIcon("/Users/muditchandna/Desktop/ /Personal/US TRIP/Mudit C/Hello World/src/dkff/220px-Hk1dollarcoina.JPG")).getImage();
    coin = new Coinflip(heads, tails);

    Timer clock = new Timer(2000, this);
    clock.start();
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = 0;
    int y = 0;
    coin.draw(g, x, y);
  }

  public void actionPerformed(ActionEvent e)
  {
    coin.flip();
    repaint();
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Flipping coin");
    w.setSize(1024, 768);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    CoinTest panel = new CoinTest();
    panel.setBackground(Color.WHITE);
    Container c = w.getContentPane();
    c.add(panel);

    w.setVisible(true);
  }
}
