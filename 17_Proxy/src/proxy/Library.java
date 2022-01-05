package proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
	private Map<String, RealEbook> ebooks = new HashMap<>();
	
	public void add(RealEbook ebook) {
		ebooks.put(ebook.getFileName(), ebook);
	}
	
	public void openEbook(String fileName) {
		ebooks.get(fileName).show();
	}
}
