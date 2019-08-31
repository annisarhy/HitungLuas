package com.example.hitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editPanjang, editLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung luas persegi panjang");

        editPanjang = (EditText)findViewById(R.id.edit_panjang);
        editLebar = (EditText)findViewById(R.id.edit_lebar);
        btnHitung = (Button)findViewById(R.id.btn_hitung);
        txtLuas = (TextView)findViewById(R.id.txt_luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = editPanjang.getText().toString().trim();
                String lebar = editLebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p*l;

                txtLuas.setText("Luas :" +luas);
            }
        });
    }

    public void next(View view) {
        Intent explicit = new Intent(this, Kalkulator.class);
        startActivity(explicit);
    }
}
