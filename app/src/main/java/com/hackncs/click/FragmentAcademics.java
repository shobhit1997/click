package com.hackncs.click;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Yasha on 06-10-2016.
 */

public class FragmentAcademics extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_academics, container, false);
    }

    public interface OnFragmentInteractionListener {

        public void onFragmentInteraction(Uri uri);

    }
}
