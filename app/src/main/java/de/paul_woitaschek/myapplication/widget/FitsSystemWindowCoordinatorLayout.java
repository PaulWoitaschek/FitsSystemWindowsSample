package de.paul_woitaschek.myapplication.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.WindowInsets;

/**
 * A CoordinatorLayout that will abide by the fitsSystemWindows flag without
 * consuming the event since Android has been designed to only allow
 * one view with fitsSystemWindows=true at a time.
 */
public class FitsSystemWindowCoordinatorLayout extends CoordinatorLayout {
    public FitsSystemWindowCoordinatorLayout(Context context) {
        super(context);
    }

    public FitsSystemWindowCoordinatorLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FitsSystemWindowCoordinatorLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected boolean fitSystemWindows(Rect insets) {
        super.fitSystemWindows(insets);
        return false;
    }

    @Override
    @TargetApi(Build.VERSION_CODES.KITKAT_WATCH)
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        WindowInsets tempInsets = new WindowInsets(insets);
        super.onApplyWindowInsets(tempInsets);
        return insets;
    }
}
