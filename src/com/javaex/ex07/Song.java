package com.javaex.ex07;

public class Song {

	////////////// 필드//////////////////

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	//////////// 생성자/////////////////

	/////////// 디폴트생성자/////////
	public Song() {

	}

	////////// 생성자(파라미터 artist,title,album)/////////////

	public Song(String artist, String title, String album) {

		this.title = title;
		this.artist = artist;
		this.album = album;

	}

	////////// (year, track, title, artist)////////////////////

	public Song(int track, int year, String title, String artist) {

		this.year = year;
		this.track = track;
		this.title = title;
		this.artist = artist;

	}

	//////////////////// ( composer )////////////////////////

	public Song(String composer) {

		this.composer = composer;

	}

	public Song(int year, String composer) {

		this.year = year;
		this.composer = composer;

	}

	public Song(String composer, int year) {
		
		this.year = year;
		this.composer = composer;

	}
	
	///////////////////////////////////
	
	public Song (String title, String artist) {
		
		this.title = title;
		this.artist = artist;
		
		System.out.println("생성자");
	}
	
	public Song (String composer, int track, int year) {
		
		//this(String title, String artist);
		this.composer = composer;
		this.track = track;
		this.year = year;
		
	}

	/*
	 * 
	 * public Song (String artist, int track) {
	 * 
	 * this.track = track; this.artist = artist; }
	 * 
	 * 같은 순서의 중복된 형태는 구분 못함 ex) String, int / String, int
	 */

	////////////////////////////// 메소드(게터세터)/////////////////////////

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void showInfo() {

		System.out.println(
				artist + "," + title + "(" + album + "," + year + "," + track + "번 track" + "," + composer + " 작곡 )");

	}

}
