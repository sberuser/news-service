package ru.sberbank.newsservice.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import ru.sberbank.newsservice.util.ParseDeserializer;

import java.time.LocalDateTime;

public class Article{

    private int id;

    private int userId;

    private String name;

    private String text;

    @JsonSerialize(using = ToStringSerializer.class)
    @JsonDeserialize(using = ParseDeserializer.class)
    private LocalDateTime dateTime;

    public Article() {}

    public Article(String name, String text) {
        this.name = name;
        this.text = text;
        this.userId = userId;
    }

    public Article(Integer id, String name, String text) {
        this.name = name;
        this.text = text;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public int getUserId() {
        return userId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", userId=" + userId +
                ", dateTime=" + dateTime +
                '}';
    }
}
