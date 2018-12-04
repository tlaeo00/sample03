package myapp.example.com.sample03;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // down btn
        findViewById(R.id.downBtn).setOnClickListener(view -> {
            findViewById(R.id.upImg).setVisibility(View.INVISIBLE);
            findViewById(R.id.downImg).setVisibility(View.VISIBLE);
            Toast.makeText(getApplicationContext(), "down 눌렸어~~", Toast.LENGTH_LONG).show();
        });

        // up btn
        findViewById(R.id.upBtn).setOnClickListener(view -> {
            findViewById(R.id.upImg).setVisibility(View.VISIBLE);
            findViewById(R.id.downImg).setVisibility(View.INVISIBLE);
            Toast.makeText(getApplicationContext(), "up 눌렸어~~", Toast.LENGTH_LONG).show();
        });

    }

}
