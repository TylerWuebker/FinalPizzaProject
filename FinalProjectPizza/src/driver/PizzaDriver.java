package driver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

import classes.PizzaOrder;
import classes.QueueLL;

public class PizzaDriver {
	public static void main(String[] args) {
		menu();		
	}
	
		public static void menu() {
			//lists
			QueueLL POList = new QueueLL();
			ArrayList<PizzaOrder> SortedOrders = new ArrayList<PizzaOrder>();
			
			boolean cont = true;
			Scanner sc = new Scanner(System.in);
			
			while(cont) {
				System.out.println("Select an Option: ");
				System.out.println("1) Place an Order");
				System.out.println("2) View all Sorted Orders");
				System.out.println("3) Check Current Orders");
				System.out.println("-99) Exit");
				int choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					POList = createOrder(POList, SortedOrders);
					break;
				case 2:
					checkSortedOrders(SortedOrders);
					break;
				case 3:
					POList.printQueue();
					break;
				case -99:
					System.out.println("Exiting...");
					cont = false;
					break;
				}	
				
			}
		}
		
		public static double makePizza() {
			Scanner sc = new Scanner(System.in);
			
			double cTotal = 0;
			boolean cont = true;
			String size = "";
			int toppings;
			String pizza = null;
			
			while(cont) {
				System.out.println("Enter Pizza Size: L, M, S");
				size += sc.nextLine();
				System.out.println("Select Topping Option: 1, 2, or 3");
				System.out.println("1) Beef");
				System.out.println("2) Ham");
				System.out.println("3) Pepperoni");
				toppings = sc.nextInt();
				
				switch(toppings) {
				case 1: 
					pizza.concat("Beef, ");
					cTotal += 15.00;
					break;
				case 2:
					pizza.concat("Ham, ");
					cTotal += 16.00;
					break;
				case 3:
					pizza.concat("Pepperoni, ");
					cTotal += 17.00;
					break;
				}
				
				System.out.println("Enter another Pizza to order? 1 yes, 2 no");
				int another = sc.nextInt();
				if(another != 1) {
					cont = false;
					break;
				}
			}
			
			
			return cTotal;
		}
		
		public static QueueLL createOrder(QueueLL pOList, List<PizzaOrder> sortedOrders) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name: ");
			String cName = sc.nextLine();
			
			System.out.println("Enter your Address");
			String cAddress = sc.nextLine();
			
			System.out.println("Enter a Phone Number");
			String cNumber = sc.nextLine();
			

			double cTotal = 0;
			boolean cont = true;
			String cOrder = "";
			int toppings;
			
			while(cont) {
				System.out.println("Enter Pizza Size: L, M, S");
				cOrder += sc.nextLine();
				System.out.println("Select Topping Option: 1, 2, or 3");
				System.out.println("1) Beef");
				System.out.println("2) Ham");
				System.out.println("3) Pepperoni");
				toppings = sc.nextInt();
				
				switch(toppings) {
				case 1: 
					cOrder += " Beef";
					cTotal += 15.00;
					break;
				case 2:
					cOrder += " Ham";
					cTotal += 16.00;
					break;
				case 3:
					cOrder += " Pepperoni";
					cTotal += 17.00;
					break;
				}
				
				System.out.println("Enter another Pizza to order? 1 yes, 2 no");
				int another = sc.nextInt();
				if(another != 1) {
					cont = false;
					break;
				}
			}
			
			PizzaOrder PO = new PizzaOrder(cName, cAddress, cOrder, cNumber, cTotal);
			
			sortedOrders.add(PO);
			pOList.enqueue(PO);
			
			System.out.println("Order Created!");
			return pOList;
		}
				
		public static void checkSortedOrders(ArrayList<PizzaOrder> sortedOrders) {
			sortedOrders = sortOrders(sortedOrders);
			
			for(PizzaOrder PO : sortedOrders) {
				PO.display();
			}
		}
		
		public static ArrayList<PizzaOrder> sortOrders(ArrayList<PizzaOrder> arr) {
			
			int n = arr.size(); 
			  
	        // One by one move boundary of unsorted subarray 
	        for (int i = 0; i < n-1; i++) 
	        { 
	            // Find the minimum element in unsorted array 
	            int min_idx = i; 
	            for (int j = i+1; j < n; j++) 
	                if (arr.get(j).getcTotal() < arr.get(min_idx).getcTotal()) 
	                    min_idx = j; 
	  
	            // Swap the found minimum element with the first 
	            // element 
	            PizzaOrder temp = arr.get(min_idx); 
	            arr.set(min_idx, arr.get(i));
	            arr.set(i, temp);
	        }
	        return arr;
		}
}
