package adaptertest;

import adapter.CaramelFilter;
import adapter.Image;
import adapter.ImageView;
import adapter.VividFilter;
import avaFilters.Caramel;

public class Main {

	public static void main(String[] args) {
		var imageView = new ImageView(new Image());
		imageView.apply(new CaramelFilter(new Caramel()));
	}

}
