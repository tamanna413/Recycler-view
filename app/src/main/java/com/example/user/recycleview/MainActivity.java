package com.example.user.recycleview;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;

    @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            recyclerView = findViewById(R.id.recycler_view);

            movieAdapter = new MovieAdapter (movieList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(movieAdapter);

        MovieData();
    }

    private void MovieData() {
        Movie movie = new Movie  ("PINK", "DRAMA", "2016");
        movie.setImage(R.drawable.pink);
        movieList.add(movie );

        movie = new Movie ("3IDIOTS", "DRAMA", "2012");
        movie.setImage(R.drawable.idiots);
        movieList.add(movie);


    }
}