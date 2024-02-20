package shopping_cart;

public class OrderDetails {
	private String orderId;
	private String pid;
	private String cid;
	
	private double unitPrice;
	private int quantity;
	private double totalPrice;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public OrderDetails(String orderId, String pid, String cid, double unitPrice, int quantity, double totalPrice) {
		super();
		this.orderId = orderId;
		this.pid = pid;
		this.cid = cid;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", pid=" + pid + ", cid=" + cid + ", unitPrice=" + unitPrice
				+ ", quantity=" + quantity + ", totalPrice=" + totalPrice + "]";
	}
			
}
