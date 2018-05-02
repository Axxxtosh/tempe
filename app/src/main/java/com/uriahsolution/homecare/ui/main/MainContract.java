package com.uriahsolution.homecare.ui.main;


import com.uriahsolution.homecare.BaseView;

public class MainContract {

    interface View extends BaseView<Presenter> {

        void startActivity(Class<?> cls);

    }

    interface Presenter {



    }

}
