package com.mikan.project.kakusample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

// ListViewを作る為のアダプタクラス
public class ListViewAdapter extends BaseAdapter {

    // DataModelの動的配列
    private ArrayList<DataModel> mDataList = new ArrayList<>();

    private LayoutInflater mInflater;

    // コンストラクタ作成
    // TODO:コンストラクタが何か調べて作業報告書に追加しておくこと
    public ListViewAdapter (Context context, ArrayList<DataModel> dataList) {
        // Adapterが動く順番1) DataListをもらうこと
        mDataList = dataList;

        // レイアウトを入れ替える為のAPI
        // ListView作成時に必須
        // TODO:ListViewの動く仕組みを調べて作業報告書に追加すること
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // Adapterが動く順番2) DataListのサイズを以下のようにセットすること
        return mDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Adapterが動く順番3) ListViewに見せる項目がpositionの中に順番に呼ばれる
        // 例えば、mDataList.size()が4だったら、getViewで項目を4行作成する

        // TODO:以下のコードは理解を促す為、簡単に書いた効率が悪いコードです。
        // TODO:以下のコードをGoogleが採用するView Holder形式に変えて報告してください

        // ListView内の1項目のレイアウトを設定する
        convertView = mInflater.inflate(R.layout.list_item, parent,false);

        TextView date = convertView.findViewById(R.id.txt_date);
        TextView value = convertView.findViewById(R.id.txt_value);

        // long値をStringに変換
        // TODO:mDataList.get(position)が何か調べること
        String txtDate = String.valueOf(mDataList.get(position).mDate);

        // int値をStringに変換
        String txtValue = String.valueOf(mDataList.get(position).mValue);

        // dateのTextViewにStringをセット
        date.setText(txtDate);

        // valueのTextViewにStringをセット
        value.setText(txtValue);

        return convertView;
    }
}
