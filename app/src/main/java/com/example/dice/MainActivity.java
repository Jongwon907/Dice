package com.example.dice;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView imageview1 = findViewById(R.id.imageView1);

        imageview1.setImageResource(R.drawable.d1);

        ImageView imageview2 = findViewById(R.id.imageView2);

        imageview2.setImageResource(R.drawable.d1);
    }
    public void onClicked(View view) {
        Random r = new Random();
        int num1 = r.nextInt(6) + 1;
        ImageView imageview1 = findViewById(R.id.imageView1);
        if(num1 == 1) imageview1.setImageResource(R.drawable.d1);
        else if(num1 == 2) imageview1.setImageResource(R.drawable.d2);
        else if(num1 == 3) imageview1.setImageResource(R.drawable.d3);
        else if(num1 == 4) imageview1.setImageResource(R.drawable.d4);
        else if(num1 == 5) imageview1.setImageResource(R.drawable.d5);
        else if(num1 == 6)imageview1.setImageResource(R.drawable.d6);
        int num2 = r.nextInt(6) + 1;
        ImageView imageview2 = findViewById(R.id.imageView2);
        if(num2 == 1) imageview2.setImageResource(R.drawable.d1);
        else if(num2 == 2) imageview2.setImageResource(R.drawable.d2);
        else if(num2 == 3) imageview2.setImageResource(R.drawable.d3);
        else if(num2 == 4) imageview2.setImageResource(R.drawable.d4);
        else if(num2 == 5) imageview2.setImageResource(R.drawable.d5);
        else if(num2 == 6)imageview2.setImageResource(R.drawable.d6);
    }

}