package com.example.sampleapp;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Bikin tampilan Dark Mode ala Binance
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#181A20")); // Background gelap
        layout.setPadding(60, 150, 60, 60);

        TextView title = new TextView(this);
        title.setText("HAM Private Exchange");
        title.setTextColor(Color.parseColor("#EAECEF")); // Teks putih
        title.setTextSize(26);
        
        TextView subtitle = new TextView(this);
        subtitle.setText("Saldo Internal HAM:\n$100,000,000,000.00");
        subtitle.setTextColor(Color.parseColor("#0ECB81")); // Teks hijau Binance
        subtitle.setTextSize(20);
        subtitle.setPadding(0, 50, 0, 0);

        layout.addView(title);
        layout.addView(subtitle);

        // Tampilkan layout ke layar
        setContentView(layout);
    }
}
