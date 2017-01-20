package practice;

import java.io.File;

public class DeleteFolder {

public static void main(String[] args){
//Set the folder for which delete folder ,all the sub folder and it contents
File filez = new File("d:/prac/sub1");
deleteFolder(filez);
}

//Function to recursively delete all the sub folder and it contents
public static void deleteFolder(File folder) {
File[] files = folder.listFiles();
if(files!=null) { //some JVMs return null for empty dirs
for(File f: files) {
if(f.isDirectory()) {
deleteFolder(f);
} else {
f.delete();
}
}
}
folder.delete();
}
}