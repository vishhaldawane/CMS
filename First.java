class Greet 
{
  public static void main(String args[])
  {
     System.out.println("Hello world");

     Cricketer player1= new Cricketer();
     Cricketer player2= new Cricketer();
     Cricketer player3= new Cricketer();
     Cricketer player4= new Cricketer();
     
	player1.setCricketerDetails(1,"Rohit Sharma",0,30,"India",67.8f);
	player2.setCricketerDetails(2,"Virat Kohli",0,35,"India",77.8f);
	player3.setCricketerDetails(3,"MS Dhoni",0,44,"India",87.8f);
	player4.setCricketerDetails(4,"Sanju Samson",25,30,"India",57.8f);
	

	player1.showCricketerDetails();
	player2.showCricketerDetails();
	player3.showCricketerDetails();
	player4.showCricketerDetails();
	
	player1.hitSixer();
	player2.hitSixer();
	player1.hitSixer();
	player1.hitSixer();
	player1.hitSixer();
	player1.hitSixer();
	player1.hitSixer();
	player2.hitSixer();
	player2.hitSixer();
	player2.hitSixer();
	player2.hitSixer();
	player1.hitBoundry();
	player2.hitBoundry();
	player2.hitBoundry();
	player1.hitBoundry();

	player1.hitSixer();
	player2.hitBoundry();
	player1.hitSixer();
	player2.hitBoundry();
	
	System.out.println("-----------");
	player1.showCricketerDetails();
	player2.showCricketerDetails();
	
	float totalScore = player1.score + player2.score;
	System.out.println("Total Score : "+totalScore);
  }
}


class Monkey
{
   public void jump() 
   {
      System.out.println("Hello monkey...jumping...");
   }

   public void gigling() 
   {
      System.out.println("Hello monkey..gigling......");
   }
}
   
class Cricketer
{
   int rank;
   String cricketerName;
   int score;
   int age;
   String country;
   float strikeRate;

   void setCricketerDetails(int a , String b, int c, int d, String e, float f)
   {
 	rank = a;
	cricketerName = b;
	score= c;
	age = d;
	country = e;
	strikeRate = f;	
   }

   void showCricketerDetails() 
   {
	System.out.println("Rank           : "+rank);
	System.out.println("Cricketer Name : "+cricketerName);
	System.out.println("Score          : "+score);
	System.out.println("Age            : "+age);
	System.out.println("Country        : "+country);
	System.out.println("Strike Rate    : "+strikeRate);
	System.out.println("-------------------");
   }

   public void hitSixer() 
   {
      System.out.println(cricketerName+ "  is hitting sixer....");
      score = score + 6;
   }

   public void hitBoundry() 
   {
      System.out.println(cricketerName+" is hitting four runs....");
      score = score + 4; 
   }
}
