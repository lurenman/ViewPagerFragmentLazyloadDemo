package com.example.administrator.viewpagerfragmentlazyloaddemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/8/17.
 */

public class Fragment2 extends LazyLoadFragment
{
    private static final String TAG = "Fragment2";
    @Override
    protected int setContentView() {
        return R.layout.fragment_2;
    }

    @Override
    protected void initVariabls() {

    }

    @Override
    protected void initViews() {
        if (null != view) {
            Logger.e(TAG,"fragment2初始化了----------------------------");
        }
    }

    @Override
    protected void lazyLoad() {
        Toast.makeText(getContext(),"fragment2可以加载网络数据",Toast.LENGTH_SHORT).show();
        Logger.e(TAG,"fragment2可以加载网络数据----------------------------");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Logger.e(TAG,"fragment2 onDestroyView了----------------------------");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Logger.e(TAG,"fragment2 onDestroy了----------------------------");
    }
}
