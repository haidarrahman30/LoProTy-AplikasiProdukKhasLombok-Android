package com.example.anekalombok

object KerajinanData {
    private val kerajinanNames = arrayOf("Kain Songket",
        "Gerabah",
        "Berugak",
        "Kerajinan Tereng",
        "Kerajinan Keramik")

    private val kerajinanDetails = arrayOf("Songket ditenun dengan tangan menggunakan benang emas dan perek, pada umunya songket dikenakan pada acara-acara resmi. Kata “songket” berasal dari istilah kata “sungkit” dalam bahasa Melayu dan bahasa Indonesia, yang berarti “mengait” atau “mencungkil”. Hal ini berkaitan dengan metode pembuatannya : mengaitkan dan mengambil sejumput kain tenun, kemudian menyelipkan benang emas. ",
        "Kerajinan ini berupa kerajinan mempunyai anyaman dari tanah liat atau tanah malit yang dilakukan oleh sekelompok warga desa Banyumulek Lombok Barat kerajinan ini banyak mendapatkan pesanan baik dari luar negeri atau untuk kebutuhan warga lokal baik itu untuk perhotelan atau juga untuk kebutuhan rumah tangga sebagai furniture atau kelengkapan rumah.",
        "Kerajinan ini adalah bentuk dari penjilmaan kerajinan berupa rumah adat tetapi dalam bentuk yang minimalis, pembuatnnya dibutuhkan hingga berbulan-bulan, dengan patokan kayu dan bahan yang cukup besar dan rumit.",
        "Kerajinan furnitur ini dapat kita temukan di desa Beleke Lombok Tengah dan kebanyakan kerajinan ini mendapat pesanan dari Pulau Dewata Bali dan sebagian lagi dipakai untuk perlengkapan rumah untuk pemasaran lokal saja",
        "Kerajinan ini berupa kerajinan mempunyai anyaman dari tanah liat atau tanah malit yang dilakukan oleh sekelompok warga desa Banyumulek Lombok Barat kerajinan ini banyak mendapatkan pesanan baik dari luar negeri atau untuk kebutuhan warga lokal baik itu untuk perhotelan atau juga untuk kebutuhan rumah tangga sebagai furniture atau kelengkapan rumah dengan bahan keramik yang begitu banyak memiliki variasi.")

    private val kerajinanImages = intArrayOf(R.drawable.songket,
        R.drawable.gerabah,
        R.drawable.berugak,
        R.drawable.bambu,
        R.drawable.keramik)

    val listKerajinan: ArrayList<Kerajinan>
        get() {
            val list = arrayListOf<Kerajinan>()
            for (position in kerajinanNames.indices) {
                val Kerajinan = Kerajinan()
                Kerajinan.name = kerajinanNames[position]
                Kerajinan.detail = kerajinanDetails[position]
                Kerajinan.photo = kerajinanImages[position]
                list.add(Kerajinan)
            }
            return list
        }
}