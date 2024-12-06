package com.example;

import java.util.List;



public class App {
    public static void main(String[] args) {
        UserTableManager manager = new UserTableManager();
        manager.createTableIfNotExists();
        UserDAO userDAO = new UserDAO();
        
        // Пример добавления пользователя
        userDAO.addUser("John oe", "john.doe@examle.com");

        // Пример получения всех пользователей
        List<User> users = userDAO.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
    
}
