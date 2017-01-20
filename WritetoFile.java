package practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {
public static void main(String[] args) {
try {
//String to written in the file - C:/Javaseleniumworld/Code.txt
String content = "Hello JavaSeleniumWorld.com"; 
File file = new File("shubham.txt");

// if file doesnt exists, then create it
if (!file.exists()) {
file.createNewFile();
}
//Use BufferedWriter to write to the file
FileWriter fw = new FileWriter(file.getAbsoluteFile());
BufferedWriter bw = new BufferedWriter(fw);
bw.write(content);
bw.close();


} catch (IOException e) {
//Display error message if an exception is encounterd while writing the file
e.printStackTrace();
}
}
}