package kisielarobert.com.colorpalette;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ColorActivity extends AppCompatActivity {

    public static final String COLOR_NAME_TAG = ColorActivity.class.getSimpleName();

    @BindView(R.id.redSeekBar)
    SeekBar redSeekBar;
    @BindView(R.id.greenSeekBar)
    SeekBar greenSeekBar;
    @BindView(R.id.blueSeekBar)
    SeekBar blueSeekBar;
    @BindView(R.id.generateButton)
    Button generateButton;
    @BindView(R.id.saveButton)
    Button saveButton;
    @BindView(R.id.colorLinearLayout)
    LinearLayout colorLinearLayout;

    private ActionBar actionBar;

    private int red;
    private int green;
    private int blue;

    Random random = new Random();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(COLOR_NAME_TAG, "onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(COLOR_NAME_TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(COLOR_NAME_TAG, "onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(COLOR_NAME_TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(COLOR_NAME_TAG, "onPause");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        ButterKnife.bind(this);
        actionBar = getSupportActionBar();
        actionBar.setDefaultDisplayHomeAsUpEnabled(true);

        Log.d(COLOR_NAME_TAG, "onCreate");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.generateButton)
    public void generate() {

        Log.d(COLOR_NAME_TAG, "generateButton clicked");
        /*red = random.nextInt(256);
        green = random.nextInt(256);
        blue = random.nextInt(256);

        int color = Color.rgb(red, green, blue);
        colorLinearLayout.setBackgroundColor(color);
        */
    }

    @OnClick(R.id.saveButton)
    public void save() {
        Log.d(COLOR_NAME_TAG, "saveButton clicked");
    }



}
