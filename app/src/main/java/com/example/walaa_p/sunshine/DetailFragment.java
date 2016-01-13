package com.example.walaa_p.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.ShareActionProvider;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public  class DetailFragment extends Fragment {

        private ShareActionProvider mShareActionProvider;

        private static final String LOG_TAG = DetailFragment.class.getSimpleName();
        private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
        private String mForecastStr;

        public DetailFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            Intent intent = this.getActivity().getIntent();
            String weatherData = intent.getStringExtra(Intent.EXTRA_TEXT);
            mForecastStr = weatherData;

            TextView weatherDataText = (TextView) rootView.findViewById(R.id.weahterDataText);
            weatherDataText.setText( mForecastStr);

            setHasOptionsMenu(true);

            return rootView;
        }


    }