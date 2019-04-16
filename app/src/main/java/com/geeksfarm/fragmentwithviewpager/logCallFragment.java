package com.geeksfarm.fragmentwithviewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class logCallFragment extends Fragment {
    WebView webView;


    public logCallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewFragment=inflater.inflate(R.layout.fragment_log_call, container, false);
        webView=(WebView)viewFragment.findViewById(R.id.crash_webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://github.com/boyborg"); //tidak boleh https tapi http
        return viewFragment;
    }

}
