package buildertest;

import builder.MovieBuilder;
import builder.PdfDocumentBuilder;
import builder.Presentation;
import builder.Slide;

public class Main {

	public static void main(String[] args) {
		var presentation = new Presentation();
		presentation.addSlide(new Slide("slide 1"));
		presentation.addSlide(new Slide("slide 1"));
		
		var builder = new PdfDocumentBuilder();
		presentation.export(builder);
		var pdf = builder.getPdfDocument();
	}

}
