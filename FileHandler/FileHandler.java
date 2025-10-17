package FileHandler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandler {
    public static void main(String[] args) {
        String sourcePath = "D:\\LECTURES\\MY CODES\\Java\\New\\Teacher's exercises\\FileHandler\\myFile";
        String destPath = "D:\\LECTURES\\MY CODES\\Java\\New\\Teacher's exercises\\FileHandler\\ReadFile";

        String data = "Hello RCA students";
        try (FileOutputStream out = new FileOutputStream(sourcePath, true)) {
            byte[] bytes = data.getBytes();
            out.write(bytes);
            out.write(System.lineSeparator().getBytes());
            System.out.println("✅ Data written to myFile successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try (
                FileInputStream in = new FileInputStream(sourcePath);
                FileOutputStream out = new FileOutputStream(destPath)
        ) {
            int content;
            while ((content = in.read()) != -1) {
                out.write(content);
            }
            System.out.println("✅ Data copied from myFile to ReadFile successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
