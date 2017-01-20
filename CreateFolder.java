package practice;

import java.io.File;

public class CreateFolder {
public static void main(String[] args) {
//Set the path of Folder to be created
// In this case Folder Javaseleniumworld will be created in path C:
File file = new File("d:/shubh");
//If the folder doesnot exist then create it
if (!file.exists()) {
if (file.mkdir()) {
System.out.println("Directory is created!");
} else {
System.out.println("Failed to create directory!");
}
}
}
}
