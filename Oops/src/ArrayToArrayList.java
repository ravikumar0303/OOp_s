import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Array Convert To ArrayList 
/* Method
   1.Arrays.asList()
   2.Collections.addAll()
   3.add()
            Syntax--Arrays.asList(item);
   
            */

public class ArrayToArrayList{
	public static void main(String[] args) {
		String [] item= {"abc","def","ghi"};
		List conv=Arrays.asList(item);
	 	
		System.out.println("List of Array TO ArrayList:"+conv);
	}
}