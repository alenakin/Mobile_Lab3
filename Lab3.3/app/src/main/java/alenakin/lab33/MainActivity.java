package alenakin.lab33;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int ALPHA_ANIM = 0;
    final int SCALE_ANIM = 1;
    final int TRANSLATE_ANIM = 2;
    final int ROTATE_ANIM = 3;
    final String[]items = {"Alpha","Rotate","Scale","Translate"};

    private TextView tvDemonstrator;
    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDemonstrator = (TextView) findViewById(R.id.textViewID);

        builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.choose);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int item) {
                Animation anim = null;
                switch (item) {
                    case ALPHA_ANIM:
                        anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha_anim);
                        break;
                    case ROTATE_ANIM:
                        anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate_anim);
                        break;
                    case SCALE_ANIM:
                        anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale_anim);
                        break;
                    case TRANSLATE_ANIM:
                        anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate_anim);
                        break;
                }
                tvDemonstrator.startAnimation(anim);
            }
        });
    }

    public void onClick(View v)
    {
        AlertDialog alert = builder.create();
        alert.show();
    }
}
