package cucumber.utils;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipFile {

    public void unzipFunction(String destinationFolder, String zipFile) {
        final File directory = new File(destinationFolder);
        if(!directory.exists()) {
            directory.mkdirs();
        }

        try {
            final FileInputStream fInput = new FileInputStream(zipFile);
            final ZipInputStream zipInput = new ZipInputStream(fInput);
            ZipEntry entry = zipInput.getNextEntry();
            // iterates over entries in the zip file
            while (entry != null) {
                final String filePath = destinationFolder + File.separator + entry.getName();
                if (!entry.isDirectory()) {
                    // if the entry is a file, extracts it
                    extractFile(zipInput, filePath);
                } else {
                    // if the entry is a directory, make the directory
                    final File dir = new File(filePath);
                    dir.mkdir();
                }
                zipInput.closeEntry();
                entry = zipInput.getNextEntry();
            }
            zipInput.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void extractFile(ZipInputStream zipIn, String filePath) throws IOException {
        final BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        final byte[] bytesIn = new byte[4096];
        int read = 0;
        while ((read = zipIn.read(bytesIn)) != -1) {
            bos.write(bytesIn, 0, read);
        }
        bos.close();
    }

    public static void main(String[] args){
        final String curentDir = System.getProperty("user.dir");
        final String file = curentDir+"/src/test/resources/features/mmt/feature.zip";
        final String dest = curentDir+"/target/test-classes/features/mmt";
        final UnzipFile unzipFile = new UnzipFile();
        unzipFile.unzipFunction(dest,file);
    }
}
