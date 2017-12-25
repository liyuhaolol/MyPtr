package cn.lyh.spa.myptr;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        String m = "2巴西有很多足球运动员，巴西在南美，巴西有很多好吃的";
        SpannableStringBuilder builder = new SpannableStringBuilder(m);
        //ForegroundColorSpan redSpan = new ForegroundColorSpan(Color.RED);
        Pattern p = Pattern.compile("巴西");
        Matcher c = p.matcher(m);
        //builder.setSpan(redSpan, 1, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        int count = 0;
        while (c.find()){
            ForegroundColorSpan redSpan = new ForegroundColorSpan(Color.RED);
            builder.setSpan(redSpan, c.start(), c.start()+2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            /*String a = c.group();
            count++;
            Log.e("123",count+a);*/
        }
        text.setText(builder);
    }
}
