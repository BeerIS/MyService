package app.security.egat.myservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.security.egat.myservice.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add a fragment
        if(savedInstanceState==null)  //ถ้าเป็นการเปิดครั้งแรก
        {
           getSupportFragmentManager().beginTransaction()
                   .add(R.id.contentFragmentMain, new MainFragment())   //add
                   .commit();
        }
    }   //Main Method

}   //Main Class

