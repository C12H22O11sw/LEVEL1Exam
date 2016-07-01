import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class codingExercise_1 implements ActionListener{

	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton buttonYellow = new JButton();
	static JButton buttonRed = new JButton();
	static JButton buttonBlue = new JButton();
	static JButton buttonGreen = new JButton();
	public static void main(String[] args) {
		codingExercise_1 thing = new codingExercise_1();
		thing.thingy();
	}
	void thingy(){
		frame.add(panel);
		
		panel.add(buttonYellow);
		panel.add(buttonBlue);
		panel.add(buttonRed);
		panel.add(buttonGreen);
		
		buttonYellow.setBackground(Color.YELLOW);
		buttonYellow.setOpaque(true);
		buttonRed.setBackground(Color.RED);
		buttonRed.setOpaque(true);
		buttonBlue.setBackground(Color.BLUE);
		buttonBlue.setOpaque(true);
		buttonGreen.setBackground(Color.GREEN);
		buttonGreen.setOpaque(true);		
		buttonGreen.addActionListener(this);
		buttonRed.addActionListener(this);
		buttonYellow.addActionListener(this);
		buttonBlue.addActionListener(this);

		frame.pack();
		frame.setVisible(true);

	}
	void speak(String words){
		try{
			Runtime.getRuntime().exec("say " + words);
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == buttonBlue){
			speak("blue");
		}
		if(e.getSource() == buttonRed){
			speak("red");
		}
		if(e.getSource() == buttonYellow){
			speak("yellow");
		}
		if(e.getSource() == buttonGreen){
			speak("green");
		}
		
	}

	
}
