package com.uottawa.rithik.wakemeup_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.sql.Time;


public class Alarm extends AppCompatActivity{
    Time time;

    public Alarm(){
        time = new Time(0,0,0);

    }

    public Alarm(int th, int tm, int ts){
        time = new Time(tm,tm,ts);
    }




}
