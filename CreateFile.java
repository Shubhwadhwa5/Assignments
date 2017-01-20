package practice;
import java.io.File;
import java.io.IOException;

public class CreateFile {
public static void main(String[] args) {
try {
//Set the path of file to be created
// In this case Code.txt file will be created in path C:/Javaseleniumworld
File file = new File("D:/prac/shubham.txt");

// if file doesnt exists, then create it
if (!file.exists()) {
file.createNewFile();
}

} catch (IOException e) {
e.printStackTrace();
}
}
}