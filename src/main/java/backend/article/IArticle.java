package backend.article;

public interface IArticle {
	String getAid();

	void setAid(String aid);

	String getDescriptionShort();

	void setDescriptionShort(String descriptionShort);

	String getDescriptionLong();

	void setDescriptionLong(String descriptionLong);
}
