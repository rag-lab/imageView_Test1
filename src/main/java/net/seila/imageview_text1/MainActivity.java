package net.seila.imageview_text1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.btnChangeImage);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                ImageView image = (ImageView) findViewById(R.id.imageView1);
                image.setImageResource(R.drawable.android3d);
            }

        });

    }

}
