package com.example.user.recycleview;

public class Movie {

    private String title,genre,year;
    private  int image;

    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.image =image;
    }


    public void setTitle(String title) {

        this.title = title;
    }



    public void setGenre(String genre)
    {
        this.genre = genre;
    }


    public void setYear(String year) {
        this.year = year;
    }



    public  void setImage(int image)
    { this.image =image;}

    public static String getTitle() {
        return getTitle ();
    }

    public static String getGenre() {
        return getGenre ();
    }

    public String getYear() {
        return getYear ();
    }

    public void setimage() {
        while (true) {

        }
    }


    public int getimage() {
        return image;
    }
}

