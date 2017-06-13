package com.example.yash.testpro;



import android.widget.ImageView;
import android.widget.TextView;

public class ModelProducts {
    String titleDescTv;
    String timeTxt;
    int itemImg;
    String itemTitleTv;

    public ModelProducts(String titleDescTv, String timeTxt, int itemImg, String itemTitleTv) {
        this.titleDescTv = titleDescTv;
        this.timeTxt = timeTxt;
        this.itemImg = itemImg;
        this.itemTitleTv = itemTitleTv;
    }

    public String getTitleDescTv() {
        return titleDescTv;
    }

    public void setTitleDescTv(String titleDescTv) {
        this.titleDescTv = titleDescTv;
    }

    public String getTimeTxt() {
        return timeTxt;
    }

    public void setTimeTxt(String timeTxt) {
        this.timeTxt = timeTxt;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItemTitleTv() {
        return itemTitleTv;
    }

    public void setItemTitleTv(String itemTitleTv) {
        this.itemTitleTv = itemTitleTv;
    }
}
