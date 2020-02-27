package backend;

import java.io.*;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class FTPUploader {

    FTPClient ftpClient = new FTPClient();

    public void ftpConnect() {
        String server = "borrmann-shop.de";
        int port = 21;
        String user = "christian.preis@borrmann.de";
        String pass = "Moku1410";

        try {

            ftpClient.connect(server, port);
            ftpClient.login(user, pass);
            ftpClient.enterLocalPassiveMode();

            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException x) {
                x.printStackTrace();
            }
            ex.printStackTrace();
        }
    }

    public void uploadFile() {
        try {
            File firstLocalFile = new File("C:\\Users\\nico.gutschow\\Desktop\\pim.xml");

            String firstRemoteFile = "work/pim.xml";
            InputStream inputStream = new FileInputStream(firstLocalFile);

            System.out.println("Start uploading file");

            boolean done = ftpClient.storeFile(firstRemoteFile, inputStream);
            inputStream.close();
            if (done) {
                System.out.println("The file was uploaded successfully.");
            }
        } catch (IOException io) {
            io.printStackTrace();
        }

    }
}