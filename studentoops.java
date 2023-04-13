import java.util.Scanner;
public class studentoops {
	String name;
    int roll_number;
	public static void main(String[] args) {
  //  Scanner s= new Scanner(source) 
		
    studentoops s1= new studentoops();
    studentoops s2= new studentoops();
    System.out.println(s1);  
    s1.name= "abc";
    s1.roll_number =10;
    System.out.println(s1.name +" "+ s2.roll_number);
	
	s2.name="def";
	s2.roll_number=55;
	
	System.out.println(s2.name+" "+ s2.roll_number);
    //System.out.println(roll_number);
	}
}
