package com.network;
import java.io.*;
import java.net.*;
public class Main {

    public static void main(String[] args)throws  Exception {
        String sentence;
        String courseName;
        System.out.println("Enter Course Name");//to give an interactive window
        System.out.println("Enter Q to exit");
        while(true) {
        BufferedReader inFromUser =
                new BufferedReader(new InputStreamReader(System.in));//a Buffered reader to read input from cli

        Socket clientSocket = new Socket("192.168.122.251", 8080);//TCP socket connected to VM server

        DataOutputStream outToServer =
                new DataOutputStream(clientSocket.getOutputStream());//Output stream to send data to server

        BufferedReader inFromServer =
                new BufferedReader(new
                        InputStreamReader(clientSocket.getInputStream()));//Input stream to read input from server



            sentence = inFromUser.readLine();//user enters course Number

            if(sentence.trim() .equals("Q") || sentence.trim().equals("q") ){         //if user entered Q or q the program quits
                break;
            }

                outToServer.writeBytes(sentence + '\n');//send the input data to server

                courseName = inFromServer.readLine();// get courseName from server

                System.out.println("The course is: " + courseName);//print it out!
                clientSocket.close();
        }



    }
}
