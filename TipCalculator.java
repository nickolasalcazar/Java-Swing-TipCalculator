import javax.swing.*;
import java.awt.*;

public class TipCalculator extends JFrame {
	JTextField originalTotal;
	JTextField tipPercent;
	JFormattedTextField newTotal;
	JButton calcBtn;
	JButton quitBtn;

	public static void main(String[] args) {
		new TipCalculator();
	}

	public TipCalculator() {
		this.setSize(250,225);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Tip Calculator");

		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());

		GridBagConstraints gridConstraints = new GridBagConstraints();

		gridConstraints.gridwidth = 1;
		gridConstraints.gridheight = 1;

		// Original total input
		//gridConstraints.insets = new Insets(5,30,5,5);

		gridConstraints.anchor = GridBagConstraints.WEST;

		originalTotal = new JTextField("");
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 1;
		originalTotal.setPreferredSize(new Dimension(100,30));
		panel.add(originalTotal, gridConstraints);
		
		// Tip Percent input
		tipPercent = new JTextField("0.0");
		gridConstraints.gridy = 2;
		tipPercent.setPreferredSize(new Dimension(100,30));
		panel.add(tipPercent, gridConstraints);

		// New total label
		newTotal = new JFormattedTextField("TOTAL");
		newTotal.setEditable(false);
		newTotal.setForeground(Color.red);
		gridConstraints.gridy = 3;
		newTotal.setPreferredSize(new Dimension(100,30));
		panel.add(newTotal, gridConstraints);

		// Calculate button
		//gridConstraints.anchor = GridBagConstraints.EAST;
		gridConstraints.anchor = GridBagConstraints.CENTER;
		calcBtn = new JButton("Calculate");
		gridConstraints.gridy = 4;
		calcBtn.setPreferredSize(new Dimension(100,30));
		panel.add(calcBtn, gridConstraints);

		// Quit button
		quitBtn = new JButton("Quit");
		gridConstraints.gridy = 5;
		quitBtn.setPreferredSize(new Dimension(100,30));
		panel.add(quitBtn, gridConstraints);

		// Labels
		gridConstraints.anchor = GridBagConstraints.EAST;
		gridConstraints.insets = new Insets(5,5,5,30);

		gridConstraints.gridx = 1;
		gridConstraints.gridy = 1;
		JLabel originalTotalLabel = new JLabel("Total:");
		panel.add(originalTotalLabel, gridConstraints);

		gridConstraints.gridy = 2;
		JLabel tipPercentLabel = new JLabel("Tip (%):");
		panel.add(tipPercentLabel, gridConstraints);

		gridConstraints.gridy = 3;
		JLabel newTotalLabel = new JLabel("Total + Tip:");
		panel.add(newTotalLabel, gridConstraints);

		this.add(panel);
		this.setVisible(true);
	}
}