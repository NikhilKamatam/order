package shopping_cart;

import java.util.ArrayList;

public class Sample {
	int n = 3;

	public void addValues(String orderId[], String pid[],
			String cid[], double unitPrice[], int quantity[], double totalPrice[])
	{

		ArrayList<OrderDetails> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			list.add(new OrderDetails(orderId[i],pid[i], cid[i], unitPrice[i], quantity[i], totalPrice[i]));
		}


		printValues(list);
	}


	public void printValues(ArrayList<OrderDetails> list)
	{
		for (int i = 0; i < n; i++) {

			OrderDetails data = list.get(i);
			System.out.println(data.getOrderId() + " " + data.getPid()
			+ " " + data.getCid() + " "
			+ data.getUnitPrice()+" "+data.getQuantity()+" "+data.getTotalPrice());
		}
	}

	public static void main(String[] args) {
		String orderId[] = {"101","102","103"};
		String pid[]    = { "p101", "p102", "p103"};
		String cid[] = { "c101", "c102", "c103"};

		double unitPrice[] = { 1000,2000,3000,4000 };
		int quantity[]= {1,2,1,2};
		// Creating an object of the class
		Sample test = new Sample();
		test.addValues(orderId, pid, cid, unitPrice, quantity, unitPrice);

	}

}
