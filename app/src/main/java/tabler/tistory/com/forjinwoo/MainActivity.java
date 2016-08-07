package tabler.tistory.com.forjinwoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgView;
    Button btnKenny;
    Button btnSunny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = (ImageView) findViewById(R.id.imageView);

        btnKenny = (Button) findViewById(R.id.button);

        btnSunny = (Button) findViewById(R.id.button2);

    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                Log.d("################ Mark","kenny");
                imgView.setImageResource(R.drawable.kenny);
                break;
            case R.id.button2:
                Log.d("################ Mark","sunny");
                imgView.setImageResource(R.drawable.sunny);
                break;
        }
    }

}
