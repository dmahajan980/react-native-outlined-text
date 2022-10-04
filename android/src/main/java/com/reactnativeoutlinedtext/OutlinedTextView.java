package com.reactnativeoutlinedtext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.facebook.react.views.text.ReactTextView;

public class OutlinedTextView extends ReactTextView {
  private boolean isDrawing = false;

  private int outlineColor = Color.BLACK;
  private float outlineWidth = 0;

  public OutlinedTextView(Context context) {
    super(context);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    if (this.outlineWidth > 0) {
      this.isDrawing = true;

      // Outline (Bigger text behind)
      setTextColor(this.outlineColor);
      getPaint().setStrokeWidth(this.outlineWidth);
      getPaint().setStyle(Paint.Style.STROKE);
      super.onDraw(canvas);

      // Text (Smaller text on front)
      int textColor = getTextColors().getDefaultColor();
      setTextColor(textColor);
      getPaint().setStrokeWidth(0);
      getPaint().setStyle(Paint.Style.FILL);

      this.isDrawing = false;
    }

    super.onDraw(canvas);
  }

  @Override
  public void invalidate() {
    if (this.isDrawing) {
      return;
    }

    super.invalidate();
  }

  public void setOutlineColor(int outlineColor) {
    this.outlineColor = outlineColor;
    this.invalidate();
  }

  public void setOutlineWidth(float outlineWidth) {
    this.outlineWidth = outlineWidth;
    this.invalidate();
  }
}
