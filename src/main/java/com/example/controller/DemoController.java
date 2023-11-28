package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.Document;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

@RestController
@RequestMapping("/hello")
public class DemoController {

    @GetMapping
    public String print() {

        return "Hello, Spring Boot!";
    }

    private String hellomaincontroller = "";
    private static final String SECRET_KEY = "mySecretKey123";

    public void display() {
//        String s=null;
//        System.out.println(s.length());

        System.out.println("testing");

    }


    private String databasePassword = "password1234";
//    String[] arr = null;
//    int length = arr.length;

    public int getSum() {
        return 10;
    }


    public void processPayment(double amount)
    {
        System.out.println("Payment processed for: " + amount);

    }

    public void readFile(String fileName)
    {
        try
        {
            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getUserData(String username)
    {
        String query = "SELECT * FROM Users WHERE username = '" + username + "'";
    }

    public int task1(int a, int b)
    {
        return a + b;
    }

    public int task2(int a, int b)
    {
        int sum = a + b;
        return sum;
    }


    public String getDatabaseUsername()
    {
        return databasePassword;
    }
}
