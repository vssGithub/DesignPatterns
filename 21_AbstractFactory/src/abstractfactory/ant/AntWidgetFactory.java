package abstractfactory.ant;

import abstractfactory.Button;
import abstractfactory.TextBox;
import abstractfactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
	@Override
	public Button createButton() {
		return new AntButton();
	}

	@Override
	public TextBox createTextBox() {
		return new AntTextbox();
	}
}
