package rcpl.com.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent i=getIntent();
        String s=i.getStringExtra("k1");
        tv=(TextView)findViewById(R.id.textView);
        tv.setText("Welcome "+s+"!");
    }
}
