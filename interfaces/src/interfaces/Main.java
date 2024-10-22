package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer sena = new Customer(1, "Sena", "Erdem");
		customerManager.add(sena);
	}

}
