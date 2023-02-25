// Generated by view binder compiler. Do not edit!
package com.example.womensafetyapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.womensafetyapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button5;

  @NonNull
  public final EditText editTextTextEmailAddress;

  @NonNull
  public final EditText editTextTextPassword;

  @NonNull
  public final ImageButton imageButton2;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final TextView signUpRedirectText;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button button5,
      @NonNull EditText editTextTextEmailAddress, @NonNull EditText editTextTextPassword,
      @NonNull ImageButton imageButton2, @NonNull ImageView imageView4,
      @NonNull TextView signUpRedirectText) {
    this.rootView = rootView;
    this.button5 = button5;
    this.editTextTextEmailAddress = editTextTextEmailAddress;
    this.editTextTextPassword = editTextTextPassword;
    this.imageButton2 = imageButton2;
    this.imageView4 = imageView4;
    this.signUpRedirectText = signUpRedirectText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.editTextTextEmailAddress;
      EditText editTextTextEmailAddress = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextEmailAddress == null) {
        break missingId;
      }

      id = R.id.editTextTextPassword;
      EditText editTextTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPassword == null) {
        break missingId;
      }

      id = R.id.imageButton2;
      ImageButton imageButton2 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton2 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.signUpRedirectText;
      TextView signUpRedirectText = ViewBindings.findChildViewById(rootView, id);
      if (signUpRedirectText == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, button5,
          editTextTextEmailAddress, editTextTextPassword, imageButton2, imageView4,
          signUpRedirectText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}