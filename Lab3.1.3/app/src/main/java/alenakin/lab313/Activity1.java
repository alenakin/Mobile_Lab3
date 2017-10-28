package alenakin.lab313;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
    }

    public void OnClickB1(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void OnClickB2(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    public void OnClickB3(View view) {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void OnClickB4(View view) {
        finish();
        System.exit(0);
    }
}
