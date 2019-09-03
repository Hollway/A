package com.belhard.valera.test.entities.less4.homework.zadacha2;


public class Book {

            // Поля

    private String title;
    private int pages;
    private ISBN isbn;
    private Format format;

            // Конструктор

    public Book(String title, int pages, ISBN isbn, Format format) {

        if (validateParams(title, pages)) {                                 // Валидация
            this.title = title;
            this.pages = pages;
        } else {
            this.title = "Default";
            this.pages = 10;
        }
        this.isbn = isbn;
        this.format = format;
    }

    private boolean validateParams(String title, int pages) {             // Условие валидации
        return title.length() > 1 & pages >= 10;
    }

    public void throughOutPage(){
        this.pages--;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", isbn=" + isbn +
                ", format=" + format +
                '}';
    }
}
