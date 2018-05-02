package com.uriahsolution.homecare.ui.main;

import com.uriahsolution.sms.BaseView;


public class MainContract {

    interface View extends BaseView<MainContract.Presenter> {

        void startActivity(Class<?> cls);

    }

    interface Presenter {



    }

}
