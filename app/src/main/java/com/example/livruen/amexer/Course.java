package com.example.livruen.amexer;

/**
 * Created by Lina on 14.04.2016.
 */
public class Course {
    private String name;
    private String link;

    public Course(String name, String link){
        this.name = name;
        this.link = link;
    }

    public String getName(){
        return this.name;
    }

    public String getLink(){
        return this.link;
    }
}