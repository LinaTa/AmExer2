package com.example.livruen.amexer.entries;

import com.example.livruen.amexer.Course;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Lina on 14.04.2016.
 */
public class CSVReader {
    private ArrayList<Course> courses = new ArrayList<Course>();;
    private ArrayList<String> courseNames = new ArrayList<String>();
    private File csv = new File("data.csv");

    public CSVReader() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(csv));
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(",");
                courses.add(new Course(split[0], split[1]));
                courseNames.add(split[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getLink(String name){
        for (Course course : courses) {
            if(course.getName().equals(name)){
                return course.getLink();
            }
        }
        return "";
    }

    public ArrayList<String> getCourseNames(){
        return courseNames;
    }
}
