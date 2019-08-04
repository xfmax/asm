package com.example.asmdemo;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.request.target.ImageViewTarget;

/**
 * File description.
 *
 * @author sufeng
 * @date 2019-08-04
 */
public class DrawableImageViewTarget extends ImageViewTarget<Drawable> {

    public DrawableImageViewTarget(ImageView view) {
        super(view);
    }

    /**
     * @deprecated Use {@link #waitForLayout()} instead.
     */
    // Public API.
    @SuppressWarnings({"unused", "deprecation"})
    @Deprecated
    public DrawableImageViewTarget(ImageView view, boolean waitForLayout) {
        super(view, waitForLayout);
    }

    @Override
    protected void setResource(@Nullable Drawable resource) {
        if (resource != null) {
            if (resource instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable)resource).getBitmap();
                if (bitmap != null) {
                    Log.d("asm------------", "setResource width: " +((BitmapDrawable)resource).getBitmap().getWidth());
                    Log.d("asm------------", "setResource height: " + ((BitmapDrawable) resource).getBitmap().getHeight());
                    Log.d("asm------------", "view width: " + view.getWidth());
                    Log.d("asm------------", "view height: " + view.getHeight());
                } else {
                    Log.d("asm------------", "setResource bitmap null");
                }
            }
        }
        view.setImageDrawable(resource);
    }
}
