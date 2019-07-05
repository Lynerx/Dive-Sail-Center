package com.example.dive_sail_center;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Courses extends Fragment {


    public Courses() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Courses");

        View v = inflater.inflate(R.layout.fragment_courses, container, false);

        WebView myWebview ;
        myWebview  = (WebView) v.findViewById(R.id.webview_courses);

//        myWebview.getSettings().setJavaScriptEnabled(true);
        myWebview.setWebViewClient(new WebViewClient());
        myWebview.loadUrl("https://www.divessi.com/info/en-IC/scuba-diving/advanced-scuba-training.html?dir=asc&mode=grid&order=name");

        return v;
    }

}
