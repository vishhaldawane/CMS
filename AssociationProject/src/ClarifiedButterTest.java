
public class ClarifiedButterTest {
	public static void main(String[] args) {
		
		
		Cow cow = new Cow();
		Milk x = cow.milkACow();
		Curd curd = x.coagulate();
		Butter butter = curd.churn();
		ClarifiedButter clarifiedButter = butter.boil();
		clarifiedButter.show();
		
	}
}
class Cow
{
	Milk milkACow() {
		Milk y = new Milk(5000,"OffWhite","A2","Gir Cow");
		return y;
	}
}

class Curd
{
	Butter churn() {
		Butter butter = new Butter();
		return butter;
	}
}

class Butter
{
	ClarifiedButter boil() {
		ClarifiedButter cf = new ClarifiedButter();
		return cf;
	}
}

class ClarifiedButter
{
	void show() {
		System.out.println("Use this clarified butter to improve your health...");
	}
}