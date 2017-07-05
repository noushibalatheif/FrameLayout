package com.example.noushibalatheif.framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout loginframe, signupframe;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginframe=(RelativeLayout)findViewById(R.id.loginframe);
        signupframe=(RelativeLayout)findViewById(R.id.signupframe);

        signupframe.setVisibility(View.GONE);

    }

    public void loginClicked(View v)
    {
        loginframe.setVisibility(View.VISIBLE);
        signupframe.setVisibility(View.GONE);
    }

    public void signupClicked(View v)
    {
        loginframe.setVisibility(View.GONE);
        signupframe.setVisibility(View.VISIBLE);
    }


}
