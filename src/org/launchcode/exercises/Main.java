package org.launchcode.exercises;

import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
//        Divide(8,2);
//        Divide(8,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Kel","orangeSoda.py");

        // Test out your CheckFileExtension() function!
        for(Map.Entry<String ,String > entry: studentFiles.entrySet()){
            String file = entry.getValue();
            System.out.println("\nStudent: "+entry.getKey()+"\nScore: "+CheckFileExtension(file));
        }
        
    }

    public static int CheckFileExtension(String fileName) {
        int score = 0;
        // Write code here!
        if (fileName.contains(".java")){
            score = 1;
        } else if (fileName.equals(null)|| fileName.equals("")) {
            try {
                throw new FileNotFoundException("No file submitted.");
            } catch (FileNotFoundException e){
                e.printStackTrace();
                return -1;
            }
        } else {
            score= 0;
        } return score;

    }

    public static void Divide(int x, int y) {
        // Write code here!
        if (y == 0){
            System.out.println("Can't be equal to zero.");
            try {
                throw new ArithmeticException("Can't divide by 0.");
            } catch (ArithmeticException e){
                e.printStackTrace();
            }
        } else {
            System.out.println(x + "/" + y + "=" + (x / y));
        }
    }

}
