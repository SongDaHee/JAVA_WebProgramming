package hw_0617;

public class Unit {
	void move(int x, int y) {
		System.out.println(x+","+y+"로 이동합니다");
	}
	
	void stop() {
		System.out.println("현재 위치에 정지합니다");
	}
}

class Marine extends Unit{
	int x;
	int y;
	
	void move(int x, int y) {
		System.out.println("marine"+x+","+y+"로 이동합니다");
	}
	
	void stop() {
		System.out.println("marine 현재 위치에 정지합니다");
	}
	
	void stimPack() {
		System.out.println("스팀팩을 사용한다");
	}
}

class Tank extends Unit{
	int x;
	int y;
	
	void move(int x, int y) {
		System.out.println("tank"+x+","+y+"로 이동합니다");
	}
	
	void stop() {
		System.out.println("tank 현재 위치에 정지합니다");
	}
	
	void changeMode() {
		System.out.println("공격모드를 변환한다");
	}

}

class Dropship extends Unit{
	int x;
	int y;
	
	void move(int x, int y) {
		System.out.println("dropship"+x+","+y+"로 이동합니다");
	}
	
	void stop() {
		System.out.println("dropship 현재 위치에 정지합니다");
	}
	
	void load() {
		System.out.println("선택된 대상을 태운다");
	}
	
	void unload() {
		System.out.println("선택된 대상을 내린다");
	}
}