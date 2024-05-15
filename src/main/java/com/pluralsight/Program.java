package com.pluralsight;

import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        try {
            userInterface.display();
        } catch (IOException e) {
            System.out.println("Error"+ e.getMessage());
        }
    }
}
