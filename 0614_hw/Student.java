
public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		float avg = (float) (getTotal()/3.0);
		return (float) ((Math.round(avg*10)) /10.0);
	}
}
