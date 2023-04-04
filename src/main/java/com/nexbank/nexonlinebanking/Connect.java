package com.nexbank.nexonlinebanking;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

    public static Connection connectDB(){
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5001/bank_gab", "postgres", "password");
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
