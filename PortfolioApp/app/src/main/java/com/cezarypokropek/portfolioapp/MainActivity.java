package com.cezarypokropek.portfolioapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Restaurant App", "Restaurant App using Android Studio and Java", R.drawable.hungry_developer),
                new Project("Task Timer App", "Task Timer App using Android Studio and Java with custom datebase", R.drawable.calculator),
                new Project("Flickr Clone App", "Flickr-like App using Android Studio and Java", R.drawable.quote),
                new Project("Trivia App", "Trivia Quiz Game App using Android Studio and Java", R.drawable.getting_started),
                new Project("Earth Quake App", "EarthQuake App using Android Studio and Java with google maps", R.drawable.tape)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);


    }

}
