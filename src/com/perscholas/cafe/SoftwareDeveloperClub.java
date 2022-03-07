package com.perscholas.cafe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareDeveloperClub {

    public SoftwareDeveloperClub() throws FileNotFoundException {
        ArrayList<String> membersList = new ArrayList<String>();
        try {
            File membersFile = new File("/Users/franzblue/Desktop/JAVA_Exercises/SoftwareClub/src/com/perscholas/cafe/members.txt");
            Scanner myReader = new Scanner(membersFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(membersList.size() == 0 || membersList.size() / 3 == 1) {
                    membersList.add("Member Name: " + data);
                } else if(membersList.size() == 1 || membersList.size() / 4 == 1) {
                    membersList.add("Location: " + data);
                } else if(membersList.size() == 2 || membersList.size() / 5 == 1){
                    membersList.add("Favorite Language: " + data);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        for (int i = 0; i < membersList.size(); i++) {
            System.out.println(membersList.get(i));
        }
    }
}
