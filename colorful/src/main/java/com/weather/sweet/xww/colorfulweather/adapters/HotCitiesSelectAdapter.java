package com.weather.sweet.xww.colorfulweather.adapters;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.weather.sweet.xww.colorfulweather.R;
import com.weather.sweet.xww.colorfulweather.entity.HotCitiesEntity;

import java.util.List;

/**
 * 功能：
 *
 * @author : xww
 * @created at : 2019/4/12
 * @time : 22:19
 */
public class HotCitiesSelectAdapter extends BaseQuickAdapter<HotCitiesEntity, BaseViewHolder> {

    public HotCitiesSelectAdapter(int layoutResId, @Nullable List<HotCitiesEntity> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HotCitiesEntity item) {
        final AppCompatTextView cityName = helper.getView(R.id.tv_city_select_name);

        cityName.setText(item.getHotCityName());
    }
}
