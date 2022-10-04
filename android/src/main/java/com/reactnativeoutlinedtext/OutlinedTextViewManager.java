package com.reactnativeoutlinedtext;

import android.graphics.Color;
import androidx.annotation.NonNull;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactTextView;
import com.facebook.react.views.text.ReactTextViewManager;

public class OutlinedTextViewManager extends ReactTextViewManager {
    public static final String REACT_CLASS = "OutlinedTextView";

    @Override
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    @NonNull
    public ReactTextView createViewInstance(ThemedReactContext reactContext) {
        return new OutlinedTextView(reactContext);
    }

    @ReactProp(name = "outlineColor")
    public void setOutlineColor(OutlinedTextView outlinedText, String color) {
        outlinedText.setOutlineColor(Color.parseColor(color));
    }

    @ReactProp(name = "outlineWidth", defaultFloat = 2f)
    public void setOutlineWidth(OutlinedTextView outlinedText, float width) {
      outlinedText.setOutlineWidth(width);
    }
}
