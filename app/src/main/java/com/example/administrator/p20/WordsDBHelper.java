package com.example.administrator.p20;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2016/9/8.
 */
public class WordsDBHelper extends SQLiteOpenHelper {
    private final static String DATABASE_NAME="wordsdb";
    private final static int DATABASE_VERSION=1;
    private final static String SQL_CREATE_DATABASE="CREATETABLE"+Words.Word.TABLE_NAME+"("+
            Words.Word._ID+"PRIMARY KEY AUTOINCREMENT,"+
            Words.Word.COLUMN_NAME_WORD+"TEXT"+","+
            Words.Word.COLUMN_NAME_MEANING+"TEXT"+","+
            Words.Word.COLUMN_NAME_SAMPLE+"TEXT"+")";
    private final static String SQL_DELETE_DATABASE="DROP TABLE IF EXISTS"+Words.Word.TABLE_NAME;

    public WordsDBHelper(Context context){
super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase sqLiteDatabase){
sqLiteDatabase.execSQL(SQL_CREATE_DATABASE);
    }
    public void onUpgrade(SQLiteDatabase sqLiteDatabase,int oldVersion,int newVersion){
sqLiteDatabase.execSQL(SQL_DELETE_DATABASE);
        onCreate(sqLiteDatabase);
    }


}
