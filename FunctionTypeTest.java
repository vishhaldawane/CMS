
public class FunctionTypeTest {
	public static void main(String[] args) {
		
		Teacher teacherObj1 = new Teacher();
		teacherObj1.cleanWhiteBoard();
		teacherObj1.teaBreak(15);
		int totalMinutes = teacherObj1.assignments(5);
		System.out.println("Oh My God : it took "+totalMinutes+" minutes to solve these assignments");
	
		char theGrade  = teacherObj1.assigningGrade();
		
		System.out.println("The grade is : "+theGrade);
		
	}
}

class Teacher
{
	//no return        no argument - 1
	void cleanWhiteBoard() {
		System.out.println("Cleaning the white board..");
	}
	
	//no return    with argument - 2
	void teaBreak(int mnts) {
		System.out.println("teacher has given break of "+mnts+" minutes");
	}
	
	//with return     with arugments - 3
	int assignments(int numberOfAssignments) {
		System.out.println("teacher has given "+numberOfAssignments+" assignments");
		return numberOfAssignments*15; //30 may be minutes for us
	}
	
	//with return     no arguments - 4
	char assigningGrade() {
		System.out.println("teacher is assinging grade....");
		return 'B';
	}
}
/*
 
  
  Functions are of 4 types
  
  1. function without argument, and without return value
  
  2. function with arguments, but without return value
  
  3. function with arguments and with return value
  
  4. function without arguments, but with return value
  
  
 */