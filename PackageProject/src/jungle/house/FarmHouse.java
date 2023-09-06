package jungle.house;
import jungle.cave.Tiger;
import jungle.river.Frog;
import jungle.tree.Parrot;

public class FarmHouse {
	public static void main(String[] args) {
		
		System.out.println("Farm house main....");
		Parrot parrot = new Parrot();
		parrot.fly();
		
		Hen hen = new Hen();
		hen.eatRice();
		
		Frog frog = new Frog();
		frog.jump();
		frog.swim();
		//frog.hiberate();
	}
}

class BengalTiger extends Tiger
{
	void jump() {
		
		System.out.println("defaultA   "+super.defaultA);
		System.out.println("privateB   "+super.privateB);
		System.out.println("protectedC "+super.protectedC);
		System.out.println("publicD    "+super.publicD);
		
		System.out.println("White tiger is jumping..");;
	}
}
class Fox
{
	void show() {
		Tiger tiger = new Tiger();
		System.out.println("defaultA   "+tiger.defaultA);
		System.out.println("privateB   "+tiger.privateB);
		System.out.println("protectedC "+tiger.protectedC);
		System.out.println("publicD    "+tiger.publicD);
		
	}
}

class Lion
{
	void show() {
		Tiger tiger = new Tiger();
		System.out.println("defaultA   "+tiger.defaultA);
		System.out.println("privateB   "+tiger.privateB);
		System.out.println("protectedC "+tiger.protectedC);
		System.out.println("publicD    "+tiger.publicD);
		
	}
}
