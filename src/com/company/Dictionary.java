package com.company;

public class Dictionary {
    //attributes
    int pages;
    String language;
    String author;
    int current_page;
    //constructors
    public Dictionary (int pages, String language, String author){
        this.pages = pages;
        this.language = language;
        this.author = author;
    }

    //method
    public void turn_page (){
        current_page++;
    }
    public int get_page () {
        return current_page;
    }
    public void set_page (int page_number){
        this.current_page = page_number;
    }
}

