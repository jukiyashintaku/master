package com.mikan.project.kakusample;

import java.io.Serializable;

/**
 * データを格納する為のモデル
 */
public class DataModel implements Serializable {
    // 日付
    long mDate;

    // 値
    int mValue;

    // テキスト
    String mText;

    // コンストラクタ
    DataModel(long date, int value, String text) {
        mDate = date;
        mValue = value;
        mText = text;
    }
}
