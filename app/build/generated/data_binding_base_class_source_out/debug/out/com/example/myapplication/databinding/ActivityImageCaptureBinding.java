// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityImageCaptureBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageCapture;

  @NonNull
  public final Button scanButton;

  private ActivityImageCaptureBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageCapture, @NonNull Button scanButton) {
    this.rootView = rootView;
    this.imageCapture = imageCapture;
    this.scanButton = scanButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityImageCaptureBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityImageCaptureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_image_capture, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityImageCaptureBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageCapture;
      ImageView imageCapture = ViewBindings.findChildViewById(rootView, id);
      if (imageCapture == null) {
        break missingId;
      }

      id = R.id.scanButton;
      Button scanButton = ViewBindings.findChildViewById(rootView, id);
      if (scanButton == null) {
        break missingId;
      }

      return new ActivityImageCaptureBinding((ConstraintLayout) rootView, imageCapture, scanButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
