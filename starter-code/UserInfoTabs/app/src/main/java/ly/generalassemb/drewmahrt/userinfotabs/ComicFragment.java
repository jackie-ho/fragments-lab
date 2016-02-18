package ly.generalassemb.drewmahrt.userinfotabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class ComicFragment extends Fragment {


    public ComicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_comic, container, false);
        ImageView comicImage = (ImageView) view.findViewById(R.id.comic);
        String url = "http://hijinksensue.com/wp-content/uploads/2013/08/2007-12-06-google-android-terminator.jpg";
        Picasso.with(getActivity()).load(url).fit().into(comicImage);
        return view;

    }

}
