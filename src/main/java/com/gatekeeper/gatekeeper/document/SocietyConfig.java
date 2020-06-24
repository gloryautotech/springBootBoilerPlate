package com.gatekeeper.gatekeeper.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.List;


@Document(collection = "SocietyConfig")
public class SocietyConfig {


    private ObjectId _id;
    private String name;
    private String secretary;
    private List<String> subSecretary;
    private List<String> questions;

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId id) {
        this._id = id;
    }

    @Override
    public String toString() {
        return "SocietyConfig{" +
                "name='" + name + '\'' +
                ", secretary='" + secretary + '\'' +
                ", subSecretary=" + subSecretary +
                ", questions=" + questions +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecretary() {
        return secretary;
    }

    public void setSecretary(String secretary) {
        this.secretary = secretary;
    }

    public List<String> getSubSecretary() {
        return subSecretary;
    }

    public void setSubSecretary(List<String> subSecretary) {
        this.subSecretary = subSecretary;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

}
