package edu.cnm.deepdive.wakeup.controller.ui.activities;

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
import androidx.lifecycle.ViewModelProviders;
import edu.cnm.deepdive.wakeup.R;
import edu.cnm.deepdive.wakeup.databinding.FragmentActivitiesBinding;

/**
 * The Activities fragment class.
 */
public class ActivitiesFragment extends Fragment {

  private ActivitiesViewModel activitiesViewModel;
  private FragmentActivitiesBinding binding;

  /**
   * Constructor that creates the binding and view model.
   * @param inflater Layout inflater
   * @param container View group container
   * @param savedInstanceState The Bundle instance
   * @return The inflated binding root.
   */
  public View onCreateView(@NonNull LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
    binding = FragmentActivitiesBinding.inflate(inflater);
    activitiesViewModel = new ViewModelProvider(this).get(ActivitiesViewModel.class);
    return binding.getRoot();
  }
}