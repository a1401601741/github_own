package com.example.administrator.github_own.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.TextView;

import com.zzhoujay.markdown.MarkDown;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/7/28 0028.
 */

public class MarkDownView extends TextView {

    public MarkDownView(Context context) {
        super(context,null);
    }

    public MarkDownView(Context context, AttributeSet attrs) {
        super(context, attrs,0);
    }

    public MarkDownView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void setText(String text) {
        byte[] b = Base64.decode(text, Base64.DEFAULT);
        final InputStream inputStream = new ByteArrayInputStream(b);

        this.post(new Runnable() {
            @Override
            public void run() {
                Spanned spanned = MarkDown.fromMarkdown(inputStream, new Html.ImageGetter() {
                    @Override
                    public Drawable getDrawable(String s) {
                        Drawable drawable = new ColorDrawable(Color.LTGRAY);
                        drawable.setBounds(0, 0, MarkDownView.this.getWidth() - MarkDownView.this
                                .getPaddingLeft() - MarkDownView.this.getPaddingRight(), 400);
                        return drawable;
                    }
                }, MarkDownView.this);
                MarkDownView.this.setText(spanned);

            }
        });

    }
}
