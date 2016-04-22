package de.paul_woitaschek.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by ph1b on 22/04/16.
 */
public class DetailFragment extends Fragment {

   @Nullable @Override public View onCreateView(LayoutInflater inflater,
                                                @Nullable ViewGroup container,
                                                @Nullable Bundle savedInstanceState) {
      return inflater.inflate(R.layout.fragment_detail, container, false);
   }

   @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
      super.onViewCreated(view, savedInstanceState);

      AppCompatActivity host = (AppCompatActivity) getActivity();
      Toolbar toolbar = (Toolbar) view.findViewById(R.id.tool);
      host.setSupportActionBar(toolbar);

      ImageView imageView = (ImageView) view.findViewById(R.id.image);
      Glide.with(this)
            .load("https://image.freepik.com/free-vector/lightbulb-idea-with-doodle-business-icons_23-2147504763.jpg")
            .into(imageView);
   }
}
