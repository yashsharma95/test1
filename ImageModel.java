package com.example.yash.testpro;

/**
 * Created by Yash on 6/13/2017.
 */

public class ImageModel {

        String id;
        int bannerImage;

        public ImageModel(String id, int bannerImage){
            this.id = id;
            this.bannerImage = bannerImage;
        }

        public String getId(){return id;}
        public int getBannerImage(){return bannerImage;}
}
