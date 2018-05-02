package com.uriahsolution.homecare.ui.main;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.uriahsolution.homecare.R;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private HashMap<String, String> url_maps;
    @BindView(R.id.slider)
    SliderLayout mDemoSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSlider();

    }
    private void setSlider() {
        url_maps= new HashMap<String, String>();
        url_maps.put("1","http://tvfiles.alphacoders.com/100/hdclearart-10.png");

        url_maps.put("2", "http://tvfiles.alphacoders.com/100/hdclearart-10.png");

        url_maps.put("3","http://tvfiles.alphacoders.com/100/hdclearart-10.png");


        mDemoSlider.removeAllSliders();
        for(String name : url_maps.keySet()){
            BaseSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView

                    .image(url_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit);


            //add your extra information

            /*textSliderView.getBundle()
                    .putString("extra",name);*/

            mDemoSlider.addSlider(textSliderView);

        }

        mDemoSlider.startAutoCycle();
    }

}
