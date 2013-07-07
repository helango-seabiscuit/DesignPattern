package ChainOfResponsibility;

public class PurchaseRequest {
	private int ID;
	private String description;
	private double amount;
	public PurchaseRequest(int id, String desc, double amount){
		this.ID = id;
		this.description = desc;
		this.amount = amount;
	}
	public int getID() {
		return ID;
	}
	public String getDescription() {
		return description;
	}
	public double getAmount() {
		return amount;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
