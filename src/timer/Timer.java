package timer;

public class Timer {

	private int seconds;
	
	public Timer(int seconds) {
		this.seconds = seconds;
	}
	
	@Override
	public String toString() {
		int hours = this.seconds / 3600;
		int minutes = (this.seconds % 3600) / 60;
		int seconds = this.seconds % 60;

		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}
}
