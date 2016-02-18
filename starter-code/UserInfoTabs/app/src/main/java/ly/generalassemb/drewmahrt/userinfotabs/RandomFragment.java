package ly.generalassemb.drewmahrt.userinfotabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RandomFragment extends Fragment {


    public RandomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_random, container, false);
        WebView webView = (WebView) view.findViewById(R.id.web_view);
        String url = "http://developer.android.com/reference/android/app/Fragment.html";
        webView.loadUrl(url);
        return view;

    }

}
