import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MainMenu extends JFrame{
    MainMenu(){

        JLabel imageLabel = new JLabel();

        ImageIcon snakeImage = new ImageIcon("peppa.jpeg");

        imageLabel.setIcon(snakeImage);

        JButton startButton = new JButton();
        startButton.setText("START GAME");
        startButton.setFont(new Font("Arial", Font.BOLD, 25));

        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);
        
        this.add(imageLabel);
        this.add(startButton);

        this.setLayout(new FlowLayout());

        this.setTitle("Snake Game");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize (500, 500);

        this.setLocationRelativeTo(null);

        this.setVisible(true);

        this.setResizable(false);

        this.getContentPane().setBackground(Color.PINK);
   }

   private class EventHandler implements ActionListener{

    public void actionPerformed(ActionEvent event){

        new ColorMenu();

        dispose();
    }
   }
}
