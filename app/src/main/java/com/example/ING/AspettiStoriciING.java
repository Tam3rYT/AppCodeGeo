package com.example.ING;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ITA.R;
import com.github.barteksc.pdfviewer.PDFView;

public class AspettiStoriciING extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspetti_storici);


        PDFView pdfView = findViewById(R.id.storiciPdf);
        pdfView.fromAsset("storici.pdf").load();
    







    }









}