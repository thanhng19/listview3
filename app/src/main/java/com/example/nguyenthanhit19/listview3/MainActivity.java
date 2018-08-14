package com.example.nguyenthanhit19.listview3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edtTen;
    Button btnLuu;
    ListView lvTen;

    ArrayList<String> arrTen;
    ArrayAdapter<String> adapterTen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        addEvent();

    }

    private void addEvent() {
        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                luuDuLieu();
            }
        });
    }

    private void addControl() {
        edtTen = (EditText) findViewById(R.id.edtTen);
        btnLuu = (Button) findViewById(R.id.btnLuu);
        lvTen = (ListView) findViewById(R.id.lvTen);

        arrTen = new ArrayList<String>();
        adapterTen = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrTen
        );
        lvTen.setAdapter(adapterTen);
    }

    private void luuDuLieu() {
        String ten = edtTen.getText().toString();
        arrTen.add(ten);
        adapterTen.notifyDataSetChanged(); //update lai adapter
        edtTen.requestFocus(); //chi lai con tro

    }
}
