package prototype;

public class ContextMenu {
	public void duplicate(Component component) {
		Component newComponent = component.clone();
		System.out.println("duplicating " + component.getClass().getSimpleName());
		System.out.println("duplicate " + newComponent.getClass().getSimpleName());
	}
}
