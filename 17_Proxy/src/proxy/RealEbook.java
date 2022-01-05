package proxy;

public class RealEbook implements Ebook {
	private String fileName;

	public RealEbook(String fileName) {
		this.fileName = fileName;
		load();
	}
	
	private void load() {
		System.out.println("loading ebook " + fileName);
	}
	
	@Override
	public void show() {
		System.out.println("showing ebook " + fileName);
	}
	
	@Override
	public String getFileName() {
		return fileName;
	}
}
