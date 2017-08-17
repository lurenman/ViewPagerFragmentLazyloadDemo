package com.example.administrator.viewpagerfragmentlazyloaddemo;

import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/8/17.
 */

public class Fragment1 extends LazyLoadFragment {
    private TextView tv_title;
    private static final String TAG = "Fragment1";

    @Override
    protected int setContentView() {
        return R.layout.fragment_1;

    }

    @Override
    protected void initVariabls() {
        //加载初始化变量

    }

    @Override
    protected void initViews() {
        if (null != view) {
            tv_title = (TextView) view.findViewById(R.id.tv_title);
            //tv_title.setText("haha");
            Logger.e(TAG,"fragment1初始化了----------------------------");
        }

    }

    @Override
    protected void initEvents() {
        super.initEvents();
        //子布局监听事件
    }

    @Override
    protected void lazyLoad() {
        //加载网络数据  这块根据网络请求的实体来判断是否加载数据
        Toast.makeText(getContext(),"fragment1可以加载网络数据",Toast.LENGTH_SHORT).show();
        Logger.e(TAG,"fragment1可以加载网络数据----------------------------");

    }

    @Override
    protected void stopLoad() {
        super.stopLoad();
        //可以停止加载数据
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Logger.e(TAG,"fragment1 onDestroyView了----------------------------");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Logger.e(TAG,"fragment1 onDestroy销毁了----------------------------");
    }
}
