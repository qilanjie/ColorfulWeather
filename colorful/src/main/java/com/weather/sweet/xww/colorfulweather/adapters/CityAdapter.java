package com.weather.sweet.xww.colorfulweather.adapters;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.weather.sweet.xww.colorfulweather.R;
import com.weather.sweet.xww.colorfulweather.entity.CityEntity;

import java.util.List;

/**
 * 功能：
 *
 * @author : xww
 * @created at : 2019/4/20
 * @time : 下午10:12
 */
public class CityAdapter extends BaseQuickAdapter<CityEntity,BaseViewHolder> {

    public CityAdapter(int layoutResId, @Nullable List<CityEntity> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, CityEntity item) {
        final AppCompatTextView tvProvinceName = helper.getView(R.id.tv_city_search_name);
        tvProvinceName.setText(item.getCityName());
    }
}
