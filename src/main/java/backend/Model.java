package backend;

import java.io.File;
import java.util.ArrayList;

public class Model {
    private ArrayList<IArticle> articles;
    private FTPUploader ftpUploader;
    private File fileToUpload;
    private File fileToRetrieve;
}
