package timertask;

import java.util.Timer;
import java.util.TimerTask;

public class TimertaskDemo {
	Timer timer ;
	public TimertaskDemo(int seconds){
		timer = new Timer();
		timer.schedule(new RemindTask() , seconds*1000);
	}
	class RemindTask extends TimerTask{
		public void run() {
			System.out.println("times up!!!");
			timer.cancel();
		}
	}
}

class Jtc13{
	public static void main(String[] args) {
		System.out.println("about to schedule task");
		new TimertaskDemo(5);
		System.out.println("task scheduled");
	}
}

