package com.demo.arraylist;

import java.io.*;
import java.util.ArrayList;

public class ArrayListSerialize {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        try {
            //serialization
            FileOutputStream fileOutputStream = new FileOutputStream("file");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(al);
            fileOutputStream.close();
            objectOutputStream.close();

            //de-serialization
            FileInputStream fileInputStream = new FileInputStream("file");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList deserializedList = (ArrayList) objectInputStream.readObject();
            System.out.println(deserializedList);
            fileInputStream.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
