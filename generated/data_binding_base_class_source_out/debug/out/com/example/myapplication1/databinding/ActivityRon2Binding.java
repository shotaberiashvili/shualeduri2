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

public final class ActivityRon2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView mediumquestion3;

  @NonNull
  public final Button rightmediumron1;

  @NonNull
  public final Button wrongmediumron1;

  @NonNull
  public final Button wrongmediumron2;

  private ActivityRon2Binding(@NonNull ConstraintLayout rootView, @NonNull TextView mediumquestion3,
      @NonNull Button rightmediumron1, @NonNull Button wrongmediumron1,
      @NonNull Button wrongmediumron2) {
    this.rootView = rootView;
    this.mediumquestion3 = mediumquestion3;
    this.rightmediumron1 = rightmediumron1;
    this.wrongmediumron1 = wrongmediumron1;
    this.wrongmediumron2 = wrongmediumron2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRon2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRon2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_ron2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRon2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mediumquestion3;
      TextView mediumquestion3 = ViewBindings.findChildViewById(rootView, id);
      if (mediumquestion3 == null) {
        break missingId;
      }

      id = R.id.rightmediumron1;
      Button rightmediumron1 = ViewBindings.findChildViewById(rootView, id);
      if (rightmediumron1 == null) {
        break missingId;
      }

      id = R.id.wrongmediumron1;
      Button wrongmediumron1 = ViewBindings.findChildViewById(rootView, id);
      if (wrongmediumron1 == null) {
        break missingId;
      }

      id = R.id.wrongmediumron2;
      Button wrongmediumron2 = ViewBindings.findChildViewById(rootView, id);
      if (wrongmediumron2 == null) {
        break missingId;
      }

      return new ActivityRon2Binding((ConstraintLayout) rootView, mediumquestion3, rightmediumron1,
          wrongmediumron1, wrongmediumron2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
