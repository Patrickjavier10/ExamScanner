// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final CardView figure1;

  @NonNull
  public final CardView figure2;

  @NonNull
  public final CardView figure3;

  @NonNull
  public final LinearLayout row1;

  @NonNull
  public final LinearLayout row2;

  @NonNull
  public final LinearLayout row3;

  @NonNull
  public final TextView textView3;

  private ActivitySettingsBinding(@NonNull ConstraintLayout rootView,
      @NonNull BottomNavigationView bottomNavigationView, @NonNull CardView figure1,
      @NonNull CardView figure2, @NonNull CardView figure3, @NonNull LinearLayout row1,
      @NonNull LinearLayout row2, @NonNull LinearLayout row3, @NonNull TextView textView3) {
    this.rootView = rootView;
    this.bottomNavigationView = bottomNavigationView;
    this.figure1 = figure1;
    this.figure2 = figure2;
    this.figure3 = figure3;
    this.row1 = row1;
    this.row2 = row2;
    this.row3 = row3;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomNavigationView;
      BottomNavigationView bottomNavigationView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationView == null) {
        break missingId;
      }

      id = R.id.figure1;
      CardView figure1 = ViewBindings.findChildViewById(rootView, id);
      if (figure1 == null) {
        break missingId;
      }

      id = R.id.figure2;
      CardView figure2 = ViewBindings.findChildViewById(rootView, id);
      if (figure2 == null) {
        break missingId;
      }

      id = R.id.figure3;
      CardView figure3 = ViewBindings.findChildViewById(rootView, id);
      if (figure3 == null) {
        break missingId;
      }

      id = R.id.row1;
      LinearLayout row1 = ViewBindings.findChildViewById(rootView, id);
      if (row1 == null) {
        break missingId;
      }

      id = R.id.row2;
      LinearLayout row2 = ViewBindings.findChildViewById(rootView, id);
      if (row2 == null) {
        break missingId;
      }

      id = R.id.row3;
      LinearLayout row3 = ViewBindings.findChildViewById(rootView, id);
      if (row3 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new ActivitySettingsBinding((ConstraintLayout) rootView, bottomNavigationView, figure1,
          figure2, figure3, row1, row2, row3, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
