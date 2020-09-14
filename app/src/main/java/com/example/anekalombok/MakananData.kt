package com.example.anekalombok

object MakananData {
    private val makananNames = arrayOf("Pelecing Kangkung",
        "Ayam Taliwang",
        "Sate Bulayak",
        "Nasi Balap Puyung",
        "Ares",
        "Sate Rembiga",
        "Sate Tanjung",
        "Jaje Tujak",
        "Beberuk Terong ",
        "Bebalung")

    private val makananDetails = arrayOf("Siapa yang belum tahu plecing kangkung? Makanan khas Lombok ini berupa olahan tanaman air ini begitu populer di setiap rumah makan di Lombok. Rasanya belum ke Lombok jika belum makan kuliner Lombok yang satu ini.\n" +
            "\n" +
            "Memang tampilannya sederhana, namun rasarnya luar biasa. Paduan cabai rawit, garam, tomat dan terasinya begitu menggetarkan lidah. Setiap orang yang memakannya pasti menangis nikmat karena sensai pedasnya.\n" +
            "\n" +
            "Plecing kangkung ini jelas sangat sehat dan membantu kesuburan karena ditambahkan tauge dan taburan kacang goreng untuk menambahkan rasa gurihnya.",
        "Ayam Taliwang sudah pasti makanan khas Lombok yang paling populer. Cobalah ayam Taliwang bakar. Wuiih rasanya pedas maknyus banget. Selain bisa dibakar, ayam Taliwang juga bisa disajikan dengan cara digoreng.\n" +
                "\n" +
                "Ayam kampung yang dipilih merupakan ayam yang masih muda sehingga dagingnya sangat empuk dan mudah sekali di lepaskan dari tulang-tulangnya. Sensasi makanan pedas memang surganya kuliner di Lombok.",
        "Sate bulayak ini hampir sama dengan sate Madura lainnya. Yang membedakan terletak pada lontong yang disajikan.\n" +
                "\n" +
                "Keunikan sate Bulayak karena lontongnya dibungkus dengan menggunakan daun aren dengan bentuk spiral. Cara membukanya pun unik karena harus mengikuti ulir daun arennya.",
        "Sekali mencoba rasanya kalian akan ketagihan untuk mencoba dan mencobanya lagi. Itulah nasi balap puyung. Sekali lagi sensai pedasnya yang menjadikan selera makan bertambah dan ingin nambah. Dengan topping ayam suwir, dipadukan dengan cabai, kacang kedelai, taburan rebon kering, abon dan lauk belut menjadikan paket nasi balap puyung ini juara. Waduh sampe ngiler deh dibuatnya. Air liur kalian bakal bercucuran mengingatnya",
        "Makanan khas lokal ini benar-benar mengingatkan kita pada orang tua zaman dahulu kala. Sebabnya bahan utama Ares adalah pelepah pisang. Ya, pelepah pisang yang masih muda ini diolah menjadi makanan yang enak.",
        " Sate Rembiga ini memiliki rasa yang unik, mulai dari manis, gurih dan utamanya pedas. Nama Rembiga berasal dari nama sebuah Desa Rembiga. Karena sangat laris dan populer sampai sekarang dikenal dengan nama Sate Rembiga.",
        "Sate Tanjung biasanya dinikmati selagi masih panas dan didampingi dengan lontong atau nasi. Keduanya sama-sama memberikan kenikmatan tersendiri dalam menikmati sate ikan Cakalang Lombok.",
        "Poteng Jaje Tujak ini diolah dengan campuran daun suji dan pandan. Makanan khas Lombok yang satu ini termasuk langka karena hanya disajikan pada saat hari raya saja.",
        "Bahan utamanya memang menggunakan terong ungu yang sudah dipotong-potong dan dicampur dengan tomat serta beberapa bumbu rempah lainnya. Nah, setelah ditambah dan dicampur kemudian terong dan taburan bumbu rempah ini ditambahkan kesegaran air jeruk limau.",
        "Penamaan bebalung mungkin sudah lekat dengan tulang. Iya, bahan utama kuliner ini adalah tulang iga sapi atau kerbau yang dibumbui dengan cabe rawit, bawang putih, bawang merah, lengkuas dan kunyit ditambahkan juga jahe.")

    private val makananImages = intArrayOf(R.drawable.pelecing,
        R.drawable.ayam_taliwang,
        R.drawable.sate_bulayak,
        R.drawable.puyung,
        R.drawable.ares,
        R.drawable.rembige,
        R.drawable.tanjung,
        R.drawable.poteng,
        R.drawable.beberuk,
        R.drawable.bebalung)

    val listMakanan: ArrayList<Makanan>
        get() {
            val list = arrayListOf<Makanan>()
            for (position in makananNames.indices) {
                val Makanan = Makanan()
                Makanan.name = makananNames[position]
                Makanan.detail = makananDetails[position]
                Makanan.photo = makananImages[position]
                list.add(Makanan)
            }
            return list
        }
}