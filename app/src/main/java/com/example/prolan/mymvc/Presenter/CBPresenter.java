package com.example.prolan.mymvc.Presenter;

import com.example.prolan.mymvc.MainActivity;
import com.example.prolan.mymvc.Model.CounterBalance;

/**
 * Created by Prolan on 21/01/2016.
 */
public class CBPresenter {
    private CounterBalance iCB = new CounterBalance();
    private MainActivity iMA;

    public void onIncrement(){
        int tmp = iCB.increment();
        iMA.showNewCount(tmp);
    }

    public void connectMe(MainActivity act){
        iMA = act;
    }

}
