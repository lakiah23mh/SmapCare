package com.example.smapcare;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;


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
        des4.add("Pada hari pertama dan kedua paska melahirkan, ASI biasanya belum keluar. Bila ibu memencet putting payudara, akan keluar sedikit cairan berwarna kekuningan. Cairan ini disebut kolostrum. ASI belum keluar lancar pada hari pertama dan kedua merupakan hal yang normal.\n\n" +
                "Untuk merangsang produksi ASI, ibu tetap mencoba menyusui bayi sesering meungkin. Semakin sering bayi menghisap, semakin merangsang produksi ASI.\n\n" +
                "Selain itu, ibu dapat menambah porsi makan, memperbanyak sayuran hijau, minum air putih minimal 8 gelas sehari, cukup istirahat dan menghindari stress.");
        des4.add("Bila payudra teraba keras, terasa nyeri, dan kulit payudara berwarna memerah dan mengkilat, kemungkinan ibu mengalami mastitis, segera periksa ke fasilitas kesehatan terdekat.\n\n" +
                "Bila payudara teraba keras, namun tidak disertai kulit berwarna merah dan mengkilat, ibu dapat melakukan perawatan payudara.\n\n" +
                "Cara melakukan pijat payudara:\nTangan dilicinkan dengan minyak kelapa / baby oil. Pengurutan    payudara  mulai  dari  pangkal  menuju  arah  putting  susu selama 2 menit (10kali) untuk masing-masing payudara.\n\n" +
                "Pengurutan yang pertama:\nLicinkan   kedua   tangan   dengan   minyak, pengurutan  dimulai dari arah atas  lalu  arak  sisi  samping  kiri kemudian  kearah kanan,  lakukan  terus pengurutan  kebawah  atau  melintang.  Lalu  kedua  tangan  dilepas  dari payudara, ulangi gerakan 20-30 kali untuk setiap satu payudara.\n\n" +
                "Pengurutan yang kedua:\nMenyokong payudara kiri dengan  tangan kiri, kemudian dua atau tiga jari  tangan  kanan  mulai  dari  pangkal  payudara  dan  berakhir  pada puting susu. Lakukan tahap mengurut payudara dengan sisi kelingking dari arah tepi kearah putting susu. Lakukan gerakan 20-30 kali.\n\n" +
                "Pengurutan yang ketiga:\nMenyokong  payudara  dengan  satu  tangan,  sedangkan  tangan  lain mengurut  dan  menggenggam  dari  pangkal  menuju  ke  putting  susu. Langkah gerakan 20-30 kali.\n\n");
        des4.add("Lidah bayi yang kasar dapat mengkibatkan putting susu lecet.\n\n" +
                "Untuk mencegah putting lecet, sebelum menyusui, oleskan terlebih dahulu sedikit ASI pada putting ibu. Biarkan bayi menyusu hingga melepaskan sendiri putting ibu.\n\n" +
                "Puting lecet juga dapat diakibatkan oleh posisi menyusui bayi yang salah. Cek perlekatan bayi. Sebagian besar daerah berwarna hitam di sekitar payudra harus masuk ke dalam mulut bayi.");
        des4.add("Perubahan mood/suasana hati pada ibu setelah melahirkan merupakan hal yang normal. Keadaan ini sering disebut dengan baby blues.\n\n" +
                "Perubahan kadar hormon merupakan penyebab ibu mengalami baby blus.\n\n" +
                "Gejala yang muncul bisa berupa perasaan gelisah, marah, panik, lelah atau sedih.\n\n" +
                "Umumnya kondisi ini hilang dalam beberapa hari atau minggu. Bila perasaan tersebut tak juga hilang, bahkan disertai rasa benci, keinginan bunuh diri, juga halusinasi, kemungkinan Anda mengalami depresi pascamelahirkan. Kondisi ini tergolong berbahaya dan perlu segera mendapat penanganan.");
        des4.add("Nyeri episiotomi disebabkan karena perlukaan jalan lahir saat proses persalinan.\n\n" +
                "Bila nyeri terjadi dalam 24 jam pertama setelah melahirkan, ibu dapat menggunakan bantalan yang berisi es untuk mengompres daerah tersebut. Pastikan tidak melakukan kompres lebih dari 15 menit agar ibu tidak kedinginan.\n\n" +
                "Bila nyeri terjadi setelah 24 jam setelah melahirkan, ibu dapat berkonsultasi dengan dokter untuk melakukan rendam duduk (Sitz bath) dengan menggunakan air hangat.\n\n" +
                "Untuk mempercepat penyembuhan luka episiotomi, selalu jaga kebersihan area tersebut dengan cara sering mengganti pembalut, makan makanan bergizi.");
        des4.add("Wasir atau ambeyen dapat terjadi pada kehamilan ataupun setelah melahirkan.\n\n" +
                "Tekanan pada perineum (area di antara lubang vagina dan anus) selama kehamilan atau setelah melahirkan membuat ibu  lebih mungkin mengalami wasir. Saat hamil, rahim ibu  terus membesar sehingga memberi tekanan pada vena besar di sisi kanan tubuh yang menerima darah dari kaki. Tekanan ini kemudian dapat memperlambat kembalinya darah dari bagian bawah tubuh, sehingga meningkatkan tekanan pada pembuluh darah di bawah rahim dan menyebabkannya menjadi besar.\n\n" +
                "Selain itu, peningkatan hormon progesteron selama kehamilan juga menyebabkan dinding pembuluh darah berelaksasi, sehingga pembuluh darah lebih mudah menjadi bengkak. Hormon progesteron juga dapat menyebabkan sembelit dengan cara memperlambat pergerakan usus . Sembelit saat hamil atau setelah melahirkan dapat menyebabkan tekanan pada pembuluh darah, sehingga bisa berkembang menjadi atau memperburuk wasir. ibu  juga bisa mengembangkan wasir karena Anda mengejan terlalu keras selama persalinan.\n\n" +
                "Cara mengatasi wasir setelah melahirkan:\nJangan menahan BAB, ini dapat membuat feses Anda menjadi kering dan sulit untuk dikeluarkan. Juga, hindari mengejan terlalu keras saat buang air besar dan jangan buang air besar dalam waktu yang lama.\n" +
                "Perbanyak konsumsi serat dan minum cukup air putih.\n" +
                "Hindari duduk dan berdiri dalam waktu yang lama serta berbaringlah sebanyak yang ibu  bisa\n" +
                "Saat ibu duduk, sebaiknya beri alas bantal untuk mengurangi tekanan pada rektum. Jangan duduk di kursi langsung, terutama pada permukaan kursi yang keras. Duduk di kursi goyang atau kursi malas mungkin lebih nyaman untuk ibu.\n" +
                "Hindari makan goreng gorengan selama wasir.");

        List<String> des5 = new ArrayList<>();
        des5.add("ASI adalah makanan terbaik bagi bayi. ASI eksklusif merupakan pemerian ASI saja kepada bayi selama minimal 6 bulan tanpa diberikan makanan tambahan apapun kecuali obat/imunisasi.");
        des5.add("Teknik menyusui yan tepat dapat menunjang keberhasilan pemberian asi ekslusif.\n\n" +
                "Perlekatan merupakan kunci sukses keberhasilan menyusui\n\n" +
                "Tahapan perlekatan saat menyusui (latch on) yang tepat pada bayi sebagai cara menyusui yang benar adalah sebagai berikut: Usahakan untuk menjaga posisi telinga, bahu, serta pinggul bayi. Pastikan tubuhnya sejajar dengan tubuh Anda agar bayi bisa lebih mudah menelan selama menyusui.Usahakan agar posisi hidung bayi berhadapan langsung dengan puting payudara Anda, dan tidak tertekan. Pegang dagu bayi secara perlahan, kemudian bantu untuk membukanya sembari bibir bayi mendekati payudara untuk mulai menyusu. Arahkan puting payudara dan gesekkan atau sentuh perlahan bagian bibir bayi dengan menggunakan puting payudara Anda. Kemudian tunggu sampai bibir bayi terbuka lebar seola sedang menguap, sebagai pertanda telah siap untuk mengisap puting payudara. Bimbing bibir bayi menuju ke puting payudara, agar bayi bisa lebih mudah untuk mengisapnya. Usahakan bibir dan mulut bayi telah mengisap puting payudara Anda dengan baik dan benar.Tarik puting dari mulut bayi dan ulangi lagi " +
                "tahapannya dari awal, bila bayi tidak bisa mengisapnya dengan tepat. Jika latch on tidak dilakukan dengan benar, biasanya Anda akan merasa nyeri atau sakit pada puting.\n\n" +
                "Tanda perlekatan sudah benar yaitu: Dagu bayi menyentuh payudara ibu, Bibir bawah bayi terpuntir keluar, Mulut bayi terbuka lebar, Aerola bagian bawah lebih banyak yang masuk ke mulut bayi dibanding bagian atas, Bayi yang menyusu dengan baik akan mengisap dengan pelan, berirama, tidak tergesa-gesa dan tidak terdengar bunyi berdecak. Pipi bayi akan menggembung dan ibu tidak terasa sakit.\n\n" +
                "Teknik menyusui yang benar adalah sebagai berikut: Bagi ibu menyusui, posisikan diri senyaman mungkin dan rilekskan diri Anda. Supaya lebih nyaman, Anda bisa bersandar atau ganjal tubuh dengan bantal. Setelah posisi ibu terasa nyaman, gendong dan pegang kepala bayi dengan satu tangan dan pertahankan posisi payudara ibu dengan tangan yang lainnya. Kemudian dekatkan wajah bayi ke arah payudara ibu. Pastikan tubuh bayi menempel sepenuhnya dengan tubuh ibu.Beri rangsangan pada daerah bibir bawah bayi dengan menggunakan puting susu ibu. Tujuannya agar mulut bayi terbuka lebar.Biarkan bayi memasukkan areola (seluruh bagian gelap di sekitar puting payudara ibu) ke dalam mulut bayi. Tahapan ini termasuk lacth on atau perlekatan saat menyusui.Bayi akan mulai menggunakan lidahnya untuk mengisap ASI. Ibu tinggal mengikuti irama menyedot dan menelan yang dilakukan bayi.Ketika ibu ingin menyudahi atau berpindah ke payudara yang lain, letakkan satu jari ibu ke sudut bibir bayi. " +
                "Nantinya, bayi perlahan-lahan akan melepaskan isapannya.Hindari melepaskan mulut bayi atau menggeser payudara Anda secara tiba-tiba. Ditakutkan, hal ini malah akan membuat bayi rewel dan akan sulit menyusu lagi nantinya.Biarkan bayi mengatur sendiri kecepatannya saat menyusui. Perlu diingat, tidak ada batasan waktu yang pasti mengenai berapa lama bayi akan menyusui, karena masing-masing bayi memiliki waktu menyusui yang berbeda-beda. Hanya saja, memang biasanya bayi punya minimal waktu tertentu saat menyusu.Perpindahan payudara saat menyusui bisa Anda lakukan ketika payudara terasa lebih lunak setelah bayi menyusu. Ini karena ASI di dalam payudara tersebut telah diminum oleh bayi, sehingga terasa tidak lagi penuh. Tindakan menyusui secara bergantian dapat mencegah payudara yang belum dipakai untuk menyusui menjadi nyeri karena penuh terisi oleh ASI.");
        des5.add("ASI dapat diperas dengan tangan, pompa manual, ataupun pompa listrik.\n\n" +
                "Cara memeras ASI dengan tangan:\nLetakkanibu  jari di tepi atas kalang susu (jam 12.00). Letakkan jari telunjuk di tepi bawh kalang susu (jam 06.00) dan 3 jari lainnya  menyangga payudara. Dengan kedua jari, tekan jaringan payudara ke arah rongga dada. dengan gerakan ke depan, pijat kalang susu ke arah depan, sehingga asi keluar. putar posisi ibu jari dan telunjuk. misal ke arah jam 3 dan 9. ulangi gerakan mmeras.");
        des5.add("ASI dapat disimpan di freezer ataupun di lemari es.\n\n" +
                "ASI tahan 6-8 jam di udara luar.\n\n" +
                "ASI tahan 24 jam dalam termos es.\n\n" +
                "ASI tahan 2x24 jam dalam lemari es.\n\n" +
                "ASI tahan 2 minggu di freezer lemari es satu pintu.\n\n" +
                "ASI tahan hingga 3 bulan bila disimpan di freezer  lemari es 2 pintu.\n\n" +
                "Sebelum disimpan di freezer, asi didinginkan terlebih dahulu mini8mal 30 menit di lemari es. Berikan label hari, tanggal, dan jam memerah.\n\n");
        des5.add("Pijat oksitosin merupakan pijatan yang dilakukan di daerah sepanjang tulang belakang sebagai upaya untuk memperlancar pengeluaran ASI. Pijatan ini mampu memicu pengeluaran oksitosin, di mana oksitosin merupakan hormon yang diperlukan untuk mengeluarkan ASI.\n\n" +
                "Manfaat pijat oksitosin yaitu meningktkan pengeluran hormon oksitosin dan prolaktin, serta meningkatkan letdown refleks.\n\n" +
                "Cara melakukan pijat oksitosin:\nIbu berada dalam posisi duduk bersandar ke depan sambil memeluk bantal agar lebih nyaman. Taruh meja di depan Anda sebagai tempat untuk bersandar.\n" +
                "Pijat kedua sisi tulang belakang menggunakan kepalan tangan dengan ibu jari menunjuk ke depan. Pijat kuat dengan gerakan melingkar.\n" +
                "Pijat sisi tulang belakang ke arah bawah sampai sebatas dada, dari leher sampai ke tulang belikat.\n" +
                "Lakukan pijatan ini selama 2-3 menit.\n\n" +
                "Perawatan   payudara   sering   disebut Breast   Care bertujuan   untuk memelihara   kebersihan   payudara,   memperbanyak   atau   memperlancar pengeluaran  ASI.\n\n" +
                "Cara melakukan pijat payudara:\nTangan dilicinkan dengan minyak kelapa / baby oil. Pengurutan    payudara  mulai  dari  pangkal  menuju  arah  putting  susu selama 2 menit (10kali) untuk masing-masing payudara.\n\n" +
                "Pengurutan yang pertama:\nLicinkan   kedua   tangan   dengan   minyak, pengurutan  dimulai dari arah atas  lalu  arak  sisi  samping  kiri kemudian  kearah kanan,  lakukan  terus pengurutan  kebawah  atau  melintang.  Lalu  kedua  tangan  dilepas  dari payudara, ulangi gerakan 20-30 kali untuk setiap satu payudara.\n\n" +
                "Pengurutan yang kedua:\nMenyokong payudara kiri dengan  tangan kiri, kemudian dua atau tiga jari  tangan  kanan  mulai  dari  pangkal  payudara  dan  berakhir  pada puting susu. Lakukan tahap mengurut payudara dengan sisi kelingking dari arah tepi kearah putting susu. Lakukan gerakan 20-30 kali.\n\n" +
                "Pengurutan yang ketiga:/nMenyokong  payudara  dengan  satu  tangan,  sedangkan  tangan  lain mengurut  dan  menggenggam  dari  pangkal  menuju  ke  putting  susu. Langkah gerakan 20-30 kali.");
        des5.add("Keluarkan ASI beku dari freezer. Simpan di lemari es hingga mencair. Setelah mencair, rendam ASI dalam air hangat hingga ASI terasa hangat/suam kuku. Cek terlebih dahulu suhu ASI sebelum diberikan pada bayi.\n\n" +
                "Jangan menyimpan kembali asi yang sudah dicairkan kedalam lemari es.");
        des5.add("Tanda asi cukup bila:\n" +
                "Posisi menyusu benar.\n" +
                "Buang air kecil 5-6 x/hari.\n" +
                "BAB 2 x/hari.\n" +
                "Bayi terlihat rileks dan puas setelah minum asi.\n" +
                "paling baik bila bayi mengakhiri menyusu sendiri.");

        List<String> des6 = new ArrayList<>();
        des6.add("Darah nifas yang keluar berwarna merah kecoklatan.\n");
        des6.add("Darah nifas berwarna merah muda, kecoklatan.\n");
        des6.add("Darah nifas berwarna merah muda, kecoklatan.\n");
        des6.add("Darah nifas berwarna putih.\n");

        List<String> des7 = new ArrayList<>();
        des7.add("Suhu ibu nifas pada 24 jam pertama setelah melahirkan 36,50C-37,50C.\n\n" +
                "Pada hari kedua atau ketiga dapat terjadi kenaikan suhu hingga 38 0C, namun tidak lebih dari 24 jam. Pada hari kedua atau ketiga dapat terjadi kenaikan suhu karena adanya pembentukan ASI.\n\n" +
                "Apabila suhu tidak turun setelah hari ketiga, ada kemungkinan terjadi infeksi pada endometrium.\n\n");
        des7.add("Kejang dapat disebabkan karena meningkatnya tekanan darah berlebih setelah melahirkan yang merupakan salah satu tanda dari postpartum preeklamsia.\n\n" +
                "Ibu  membutuhkan pengobatan medis segera karena dapat menyebabkan komplikasi serius paska melahirkan.");
        des7.add("Darah nifas berbau busuk dapat menandakan adanya infeksi disertai keadaan lain seperti demam tinggi, darah nifas berubah warna tidak lazim, muncul gejala pendarahan, serta nyeri pada vagina dan perineum.\n\n" +
                "Pencegahan dapat dilakukan dengan menjaga kebersihan dan kesehatan daerah sekitar vagina, mengganti pembalut sesering mungkin, dan menghindari berhubungan intim sebelum masa nifas berakhir.\n\n" +
                "Segera periksa ke dokter untuk mendapatkan penanganan lebih lanjut.\n");
        des7.add("Batas normal tekanan darah antara 90/60 mmHg sampai 130/90 mmHg.\n\n" +
                "Tekanan darah yang tinggi dapat menandakan ibu terkena pre-eklamsia post partum.\n\n" +
                "Segera periksa ke dokter untuk mendapatkan penanganan lebih lanjut.\n\n");
        des7.add("Pendarahan setelah melahirkan didefinisikan sebagai keadaan kehilangan darah >500 ml melalui persalinan normal, dan >1000 ml untuk caesarean pada 24 jam setelah melahirkan.\n\n" +
                "Faktor resiko terjadinya pendarahan pada umumnya karena atonia uteri (berkurang/tidak adanya kontraksi uterus setelah plasenta lepas), plasentasi abnormal (penempelan abnormal plasenta pada dinding uterus), trauma, maupun koagulopati.\n\n" +
                "Bila ibu merasakan rahim teraba lembek, segera lakukan pemijatan/massage di daerah rahim untuk merangsang rahim berkontraksi. Kontraksi pada rahim diperlukan untuk menjepit pembuluh darah yang terbuka selama proses persalinan, sehingga dapat meminimalkan terjadinya perdarahan.");
        des7.add("Merupakan salah satu tanda preeklamsia.\n\n" +
                "Segera periksa ke dokter untuk mendapatkan penanganan lebih lanjut.");
        des7.add("Nyeri hebat pada dada disertai dengan sesak nafas merupakan tanda terjadinya emboli paru.\n\n" +
                "Emboli paru adalah kondisi tersumbatnya aliran darah di paru-paru, biasanya karena ada gumpalan darah. Kondisi ini bisa mengancam nyawa, apalagi bila muntah darah atau penurunan kesadaran turut terjadi.");
        des7.add("Batuk disertai sesak nafas pada ibu paska bersalin yang memiliki riwayat preekalmsia merupakan salah satu tanda gagal jantung. Atau ibu kemungkinan mengalami radang paru (pneumonia).\n\n" +
                "Segera periksa ke dokter untuk mendapatkan penanganan lebih lanjut.\n\n");
        des7.add("ASI bernanah, payudara kencang, dan berwarna merah mengkilap merupakan tanda mastitis.\n\n" +
                "Mastitis merupakan peradangan pada jaringan payudara.\n\n" +
                "Jangan berikan ASI bila ibu mengalami mastitis.\n\n" +
                "Segera periksa ke dokter untuk mendapatkan penanganan lebih lanjut.");

        List<String> des8 = new ArrayList<>();
        des8.add("Di awal setelah persalinan selesai, bekas luka jahitan akan terlihat seperti sedikit timbul, bengkak dan warnanya lebih gelap jika dibandingkan dengan warna kulit asli Anda.\n\n" +
                "Bekas luka operasi Caesar umumnya memiliki panjang sekitar 10-15 cm, namun seiring berjalannya waktu, bekas jahitan caesar akan menyusut dan mengering. Bekas yang sudah sembuh akan terlihat menyatu dengan kulit, tidak berair, tidak terasa sakit, serta tidak mengeluarkan nanah maupun darah.");
        des8.add("1.    Ganti perban balutan setiap 1 kali dalam sehari. Segera ganti balutan apabila kondisinya lembab, basah, maupun tidak nyaman.\n\n" +
                "2.     Bersihkan saat mandi dan jaga area bekas sayatan agar selalu bersih dan kering seusainya.");

        List<String> des9 = new ArrayList<>();
        des9.add("Luka robekan dan jahitan paska melahirkan normal adalah hal yang umumnya dirasakan setiap ibu.\n");
        des9.add("-     Jaga kebersihan dengan mandi\n" +
                "-      Ganti pembalut paska persalinan secara teratur\n" +
                "-      Konsumsi makanan kaya serat seperti buah dan sayur\n" +
                "-      Konsultasikan ke bidan atau dokter apabila jahitan terasa sakit\n" +
                "-      Pastikan jahitan kering setiap selesai buang air kecil maupun buang air besar.");

        List<String> des10 = new ArrayList<>();
        des10.add("Kebutuhan gizi ibu nifas meningkat karena makanan tersebut juga diperlukan untuk menghasilkan ASI bagi bayinya, untuk memulihkan tenaga ibu setelah melahirkan, serta untuk kebutuhan sehari-hari.\n\n" +
                "Ibu menyusui harus memperbnyak porsi makan. Ibu hendaknya tidak berpantang makanan. Ikan, daging, telur sangat bagus untuk ibu menyusui.\n\n" +
                "Bila ibu memiliki luka jahitan, tidak perlu berpantang makan ikan dan telur. Protein hewani tersbut diperlukan untuk mempercepat penyembuhan luka.\n\n" +
                "Ikan dan telur tidak membuat Asi menjadi amis.");
        des10.add("ASI dipengaruhi oleh makanan yang dimakan ibu.\n\n" +
                "Ibu menyusui harus makan makanan dengan gizi seimbang yang terdiri dari kalori, protein, lemak, vitamin, dan mineral yang cukup.\n\n" +
                "Protein yang dikonsumsi terdiri dari hewani dan nabati. Lebih baik bila ibu juga minum susu.\n\n" +
                "Makanan yang baik adalah yang mudah dicerna dan tidak merangsang, menghindari makanan yang banyak berbumbu, alkohol, terlalu panas atau dingin.");


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



