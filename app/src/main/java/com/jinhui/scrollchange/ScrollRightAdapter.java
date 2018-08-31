package com.jinhui.scrollchange;

import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by jh on 2018/8/31.
 * Email: 1004260403@qq.com
 */
public class ScrollRightAdapter extends BaseSectionQuickAdapter<ScrollBean, BaseViewHolder> {

    public ScrollRightAdapter(int layoutResId, int sectionHeadResId, List<ScrollBean> data) {
        super(layoutResId, sectionHeadResId, data);
    }

    @Override
    protected void convertHead(BaseViewHolder helper, ScrollBean item) {
        helper.setText(R.id.right_title, item.header);
    }

    @Override
    protected void convert(BaseViewHolder helper, ScrollBean item) {
        ScrollBean.ScrollItemBean t = item.t;
        helper.setText(R.id.right_text, t.getText());
    }
}

