package practice;

import java.io.File;

public class CreateFolderstructure{
public static void main(String[] args){
//Set the path of Folders to be created
//In this case Folder Javaseleniumworld ,Sub1,Sub2 doesnot exist
//The below code will create the Folder Javaseleniumworld and the Subdirectories Sub1 and Sub2
File files = new File("d:/prac/Sub1/Sub2");
if (!files.exists()) {
if (files.mkdirs()) {
System.out.println("Multiple directories are created!");
} 
else {
System.out.println("Failed to create multiple directories!");
}
}

}
}