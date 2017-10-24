package com.pucha.pavan.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

/**
 * Created by pavan on 10/24/2017.
 */
//PlaceHolder Data : http://boombox.ng/albums/music.jsons
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvView;
        rvView = (RecyclerView) this.findViewById(R.id.rv_layout);
    }


}
