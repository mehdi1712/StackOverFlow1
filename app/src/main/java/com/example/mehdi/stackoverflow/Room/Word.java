package com.example.mehdi.stackoverflow.Room;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {


    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    private int Wid;

    @NonNull
    @ColumnInfo(name = "Title")
    private String WTitle;

    @NonNull
    @ColumnInfo(name = "ProfileImage")
    private String WProfileImage;
    private String WName;

    public int getWId(){
        return Wid;
    }
    public void setWid(int wid){
        this.Wid=wid;
    }

    public String getWTitle() {
        return WTitle;
    }

    public void setWTitle(String WTitle) {
        this.WTitle = WTitle;
    }

    public String getWProfileImage() {
        return WProfileImage;
    }

    public void setWProfileImage(String WProfileImage) {
        this.WProfileImage = WProfileImage;
    }

    public String getWName() {
        return WName;
    }

    public void setWName(String WName) {
        this.WName = WName;
    }

//    public Word(int wid,String WTitle, String WProfileImage, String WName) {
//
//        this.Wid=wid;
//        this.WTitle = WTitle;
//        this.WProfileImage = WProfileImage;
//        this.WName = WName;
//    }
            public Word() {


            }
}
