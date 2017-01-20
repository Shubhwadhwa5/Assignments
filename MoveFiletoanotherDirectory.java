package practice;

import java.io.File;
public class MoveFiletoanotherDirectory {
public static void main(String[] args){
//Move the file from - d:/prac/shubha.txt to -d:/prac/Sub1/shubha.txt
File from = new File("d:/prac/shubha.txt");
//rename and change the file and folder
File to = new File("d:/prac/Sub1/shubha.txt");
//Rename
if (from.renameTo(to))
System.out.println("Successfully Moved the file");
else
System.out.println("Error while moving the file");
}
}