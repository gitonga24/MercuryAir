package com.mercury.fms.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOpener {

    public void openFile(String filename) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = null;
            while ((line=reader.readLine())!= null){
                String[] parts = line.split(" ");
                System.out.println(line);
            }
        }
        finally {
           if(reader !=null) {}
           // reader.close();
        }

    }//end of openFile


}//end of class
