package timer;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {

	public static List<TimerStateChangedEvent> listeners;
	
	public static void main(String[] args) {


		listeners = new ArrayList<TimerStateChangedEvent>();

		
		TimerState timer = new TimerState(listeners);
		JFrame frame = new JFrame("Timer");
		JPanel buttonsPanel = new JPanel();
		JButton startButton = new JButton("Start");
		JButton stopButton = new JButton("Stop");
		JLabel label = new JLabel("");
		listeners.add(new TimerStateChangedEventListener(label));
		
		startButton.addActionListener(new StartButtonActionListener(timer));
		stopButton.addActionListener(new StopButtonActionListener(timer));

		buttonsPanel.add(startButton);
		buttonsPanel.add(stopButton);

		frame.add(label);
		frame.add(buttonsPanel, BorderLayout.CENTER);

		frame.setLayout(new GridLayout(0, 1));
		frame.setTitle("Timer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}

	public static String getTime(int secondsPassed) {

		int hours = secondsPassed / 3600;
		int minutes = (secondsPassed % 3600) / 60;
		int seconds = secondsPassed % 60;

		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

}