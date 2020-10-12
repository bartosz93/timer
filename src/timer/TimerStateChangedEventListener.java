package timer;

import javax.swing.JLabel;

public class TimerStateChangedEventListener implements TimerStateChangedEvent {
	
	private JLabel label;
	
	public TimerStateChangedEventListener(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void onTimerStateChanged(int seconds) {
		this.label.setText(""+seconds);
	}
}
