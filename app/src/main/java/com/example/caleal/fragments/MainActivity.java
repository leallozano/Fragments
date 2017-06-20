package com.example.caleal.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    Fragment [] fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int b= -1;
        final Button button;

        button =  (Button) findViewById(R.id.button3) ;
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Boton(button.getId());

            }

        });


        //final Button button = (Button) findViewById(R.id.button3);




        /*button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               Boton(button.getId());
            }
        });*/


    }





    public void Boton (int miBoton) {

        fragment = new Fragment[3];

        fragment[1]= new CameraFragment();


        FragmentManager fr = getFragmentManager();
        FragmentTransaction ft = fr.beginTransaction();

        ft.replace(R.id.botones,fragment[1]);

        //fragment.getActivity();
        ft.commit();


    }



}
