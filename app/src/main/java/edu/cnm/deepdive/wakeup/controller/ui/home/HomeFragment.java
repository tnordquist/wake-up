package edu.cnm.deepdive.wakeup.controller.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import edu.cnm.deepdive.wakeup.R;
import org.jetbrains.annotations.NotNull;

/**
 * The fragment class of the home page.
 */
public class HomeFragment extends Fragment {

  private HomeViewModel homeViewModel;

  /**
   * Constructor that creates the binding and view model.
   * @param inflater Layout inflater
   * @param container View group container
   * @param savedInstanceState The Bundle instance
   * @return The inflated binding root.
   */
  public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
    View root = inflater.inflate(R.layout.fragment_home, container, false);
    final TextView textView = root.findViewById(R.id.text_home);
    homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
      @Override
      public void onChanged(String s) {
        textView.setText(s);
      }
    });
    return root;
  }
}
