package com.uriahsolution.homecare.ui.login;

import com.uriahsolution.homecare.BaseView;

public class LoginContract {


        interface View extends BaseView<Presenter> {

                void startActivity(Class<?> cls);

        }

        interface Presenter {



        }


}
