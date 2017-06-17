package y.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.graphics.drawable.Drawable;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtZQD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main1);*/
        /*setContentView(R.layout.activity_main);*/
        /*setContentView(R.layout.textview01);*/
        setContentView(R.layout.textview02);
/*
        txtZQD = (TextView) findViewById(R.id.text01);
        Drawable[] drawable = txtZQD.getCompoundDrawables();
        // 数组下表0~3,依次是:左上右下
        drawable[1].setBounds(0,0,100,100);
        txtZQD.setCompoundDrawables(drawable[0], drawable[1], drawable[2],
                drawable[3]);

*/

    }
}
