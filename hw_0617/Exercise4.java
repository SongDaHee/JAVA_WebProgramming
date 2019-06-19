package hw_0617;

public class Exercise4 {
	static void action(Robot robot) {
		if(robot instanceof DanceRobot) {
			DanceRobot dancerobot = new DanceRobot();
			dancerobot.dance();
		}
		else if(robot instanceof SingRobot) {
			SingRobot singrobot = new SingRobot(); 
			singrobot.sing();
		}
		else if(robot instanceof DrawRobot) {
			DrawRobot drawrobot = new DrawRobot();
			drawrobot.draw();
		}
			
	}
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for(int i=0; i<arr.length;i++)
			action(arr[i]);
		}
	}
	
class Robot{}
	
class DanceRobot extends Robot{
		void dance() {
			System.out.println("춤을 춥니다");
		}
	}
	
class SingRobot extends Robot{
		void sing() {
			System.out.println("노래를 합니다");
		}
	}
	
class DrawRobot extends Robot{
		void draw() {
			System.out.println("그림을 그립니다");
		}
	}

