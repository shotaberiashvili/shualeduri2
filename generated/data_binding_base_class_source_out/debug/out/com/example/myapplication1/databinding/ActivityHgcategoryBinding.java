// Generated by view binder compiler. Do not edit!
package com.example.myapplication1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHgcategoryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView choosehgcategory;

  @NonNull
  public final TextView choosehgcategory1;

  @NonNull
  public final Button easyhg;

  @NonNull
  public final Button hardhg;

  @NonNull
  public final Button mediumhg;

  private ActivityHgcategoryBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView choosehgcategory, @NonNull TextView choosehgcategory1,
      @NonNull Button easyhg, @NonNull Button hardhg, @NonNull Button mediumhg) {
    this.rootView = rootView;
    this.choosehgcategory = choosehgcategory;
    this.choosehgcategory1 = choosehgcategory1;
    this.easyhg = easyhg;
    this.hardhg = hardhg;
    this.mediumhg = mediumhg;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHgcategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHgcategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_hgcategory, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHgcategoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.choosehgcategory;
      TextView choosehgcategory = ViewBindings.findChildViewById(rootView, id);
      if (choosehgcategory == null) {
        break missingId;
      }

      id = R.id.choosehgcategory1;
      TextView choosehgcategory1 = ViewBindings.findChildViewById(rootView, id);
      if (choosehgcategory1 == null) {
        break missingId;
      }

      id = R.id.easyhg;
      Button easyhg = ViewBindings.findChildViewById(rootView, id);
      if (easyhg == null) {
        break missingId;
      }

      id = R.id.hardhg;
      Button hardhg = ViewBindings.findChildViewById(rootView, id);
      if (hardhg == null) {
        break missingId;
      }

      id = R.id.mediumhg;
      Button mediumhg = ViewBindings.findChildViewById(rootView, id);
      if (mediumhg == null) {
        break missingId;
      }

      return new ActivityHgcategoryBinding((ConstraintLayout) rootView, choosehgcategory,
          choosehgcategory1, easyhg, hardhg, mediumhg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
