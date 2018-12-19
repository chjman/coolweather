package com.example.administrator.coolweather;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2018/12/19.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {
    public static final String CREATE_PROVINCE = "create table province ("
            + "id integer primary key autoincrement"
            + "province text)";

    public static final String CREATE_CITY = "create table city ("
            + "id integer primary key autoincrement"
            + "city text)";

    public static final String CREATE_COUNTY = "create table county ("
            + "id integer primary key autoincrement"
            + "county text)";

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,int version) {
        super(context,name,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
