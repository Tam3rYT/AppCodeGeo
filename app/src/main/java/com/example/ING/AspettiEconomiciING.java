package com.example.ING;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ITA.R;
import com.github.barteksc.pdfviewer.PDFView;

public class AspettiEconomiciING extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspetti_economici);
        PDFView pdfView = findViewById(R.id.economiciPdf);
        pdfView.fromAsset("economici.pdf").load();
    }
}