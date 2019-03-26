package com.example.takehomeassignment08_thomass;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast; //Library imports

public class SelectionViewHolder extends RecyclerView.ViewHolder { //RecycleView is a subclass of ViewGroup that displays child views
    //Recycler view helps store memory by not loading everything

    public CardView cardView;
    public TextView activitySelection;
    public TextView descriptionSelection;
    public TextView questionAnswer;
    public TextView linkToSite;
    public ImageView activityImage; //Global and Public variables can be used throughout classes
    public Context context;


    public SelectionViewHolder(final View itemView, final Context context) { //View is only what is needed
        super(itemView); //inheritance
        cardView = (CardView) itemView.findViewById(R.id.card_view_selection);
        activitySelection = (TextView) itemView.findViewById(R.id.activity);
        descriptionSelection = (TextView) itemView.findViewById(R.id.description);
        activityImage = (ImageView) itemView.findViewById(R.id.activity_image);


    }

/*
    public void bind(final Question question) {
        //questionCountry.setSelected(question.answer);
        questionCountry.setText(question.question);
        countryQuestion.setText(question.location);
        countryImage.setImageResource(question.photoId);
        linkToSite.setText(question.link);
        bind(question);
    }*/
}


