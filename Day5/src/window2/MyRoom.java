package window2;

public class MyRoom {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.leg = 4;
		dog.tail = true;
		
		dog.bark();
		dog.shake();
		
		System.out.println(dog.leg);
		System.out.println(dog.tail);
		
		System.out.println("-----------------------------");
		
		Tv tv1 = new Tv(); // ������ ����
		tv1.shape = "�׸�";
		tv1.stand = true;
		
		tv1.turnOn();
		tv1.change(100);
		
		Tv tv2 = new Tv();
		tv2.shape = "���̾Ƹ��";
		tv2.stand = false;
		
		tv2.turnOn();
		tv2.change(200);
		
		System.out.println("-----------------------------");
		
		System.out.println(tv1);
		System.out.println(tv2);
		
		
		
		
		
		
		
	}

}
