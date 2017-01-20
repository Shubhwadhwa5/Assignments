package practice;

import java.io.File;

public class DeleteFile
{
public static void main(String[] args)
{
try{
//File to be deleted - C:/Javaseleniumworld/Code.txt
File file = new File("D:/prac/shubham.txt");

if(file.delete()){
System.out.println(file.getName() + " is deleted!");
}else{
System.out.println("Delete operation is failed.");
}

}catch(Exception e){ 
e.printStackTrace(); 
}
}
}