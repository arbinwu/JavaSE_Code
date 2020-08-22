package IO_04;
/*
    复制多级文件夹内容
 */
import java.io.*;

public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("myIO\\src\\itcast");
        File destFile = new File("E:\\IdeaProjects\\JavaSE_Code\\myIO\\src\\IO_04");
        /*
        复制文件夹
         */
        copyFolder(srcFile,destFile);

    }
    /*
    复制文件夹，如果还是文件夹则递归，是文件就复制
     */
    private static void copyFolder(File srcFile, File destFile) throws IOException {
        if (srcFile.isDirectory()) {
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile,srcFileName);
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }
            File[] fileArray = srcFile.listFiles();

            for (File file: fileArray
                 ) {
                copyFolder(file,newFolder);
            }
        }else {
            File newFile = new File(destFile,srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }
    /*
    复制文件内容
     */
    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes))!=-1) {
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }

}
