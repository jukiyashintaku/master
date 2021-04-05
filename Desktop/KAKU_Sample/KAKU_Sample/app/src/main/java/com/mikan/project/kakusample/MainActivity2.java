package com.mikan.project.kakusample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    // DataModelの動的配列
    private ArrayList<DataModel> mDataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 送信側からintentを受信
        // TODO: Intentはデータ送受信以外にも使われるので調べて作業報告書に追加して置くこと
        Intent intent = getIntent();

        // 送信側からIntentがない場合はnullで受信されるので、こういうNullCheckはこまめにやったほうがいい
        if (intent != null) {
            mDataList = (ArrayList<DataModel>) intent.getSerializableExtra("TAG");
        }


        // 以下、ListViewの使い方
        // ListViewのセット
        ListView listView = findViewById(R.id.lv_list);

        // TODO:thisが何か調べること。使い方と例などをあげて作業報告書に追加すること
        ListViewAdapter adapter = new ListViewAdapter(this, mDataList);

        // listViewにアダプタをセット
        listView.setAdapter(adapter);

        // Adapterを更新するAPI(ListViewが更新(描画)するイメージ)
        adapter.notifyDataSetChanged();

    }
}