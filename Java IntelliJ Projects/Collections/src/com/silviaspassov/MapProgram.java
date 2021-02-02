package com.silviaspassov;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level OO language");
        languages.put("Python", "interpreted OO language");
        languages.put("Algol", "algorithmic language");
        languages.put("Basic", "Beginners all purpose symbolic");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));

        if(languages.containsKey("Java")){
            System.out.println("java is alrdy in the map");
        } else {
            languages.put("Java", "this course is about java");
        }

        System.out.println("============================");

//        languages.remove("Lisp");
        if(languages.remove("Alogol", "algorithmic")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("not removed. key/value pair not found");
        }

        if(languages.replace("Lisp", "Therein lies madness", "interesting language")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("lisp was not replaced");
        }



        for(String key: languages.keySet()) {
            System.out.println(key + " : " +languages.get(key));
        }

    }
}
