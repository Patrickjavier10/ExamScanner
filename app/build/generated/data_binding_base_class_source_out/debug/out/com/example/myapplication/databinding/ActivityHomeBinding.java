// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView answerKeyImage;

  @NonNull
  public final ImageView answerKeyImages;

  @NonNull
  public final ImageView answerKeyyImage;

  @NonNull
  public final CardView figure1;

  @NonNull
  public final CardView figure2;

  @NonNull
  public final CardView figure3;

  @NonNull
  public final CardView figure4;

  @NonNull
  public final CardView figure5;

  @NonNull
  public final CardView figure6;

  @NonNull
  public final ImageView imageView15;

  @NonNull
  public final ImageView myclassImage;

  @NonNull
  public final ImageView myclassImages;

  @NonNull
  public final ImageView myclasssImage;

  @NonNull
  public final TextView name1;

  @NonNull
  public final TextView name2;

  @NonNull
  public final TextView name3;

  @NonNull
  public final TextView name4;

  @NonNull
  public final TextView name5;

  @NonNull
  public final TextView name6;

  @NonNull
  public final LinearLayout row1;

  @NonNull
  public final LinearLayout row2;

  @NonNull
  public final LinearLayout row3;

  @NonNull
  public final TextView textView6;

  private ActivityHomeBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView answerKeyImage,
      @NonNull ImageView answerKeyImages, @NonNull ImageView answerKeyyImage,
      @NonNull CardView figure1, @NonNull CardView figure2, @NonNull CardView figure3,
      @NonNull CardView figure4, @NonNull CardView figure5, @NonNull CardView figure6,
      @NonNull ImageView imageView15, @NonNull ImageView myclassImage,
      @NonNull ImageView myclassImages, @NonNull ImageView myclasssImage, @NonNull TextView name1,
      @NonNull TextView name2, @NonNull TextView name3, @NonNull TextView name4,
      @NonNull TextView name5, @NonNull TextView name6, @NonNull LinearLayout row1,
      @NonNull LinearLayout row2, @NonNull LinearLayout row3, @NonNull TextView textView6) {
    this.rootView = rootView;
    this.answerKeyImage = answerKeyImage;
    this.answerKeyImages = answerKeyImages;
    this.answerKeyyImage = answerKeyyImage;
    this.figure1 = figure1;
    this.figure2 = figure2;
    this.figure3 = figure3;
    this.figure4 = figure4;
    this.figure5 = figure5;
    this.figure6 = figure6;
    this.imageView15 = imageView15;
    this.myclassImage = myclassImage;
    this.myclassImages = myclassImages;
    this.myclasssImage = myclasssImage;
    this.name1 = name1;
    this.name2 = name2;
    this.name3 = name3;
    this.name4 = name4;
    this.name5 = name5;
    this.name6 = name6;
    this.row1 = row1;
    this.row2 = row2;
    this.row3 = row3;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.answerKeyImage;
      ImageView answerKeyImage = ViewBindings.findChildViewById(rootView, id);
      if (answerKeyImage == null) {
        break missingId;
      }

      id = R.id.answerKeyImages;
      ImageView answerKeyImages = ViewBindings.findChildViewById(rootView, id);
      if (answerKeyImages == null) {
        break missingId;
      }

      id = R.id.answerKeyyImage;
      ImageView answerKeyyImage = ViewBindings.findChildViewById(rootView, id);
      if (answerKeyyImage == null) {
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

      id = R.id.figure4;
      CardView figure4 = ViewBindings.findChildViewById(rootView, id);
      if (figure4 == null) {
        break missingId;
      }

      id = R.id.figure5;
      CardView figure5 = ViewBindings.findChildViewById(rootView, id);
      if (figure5 == null) {
        break missingId;
      }

      id = R.id.figure6;
      CardView figure6 = ViewBindings.findChildViewById(rootView, id);
      if (figure6 == null) {
        break missingId;
      }

      id = R.id.imageView15;
      ImageView imageView15 = ViewBindings.findChildViewById(rootView, id);
      if (imageView15 == null) {
        break missingId;
      }

      id = R.id.myclassImage;
      ImageView myclassImage = ViewBindings.findChildViewById(rootView, id);
      if (myclassImage == null) {
        break missingId;
      }

      id = R.id.myclassImages;
      ImageView myclassImages = ViewBindings.findChildViewById(rootView, id);
      if (myclassImages == null) {
        break missingId;
      }

      id = R.id.myclasssImage;
      ImageView myclasssImage = ViewBindings.findChildViewById(rootView, id);
      if (myclasssImage == null) {
        break missingId;
      }

      id = R.id.name1;
      TextView name1 = ViewBindings.findChildViewById(rootView, id);
      if (name1 == null) {
        break missingId;
      }

      id = R.id.name2;
      TextView name2 = ViewBindings.findChildViewById(rootView, id);
      if (name2 == null) {
        break missingId;
      }

      id = R.id.name3;
      TextView name3 = ViewBindings.findChildViewById(rootView, id);
      if (name3 == null) {
        break missingId;
      }

      id = R.id.name4;
      TextView name4 = ViewBindings.findChildViewById(rootView, id);
      if (name4 == null) {
        break missingId;
      }

      id = R.id.name5;
      TextView name5 = ViewBindings.findChildViewById(rootView, id);
      if (name5 == null) {
        break missingId;
      }

      id = R.id.name6;
      TextView name6 = ViewBindings.findChildViewById(rootView, id);
      if (name6 == null) {
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

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      return new ActivityHomeBinding((ConstraintLayout) rootView, answerKeyImage, answerKeyImages,
          answerKeyyImage, figure1, figure2, figure3, figure4, figure5, figure6, imageView15,
          myclassImage, myclassImages, myclasssImage, name1, name2, name3, name4, name5, name6,
          row1, row2, row3, textView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}