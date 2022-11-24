package com.jhw.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Ex11ListViewActivity extends AppCompatActivity {

    private String TAG = "리스트뷰예제";
    private ListView listview = null;
    private ListViewAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13_listview1_seraphin);

        listview = (ListView) findViewById(R.id.listview);
        adapter = new ListViewAdapter();

        //Adapter 안에 아이템의 정보 담기
        adapter.addItem(new Ex11SamiraActivity
                ("출시일(22.07.14)", "닐라", R.drawable.a1));
        adapter.addItem(new Ex11SamiraActivity
                ("출시일(22.06.10)", "벨베스", R.drawable.a2));
        adapter.addItem(new Ex11SamiraActivity
                ("출시일(22.02.18)", "레나타", R.drawable.a3));
        adapter.addItem(new Ex11SamiraActivity
                ("출시일(22.01.21)", "제리", R.drawable.a4));
        adapter.addItem(new Ex11SamiraActivity
                ("출시일(21.09.24)", "벡스", R.drawable.a5));
        adapter.addItem(new Ex11SamiraActivity
                ("출시일(21.07.23)", "아크샨", R.drawable.a6));
        adapter.addItem(new Ex11SamiraActivity
                ("출시일(21.04.16)", "그웬", R.drawable.a7));
        adapter.addItem(new Ex11SamiraActivity
                ("출시일(21.01.22)", "비에고", R.drawable.a8));
        adapter.addItem(new Ex11SamiraActivity
                ("출시일(20.12.10)", "렐", R.drawable.a9));
        adapter.addItem(new Ex11SamiraActivity
                ("출시일(20.10.31)", "세라핀", R.drawable.a10));
        adapter.addItem(new Ex11SamiraActivity
                ("출시일(20.09.21)", "사미라", R.drawable.a11));

        //리스트뷰에 Adapter 설정
        listview.setAdapter(adapter);
    }

    /* 리스트뷰 어댑터 */
    public class ListViewAdapter extends BaseAdapter {
        ArrayList<Ex11SamiraActivity> items = new ArrayList<Ex11SamiraActivity>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(Ex11SamiraActivity item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            final Context context = viewGroup.getContext();
            final Ex11SamiraActivity championphone = items.get(position);

            if(convertView == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.activity_main14_listview2_samira, viewGroup, false);

            } else {
                View view = new View(context);
                view = (View) convertView;
            }

            TextView tv_name = (TextView) convertView.findViewById(R.id.tvName);
            TextView tv_num = (TextView) convertView.findViewById(R.id.tvNumber);
            ImageView iv_icon = (ImageView) convertView.findViewById(R.id.ivChampion);

            tv_num.setText(championphone.getNum());
            tv_name.setText(championphone.getName());
            iv_icon.setImageResource(championphone.getResId());
            Log.d(TAG, "getView() - [ "+position+" ] "+championphone.getName());

            //각 아이템 선택 event
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

//                    Toast.makeText(getApplicationContext(),"R.id.iv_icon:"+R.id.iv_icon,Toast.LENGTH_SHORT).show();
//                    Toast.makeText(getApplicationContext(),"phoneItem.getResId():"+phoneItem.getResId(),Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(),championphone.getName()+"에게 전화를 겁니다!",Toast.LENGTH_SHORT).show();
                    Intent intentTel = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+championphone.getNum()));
                    startActivity(intentTel);
                }
            });
            return convertView;  //뷰 객체 반환
        }
    }
}