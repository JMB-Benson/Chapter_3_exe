package diego.benson;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		
		double ItemCost1;
		double ItemCost2;
		double ItemCost3;
		double SaleTax;
		int Tip;
		double TotalItemCost;
		double TotalAmount;
		
		
		
		
		// menu
		System.out.println("__________________________________________________________\r\n" + 
				"		|      Crispy Chicken Tender Salad	 $10.49                     \r\n" + 
				"		| 		Grilled Chicken Salad  $10.99						    \r\n" + 
				"		| 		Southwestern Chicken Salad  $10.49					    \r\n" + 
				"		| 		Southwestern Steak Salad	$11.49					    \r\n" + 
				"		| 		Thai Shrimp Salad			$10.99					    \r\n" + 
				"		| 		Oriental Chicken Salad		$10.49						\r\n" + 
				"		| 		Oriental Grilled Chicken Salad $10.99					\r\n" + 
				"		| 		Grilled Chicken Caesar Salad  $10.49					\r\n" + 
				"		| 		Blackened Shrimp Caesar Salad $11.49				    \r\n" + 
				"		 ---------------------------------------------------------\r\n");
		//prompt user to put in 3 item cost
		System.out.println("Type in 3 of the item costs");
		Scanner input = new Scanner(System.in);
		
		
		ItemCost1 = input.nextDouble();
		ItemCost2 = input.nextDouble();
		ItemCost3 = input.nextDouble();
		//Add all items
		TotalItemCost = ItemCost1+ItemCost2+ItemCost3;
		double roundOff = Math.round(TotalItemCost*100)/100;
		
		//Add sale tax
		SaleTax = (roundOff*4.7);
		double roundSaleTax =  Math.round(SaleTax*100)/100;
		
		//prompt user to type in sale tax
		System.out.println("type in Tip");
		
		Tip = input.nextInt();
		
		double TipAdd = Tip/100;
		//add all of it together
		TotalAmount = ( roundSaleTax + TipAdd );
		double TotalAmountOff = Math.round(TotalAmount*100)/100;
		//prompt user the total
		System.out.println(" Your total amount is "+ TotalAmountOff);
		System.out.println(" Your tip is "+ TotalAmount);
		System.out.println(" Your tax is 4.7");
		System.out.println(" Your Item cost is "+ TotalItemCost);
		
		
		
	}

}
