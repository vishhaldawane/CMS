
public class GeneralTest {
	public static void main(String[] args) {
		
		try {
			String company ="CMS Computers Limited";
		
			System.out.println("company : "+company);
		
			System.out.println("Character : "+company.charAt(4));
			System.out.println("company : "+company.substring(14,28));
		
			System.out.println("company : "+company.toUpperCase());
			System.out.println("company : "+company.toLowerCase());
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Some problem1 : "+e);
		}
		catch(NullPointerException e) {
			System.out.println("Some problem2 : "+e);
					
		}
		System.out.println("END");
		
	}
}
