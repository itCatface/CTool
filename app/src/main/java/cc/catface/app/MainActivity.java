package cc.catface.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import cc.catface.ctool.view.click.AntiShakeClickListener;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View bt1 = findViewById(R.id.bt_1);
        View bt2 = findViewById(R.id.bt_2);


        bt1.setOnClickListener(new AntiShakeClickListener() {
            @Override protected void onAntiShakeClick(View v) {
                Log.d("catface", "ddd1614");
            }
        });

        bt2.setOnClickListener(new AntiShakeClickListener(2_000) {
            @Override protected void onAntiShakeClick(View v) {
                Log.d("catface", "weqqrwqer");
            }
        });
    }
}
