package backend;

import backend.article.Article;
import backend.article.IArticle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Model {
	private ArrayList<IArticle> articles = new ArrayList<>();
	private FTPUploader ftpUploader;
	private File fileToUpload;
	private File fileToRetrieve;

	public void setFileToRetrieve(File fileToRetrieve) {
		this.fileToRetrieve = fileToRetrieve;
	}

	public String getFiletoRetrieve() {
		return fileToRetrieve.getAbsolutePath();
	}

	public ArrayList<IArticle> getArticles() {
	    return articles;
  }

	public void readFileToRetrieve() {
		String line;
		String cvsSplitBy = ";";
		try (BufferedReader br = new BufferedReader(new FileReader(fileToRetrieve))) {
			while ((line = br.readLine()) != null) {
				String[] articleArray = line.split(cvsSplitBy);
				IArticle article = new Article(articleArray[0], articleArray[1], articleArray[2]);
				articles.add(article);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("[ Datei konnte nicht gefunden werden!  ]");
		}
	}
}
