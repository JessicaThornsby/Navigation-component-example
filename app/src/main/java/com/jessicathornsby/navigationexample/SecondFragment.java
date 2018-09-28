package com.jessicathornsby.navigationexample;

import android.os.Bundle;
import android.widget.Button;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.net.Uri;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class SecondFragment extends Fragment {

    public SecondFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Button button = (Button) view.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController navController = Navigation.findNavController(getActivity(), R.id.my_nav_host_fragment);
                new NavOptions.Builder().setExitAnim(R.anim.fade_out);
                navController.navigate(R.id.action_secondFragment_to_thirdFragment);


            }
        });

    }

    public interface OnFragmentInteractionListener {
     //To do//
        void onFragmentInteraction(Uri uri);
    }
}
