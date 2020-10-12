package timer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TimerTest {

	@ParameterizedTest(name = "{index} => seconds={0}, expected={1}")
	@CsvSource({
		"0,'00:00:00'",
		"60,'00:01:00'",
		"3600,'01:00:00'"
	})
	void test(int seconds, String expected) {
		Timer timer = new Timer(seconds);
		
		assertEquals(expected, timer.toString());
	}

}
