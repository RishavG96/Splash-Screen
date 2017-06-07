package rcpl.com.splashscreen;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tv,tv1;
    RelativeLayout rl1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView6);
        rl1=(RelativeLayout)findViewById(R.id.rl);
        tv1=(TextView)findViewById(R.id.textView7);
        tv.setText("\n\nRishav Gupta Inc.\nCEO of Kaun Banega Crorepati\nPh-8961682172\nwww.kaunbanegacrorepati.com");
        new CountDownTimer(4000,1000)
        {
            @Override
            public void onTick(long millisUntilFinished) {
                tv1.setText(String.valueOf(millisUntilFinished/1000L));

            }

            @Override
            public void onFinish() {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }
}
