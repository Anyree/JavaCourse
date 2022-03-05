import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

class CounterApp extends JFrame {
	
    private int value;

    public static void main(String[] args) {
	new CounterApp(0);
    }
	
    CounterApp(final int initialValue) {
	setTitle("Simple Counter");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(300,120);
	setLocationRelativeTo(null);
		
	Font font = new Font("Arial", Font.BOLD, 42);
		
	value = initialValue;
		
	JLabel counterValueview = new JLabel();
	counterValueView.setFont(font);
	counterValueview.setHorizontalAlignment(SwingConstants.CENTER);
	add(counterValueView, BorderLayout.CENTER);
		
	counterValueview.setText(String.valueOf(value));
	
        JButton decrementButton = new JButton("<");
	decrementButton.setFont(font);
	decrementButton.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent actionEvent) {
	        value--;
	        counterValueview.setText(String.valueOf(value));
	    }
	});
	add(decrementButton, BorderLayout.WEST);
		
	JButton incrementButton = new JButton(">");
	incrementButton.setFont(font);
	incrementButton.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent actionEvent) {
	        value++;
		counterValueview.setText(String.valueOf(value));
	    }
	});
	add(incrementButton, BorderLayout.EAST);
	
	setVisible(true);
	}
}
