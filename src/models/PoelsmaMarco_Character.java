package models;

import java.time.Year;
public class PoelsmaMarco_Character {
    private String name;
    private int chapter;
    private int episode;
    private Year year;
    private String note;

    public PoelsmaMarco_Character(String name, int chapter, int episode, Year year, String note) {
        this.name = name;
        this.chapter = chapter;
        this.episode = episode;
        this.year = year;
        this.note = note;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getChapter() {
        return chapter;
    }
    public void setChapter(int chapter) {
        this.chapter = chapter;
    }
    public int getEpisode() {
        return episode;
    }
    public void setEpisode(int episode) {
        this.episode = episode;
    }
    public Year getYear() {
        return year;
    }
    public void setYear(Year year) {
        this.year = year;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", chapter=" + chapter +
                ", episode=" + episode +
                ", year=" + year +
                ", note='" + note + '\'' +
                '}';
    }
}
