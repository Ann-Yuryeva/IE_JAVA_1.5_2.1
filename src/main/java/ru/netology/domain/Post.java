package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId; // поле из документации
    private CommentsInfo commentsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс CommentsInfo
    // + get/set на все поля
}