package com.annotation.practiceproblems.customannotations.advancedlevel.customserialization;

public class JsonSerializerTest {
    public static void main(String[] args) {
        User user = new User("Nancy Mehra", "mehranancy975@gmail.com");
        System.out.println(user.toJson());
    }
}
