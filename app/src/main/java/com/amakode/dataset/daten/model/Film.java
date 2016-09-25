package com.amakode.dataset.daten.model;

public class Film{

        private String title, thumbnailUrl;

       // private ArrayList<String> genre;

        public Film() {
        }

        public Film(String name, String thumbnailUrl) {
            this.title = name;
            this.thumbnailUrl = thumbnailUrl;

        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String name) {
            this.title = name;
        }

        public String getThumbnailUrl() {
            return thumbnailUrl;
        }

        public void setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
        }

    }