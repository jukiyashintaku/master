package com.mikan.project.kakusample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // DataModelの動的配列
    private ArrayList<DataModel> mDataList = new ArrayList<>();

    // Activity情報
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // レイアウト設定
        setContentView(R.layout.activity_main);

        /*
        もし、画面繊維毎、異なるレイアウトが欲しければ以下の感じでもできる
        if (条件) {
        　　　setContentView(R.layout.見せたいレウアウト1);
        } else {
            setContentView(R.layout.見せたいレウアウト2);
        }
         */

        // Activity情報をクラスメンバー変数に保存する
        // TODO: contextが何か調べて作業報告書に記載すること
        mContext = this;

        DataModel dataModel;

        // データを格納するモデルクラスを作成する
        dataModel = new DataModel(20210213, 100, "1回目計算結果");
        // モデルクラスを配列に追加する
        mDataList.add(dataModel);

        // データを格納するモデルクラスを作成する
        dataModel = new DataModel(20210214, 200, "2回目計算結果");
        // モデルクラスを配列に追加する
        mDataList.add(dataModel);

        // データを格納するモデルクラスを作成する
        dataModel = new DataModel(20210215, 300, "3回目計算結果");
        // モデルクラスを配列に追加する
        mDataList.add(dataModel);

        // データを格納するモデルクラスを作成する
        dataModel = new DataModel(20210216, 400, "4回目計算結果");
        // モデルクラスを配列に追加する
        mDataList.add(dataModel);

        // ButtonView作成
        Button btnNext = findViewById(R.id.btn_next);

        // ButtonViewのクリックイベント(ボタンタッチ時、発生する)
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 次の画面へ値を渡して繊維する
                Intent intent = new Intent(mContext, MainActivity2.class);
                intent.putExtra("TAG", mDataList);
                startActivity(intent);
            }
        });
    }
}