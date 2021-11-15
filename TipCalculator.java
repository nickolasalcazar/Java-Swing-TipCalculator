import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TipCalculator extends JFrame {
	JTextField totalField;
	JTextField tipPercentField;
	JFormattedTextField newTotalField;
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

		ListenForButton lForButton = new ListenForButton();

		GridBagConstraints gridConstraints = new GridBagConstraints();

		gridConstraints.gridwidth = 1;
		gridConstraints.gridheight = 1;

		// Original total input
		gridConstraints.anchor = GridBagConstraints.WEST;

		totalField = new JTextField("");
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 1;
		totalField.setPreferredSize(new Dimension(100,30));
		panel.add(totalField, gridConstraints);
		
		// Tip Percent input
		tipPercentField = new JTextField("0.0");
		gridConstraints.gridy = 2;
		tipPercentField.setPreferredSize(new Dimension(100,30));
		panel.add(tipPercentField, gridConstraints);

		// New total label
		newTotalField = new JFormattedTextField("TOTAL");
		newTotalField.setEditable(false);
		newTotalField.setForeground(Color.red);
		gridConstraints.gridy = 3;
		newTotalField.setPreferredSize(new Dimension(100,30));
		panel.add(newTotalField, gridConstraints);

		// Calculate button
		gridConstraints.anchor = GridBagConstraints.CENTER;
		calcBtn = new JButton("Calculate");
		gridConstraints.gridy = 4;
		calcBtn.setPreferredSize(new Dimension(100,30));
		panel.add(calcBtn, gridConstraints);

		// Quit button
		quitBtn = new JButton("Quit");
		quitBtn.addActionListener(lForButton);
		gridConstraints.gridy = 5;
		quitBtn.setPreferredSize(new Dimension(100,30));
		panel.add(quitBtn, gridConstraints);

		// Labels
		gridConstraints.anchor = GridBagConstraints.EAST;
		gridConstraints.insets = new Insets(5,5,5,30);

		gridConstraints.gridx = 1;
		gridConstraints.gridy = 1;
		JLabel totalLabel = new JLabel("Total:");
		panel.add(totalLabel, gridConstraints);

		gridConstraints.gridy = 2;
		JLabel tipPercentFieldLabel = new JLabel("Tip (%):");
		panel.add(tipPercentFieldLabel, gridConstraints);

		gridConstraints.gridy = 3;
		JLabel newTotalFieldLabel = new JLabel("Total + Tip:");
		panel.add(newTotalFieldLabel, gridConstraints);

		this.add(panel);
		this.setVisible(true);
	}

	private class ListenForButton implements ActionListener { 
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == quitBtn) System.exit(0);
		}
	}
}