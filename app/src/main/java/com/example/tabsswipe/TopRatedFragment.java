package com.example.tabsswipe;

        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

        import com.example.tabsswipe.R;
        import com.google.android.gms.maps.GoogleMap;

public class TopRatedFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_top_rated, container, false);
       // GoogleMap map = ((MapFragment) getFragmentManager()
         //       .findFragmentById(R.id.map)).getMap();
        return rootView;
    }
}