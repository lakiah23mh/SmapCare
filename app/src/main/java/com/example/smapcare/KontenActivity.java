package com.example.smapcare;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class KontenActivity extends Activity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konten);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lv_konten);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            }
        });
        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }


    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Perawatan Bayi Baru Lahir");
        listDataHeader.add("Tanda-tanda bahaya bayi baru lahir");
        listDataHeader.add("Masalah pada bayi");
        listDataHeader.add("Masalah pada ibu nifas");
        listDataHeader.add("ASI");
        listDataHeader.add("Perubahan normal ibu nifas");
        listDataHeader.add("Tanda-tanda bahaya ibu nifas");
        listDataHeader.add("SC");
        listDataHeader.add("Luka jalan lahir");
        listDataHeader.add("Gizi ibu nifas");

        // Adding child data
        List<String> menu1 = new ArrayList<String>();
        menu1.add("Memandikan");
        menu1.add("Membedong");
        menu1.add("Merawat tali pusat");


        List<String> menu2 = new ArrayList<String>();
        menu2.add("Infeksi tali pusat");
        menu2.add("Kuning pada bayi");
        menu2.add("Kurang cairan (dehidrasi)");
        menu2.add("Tidak mau netek");
        menu2.add("Kejang");
        menu2.add("Demam atau dingin");
        menu2.add("Sesak nafas");
        menu2.add("Bayi biru");


        List<String> menu3 = new ArrayList<String>();
        menu3.add("Batuk, pilek");
        menu3.add("Panas");
        menu3.add("Diare");
        menu3.add("Sembelit");
        menu3.add("Bayi dengan HIV");
        menu3.add("Bayi dengan HbSAg");
        menu3.add("Perut kembung");
        menu3.add("Kulit kepala berkerak");
        menu3.add("Lidah putih");

        List<String> menu4 = new ArrayList<String>();
        menu4.add("ASI tidak keluar");
        menu4.add("Payudara bengkak");
        menu4.add("Puting susu lecet");
        menu4.add("Perubahan mood ibu nifas");
        menu4.add("Nyeri episiotomi");
        menu4.add("Wasir");

        List<String> menu5 = new ArrayList<String>();
        menu5.add("Pengertian");
        menu5.add("Teknik menyusui");
        menu5.add("Cara memeras ASI");
        menu5.add("Cara menyimpan ASI");
        menu5.add("Cara melancarkan ASI (pijat oksitosin, breast care)");
        menu5.add("Cara menghangatkan ASI");
        menu5.add("Tanda bayi cukup ASI");

        List<String> menu6 = new ArrayList<String>();
        menu6.add("Hari 1-3");
        menu6.add("Hari 4-7");
        menu6.add("Hari 8-14");
        menu6.add("Hari 15-42");

        List<String> menu7 = new ArrayList<String>();
        menu7.add("Demam");
        menu7.add("Kejang");
        menu7.add("Darah nifas bau busuk");
        menu7.add("Tekanan darah tinggi");
        menu7.add("Pendarahan");
        menu7.add("Pandangan mata kabur");
        menu7.add("Nyeri hebat pada dada");
        menu7.add("Batuk disertai sesak nafas");
        menu7.add("ASI bernanah, payudara kencang, merah mengkilap");

        List<String> menu8 = new ArrayList<String>();
        menu8.add("Mengenal kondisi luka");
        menu8.add("Perawatan luka SC");

        List<String> menu9 = new ArrayList<String>();
        menu9.add("Mengenali kondisi luka");
        menu9.add("Perawatan luka");

        List<String> menu10 = new ArrayList<String>();
        menu10.add("Kebutuhan gizi");
        menu10.add("Pemenuhan gizi");




        listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), menu2);
        listDataChild.put(listDataHeader.get(2), menu3);
        listDataChild.put(listDataHeader.get(3), menu4);
        listDataChild.put(listDataHeader.get(4), menu5);
        listDataChild.put(listDataHeader.get(5), menu6);
        listDataChild.put(listDataHeader.get(6), menu7);
        listDataChild.put(listDataHeader.get(7), menu8);
        listDataChild.put(listDataHeader.get(8), menu9);
        listDataChild.put(listDataHeader.get(9), menu10);
    }
}



