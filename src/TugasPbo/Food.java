package TugasPbo;

	public abstract class Food {
	
		
		 private String name;
		 private double price;

		 public Food(String name, double price) {
		     this.name = name;
		     this.price = price;
		 }

		 public abstract double calculateTotalCost(int quantity);
		 
		 public abstract void nama ();

		 public String getName() {
		     return name;
		 }

		 public void setName(String name) {
		     this.name = name;
		 }

		 public double getPrice() {
		     return price;
		 }

		 public void setPrice(double price) {
		     this.price = price;
		 }
		}
	}


