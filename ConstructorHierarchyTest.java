
public class ConstructorHierarchyTest {
	public static void main(String[] args) {
		
//		GrandFather gf = new GrandFather();
//		gf.wakeupEarly();
//		gf.walking();
//		gf.farming();
//		System.out.println("---------------");
//		
//		Father father = new Father();
//		father.wakeupEarly();
//		father.walking();
//		father.farming();
//		
//		System.out.println("---------------");

		
		Child child = new Child();
		child.wakeupEarly();
		child.walking();
		child.farming();
	}
}

class GrandFather //Object class in java
{
	GrandFather() {
		//super();
		System.out.println("GrandFather() ctor...");
	}
	void farming() {
		System.out.println("GrandFather is farming...");
	}
	void walking() {
		System.out.println("GrandFather is walking...in the garden");
	}
	void wakeupEarly() {
		System.out.println("GrandFather is waking up at 4.30am");
	}
}


class Father extends GrandFather
{
	Father() {
		//super();
		System.out.println("Father() ctor...");
	}
	void farming() {
		System.out.println("Father is farming...with tractor..");
	}
	void walking() {
		System.out.println("Father is walking...in the balcony");
	}
	void wakeupEarly() {
		System.out.println("Father is waking up at 6.30am");
	}
}


class Child extends Father
{
	Child() {
		//super(); // default line to invoke nearest super class
		System.out.println("Child() ctor...");
	}
	void farming() {
		System.out.println("Child is farming...with robotic tractor..");
	}
	void walking() {
		System.out.println("Child is walking...in the gym's trademill");
	}
	void wakeupEarly() {
		System.out.println("Child is waking up at 8.30am");
	}
}