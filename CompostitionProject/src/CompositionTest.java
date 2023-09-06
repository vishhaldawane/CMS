
public class CompositionTest {
	public static void main(String[] args) {
		
		
		
		
		Human human = new Human();
		human.think();
		human.walk(); //inherited from Mammal- as a parent 
		human.heart.pumping();
		human.liver.creatingBlood();
		human.rightKidney.filteringBlood();
		human.leftKidney.filteringBlood();
	}
}
class Heart
{
	void pumping() {
		System.out.println("Heart is pumping...");
	}
}
class Mammal
{
	void walk() {
		System.out.println("mammal is walking ....");
	}
}

class Liver
{
	void creatingBlood() {
		System.out.println("Liver is creating blood....");
	}
}
class Kidney
{
	void filteringBlood() {
		System.out.println("Filtering the blood...");
	}
}

class Human extends Mammal //isA -- Human is the "whole entity"
{
	//Heart is the Part of Human - vital part
	String name; //hasA
	Heart heart = new Heart(); //hasA - part of the "whole entity"
	Liver liver = new Liver();
	Kidney rightKidney = new Kidney();
	Kidney leftKidney = new Kidney();
	
	void think() {
		System.out.println("Human is thinking...");
	}
}

