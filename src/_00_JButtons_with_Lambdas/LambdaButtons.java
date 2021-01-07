package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((e) -> {
			int one;
			String oneone;
			int two;
			String twotwo;
			int total;
			JOptionPane.showMessageDialog(null, "what numbers do you want to add?");
			oneone = JOptionPane.showInputDialog("first number:");
			twotwo = JOptionPane.showInputDialog("your first number is " + oneone + " add another.");
			one = Integer.parseInt(oneone);
			two = Integer.parseInt(twotwo);
			total = one + two;
			JOptionPane.showMessageDialog(null, one + " + " + two + " equals " + total);
		});
		randNumber.addActionListener((e) -> {
			int randNum;
			Random rand = new Random();
			randNum = rand.nextInt();
			JOptionPane.showMessageDialog(null, "Here is your random number: " + randNum);
		});
		tellAJoke.addActionListener((e) -> {
			int randNum;
			Random rand = new Random();
			randNum = rand.nextInt(5);
			System.out.println(randNum);
			if (randNum == 0) {
				JOptionPane.showMessageDialog(null, "What Is the best thing about Switzerland? \n i really don't know, but the flag is a plus.");
			} else if(randNum == 1) {
				JOptionPane.showMessageDialog(null, "Why do bees have sticky hair? \n because they use honeycombs");
			} else if(randNum == 2) {
				JOptionPane.showMessageDialog(null, "Why should you never believe a clock? \n its usually second hand information");
			} else if (randNum == 3) {
				JOptionPane.showMessageDialog(null, "how do you tell if a vampire is sick? \n By how much he is coffin");
			} else {
				JOptionPane.showMessageDialog(null, "how many times can you subtract 10 from 100? \n once otherwise you would be subtracting 10 from 90");
			}
		});
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
