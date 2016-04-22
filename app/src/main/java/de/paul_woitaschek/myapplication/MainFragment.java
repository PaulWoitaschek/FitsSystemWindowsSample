package de.paul_woitaschek.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ph1b on 22/04/16.
 */
public class MainFragment extends Fragment {

   @Nullable @Override public View onCreateView(LayoutInflater inflater,
                                                @Nullable ViewGroup container,
                                                @Nullable Bundle savedInstanceState) {
      return inflater.inflate(R.layout.fragment_main, container, false);
   }

   @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
      super.onViewCreated(view, savedInstanceState);

      Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
      AppCompatActivity host = (AppCompatActivity) getActivity();
      host.setSupportActionBar(toolbar);

      view.findViewById(R.id.fab)
            .setOnClickListener(new View.OnClickListener() {
               @Override public void onClick(View v) {
                  getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentContainer, new DetailFragment(), "fullfragment")
                        .addToBackStack(null)
                        .commit();
               }
            });
   }
}
