// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03vst
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 80 Point Version\n");
	  int startSeconds = 10000;
	  int hours = startSeconds/ 3600;
	  int hRemainder = startSeconds % 3600;
	  int mins = hRemainder / 60;
	  int seconds = hRemainder % 60;
	  System.out.println("Starting seconds    :" + startSeconds);
	  System.out.println("Hours:   " + hours);
	  System.out.println("Minutes:   " + mins);
	  System.out.println("Seconds:   " + seconds);


	}
}

