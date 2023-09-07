
public class KiteTest {
	public static void main(String[] args) {
		
		//how many kites are
		Kite.showKiteCount();
		
		Kite kite1 = new Kite("Blue",50,"Piyush",true);
		Kite kite2 = new Kite("Red",60,"Amod",true);

		//how many here
		Kite.showKiteCount();
		
		Kite kite3 = new Kite("Green",80,"Jack",true);

		//how many here
		Kite.showKiteCount();

		Kite kite4 = new Kite("Yellow",40,"Jane",true);
		Kite kite5 = new Kite("Purple",30,"Julie",true);
		Kite.showKiteCount();

		
		kite1.kiteFight(kite2);
		
		Kite.showKiteCount();

	}
}


class Kite
{
	private String color;
	private int length;
	private String owner;
	private boolean flying;
	
	private static int kiteCount;
	
	
	void kiteFight(Kite kiteRef) {
		System.out.println(owner+ " has started the Kite fight ...with .."+kiteRef.owner);
		double val  = Math.random()%10;
		if(val>0.80) {
			kiteCount--;
			flying=false;
			System.out.println(owner+" lost the kite");
		}
		else if(val<0.40) {
			kiteCount--;
			kiteRef.flying=false;
			System.out.println(kiteRef.owner+" lost the kite");

		}
		else if(val>=0.50 && val<=0.60) {
			kiteCount--;
			kiteCount--;
			flying=false;
			kiteRef.flying=false;
			System.out.println(owner+" lost the kite");
			System.out.println(kiteRef.owner+" lost the kite");

		}
	}
	
	public static void showKiteCount() {
		System.out.println("Count  :"+kiteCount);

	}
	
	
	
	public Kite(String color, int length, String owner, boolean flying) {
		super();
		this.color = color;
		this.length = length;
		this.owner = owner;
		this.flying = flying;
		kiteCount++;
		
	}
	@Override
	public String toString() {
		return "Kite [color=" + color + ", length=" + length + ", owner=" + owner + ", flying=" + flying + "]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public boolean isFlying() {
		return flying;
	}
	public void setFlying(boolean flying) {
		this.flying = flying;
	}
	
	
}

/*
		Kite kite1 = new Kite("Blue",50,"Piyush",true);
		System.out.println("kite1 :"+kite1 );
		
		Kite kite2 = kite1;
		System.out.println("kite2 :"+kite2 );
		
		Kite kite3 = kite2;
		System.out.println("kite3 :"+kite3 );
		
		System.out.println("kite1: "+kite1.hashCode());
		System.out.println("kite2: "+kite2.hashCode());
		System.out.println("kite3: "+kite3.hashCode());

		Kite kite4 =kite1;
		System.out.println("kite4: "+kite4.hashCode());

		System.out.println("kite4: "+kite4);

		System.out.println("setting a new color...to kite4");
		kite4.setColor("LightBlue");
		
		System.out.println("kite1: "+kite1);		
		System.out.println("kite4: "+kite4);
		
		System.out.println("setting a new owner...to kite1");
		kite1.setOwner("Amod");

		System.out.println("kite1: "+kite1);		
		System.out.println("kite4: "+kite4);


*/