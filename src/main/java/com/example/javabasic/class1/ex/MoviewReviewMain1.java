package com.example.javabasic.class1.ex;

public class MoviewReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타입";
        aboutTime.review = "인생 시간 영화";

        System.out.println("영화 제목: " + inception.title + ", 리뷰:" + inception.review);
        System.out.println("영화 제목: " + aboutTime.title + ", 리뷰:" + aboutTime.review);
    }
}
