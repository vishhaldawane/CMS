
public class AssociationTest {
	public static void main(String[] args) {
		
		Milk milk = new Milk(150,"OffWhite","A2","Gir Cow");
		
		Fruit fruit = new Fruit("Apple","Creamy","Round","Sour",50);
		
		Sugar sugar = new Sugar(50, "Organic", "Brown");
		
		Ice ice = new Ice(3,"Square","Mineral","hard","80%");
				
		
		
		Kitchen kitchen  = new Kitchen();
		MilkShake milkShake = kitchen.makeASoftDrink(milk, fruit, sugar, ice);
		
		System.out.println("color : "+milkShake.getColor());
		System.out.println("qty   : "+milkShake.getQuantity());
		System.out.println("taste : "+milkShake.getTaste());
		System.out.println("type  : "+milkShake.getType());

		

		
	}
}

class Kitchen
{
	
								//passing object 
	MilkShake  makeASoftDrink(Milk m, Fruit f, Sugar s, Ice i) {
		
		MilkShake milkShake = new MilkShake();
		milkShake.setColor(m.getColor() + f.getColor());
		milkShake.setQuantity(m.getQuantity() + f.getQuantity()+i.getQuantity());
		milkShake.setTaste(f.getTaste());
		milkShake.setType(f.getName());
		return milkShake; //producing an object
		
	}
	
	float calculate(int i, int j) {
		float sum = i+j;
		return sum;
	}
}

class MilkShake
{
	String type;
	int quantity;
	String color;
	String taste;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	
	
}

//Fruit Milkshake
// Milk, Fruit, Sugar, Ice

class Milk
{
	int quantity;
	String color;
	String type; //A2 or A1
	String source; // cow, Buff, goat
	
	public Milk(int quantity, String color, String type, String source) {
		super();
		this.quantity = quantity;
		this.color = color;
		this.type = type;
		this.source = source;
	}
	
	void showMilk() {
		System.out.println("qty    : "+quantity);
		System.out.println("col    : "+color);
		System.out.println("type   : "+type);
		System.out.println("source : "+source);
		
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	
}


class Fruit
{
	String name;
	String color;
	String shape;
	String taste;
	int quantity;
	public Fruit(String name, String color, String shape, String taste, int quantity) {
		super();
		this.name = name;
		this.color = color;
		this.shape = shape;
		this.taste = taste;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}

class Sugar
{
	int quantity;
	String type;
	String color;
	public Sugar(int quantity, String type, String color) {
		super();
		this.quantity = quantity;
		this.type = type;
		this.color = color;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}

class Ice
{
	int quantity;
	String shape;
	String waterSource;
	String density;
	String purity;
	
	public Ice(int quantity, String shape, String waterSource, String density, String purity) {
		super();
		this.quantity = quantity;
		this.shape = shape;
		this.waterSource = waterSource;
		this.density = density;
		this.purity = purity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getWaterSource() {
		return waterSource;
	}

	public void setWaterSource(String waterSource) {
		this.waterSource = waterSource;
	}

	public String getDensity() {
		return density;
	}

	public void setDensity(String density) {
		this.density = density;
	}

	public String getPurity() {
		return purity;
	}

	public void setPurity(String purity) {
		this.purity = purity;
	}
	
	
	
	
}


