import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class DigitalClock extends JFrame {

    JLabel clockLabel;

    DigitalClock() {

        setTitle("Digital Clock");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        clockLabel = new JLabel();
        clockLabel.setFont(new Font("Arial", Font.BOLD, 40));

        add(clockLabel);

        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();

        updateClock();

        setVisible(true);
    }

    public void updateClock() {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(new Date());

        clockLabel.setText(time);
    }

    public static void main(String[] args) {

        new DigitalClock();
    }
}