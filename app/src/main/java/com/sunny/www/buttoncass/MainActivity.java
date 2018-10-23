package com.sunny.www.buttoncass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClickWidget(View view){
        int id = view.getId();
        String text = null;

        switch (id){
            case R.id.btn1:
                text = ((Button)view).getText().toString(); break;

            case R.id.btn2:
                text = ((Button)view).getText().toString();break;
                default: text="Noting!";

        }
        Toast.makeText(view.getContext(),text,Toast.LENGTH_SHORT).show();;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
