package com.example.ING;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ITA.R;
import com.github.barteksc.pdfviewer.PDFView;

public class AspettiAmbientaliING extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspetti_ambientali);
        PDFView pdfView = findViewById(R.id.ambientaliPdf);
        pdfView.fromAsset("ambientali.pdf").load();
    }
}