package abstractfactory.app;

import abstractfactory.WidgetFactory;

public class ContactForm {
	public void render(WidgetFactory factory) {
		factory.createButton().render();
		factory.createTextBox().render();
	}
}
