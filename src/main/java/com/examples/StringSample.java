package com.examples;

public class StringSample {
    public static void main(String[] args) {
        /*
         * String
         * Immutable: Once a String object is created, it cannot be changed. Any
         * operation that seems to modify the string actually creates a new String
         * object.
         * 
         * Use When:
         * You don't need to modify the string frequently.
         * You want safe, simple text handling.
         * Thread safety isn't an issue because String is immutable (thusinherently
         * thread-safe).
         * 
         * Example:
         */

        String s = "Hello";
        s = s + " World!";
        System.out.println(s);

        /*
         * StringBuilder
         * 
         * Mutable: Can be modified without creating new objects.
         * Not thread-safe: No synchronization, so it's not safe to use across multiple
         * threads.
         * 
         * Use When:
         * You need to frequently modify strings(e.g., concatenation in loops).
         * You ar working in a single-threaded environment.
         * You need better performance than String.
         * 
         */

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World!");
        System.out.println(stringBuilder);

        /*
         * StringBuffer
         * 
         * Mutable like StringBuilder.
         * Thread-safe: Methods are synchronized, so it's safe to use in multithreading
         * environments.
         * 
         * Use When:
         * You need to modify strings frequently.
         * You are working in a multi-threaded environment where synchronization is
         * requiered.
         * 
         */

        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World!");
        System.out.println(stringBuffer);

        /*
         * Rule of Thumb:
         * 
         * Use String for constants and minimal text changes.
         * Use StringBuilder for performance-critical code that modifies strings (in one
         * thread).
         * Use StringBuffer only if you must support multiple threads.
         * 
         */
    }

}
