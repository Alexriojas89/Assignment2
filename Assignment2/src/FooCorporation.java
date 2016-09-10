import java.util.ArrayList;

public class FooCorporation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<Integer> hoursworked = new ArrayList<Integer>();
hoursworked.add(35);
hoursworked.add(47);
hoursworked.add(73);

ArrayList<Double> BasePay = new ArrayList<Double> ();
BasePay.add(7.50);
BasePay.add(8.20);
BasePay.add(10.00);

 for (Integer hours : hoursworked){
 for (Double Pay : BasePay){  
     if (hours > 60 && Pay < 8){
    	 System.out.println("error");
     } else if (hours > 40){
    	 System.out.println(Pay * hours * 1.5);
    	 }
   }
    }
}
	}
