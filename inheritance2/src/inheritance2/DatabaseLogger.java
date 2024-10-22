package inheritance2;

public class DatabaseLogger extends Logger {
	@Override // yazmasak da olur sadece bilgi vermek için
	public void log() {
		System.out.println("database loglandı");
	}
}
