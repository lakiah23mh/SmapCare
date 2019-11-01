package com.example.smapcare;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
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
    List<String> listTemp;
    HashMap<String, List<String>> listDeskripsi;

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
                Intent intent = new Intent(KontenActivity.this, DeskripsiActivity.class);
                intent.putExtra("movetosubjudul",listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition));
                intent.putExtra("movetodeskripsi", listDeskripsi.get(listTemp.get(groupPosition)).get(childPosition));
                startActivity(intent);

                return false;
            }
        });

        // Listview Group expanded listener
//        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
//
//            @Override
//            public void onGroupExpand(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Expanded",
//                        Toast.LENGTH_SHORT).show();
//            }
//        });
        // Listview Group collasped listener
//        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
//
//            @Override
//            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Collapsed",
//                        Toast.LENGTH_SHORT).show();
//
//            }
//        });
    }


    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listTemp= new ArrayList<String>();
        listDeskripsi= new HashMap<String, List<String>>();
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


        listTemp.add("1");
        listTemp.add("2");
        listTemp.add("3");
        listTemp.add("4");
        listTemp.add("5");
        listTemp.add("6");
        listTemp.add("7");
        listTemp.add("8");
        listTemp.add("9");
        listTemp.add("10");

        List<String> des1 = new ArrayList<>();
        des1.add("Memandikan bayi merupakan upaya yang dilakukan untuk menjaga agar tubuh bayi " +
                "bersih, terasa segar, dan mencegah kemungkinan adanya infeksi\n\n" +
                "Bayi dimandikan paling cepat 6 jam setelah lahir.\n\nCara memandikan :Bayi mandi " +
                "dengan air hangat, untuk menghindari suhu tubuhnya turun yang dapat berbahaya bagi" +
                " bayi. Mandikan dengan cepat, bersihkan muka, leher dan ketiak dengan air dan " +
                "sabun. Keringkan seluruh tubuh dengan cepat. Bayi tidak boleh dibedong, cukup" +
                " dipakaikan baju, topi, kaus kaki dan diselimuti sehingga terjaga kehangatannya. " +
                "Jangan memandikan bayi jika demam atau pilek.\n\n" +
                "Bayi umur 1-7 hari dimandikan cukup 1 kali dalam sehari, menjelang siang hari. ");
        des1.add("Membedong adalah praktek membungkus bayi dengan menggunakan kain.\n\nBedong bukan" +
                " perangkat meluruskan kaki tetapi hanyalah salah cara untuk menghindari bayi dari " +
                "kedinginan.");
        des1.add("Tali pusat dalam keadaan bersih, terbuka dan kering agar kuman tetanus tidak dapat" +
                " hidup. Jangan membubuhi apapun pada pangkal tali pusat (termasuk alkohol dan " +
                "povidon yodium) agar lekas kering dan lepas.\n\nBila tali pusat terlihat kotor, " +
                "bersihkan tali pusat dengan air bersih dan sabun mandi, lalu segera keringkan " +
                "dengan kain bersih. Cuci tangan sebelum dan sesudah memegang bayi.\n\nBila tali " +
                "pusat basah, berbau atau dinding perut disekitarnya kemerahan harus segera dibawa " +
                "ke petugas kesehatan, poskesdes, puskesmas atau fasilitas kesehatan yang lain.");

        List<String> des2 = new ArrayList<>();
        des2.add("Tanda infeksi pada tali pusat antara lain tali pusat tercium bau dan dapat " +
                "terlihat nanah, tampak kemerahan pada kulit sekeliling tali pusat, nyeri tekan di " +
                "sekitar pusat, dan dapat diikuti dengan demam.\n\nApabila ditemukan adanya infeksi" +
                " pada tali pusat, langkah pertama yang dapat dilakukan di rumah adalah jangan " +
                "panik, bersihkan ujung tali pusat menggunakan alkohol swab 70%, bayi tetap diminumkan " +
                "ASI selama bayi sadar, dan segera dibawa ke dokter untuk mendapatkan penanganan " +
                "lebih lanjut. Pemakaian popok di bawah tali pusat. ");
        des2.add("Kuning menandakan tingginya zat bilirubin dalam darah yang dapat terjadi secara " +
                "normal untuk hari-hari awal kelahiran namun dapat pula mendandakan bahaya bila " +
                "terjadi dalam waktu lama atau lebih dari satu minggu.");
        des2.add("Dehidrasi pada bayi bisa disebabkan oleh banyak hal, misalnya terlalu lama berada " +
                "di luar ruangan dalam cuaca panas ataupun saat bayi mengalami diare.\n\nTanda-tanda " +
                "dehidrasi pada bayi:Mata bayi terlihat cekung; frekuensi buang air kecil <8 x/ hari, " +
                "Air seni tampak berwarna kuning gelap dan kental; Mulut kering dan bibir pecah-pecah;" +
                " Lesu dan Lemah; Bagian lunak di ubun-ubun bayi terlihat cekung atau tenggelam.");
        des2.add("Tanda ini dapat menunjukkan adanya gangguan pada reflek menghisap pada mulut bayi," +
                " gangguan pada saluran cerna bayi, dan kandungan ASI (jarang terjadi) atau susu " +
                "formula yang dikonsumsi bayi yang tidak dapat dicerna oleh bayi.");
        des2.add("Kejang merupakan salah satu tanda dari infeksi tetanus  menyerang pada bayi baru " +
                "lahir.\n\nHal ini sangat berbahaya bagi bayi bahkan dapat menyebabkan kematian jika" +
                " tidak ditangani dengan segera.\n\nSaat bayi mengalami kejang, pastikan jalan nafas" +
                " bayi tidak mengalami sumbatan (lidah bayi tidak menutupi saluran pernafasan)\n\nsegera " +
                "bawa bayi ke fasilitas kesehatan bila terjadi kejang");
        des2.add("Demam dapat terjadi pada bayi baru lahir yang merupakan tanda umum adanya infeksi " +
                "dan dapat disertai dengan tanda bahaya lain yang muncul bersamaan atau belakangan.\n\n" +
                "Jika tubuh bayi dingin, maka ini perlu penanganan segera di fasilitas kesehatan " +
                "karena menandakan aliran darah yang terganggu yang biasanya diiringi warna pucat " +
                "pada kedua ujung tangan dan kaki.\n\nPenanganan pertama bayi kedinginan: \nJaga " +
                "kehangatan dengan tetap memberikan asi dan selimut  lalu segera bawa ke fasilitas " +
                "kesehatan terdekat  ");
        des2.add("Merupakan tanda adanya gangguan pada sistem pernafasan bayi. \u2028Dapat disertai " +
                "dengan tanda bahaya lain seperti demam. Penghitungan nafas bayi dapat dilakukan " +
                "dengan menghitung pergerakan dada atau perut bayi dalam 60 detik. Tarikan dinding " +
                "dada yang sangat kuat menandakan adanya gangguan pada sistem pernafasan pada bayi.\n\n" +
                "Segera bawa bayi ke fasilitas kesehatan terdekat untuk mendapatkan penanganan lebih lanjut.");
        des2.add("Jika bibir bayi Anda terlihat kebiruan, atau membran mukus di dalam mulutnya atau " +
                "pada lidahnya berubah biru, ini bisa jadi tanda bahwa si bayi tidak mendapatkan " +
                "oksigen yang cukup.\n\nKondisi ini disebut sianosis.\n\nSaat ini terjadi, segeralah " +
                "ke dokter atau panggil ambulans ");

        List<String> des3 = new ArrayList<>();
        des3.add("Batuk dan pilek merupakan penyakit yang lazim terjadi pada bayi\n\nDapat disebabkan " +
                "infeksi dan alergi\n\nBatuk pilek karena infeksi bisa disertai gejala demam, " +
                "hidung meler atau tersumbat (kerap disertai dengan ingus), batuk, bersin, nyeri " +
                "otot, sakit kepala, dan mata berair\n\nBiasanya penyebaran infeksi bisa melalui bersin," +
                " batuk, dan kontak tangan.\n\nBatuk-pilek bisa saja terjadi pada bayi yang baru " +
                "lahir, biasanya berlangsung antara 2-3 hari dengan penyebab tersering adalah virus, " +
                "tetapi bila terjadi lebih dari 1 minggu, ada kemungkinan terjadi infeksi bakteri " +
                "lanjutan atau disebabkan alergi.\n\nApabila batuk pilek disertai dengan nafas cepat" +
                " dan tarikan dinding dada masuk ekdalam, segera bawa bayi ke fasilitas kesehatan.\n\n" +
                "Apabila batuk lebih dari 14 hari, kunjungi ulang fasilitas kesehatan untuk " +
                "menentukan penyebab lain dari batuk.");
        des3.add("Demam dapat terjadi pada bayi yang merupakan tanda umum adanya infeksi dan dapat " +
                "disertai dengan tanda bahaya lain yang muncul bersamaan atau belakangan\n\nBila " +
                "suhu bayi >38.5 0C, ibu dapat memberikan obat penurun panas sesuai dengan dosis " +
                "yang dianjurkan oleh dokter.\n\nIbu juga dapat memberikan kompres pada dahi, " +
                "ketiak, atau selangkangan.\n\nSelalu pantau suhu tubuh bayi anda. Panas yang " +
                "terlalu tinggi dapat menyebabkan kejang pada bayi.\n\nSegera bawa bayi ke fasilitas " +
                "kesehatan bila terjadi kejang. Pastikan jalan nafas pada bayi tidak mengalami " +
                "sumbatan.\n\nBila bayi demam/panas disertai kaku pada kuduk, segera bawa bayi ke " +
                "fasilitas kesehatan.");
        des3.add("Diare merupakan kondisi bayi ketika mengeluarkan feses yang cair dan lebih " +
                "sering dari biasanya.\n\nDiare dapat terjadi karena infeksi virus, bakteri ataupun " +
                "tanda gejala suatu penyakit.\n\nTetap berikan ASI selama bayi diare.\n\n" +
                "Segera bawa ke fasilitas kesehatan bila menemukan tinja bayi berlendir, berdarah, berbau busuk.\n\n" +
                "Segera bawa ke fasilitas kesehatan bila bayi anda menunjukkan tanda dehidrasi (mata cekung, ubun ubun cekung, cubitan kulit perut kembalinya sangat lambat), bayi rewel, dan demam tinggi.");
        des3.add("Mengatasi sembelit pada bayi yng masih mendapatkan ASI dapat dilakukan dengan mengubah asupan makanan ibu.\n\n" +
                "Ibu dapat memperbanyak makan sayuran berserat dan buah buahan.\n\n" +
                "Untuk bayi yang mendapatkan susu formula, sembelit dapat disebabkan susu formula yang tiak cocok. Coba untuk mengganti merk susu formula.");
        des3.add("HIV atau sering juga disebut dengan Human immunodefisiensi virus. Merupakan penyakit yang menyerang sistem kekebalan tubuh.\n\n" +
                "Bayi baru lahir dapat tertular HIV melalui ibunya (proses kehamilan dan persalinan).\n\n" +
                "Bayi yang dilahirkan dari ibu positif HIV, dianjurkan untuk tidak diberikan ASI ibunya.\n\n" +
                "Ibu dengan positif HIV belum tentu menularkan kepada bayinya.\n\n" +
                "Bayi yang dilahirkan dari ibu yang terinfeksi HIV diberikan obat antiretroviral selama 4 hingga 6 minggu untuk meminimalkan penularan HIV.\n\n" +
                "Untuk mengetahui apakah bayi tertular HIV atau tidak, dapat dilakukan tes darah pada bayi. Tes darah ini akan diulang hingga bayi berusia 1.5 atau 2 tahun, untuk memastikan apakah bayi terbebas dari HIV atau tidak .\n\n" +
                "Tes darah perlu diulang karena antibodi maternal yang diturunkan kepada bayi berangsur angsur akan hilang saat bayi berusia 1.5 atau 2 tahun.");
        des3.add("HbSAg merupakan salah satu jenis penyakt hati/hepatitis B.\n\n" +
                "Bayi dapat tertular HbSAg dari ibunya melalui proses pesalinan.\n\n" +
                "Bayi yang dilahirkan dengan ibu yang positif menderita HbSAg, segera setelah lahir diberikan suntikan untuk menekan jumlah virus hepatititis dalam darah bayi.");
        des3.add("Bayi kerap mengalami perut kembung karena saluran pencernaan belum bekerja sempurna.\n\n" +
                "Bayi kembung juga dapat disebabkan karena intoleransi laktosa pada susu sapi\n\n" +
                "Jika hal demikian yang terjadi, konsultasikan kepada dokter spesialis anak untuk mendapatkan susu pengganti.\n\n" +
                "Cara menangani perut kembung:\n" +
                "Posisikan kepala bayi lebih tinggi dari perut ketika menyusu,  Pastikan mulut bayi melekat sempurna ketika menyusu secara langsung pada payudara, Jika menggunakan botol, pilihlah botol susu yang mencegah timbulnya gelembung udara, Setelah menyusu, gendong bayi dalam posisi tegak untuk membantu mengeluarkan udara dari saluran cernanya.");
        des3.add("Kerak kepala pada bayi dapat disebabkan karena hormone yang diterima bayi dari ibu di akhir masa kehamlan yang banyak merangsang kelenjar penghasil minyak.\n\n" +
                "Umumnya kerak kepala dapat hilang sendiri tanpa pengobatan dalam jangka waktu tertentu.\n\n" +
                "Lakukan pencegahan dan perawatan dengan menggosok perlahan kulit kepala dengan tangan ataupun kain untuk meluruhkan kerak. Cuci rambut bayi dengan sampo formulasi ringan. Hubungi dokter apabila masalah berlanjut setelah dilakukan langkah untuk mengatasinya.");
        des3.add("Lidah putih pada bayi dapat disebabkan oleh jamur.\n\n" +
                "Jamur dapat tumbuh pada lidah bayi disebabkan sisa ASI/susu formula.\n\n" +
                "Jamur pada lidah bayi dapat menyebabkan bayi tidak mau menyusu, dalam jangka panjang dapat menyebabkan bayi diare.\n\n" +
                "Cara mengobati lidah putih:\n" +
                "Cuci tangan sebelum mengobati bayi, Bersihkan mulut bayi dengan ujung jari yang terbungkus kain" +
                " bersih dan telah dicelupkan ke larutan air matang hangat " +
                "bergaram (1 gelas air hangat ditambah seujung sdt garam), Teteskan 1 ml suspensi nistatin di mulut 4 kali sehari,  Cuci tangan kembali");
        List<String> des4 = new ArrayList<>();
        List<String> des5 = new ArrayList<>();
        List<String> des6 = new ArrayList<>();
        List<String> des7 = new ArrayList<>();
        List<String> des8 = new ArrayList<>();
        List<String> des9 = new ArrayList<>();
        List<String> des10 = new ArrayList<>();


        listDeskripsi.put(listTemp.get(0),des1);
        listDeskripsi.put(listTemp.get(1),des2);
        listDeskripsi.put(listTemp.get(2),des3);
        listDeskripsi.put(listTemp.get(3),des4);
        listDeskripsi.put(listTemp.get(4),des5);
        listDeskripsi.put(listTemp.get(5),des6);
        listDeskripsi.put(listTemp.get(6),des7);
        listDeskripsi.put(listTemp.get(7),des8);
        listDeskripsi.put(listTemp.get(8),des9);
        listDeskripsi.put(listTemp.get(9),des10);


    }
}



