
public class CurrentTime {

	public static void main(String[] args) 
	{
		// Millisecond 
		long currentTimeMS = System.currentTimeMillis();
		// Current Second 
		long currentSecond = (currentTimeMS / 1000) % 60;
		// Current Minute 
		long currentMinute = (currentTimeMS / 1000 /60) % 60;
		// Current Hour 
		long currentHour = (currentTimeMS / 1000 /60 / 60) % 24;
		
		System.out.println(String.format("Current Time is %d:%d:%d GMT", currentHour, currentMinute, currentSecond));

	}

}
