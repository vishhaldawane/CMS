
public class KiteTest {
	public static void main(String[] args) {
		
		Kite kite1 = new Kite("Blue",50,"Piyush",true);
		Kite kite2 = new Kite("Red",60,"Amod",true);

		Cricketer cricketer1 = new Cricketer("Amal");
		
		 Playground ground = new Playground();
		 
		 ground.play(kite1, kite2, cricketer1); 
	}
}



class Playground
{
	void play(Kite x, Kite y, Cricketer z) { //x (play) is a proxy of kite1(main)
		System.out.println(x.getOwner()+" and "+y.getOwner()+" are playing at the ground...with "+x.getColor()+ " kite and "+y.getColor()+" kite");
		System.out.println(z.getName()+" is playing cricket...");
	}
}


class Cricketer
{
	String name;

	public Cricketer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}




/*
  		

 */





class Kite
{
	String color;
	int length;
	String owner;
	boolean flying;
	public Kite(String color, int length, String owner, boolean flying) {
		super();
		this.color = color;
		this.length = length;
		this.owner = owner;
		this.flying = flying;
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