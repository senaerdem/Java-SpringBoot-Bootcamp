package inheritance2;

public class FileLogger extends Logger{
	@Override // yazmasak da olur sadece bilgi vermek için
	public void log() {
		System.out.println("dosya loglandı");
	}
}
