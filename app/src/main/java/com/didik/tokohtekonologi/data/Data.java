package com.didik.tokohtekonologi.data;

import java.util.ArrayList;

public class Data {
    public static String[][] data = new String[][] {
            {"Bill Gates", "Founder Microsoft", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Bill_Gates_in_WEF%2C_2007.jpg/220px-Bill_Gates_in_WEF%2C_2007.jpg",
                    "seorang tokoh bisnis, investor, filantropis, penulis asal Amerika Serikat, serta mantan CEO yang saat ini menjabat sebagai ketua Microsoft, perusahaan perangkat lunak yang ia dirikan bersama Paul Allen. Ia menduduki peringkat tetap di antara orang-orang terkaya di dunia dan menempati peringkat pertama sejak 1995 hingga 2009, tidak termasuk 2008 ketika ia turun ke peringkat tiga."},
            {"Steve Jobs", "Founder Apple", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Steve_Jobs_with_red_shawl_edit.jpg/200px-Steve_Jobs_with_red_shawl_edit.jpg",
                    "seorang tokoh bisnis dan penemu dari Amerika Serikat. Ia adalah pendiri pendamping, ketua, dan mantan CEO Apple Inc. Jobs juga sebelumnya menjabat sebagai pejabat eksekutif Pixar Animation Studios, ia menjadi anggota dewan direktur The Walt Disney Company pada tahun 2006, setelah pengambilan alih Pixar oleh Disney. Namanya dicantumkan sebagai produser eksekutif dalam film Toy Story tahun 1995."},
            {"Larry Page", "Founder Google", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/Larry_Page.jpg/190px-Larry_Page.jpg",
                    "salah satu pendiri dari mesin pencari internet Google bersama Sergey Brin. Sejak 4 April 2011, ia menjabat sebagai Chief Executive Officer/CEO di Google Inc. menggantikan Eric Schmidt."},
            {"Linus Torvalds", "Inventor Linux", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/LinuxCon_Europe_Linus_Torvalds_03_%28cropped%29.jpg/220px-LinuxCon_Europe_Linus_Torvalds_03_%28cropped%29.jpg",
                    "rekayasawan perangkat lunak Finlandia yang dikenal sebagai perintis pengembangan Kernel Linux. Ia sekarang bertindak sebagai koordinator proyek tersebut."},
            {"Jeff Bezos", "Founder Amazon", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Jeff_Bezos_at_Amazon_Spheres_Grand_Opening_in_Seattle_-_2018_%2839074799225%29_%28cropped%29.jpg/220px-Jeff_Bezos_at_Amazon_Spheres_Grand_Opening_in_Seattle_-_2018_%2839074799225%29_%28cropped%29.jpg",
                    "pengusaha terkaya di dunia sepanjang sejarah modern. Ia adalah pendiri, chairman, CEO, presiden dan pemilik saham mayoritas perusahaan teknologi terbesar di dunia Amazon.com. Kekayaan bersihnya US$ 165 miliar (sekitar Rp 2.500 triliun). "},
            {"Jack Ma", "Founder Alibaba", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Jack_Ma_2008.jpg/200px-Jack_Ma_2008.jpg",
                    "seorang pebisnis berkebangsaan Tionghoa. Dia merupakan pendiri sekaligus Chairman Eksekutif dari Alibaba Group, perusahaan e-commerce terbesar di Tiongkok. Dia merupakan warga China Daratan pertama yang pernah muncul di majalah Forbes dan terdaftar sebagai biliuner dunia. Pada 2015, ia masuk dalam daftar orang paling berpengaruh di dunia pada urutan ke-22."},
            {"Tim Berners-Lee", "Inventor WWW", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Tim_Berners-Lee_closeup.jpg/220px-Tim_Berners-Lee_closeup.jpg",
                    " penemu World Wide Web dan ketua World Wide Web Consortium, yang mengatur perkembangannya. Pada 1980, ketika masih seorang kontraktor bebas di CERN, Berners-Lee mengajukan sebuah proyek yang berbasiskan konsep hiperteks (hypertext) untuk memfasilitasi pembagian dan pembaharuan informasi di antara para peneliti. Dengan bantuan dari Robert Cailliau dia menciptakan sistem prototipe bernama Enquire."}
    };

    public static ArrayList<Tokoh> getListTokoh() {
        Tokoh tokoh = null;
        ArrayList<Tokoh> list = new ArrayList<>();
        for(int i=0; i<data.length; i++) {
            tokoh = new Tokoh();
            tokoh.setName(data[i][0]);
            tokoh.setRemarks(data[i][1]);
            tokoh.setPhoto(data[i][2]);
            tokoh.setDesc(data[i][3]);

            list.add(tokoh);
        }
        return list;
    }
}
