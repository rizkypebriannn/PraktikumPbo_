package TugasPbo;


	public class Pizza extends Food {
		 private int diameter;

		 public Pizza(String name, double price, int diameter) {
		     super(name, price);
		     this.diameter = diameter;
		 }
		 
		 public void nama() {
			 
		 }

		 
		 @Override
		 public double calculateTotalCost(int quantity) {
		  
		     double costPerPizza = getPrice() * diameter;
		     return costPerPizza * quantity;
		 }

		 
		 public int getDiameter() {
		     return diameter;
		 }

		 public void setDiameter(int diameter) {
		     this.diameter = diameter;
		 }
		 
		 public static void main(String[] args) {
			 Pizza pizza = new Pizza("Pizza" , 10000,10);
			 
			 System.out.println("Harga : " + pizza.calculateTotalCost(1));
			 }
		}


