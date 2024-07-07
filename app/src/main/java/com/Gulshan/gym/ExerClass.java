package com.haris.gym;

import android.widget.ImageView;

import java.io.Serializable;

public class ExerClass implements Serializable {
    String source,name,description;

    public ExerClass(String source, String name, String description) {
        this.source = source;
        this.name = name;
        this.description = description;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
