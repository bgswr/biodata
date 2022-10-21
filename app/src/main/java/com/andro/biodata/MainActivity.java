package com.andro.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnTelp, btnAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTelp = findViewById(R.id.btnTelp);
        btnAlamat = findViewById(R.id.btnAlamat);

        btnTelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomor="089694652540";
                Intent telepon = new Intent(Intent.ACTION_DIAL);
                telepon.setData(Uri.fromParts("tel",nomor,null));
                startActivity(telepon);
            }
        });

        btnAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(i);
            }
        });
    }
}
