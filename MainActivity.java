package com.example.yash.testpro;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.viewpagerindicator.CirclePageIndicator;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
;import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;

public class MainActivity extends Activity {
    ArrayList<ModelProducts> modelProductses;
    ArrayList<ImageModel> mImageModels;
    CustomList customList;
    ImageBannerAdapter mImageBannerAdapter;
    private ListView listView;
    AutoScrollViewPager viewPager;

    int[] mResources = {
            R.mipmap.kp_img,
            R.mipmap.arina_img,
            R.mipmap.jb_img,
            R.mipmap.jt_img,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialElements();
    }

    private void setInitialElements() {

        listView = (ListView) findViewById(R.id.list_view);

        viewPager = (AutoScrollViewPager) findViewById(R.id.pager);

        modelProductses = new ArrayList<ModelProducts>();
        modelProductses.add(new ModelProducts("Lorem ipsum dolor sit amet, quam dolor nibh nonummy, amet quisque nunc","21 hours ago",R.mipmap.jb_img,"Baby ft. justin bieber"));
        modelProductses.add(new ModelProducts("Lorem ipsum dolor sit amet, quam dolor nibh nonummy, amet quisque nunc","28 hours ago",R.mipmap.kp_img,"Roar ft. katy perry"));
        modelProductses.add(new ModelProducts("Lorem ipsum dolor sit amet, quam dolor nibh nonummy, amet quisque nunc","18 hours ago",R.mipmap.jt_img,"Mirrors ft. justin tiblekar"));
        modelProductses.add(new ModelProducts("Lorem ipsum dolor sit amet, quam dolor nibh nonummy, amet quisque nunc","12 hours ago",R.mipmap.arina_img,"Love the way ft. arina ggrande"));

        customList=new CustomList(this,modelProductses);
        listView.setAdapter(customList);

        setPager();

    }

    //region setPager
    public void setPager() {

        mImageBannerAdapter = new ImageBannerAdapter(MainActivity.this, mResources);
        viewPager.setAdapter(mImageBannerAdapter);
        viewPager.setCurrentItem(0);
        viewPager.setClickable(true);
        viewPager.setInterval(3000);
        viewPager.startAutoScroll();

        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) findViewById(R.id.titles);
        circlePageIndicator.setViewPager(viewPager);
        circlePageIndicator.setRadius(5);
    }
    //endregion
}
