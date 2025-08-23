package com.gdcg;

public class MulitpleClassesInSameFile {
    public static void main(String[] args) {

        System.out.println(GenerateMessage.generateMessage());
        System.out.println(AnotherMessage.generateAnotherMesagge());

    }
}

class GenerateMessage {
    static String generateMessage() {
        return "Here is one message";
    }
}

class AnotherMessage {
    static String generateAnotherMesagge() {
        return "Here is another message";
    }
}
