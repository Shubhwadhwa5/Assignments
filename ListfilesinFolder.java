package practice;

import java.io.File;

public class ListfilesinFolder {
public static void main(String a[]){
//Set the path of folder for which you wish to list name of all the files stored
File file = new File("D:/prac");
// Object files contains all the files under the selected folder
File[] files = file.listFiles();
//for each file in the folder
for(File f: files){
System.out.println(f.getName());
}
}
}