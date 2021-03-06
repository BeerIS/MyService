package app.security.egat.myservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import app.security.egat.myservice.R;

/**
 * Created by Phakpoom.I on 16/9/2560.
 */

public class MainFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false); //Create a new view from xml
        return view;
    }//Create Fragment View

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Button controller
        buttonController();

    }

    private void buttonController() {
        Button button = (Button)getView().findViewById(R.id.btnGoToSecond);
        button.setOnClickListener(new View.OnClickListener() {
            //เมื่อคลิกจะสร้าง obj onclickListener และ Override Event Click
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentFragmentMain,new SecondFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
