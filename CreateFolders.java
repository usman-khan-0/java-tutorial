import java.io.File;

public class CreateFolders {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            File folder = new File(String.valueOf(i));
            if (!folder.exists()) {
                if (folder.mkdir()) {
                    System.out.println("Folder created: " + folder.getName());
                } else {
                    System.out.println("Failed to create folder: " + folder.getName());
                }
            }
        }
    }
}
