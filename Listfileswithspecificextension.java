package practice;

import java.io.File;

public class Listfileswithspecificextension {
public static void main(String a[]){
//Set folder path for which you wish to get name of the files stored with specific Extension
File file = new File("D:/prac");
// Object files contains all the files under the selected folder
File[] files = file.listFiles();
//for each file in the folder
for(File f: files){
//capture all filenames with .zip extension
//You can mention .txt for extracting files wth .txt extension
if(f.getName().toLowerCase().endsWith(".zip")){
//Print the filename with .zip extension
System.out.println(f.getName());
}
}
}
}