package com.javaex.oop;

public class SongApp {
    public static void main(String[] args) {
        //Song(title, artist, album, composer, year, track)
        Song song1 = new Song("좋은날", "아이유", "Real", "이민수", 2010, 3);
        song1.showInfo();

        Song song2 = new Song();
        song2.setTitle("거짓말");
        song2.setArtist("BIGBANG");
        song2.setAlbum("Always");
        song2.setComposer("G-Dragon");
        song2.setYear(2007);
        song2.setTrack(2);
        song2.showInfo();

        Song song3 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", 2012, 4);
        song3.showInfo();
        Song song4 = new Song("노래제목", "가수");
        song4.setTitle("노래 제목 변경");
        song4.showInfo();
    }
}
