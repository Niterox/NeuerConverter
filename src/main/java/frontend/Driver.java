package frontend;

public class Driver {
	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.printWelcome();
		controller.updateView();
		controller.setModelDetails();
	}
}
