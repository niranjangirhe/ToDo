package com.ngsolutions.todo.model;

public class Category {
    String imageUrl;
    String categoryTitle;

    public Category(String imageUrl, String categoryTitle) {
        this.imageUrl = imageUrl;
        this.categoryTitle = categoryTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }
}
