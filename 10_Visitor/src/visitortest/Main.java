package visitortest;

import visitor.AnchorNode;
import visitor.HeadingNode;
import visitor.HighlightOperation;
import visitor.HtmlDocument;
import visitor.PlainTextOperation;

public class Main {

	public static void main(String[] args) {
		var document = new HtmlDocument();
		document.add(new HeadingNode());
		document.add(new AnchorNode());
		document.execute(new PlainTextOperation());
	}

}
