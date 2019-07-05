package com.example.dive_sail_center;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class AboutUs extends Fragment {


    public AboutUs() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("About Us");

        View v = inflater.inflate(R.layout.fragment_about_us, container, false);


        WebView myWebview ;
        myWebview  = (WebView) v.findViewById(R.id.webview_about);

//        myWebview.getSettings().setJavaScriptEnabled(true);
        myWebview.setWebViewClient(new WebViewClient());
        myWebview.loadUrl("https://www.sjzdiveandsail.com/en/about-us-sjz-dive-sail-center/");

        return v;

    }

}
