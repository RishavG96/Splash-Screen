package rcpl.com.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button b;
    TextView tv;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final String arr[][]=new String[10][2];
        b=(Button)findViewById(R.id.button);
        //final String SECOND_ACTIVITY="secondactivity";
        tv=(TextView)findViewById(R.id.textView3);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et1.setText("");
        et2.setText("");
        arr[0][0]="Rishav";
        arr[0][1]="Gupta";
        arr[1][0]="Vaibhav";
        arr[1][1]="Bhat";
        arr[2][0]="Shyamal";
        arr[2][1]="Chaudhary";
        arr[3][0]="Prakhar";
        arr[3][1]="Bindal";
        arr[4][0]="Harsh";
        arr[4][1]="Tandon";
        arr[5][0]="Suvigya";
        arr[5][1]="Agarwal";
        arr[6][0]="Dhruv";
        arr[6][1]="Agarwal";
        arr[7][0]="Div";
        arr[7][1]="Singh";
        arr[8][0]="Nic";
        arr[8][1]="Deshmukh";
        arr[9][0]="Akshay";
        arr[9][1]="Jain";
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("")&&et2.getText().toString().equals(""))
                    tv.setText("Enter Username and password");
                else if(et1.getText().toString().equals(""))
                    tv.setText("Enter Username");
                else if(et2.getText().toString().equals(""))
                    tv.setText("Enter Password");
                else {
                    int i,a=0;
                    for (i = 0; i < 10; i++) {
                        if (et1.getText().toString().equals(arr[i][0]) && et2.getText().toString().equals(arr[i][1])) {
                            Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                            intent.putExtra("k1", arr[i][0]);
                            startActivity(intent);
                            a=1;
                        }
                        else if (a == 0) {
                            if (et2.getText().toString().equals(arr[i][1])) {
                                tv.setText("Enter  valid Username");
                            }
                            else if (et1.getText().toString().equals(arr[i][0])) {
                                tv.setText("Enter valid Password");
                            }
                            else
                            {
                                tv.setText("Enter correct username and password");
                            }
                        }
                    }
                }
            }
        });
    }
}
