package check;
import constants.Constants;

//課題①
public class Main {

	  	
	    private static String firstName = "ゆい";		//名前
	    private static String lastName = "はしづめ";	//名字

	  
//課題②
	 
	  private static  String printName(String firstName, String lastName) {
	    return lastName + firstName;
	  }

	  
//課題③
	  public static void main(String[] args) {

		    System.out.println("printNameメソッド　→　" + printName(firstName, lastName));

	Pet pt = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pt.introduce();
	 
	  
	
	RobotPet rpt = new RobotPet("R2D2", "LUKE") ;
		rpt.introduce();
		
	  }

}
