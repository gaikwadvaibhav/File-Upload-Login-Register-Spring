package com.dhasu.Dhasu.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by raj on 21/11/17.
 */
@Document
public class File  {

    String imagePath;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "File{" +
                "imagePath='" + imagePath + '\'' +
                '}';
    }


}
