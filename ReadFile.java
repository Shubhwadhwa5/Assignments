package practice;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

public static void main(String a[]){
//Set the BufferredReader object to null intitally
BufferedReader br = null;
String strLine = "";
try {
//Point the br object to the file you want to read 
//File to be read line by line - C:/Javaseleniumworld/Code.txt
br = new BufferedReader( new FileReader("D:/prac/shubham.txt"));
//Read the file Line by Line till Null value is encountered
while( (strLine = br.readLine()) != null){
//display each line
System.out.println(strLine);
}
} catch (FileNotFoundException e) {
//Display error message if File was not found
System.err.println("Unable to find the file");
} catch (IOException e) {
//Display error message if an exception is encounterd while reading the file
System.err.println("Unable to read the file");
}
}
}