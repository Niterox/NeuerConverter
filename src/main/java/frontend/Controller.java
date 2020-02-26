package frontend;

import backend.Model;
import java.io.File;

public class Controller {
	private Model model = new Model();
	private View view = new View();

	public void setModelDetails() {
		model.setFileToRetrieve(new File(view.getUserInput()));
		model.readFileToRetrieve();
		model.getArticles().forEach(iArticle -> {
			System.out.println(iArticle.getAid() + " " +
					iArticle.getDescriptionShort() + " " +
					iArticle.getDescriptionLong());
		});
	}

	public void printWelcome() {
		view.welcome();
	}

	public void updateView() {
		//System.out.println(view.getUserInput());
	}


}
