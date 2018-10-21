package com.gmail.indraramadhona12.buatradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //ini deklarasi atribut tampilan view
    EditText editNama, editNomor;
    TextView texthasil;
    Button tombolsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //koneksi atribut XML
        editNama = (EditText) findViewById(R.id.editNama);
        editNomor = (EditText) findViewById(R.id.editNomor);
        texthasil = (TextView)findViewById(R.id.textView3);
        tombolsubmit = (Button)findViewById(R.id.button);


    }
    protected  void onClick(View view){
        String nama, nomor;
        nama = editNama.getText() .toString();
        nomor = editNomor.getText().toString();
        texthasil.setText(""+nama+"-"+nomor);
    }

}
