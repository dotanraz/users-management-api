package com.app.environment;

public class EnvConstants {

//    public static String POSTGRES_PATH;
    public static String POSTGRES_IP;
    static {
        POSTGRES_IP = System.getenv("postgres_ip") == null ? "127.0.0.1" : System.getenv("postgres_ip");
    }
    public static String POSTGRES_PATH = "jdbc:postgresql://" + POSTGRES_IP + ":5432/postgres";
    public static String POSTGRES_USERNAME = "postgres";
    public static String POSTGRES_PASSWORD = "1234";

}
