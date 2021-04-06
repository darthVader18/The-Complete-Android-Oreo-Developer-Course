package csb.myappcompany.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void switchAv(View view) {
        Log.i("Info", "Button Pressed");

        ImageView image = (ImageView) findViewById(R.id.dvimageView);
        image.setImageResource(R.drawable.sauske);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}