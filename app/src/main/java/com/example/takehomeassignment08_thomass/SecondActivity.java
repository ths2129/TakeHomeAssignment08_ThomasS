package com.example.takehomeassignment08_thomass;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    public List<Selection> selections; //Connects to the intialData method
    private SelectionAdapter selectionAdapter; //calling the adapter


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_page);
        dataToInitialize();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        selectionAdapter = new SelectionAdapter(selections, this); //calling the variable
        recyclerView.setAdapter(selectionAdapter);
    }


    public void dataToInitialize() {
        selections = new ArrayList<>(); //This is calling the global array variable
        selections.add(new Selection(R.string.quiz, R.string.quiz_description, R.drawable.foot, 2)); //linked to global array and Question class
        selections.add(new Selection(R.string.email, R.string.email_description, R.drawable.letter, 2)); //linked to global array and Question class
        selections.add(new Selection(R.string.forum, R.string.forum_description, R.drawable.forum, 2)); //linked to global array and Question class
        selections.add(new Selection(R.string.company, R.string.company_description, R.drawable.company, 2)); //linked to global array and Question class
        selections.add(new Selection(R.string.recycling_centers, R.string.recycling_centers_description, R.drawable.recycle, 2));
        selections.add(new Selection(R.string.game, R.string.game_description, R.drawable.game, 2));


    }
}