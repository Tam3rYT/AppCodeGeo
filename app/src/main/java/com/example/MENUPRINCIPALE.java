package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ING.Inglish;
import com.example.ITA.AspettiStorici;
import com.example.ITA.Italia;
import com.example.ITA.R;

public class MENUPRINCIPALE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_e_n_u_p_r_i_n_c_i_p_a_l_e);
    }

    public void ApriMenuITA(View v) {

        Intent i = new Intent(this, Italia.class);
        startActivity(i);

    }

    public void ApriMenuING(View v) {

        Intent i = new Intent(this, Inglish.class);
        startActivity(i);

    }







}


