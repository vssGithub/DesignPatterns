package abstractfactorytest;

import abstractfactory.ant.AntWidgetFactory;
import abstractfactory.app.ContactForm;
import abstractfactory.material.MaterialWidgetFactory;

public class Main {

	public static void main(String[] args) {
		new ContactForm().render(new MaterialWidgetFactory());
		new ContactForm().render(new AntWidgetFactory());
	}
}
