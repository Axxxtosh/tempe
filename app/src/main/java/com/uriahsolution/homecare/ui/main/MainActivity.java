package com.uriahsolution.homecare.ui.main;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.uriahsolution.homecare.R;
import com.uriahsolution.homecare.ui.main.adapter.AdapterOne;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    AdapterOne adapterOne;
    private HashMap<String, Integer> url_maps;
    @BindView(R.id.slider1)
    SliderLayout mDemoSlider1;
    @BindView(R.id.slider2)
    SliderLayout mDemoSlider2;

    //recycler view
    @BindView(R.id.rv_1)
    RecyclerView rv_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSlider();

        setRecycler();

    }

    private void setRecycler() {
       adapterOne=new AdapterOne(getBaseContext());
        rv_1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        rv_1.setAdapter(adapterOne);
        rv_1.setVisibility(View.VISIBLE);
        rv_1.postDelayed(new Runnable() {
            @Override
            public void run() {
                rv_1.smoothScrollToPosition(adapterOne.getItemCount());

            }
        },1000);
    }

    private void setSlider() {
        url_maps= new HashMap<String, Integer>();
        url_maps.put("1",R.drawable.a);
        url_maps.put("2",R.drawable.aab);
        url_maps.put("3",R.drawable.aae);
        url_maps.put("4",R.drawable.aag);
        url_maps.put("5",R.drawable.aah);
        url_maps.put("6",R.drawable.aaf);

        mDemoSlider1.removeAllSliders();
        mDemoSlider2.removeAllSliders();
        for(String name : url_maps.keySet()){
            BaseSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView

                    .image(url_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.FitCenterCrop);


            //add your extra information

            /*textSliderView.getBundle()
                    .putString("extra",name);*/

            mDemoSlider1.addSlider(textSliderView);
            mDemoSlider2.addSlider(textSliderView);


        }

        mDemoSlider1.startAutoCycle();
        mDemoSlider2.startAutoCycle();
    }

}
