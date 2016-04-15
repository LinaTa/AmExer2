package com.example.livruen.amexer.entries;

import java.sql.SQLException;

/**
 * Created by Lina on 04.04.2016.
 */
public class Testklasse {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        CSVReader reader = new CSVReader();
        System.out.println(reader.getCourseNames().toString());

        System.out.println("Link" + reader.getLink("Angebot des Vfl Suderburg-Sud"));
    }
}
