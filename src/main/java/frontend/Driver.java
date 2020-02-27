package frontend;

import backend.FTPUploader;

import java.io.IOException;

public class Driver {
	public static void main(String[] args) {
		/*
		Controller controller = new Controller();
		controller.printWelcome();
		controller.updateView();
		controller.setModelDetails();
		*/

		FTPUploader ftpUploader = new FTPUploader();
		ftpUploader.ftpConnect();
		ftpUploader.uploadFile();
	}

}
