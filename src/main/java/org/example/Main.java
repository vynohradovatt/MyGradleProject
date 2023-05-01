package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        User user = new User("Tanya", "Vynohradova");

        System.out.println(new Gson().toJson(user));

    }
}