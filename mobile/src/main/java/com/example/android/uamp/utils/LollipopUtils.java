package com.example.android.uamp.utils;

import android.content.res.ColorStateList;
import android.os.Build;
import android.widget.ImageView;

/**
 * Created by chrisa on 15/04/2015.
 */
public final class LollipopUtils {

    private LollipopUtils() { }

    public static void setImageTintList(ImageView imageView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            imageView.setImageTintList(colorStateList);
        }
    }
}
