package com.company;

/*

1906 Even characters
Read 2 file names from the console.
Print all characters with an even index into the second file.
Example:
second character, fourth character, sixth character, etc.
Close I / O Streams

Requirements:
1. The program should read the file names from the console (use BufferedReader).
2. BufferedReader must be closed for reading data from the console.
3. The program should read the contents of the first file (use FileReader with the String constructor).
4. The stream of reading from the file (FileReader) should be closed.
5. The program should write to the second file all bytes from the first file with an even index (use FileWriter).
6. The write stream to the file (FileWriter) must be closed.


*/

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {
       public static void main(String[] args) throws IOException {
           BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
           String fileName1 = conReader.readLine();
           String fileName2 = conReader.readLine();
           conReader.close();
           FileReader fileReader = new FileReader(fileName1);
           FileWriter fileWriter = new FileWriter(fileName2);
           int i=1;
           while(fileReader.ready()) {
               int value = fileReader.read();
               if (i % 2 == 0)
                   fileWriter.write(value);
               i++;
           }
           fileReader.close();
           fileWriter.close();
    }
}




