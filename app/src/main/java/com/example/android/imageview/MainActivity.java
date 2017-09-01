package com.example.android.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static ImageView imgView;
    private static Button buttonSbm;

    private int current_image_index;
    int [] images = {R.drawable.ic_stat_name, R.mipmap.fun, R.mipmap.ic_launcher_round };
    public void buttonClick(){
        imgView = (ImageView) findViewById(R.id.imageView);
        buttonSbm = (Button) findViewById(R.id.button);
        buttonSbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        current_image_index++;
                        current_image_index = current_image_index % images.length;
                        imgView.setImageResource(images[current_image_index]);
                    }
                }
        );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClick();
    }
}
