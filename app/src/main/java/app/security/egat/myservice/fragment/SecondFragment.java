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

public class SecondFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        buttonController();
    }

    private void buttonController() {
        Button button = (Button)getView().findViewById(R.id.btnGoToMain);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager()
                        .popBackStack();
            }
        });
    }
}   //Main class
