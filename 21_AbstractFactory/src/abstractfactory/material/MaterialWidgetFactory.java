package abstractfactory.material;

import abstractfactory.Button;
import abstractfactory.TextBox;
import abstractfactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
	@Override
	public Button createButton() {
		return new MaterialButton();
	}

	@Override
	public TextBox createTextBox() {
		return new MaterialTextbox();
	}
}
