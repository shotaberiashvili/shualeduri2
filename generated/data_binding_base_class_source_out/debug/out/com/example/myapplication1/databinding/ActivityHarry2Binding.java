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

public final class ActivityHarry2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView mediumquestion1;

  @NonNull
  public final Button rightmediumharry1;

  @NonNull
  public final Button wrongmediumharry1;

  @NonNull
  public final Button wrongmediumharry2;

  @NonNull
  public final Button wrongmediumharry3;

  private ActivityHarry2Binding(@NonNull ConstraintLayout rootView,
      @NonNull TextView mediumquestion1, @NonNull Button rightmediumharry1,
      @NonNull Button wrongmediumharry1, @NonNull Button wrongmediumharry2,
      @NonNull Button wrongmediumharry3) {
    this.rootView = rootView;
    this.mediumquestion1 = mediumquestion1;
    this.rightmediumharry1 = rightmediumharry1;
    this.wrongmediumharry1 = wrongmediumharry1;
    this.wrongmediumharry2 = wrongmediumharry2;
    this.wrongmediumharry3 = wrongmediumharry3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHarry2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHarry2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_harry2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHarry2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mediumquestion1;
      TextView mediumquestion1 = ViewBindings.findChildViewById(rootView, id);
      if (mediumquestion1 == null) {
        break missingId;
      }

      id = R.id.rightmediumharry1;
      Button rightmediumharry1 = ViewBindings.findChildViewById(rootView, id);
      if (rightmediumharry1 == null) {
        break missingId;
      }

      id = R.id.wrongmediumharry1;
      Button wrongmediumharry1 = ViewBindings.findChildViewById(rootView, id);
      if (wrongmediumharry1 == null) {
        break missingId;
      }

      id = R.id.wrongmediumharry2;
      Button wrongmediumharry2 = ViewBindings.findChildViewById(rootView, id);
      if (wrongmediumharry2 == null) {
        break missingId;
      }

      id = R.id.wrongmediumharry3;
      Button wrongmediumharry3 = ViewBindings.findChildViewById(rootView, id);
      if (wrongmediumharry3 == null) {
        break missingId;
      }

      return new ActivityHarry2Binding((ConstraintLayout) rootView, mediumquestion1,
          rightmediumharry1, wrongmediumharry1, wrongmediumharry2, wrongmediumharry3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
