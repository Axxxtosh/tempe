package com.uriahsolution.homecare.ui.login;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.uriahsolution.homecare.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    @BindView(R.id.btn_login)
    Button btn_login;


    private LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);



        //Set presenter
        mLoginPresenter=new LoginPresenter(this);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // startActivity(MainActivity.class);


            }
        });

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void log() {

    }

    @Override
    public void startActivity(Class<?> cls) {

        Intent intent=new Intent(this,cls);
        startActivity(intent);


    }
}
