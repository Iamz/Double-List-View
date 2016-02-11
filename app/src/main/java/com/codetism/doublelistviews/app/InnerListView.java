package com.codetism.doublelistviews.app;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by Iamz on 2/11/2016 AD.
 * Copyright @ 2016 by Codetism Co., Ltd.
 */
public class InnerListView extends ListView {

    public InnerListView(Context context) {
        super(context);
    }

    public InnerListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public InnerListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public InnerListView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        final int measuredWidth = getMeasuredWidth();
        final int measuredHeight = getMeasuredHeight();
        setMeasuredDimension(measuredWidth, (measuredHeight + getDividerHeight())* getCount());
    }
}
