package org.launchcode.exercises;

import java.util.HashMap;



public class Main {

    public static void main(String[] args) {
        Divide(1, 0);
        Divide(15, 3);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        System.out.println(CheckFileExtension(studentFiles.get("Carl")));
        System.out.println(CheckFileExtension(studentFiles.get("Brad")));
        System.out.println(CheckFileExtension(studentFiles.get("Elizabeth")));
        System.out.println(CheckFileExtension(studentFiles.get("Stefanie")));
    }

    public static void Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            int result = x/y;
            System.out.println(result);
        }
    }

    public static int CheckFileExtension(String fileName) {
        int numPoints;
        int fileLength = fileName.length();

        if (fileLength == 0) {
            try {
                throw new ArithmeticException("Missing file");
            } catch (ArithmeticException e) {
                numPoints = -1;
                e.printStackTrace();
            }
        } else if (fileName.contains(".java")) {
            numPoints = 1;
        } else {
            numPoints = 0;
        }
            return numPoints;
    }
}
