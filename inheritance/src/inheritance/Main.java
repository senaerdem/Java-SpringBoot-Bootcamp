package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer sena = new IndividualCustomer();
		sena.customerNumber = "12345";
		
		CorporateCustomer innova = new CorporateCustomer();
		innova.customerNumber = "67890";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "11111";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {sena, abc, innova};
		
		customerManager.addMultiple(customers);
	}

}
