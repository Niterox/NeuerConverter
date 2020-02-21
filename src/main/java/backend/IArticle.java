package backend;

import java.io.File;

public interface IArticle {
    public void retrieveAid(File file);

    public void retrieveDescriptionShort(File file);

    public void retrieveDescribtionLong(File file);

    public void retrieveImages(File file);

}
