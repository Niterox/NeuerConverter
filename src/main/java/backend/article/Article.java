package backend.article;

import java.util.ArrayList;

public class Article implements IArticle {
	private String aid;
	private String descriptionShort;
	private String descriptionLong;
	private ArrayList<String> images;

	public Article(String aid, String descriptionShort, String descriptionLong) {
		this.aid = aid;
		this.descriptionShort = descriptionShort;
		this.descriptionLong = descriptionLong;
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getDescriptionShort() {
		return descriptionShort;
	}

	public void setDescriptionShort(String descriptionShort) {
		this.descriptionShort = descriptionShort;
	}

	public String getDescriptionLong() {
		return descriptionLong;
	}

	public void setDescriptionLong(String descriptionLong) {
		this.descriptionLong = descriptionLong;
	}
}
