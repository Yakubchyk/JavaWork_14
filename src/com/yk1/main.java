package com.yk1;

import java.io.*;

public class main {
    public static <file> void main(String[] args) throws IOException {
//
//        File file = new File("src/com/yk1/test1.txt");
//        System.out.println(file.getCanonicalPath());

        // открыть соединение
//        try (FileInputStream stream = new FileInputStream("src/com/yk1/test1.txt")) {
//            int i;
//            StringBuilder sb = new StringBuilder();
//            while ((i = stream.read()) != -1) {
//                sb.append((char) i);
//            }
//            System.out.println(sb);
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//
//
//
//
//        try (FileReader stream = new FileReader("src/com/yk1/test1.txt")) {
//            int i;
//            while ((i = stream.read()) != -1) {
//                System.out.print((char) i);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }

//        try (FileWriter fileWriter = new FileWriter("src/com/yk1/test1.txt")) {
//            try (FileReader fileReader = new FileReader("src/com/yk1/test1.txt")) {
//                fileWriter.write("Ich bin Ivan, und 46 Jahre alt");
//                fileWriter.flush();
//                System.out.println(fileReader.read());
//
//            } catch (IOException e) {
//                System.out.println(e);
//            }
//
//        }


        Person valera = new Person(28, "Valera");

        //Сериализация
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/com/yk1/Valera.txt"));


    }
}
