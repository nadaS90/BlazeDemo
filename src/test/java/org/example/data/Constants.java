package org.example.data;

import java.text.DecimalFormat;
import java.util.Random;

public class Constants
{
    private static Random rand = new Random();
    public static String email = rand.nextInt(100) + "test@example.com";
    public static String wrongEmail = "wrong@example.com";
    public static String Password = "p@ssword";

}
