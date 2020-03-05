package com.example.pokechecker;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
// https://developer.android.com/training/data-storage/room
@Entity(tableName = "pokemon")
public class Pokemon {
    // _id,Name,Type1,Type2,Stage1,Evolve1,Stage2,Evolve2,Stage3
    @PrimaryKey
    public int uid;
    @ColumnInfo(name = "_id")
    private Integer id;
    @ColumnInfo(name = "Name")
    private String name;
    @ColumnInfo(name = "Type1")
    private String type1;
    @ColumnInfo(name = "Type2")
    private String type2;
    @ColumnInfo(name = "Stage1")
    private String stage1;
    @ColumnInfo(name = "Evolve1")
    private String evolve1;
    @ColumnInfo(name = "Stage2")
    private String stage2;
    @ColumnInfo(name = "Evolve2")
    private String evolve2;
    @ColumnInfo(name = "Stage3")
    private String stage3;
    public int getUid() {
        return uid;
    }
    public void setUid(int uid){
        this.uid = uid;
    }
    public String getName() {
        return name;
    }
    public String getType1() {
        return type1;
    }
    public String getType2() {
        return type2;
    }
    public String getStage1() {
        return stage1;
    }
    public String getStage2() {
        return stage2;
    }
    public String getStage3() {
        return stage3;
    }
    public String getEvolve1() {
        return evolve1;
    }
    public String getEvolve2() {
        return evolve2;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setType1(String type1) {
        this.type1 = type1;
    }
    public void setType2(String type2) {
        this.type2 = type2;
    }
    public void setStage1(String stage1) {
        this.stage1 = stage1;
    }
    public void setStage2(String stage2) {
        this.stage2 = stage2;
    }
    public void setStage3(String stage3) {
        this.stage3 = stage3;
    }
    public void setEvolve1(String evolve1) {
        this.evolve1 = evolve1;
    }
    public void setEvolve2(String evolve2) {
        this.evolve2 = evolve2;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
}

