package parties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test3 {
	/**
	   * Zip a list of file into one zip file.
	   * 
	   * @param files
	   *          files to zip
	   * @param targetZipFile
	   *          target zip file
	   * @throws IOException
	   *           IO error exception can be thrown when copying ...
	   */
	  public static void zipFile(final File[] files, final File targetZipFile) throws IOException {
	    try {
	      FileOutputStream   fos = new FileOutputStream(targetZipFile);
	      ZipOutputStream zos = new ZipOutputStream(fos);
	      byte[] buffer = new byte[128];
	      for (int i = 0; i < files.length; i++) {
	        File currentFile = files[i];
	        if (!currentFile.isDirectory()) {
	          ZipEntry entry = new ZipEntry(currentFile.getName());
	          FileInputStream fis = new FileInputStream(currentFile);
	          zos.putNextEntry(entry);
	          int read = 0;
	          while ((read = fis.read(buffer)) != -1) {
	            zos.write(buffer, 0, read);
	          }
	          zos.closeEntry();
	          fis.close();
	        }
	      }
	      zos.close();
	      fos.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("File not found : " + e);
	    }

	  }
}