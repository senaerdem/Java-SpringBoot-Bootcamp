package inheritance2;

public class EmailLogger extends Logger {
	@Override // yazmasak da olur sadece bilgi vermek için
	public void log() {
		System.out.println("email loglandı");
	}
}
