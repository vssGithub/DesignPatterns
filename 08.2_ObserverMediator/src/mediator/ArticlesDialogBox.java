package mediator;

public class ArticlesDialogBox {
	private ListBox articlesListBox = new ListBox();
	private TextBox titleTextBox = new TextBox();
	private Button saveButton = new Button();
	
	public ArticlesDialogBox() {
		/*
		articlesListBox.attach(new Observer() {
			@Override
			public void update() {
				articleSelected();
			}
		});
		*/
		
		// using lambda expression
		/*
		articlesListBox.attach(() -> {
			articleSelected();
		});
		
		// the above simplifies to 
		articlesListBox.attach(() -> articleSelected());
		*/
		
		// the above simplifies to
		// add event handlers
		articlesListBox.addEventHandler(this::articleSelected);
		titleTextBox.addEventHandler(this::titleChanged);
	}
	
	public void simulateUserInteraction() {
		articlesListBox.setSelection("Article 111");
		titleTextBox.setContent("");
		titleTextBox.setContent("Article 222");
		System.out.println("Textbox: " + titleTextBox.getContent());
		System.out.println("Button: " + saveButton.isEnabled());
	}
	
	private void articleSelected() {
		titleTextBox.setContent(articlesListBox.getSelection());
		saveButton.setEnabled(true);
	}
	
	private void titleChanged() {
		var content = titleTextBox.getContent();
		var isEmpty = (content == null || content.isEmpty());
		saveButton.setEnabled(!isEmpty);
	}

}
