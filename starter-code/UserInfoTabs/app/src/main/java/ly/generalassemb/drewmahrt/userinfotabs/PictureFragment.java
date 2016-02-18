package ly.generalassemb.drewmahrt.userinfotabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by JHADI on 2/18/16.
 */
public class PictureFragment extends Fragment {

    public PictureFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.picture_fragment, container, false);
        ImageView myPhoto = (ImageView) v.findViewById(R.id.image_photo);
        myPhoto.setImageResource(R.drawable.profile);
        return v;
    }
}
