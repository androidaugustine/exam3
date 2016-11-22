package com.example.blackmonk.exam3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson json = new Gson();

        Reader reader = new Reader() {
            @Override
            public int read(char[] chars, int i, int i1) throws IOException {
                return 0;
            }

            @Override
            public void close() throws IOException {

            }
        };

        reader.read(json.exam3.json);

        json.fromJson(reader, null);



    }
}
