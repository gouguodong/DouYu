package com.team.zhuoke.presenter.common.interfaces;


import android.content.Context;

import com.team.zhuoke.base.BaseModel;
import com.team.zhuoke.base.BasePresenter;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.common.bean.TempLiveVideoInfo;

import okhttp3.Request;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/11/14 下午3:29
 **/
public interface CommonPcLiveVideoContract {

      interface View extends BaseView {
           void getViewPcLiveVideoInfo(TempLiveVideoInfo mLiveVideoInfo);
      }
    interface  Model extends BaseModel{
        Request getModelPcLiveVideoInfo(Context context, String room_id);
    }
    abstract class Presenter extends BasePresenter<View,Model> {
              public abstract  void getPresenterPcLiveVideoInfo(String room_id);
      }

}
