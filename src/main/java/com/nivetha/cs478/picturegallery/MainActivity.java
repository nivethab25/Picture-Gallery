package com.nivetha.cs478.picturegallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // GridView to display the Picture Gallery
    private GridView mGridView;

    // List to hold the resource ids of the landmark pictures
    private ArrayList<Integer> mPictureIds = new ArrayList<>(
            Arrays.asList(R.drawable.image1, R.drawable.image2,
                    R.drawable.image3, R.drawable.image4, R.drawable.image5,
                    R.drawable.image6, R.drawable.image7, R.drawable.image8,
                    R.drawable.image9, R.drawable.image10, R.drawable.image11,
                    R.drawable.image12,R.drawable.image13,R.drawable.image14,R.drawable.image15,R.drawable.image16));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the layout for the Picture Gallery
        setContentView(R.layout.activity_main);

        // Binding the grid view from the layout
        mGridView = (GridView) findViewById(R.id.gridview);

        // Setting the Image Adapter for the Gallery
        mGridView.setAdapter(new ImageAdapter(this, mPictureIds));

        // Disabling click in the Gallery
        mGridView.setClickable(false);

        // Setting up the Action Bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
