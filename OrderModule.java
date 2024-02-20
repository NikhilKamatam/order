package shopping_cart;

import java.net.Authenticator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OrderModule {
	static Scanner sc = new Scanner(System.in);
//static ArrayList<OrderDetails> unique_fields;
	
	static void authentication() {
		System.out.println("Enter Login details");
		System.out.println("Username: ");
			String un = sc.next();
			String username = "a";
		System.out.println("Enter Password: ");
			String pwd = sc.next();
			String password = "a";
			
			if(username.equals(un) && password.equals(pwd)) {
				System.out.println("\nAccess Granted\n");
			operations();
			}
			
			else {
				System.out.println("\nAccess Denied\n");//throw new loginException();
			authentication();
			}
		
	}
	
	static void operations() {
		System.out.println("Choose any one of the below operations\n");
		System.out.println("1.Place Order\n2.Search Order by entering your Order Id\n3.Generate Order Report\n4.Exit ");
		int operation = sc.nextInt();
		switch(operation) {
		case 1:	placeOrder();
		case 2:
		case 3:
		case 4:exit();
		}
	}
	
	
	static void placeOrder() {	
		
		for(int i=1;i<=3;i++) {
		System.out.println("Enter the " +" Order ID:");
		String orderId = sc.next();
		System.out.println("Enter Product Id which are present in Product Module");
		String pid = sc.next();
		System.out.println("Enter Customer Id which are available in Customer Module");
		String cid = sc.next();
		System.out.println("Enter Unit Price");
		double unitPrice = sc.nextDouble();
		System.out.println("Enter quantity");
		int quantity = sc.nextInt();
		
		double totalPrice = unitPrice*quantity;
		
//		OrderDetails abc = new OrderDetails(orderId, pid, cid, unitPrice,quantity,totalPrice);
//		
//
//		
		ArrayList<OrderDetails> fields = new ArrayList <OrderDetails>();
		fields.add(new OrderDetails(orderId, pid, cid, unitPrice, quantity, totalPrice));
		
		Iterator<OrderDetails> itr=fields.iterator();  
//		while(itr.hasNext()){  
//		    OrderDetails st=(OrderDetails)itr.next();  
//		    System.out.println(st.getOrderId()+" "+st.getPid()+" "+st.getCid());  
//		    }
		
		
		
		} 
	
		//}
		
	
	
	static void searchOrder() {
		
	}
	
	static void generateOrderReport() {
		
	}
	
	static void exit() {
		System.out.println("Thank you. Visit again");
	}
	
	
	public static void main(String[] args) {
			authentication();
		
			
	}
	

}


