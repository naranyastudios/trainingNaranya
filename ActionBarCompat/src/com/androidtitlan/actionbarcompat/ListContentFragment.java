package com.androidtitlan.actionbarcompat;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListContentFragment extends ListFragment{
	private String mText;

    @Override
    public void onAttach(Activity activity) {
      // This is the first callback received; here we can set the text for
      // the fragment as defined by the tag specified during the fragment transaction
      super.onAttach(activity);
      mText = getTag();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // This is called to define the layout for the fragment;
        // we just create a TextView and set its text to be the fragment tag
        TextView text = new TextView(getActivity());
        text.setText(mText);
        return text;
    }
}
