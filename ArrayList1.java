package basicJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Dynamic Arrary
//
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar= new ArrayList<String>();
	    int counter=0;
	    for(String s:ar)
	    {  counter++;   }
		System.out.println("No arguments"+counter);
		
		ArrayList<String> br= new ArrayList<String>(30);
	    counter=0;
	    for(String s:br)
	    {  counter++;   }
		System.out.println("No arguments with capacity"+counter);
		String sArray[]= {"one","two","three","four","five"};
		List<String> list=Arrays.asList(sArray);
		ArrayList<String> cr= new ArrayList<String>(list);
	   cr.add("seven");
	    for(String s:cr)
	     
		System.out.println(" ArrayList list s "+s);
	    System.out.println(cr);
	   
		
		
		
		
		
	}

}
