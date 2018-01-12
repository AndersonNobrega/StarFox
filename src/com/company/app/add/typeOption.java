package com.company.app.add;

public enum typeOption {
    Anime, Series, Book, Manga;

    typeOption() {}

    public String value() {
        return name();
    }

    public static typeOption fromValue(String v) {
        return valueOf(v);
    }
}
