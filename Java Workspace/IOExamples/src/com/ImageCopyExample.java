package com;

import java.io.*;

public class ImageCopyExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("photo.jpg");
        FileOutputStream fos = new FileOutputStream("backup.jpg");

        int data;
        while ((data = fis.read()) != -1) {		// -1 refer to EOF
            fos.write(data);		// write as byte 
        }
        fis.close();
        fos.close();

        System.out.println("Image copied successfully");
    }
}

