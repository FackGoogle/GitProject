package edu.android.gitproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Burron button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.FuckGoogle);
        TextView textView2 = findViewById(R.id.FuckGoogle);
    }
}
