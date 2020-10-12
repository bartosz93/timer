package timer.eventlistener;

import javax.swing.JLabel;

import timer.Timer;

public class TimerStateChangedEventListener implements TimerStateChangedEvent {
	
	private JLabel label;
	
	public TimerStateChangedEventListener(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void onTimerStateChanged(int seconds) {
		this.label.setText(new Timer(seconds).toString());
	}
}
