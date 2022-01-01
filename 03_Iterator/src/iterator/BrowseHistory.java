package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
	private List<String> urls = new ArrayList<>();

	public void push (String url) {
		this.urls.add(url);
	}
	
	public String pop() {
		var lastIndex = this.urls.size() - 1;
		var lastUrl = this.urls.get(lastIndex);
		this.urls.remove(lastUrl);
		
		return lastUrl;
	}
	
	public Iterator createIterator() {
		return new ListIterator(this);		
	}
	
	public class ListIterator implements Iterator {
		private BrowseHistory history;
		private int index;
		
		public ListIterator(BrowseHistory history) {
			this.history = history;
		}

		@Override
		public boolean hasNext() {
			return (index < this.history.urls.size());
		}

		@Override
		public String current() {
			return history.urls.get(index);
		}

		@Override
		public void next() {
			index++;			
		}
		
	}
}