package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {

		Song song1 = new Song();
		Song song2 = new Song();
		Song song3 = new Song();

		song1.setArtist("아이유");
		song1.setTitle("좋은날");
		song1.setAlbum("Real");
		song1.setYear(2010);
		song1.setTrack(3);
		song1.setComposer("이민수");
		song1.showInfo();

		song2.setArtist("BIGBANG");
		song2.setTitle("거짓말");
		song2.setAlbum("Always");
		song2.setYear(2007);
		song2.setTrack(2);
		song2.setComposer("G-DRAGON");
		song2.showInfo();

		song3.setArtist("버스커버스커");
		song3.setTitle("벚꽃엔딩");
		song3.setAlbum("버스커버스커1집");
		song3.setYear(2012);
		song3.setTrack(4);
		song3.setComposer("장범준");
		song3.showInfo();

		System.out.println("=======================================================");

		Song song4 = new Song("아이유", "좋은날", "Real");
		song4.setYear(2010);
		song4.setTrack(3);
		song4.setComposer("이민수");

		song4.showInfo();

		System.out.println("=======================================================");

		Song song5 = new Song(2, 2007, "BIGBANG", "거짓말");
		song5.setComposer("G-DRAGON");
		song5.setAlbum("Always");

		song5.showInfo();

		System.out.println("=======================================================");

		Song song6 = new Song(2012, "장범준");

		song6.showInfo();

		Song song7 = new Song("장범준", 2012);

		song7.showInfo();

		System.out.println("--------------------------------------------");


		
		
		
	}

}
