package timer;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import timer.actionlistener.RestartButtonActionListener;
import timer.actionlistener.StartButtonActionListener;
import timer.actionlistener.StopButtonActionListener;

import timer.eventlistener.TimerStateChangedEvent;
import timer.eventlistener.TimerStateChangedEventListener;

public class App {
	
	public static List<TimerStateChangedEvent> listeners;
	
	public static void main(String[] args) {
		
		listeners = new ArrayList<TimerStateChangedEvent>();
		
		TimerState timer = new TimerState(listeners);
		JFrame frame = new JFrame("Timer");
		JPanel buttonsPanel = new JPanel();
		JButton startButton = new JButton("Start");
		JButton stopButton = new JButton("Stop");
		JButton restartButton = new JButton("Reset");
		JLabel label = new JLabel(new Timer(0).toString());
		listeners.add(new TimerStateChangedEventListener(label));
		
		startButton.addActionListener(new StartButtonActionListener(timer));
		stopButton.addActionListener(new StopButtonActionListener(timer));
		restartButton.addActionListener(new RestartButtonActionListener(timer));
		
		buttonsPanel.add(startButton);
		buttonsPanel.add(stopButton);
		buttonsPanel.add(restartButton);
		
		frame.add(label);
		frame.add(buttonsPanel, BorderLayout.CENTER);
		
		frame.setLayout(new GridLayout(0, 1));
		frame.setTitle("Timer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
}
