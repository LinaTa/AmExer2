package com.example.livruen.amexer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.livruen.amexer.entries.CSVReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sport extends AppCompatActivity {
    private ListView sportsListView;
    private ArrayAdapter<String> sportslistAdapter;
    private List<String> sportsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        createEmptyList();

        sportsListView = (ListView) findViewById(R.id.sportListView);
        try {
            fillSportsList();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        setActions();
    }


    /**
     * Initialisiert die Liste
     */
    private void createEmptyList() {
        String[] sportslistArray = new String[]{};

        sportsList = new ArrayList<>(Arrays.asList(sportslistArray));

        sportslistAdapter =
                new ArrayAdapter<>(
                        this, // Die aktuelle Umgebung (diese Activity)
                        R.layout.list_item_sportslist, // ID der XML-Layout Datei
                        R.id.item_list_textview, // ID des TextViews
                        sportsList); // Beispieldaten in einer ArrayList

        ListView sportslistListView = (ListView) this.findViewById(R.id.sportListView);
        sportslistListView.setAdapter(sportslistAdapter);
        sportslistAdapter.notifyDataSetChanged();
    }

    public void fillSportsList() throws ClassNotFoundException{
/*        sportsList.clear();
        sportsList.addAll(GetDbEntries.getInstance().getSports());
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                sportslistAdapter.notifyDataSetChanged();
            }
        });*/

        String[] aktienlisteArray = {
                "Angebot des Mtv Salzgitter-SZ",
                "Angebot des Vfl Suderburg-Sud",
                "Angebote MTV-Wolfenbüttel-Wf",
                "Angebote Sportzentrum TU Braunschweig-WF",
                "Angebote VFL-Wolfsburg-Wob",
                "Aquarobic/Wassergymnastik-Wf",
                "Arbeitsplatz-Massage-SZ",
                "Arbeitsplatz-Massage-Sud",
                "Arbeitsplatz-Massage-Wf",
                "Arbeitsplatz-Massage-Wob",
                "Badminton-SZ",
                "Badminton-Sud",
                "Badminton-Wf",
                "Ball- und Bewegungsspiele-Wf",
                "Basketball-SZ",
                "Basketball-Sud",
                "Basketball-Wf",
                "Basketball-Wob",
                "Bauch Beine Po - SZ",
                "Beachvolleyball Day - Wf",
                "Beachvolleyball-Wf",
                "Betriebsmedizin-SZ",
                "Body-Styling-Wf",
                "Bodyfit-Sud",
                "Bowling-WF",
                "Boxen-Sud",
                "Boxen-Wf",
                "Bujinkan Sud",
                "Campuslauf TU BS",
                "Cycle Tour Magdeburg - Braunschweig",
                "Dozenten- und Mitarbeitersport-Wf",
                "Erstsemester - WF",
                "Fitnesstraining - Kraftraum-SZ",
                "Fitnesstraining - Kraftraum-Sud",
                "Fitnesstraining - Kraftraum-Wf",
                "Fitnesstraining - Wob",
                "Freeletics-WF",
                "Fusi N8-WOB",
                "Fußball-SZ",
                "Fußball-Sud",
                "Fußball-Wf",
                "Fußball-Wob",
                "Fußballturnier Hannover",
                "Golf-Wf",
                "Golf-Wob",
                "Handball N8-SZ",
                "Handball-SZ",
                "Handball-Sud",
                "Handball-Wf",
                "Handball-Wob",
                "Hapkido-Wf",
                "Hip Hop-Wf",
                "Jiu Jitsu-Sud",
                "Kanu-SZ",
                "Kanu-Wf",
                "Karate-Wf",
                "Kickboxen - SZ",
                "Klangmassage-Wf",
                "Körper-Atem-Stimme-Wf",
                "Lauf- und Walkingtreff - Sud",
                "Lauf- und Walkingtreff-Wf",
                "Nachtlauf BS",
                "Nutzerberechtigung für Beschäftigte",
                "Nutzerberechtigung für berechtigte Externe",
                "Ostfälische Spiele Suderburg",
                "Ostfälische Spiele Wolfenbüttel",
                "PausenExpress-Wf",
                "Pilates-Wf",
                "Power Workout-SZ",
                "Power-Bauch - Sud",
                "Power-Circuit-SZ",
                "Rudern-Wob",
                "Rückenschule-Wf",
                "Schach-Wob",
                "Schulung KL",
                "Selbstverteidigung für Frauen (Kurs) -Wf",
                "Selbstverteidigung für Frauen (Workshop)-Wf",
                "Selbstverteidigung für Frauen-SUD",
                "Sportchanbara-Wf",
                "Square-Dance-Wf",
                "Standard- und Lateintanz-Sud",
                "Standard- und Lateintanz-Wf",
                "Swing (Lindy Hop)-Wf",
                "Taekwondo-Wf",
                "Tai Chi-WF",
                "Tennis-SUD",
                "Tennis-SZ",
                "Tennis-Wf",
                "Tischtennis-SUD",
                "Tischtennis-SZ",
                "Triathlon-Wf",
                "Voba N8-SZ",
                "Volleyball-SZ",
                "Volleyball-Sud",
                "Volleyball-Wf",
                "Volleyball-Wob",
                "Wandern-standortübergreifend",
                "Wasserski-SZ",
                "Wirbelsäulengymnastik-Wf",
                "Yo-Qi-Lates-Wf",
                "Yoga-SZ",
                "Yoga-Sud",
                "Yoga-WF",
                "Z-Fitness-BBP-Tae Bo-SZ",
                "Zumba-Sud",
                "Zumba-WF"
        };

        //List<String> aktienListe = new ArrayList<>(Arrays.asList(aktienlisteArray));
        System.out.println("Liste wird befüllt");
        List<String> aktienListe = new ArrayList<>(new CSVReader().getCourseNames());

        ArrayAdapter<String> aktienlisteAdapter =
                new ArrayAdapter<>(
                        this, // Die aktuelle Umgebung (diese Activity)
                        R.layout.list_item_sportslist, // ID der XML-Layout Datei
                        R.id.item_list_textview, // ID des TextViews
                        aktienListe); // Beispieldaten in einer ArrayList

        ListView aktienlisteListView = (ListView) this.findViewById(R.id.sportListView);
        aktienlisteListView.setAdapter(aktienlisteAdapter);
    }

    private void setActions() {
        sportsListView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                //TODO hier muss etwas mit dem angeklickten Element passieren
                Uri uri = Uri.parse("https://www.hochschulsport.ostfalia.de/angebote/aktueller_zeitraum/_Angebot_des_Mtv_Salzgitter-SZ.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
