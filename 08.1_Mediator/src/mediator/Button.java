package mediator;

public class Button extends UIControl {
	private boolean isEnabled;
	
	public Button(DialogBox owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean enabled) {
		this.isEnabled = enabled;
		owner.changed(this);
	}
}
