package hw_0617;

public class Unit {
	void move(int x, int y) {
		System.out.println(x+","+y+"�� �̵��մϴ�");
	}
	
	void stop() {
		System.out.println("���� ��ġ�� �����մϴ�");
	}
}

class Marine extends Unit{
	int x;
	int y;
	
	void move(int x, int y) {
		System.out.println("marine"+x+","+y+"�� �̵��մϴ�");
	}
	
	void stop() {
		System.out.println("marine ���� ��ġ�� �����մϴ�");
	}
	
	void stimPack() {
		System.out.println("�������� ����Ѵ�");
	}
}

class Tank extends Unit{
	int x;
	int y;
	
	void move(int x, int y) {
		System.out.println("tank"+x+","+y+"�� �̵��մϴ�");
	}
	
	void stop() {
		System.out.println("tank ���� ��ġ�� �����մϴ�");
	}
	
	void changeMode() {
		System.out.println("���ݸ�带 ��ȯ�Ѵ�");
	}

}

class Dropship extends Unit{
	int x;
	int y;
	
	void move(int x, int y) {
		System.out.println("dropship"+x+","+y+"�� �̵��մϴ�");
	}
	
	void stop() {
		System.out.println("dropship ���� ��ġ�� �����մϴ�");
	}
	
	void load() {
		System.out.println("���õ� ����� �¿��");
	}
	
	void unload() {
		System.out.println("���õ� ����� ������");
	}
}