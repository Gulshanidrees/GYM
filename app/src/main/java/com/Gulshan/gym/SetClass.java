package com.haris.gym;

public class SetClass {
    String pic,name,category,targetMuscles,description,set;
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTargetMuscles() {
        return targetMuscles;
    }

    public void setTargetMuscles(String targetMuscles) {
        this.targetMuscles = targetMuscles;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public SetClass(String pic, String name, String category, String targetMuscles, String description, String set) {
        this.pic = pic;
        this.name = name;
        this.category = category;
        this.targetMuscles = targetMuscles;
        this.description = description;
        this.set = set;
    }
}
