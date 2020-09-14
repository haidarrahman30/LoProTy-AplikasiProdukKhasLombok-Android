package com.example.anekalombok

object MinumanData {
    private val minumanNames = arrayOf("Brem",
        "Bubur Reket",
        "Tuak Manis",
        "Es Sarang Burung",
        "Kopi Lombok",
        "Serbat Jahe")

    private val minumanDetails = arrayOf("Brem ialah minuman khas lombok yang terbuat dari ketan yang sudah difermentasi, minuman ini sering disajikan pada acara adat yang dimana minuman ini mudah ditemui di pedagang kaki lima di sekitaran lombok. ",
        "Bubur reket merupakan minuman asal lombok tengah yang dimana proses pembuatannya menggukanakan ketan hitam dan diberi kuah santan serta gula merah cair kerap disajikan saat makan-makan oleh masyarakat lombok tengah",
        "Tuak Manis khas lombok ini adalah minuman yang terbuat dari pohon aren yang sudah disadap untuk mendapatkan air berwarna putih yang bertekstur kental, rasanya manis juga menyegarkan, minuman ini banyak ditemukan di pedagang kaki lima di kawasan pusuk",
        "Es Sarang burung ini adalah minuman yang sangat menyegarkan yang paling banyak diburu oleh wisatawan untuk menyegarkan tubuh di panasnya siang terik matahari, yang dimana harga minuman ini terbilang murah dan tidak menguras kantong",
        "Kopi Lombok ini benar-benar kopi yang lombok banget dimana kopi ini diracik dengan cara dari suku sasak sendiri yang dimana memiliki rasa yang begitu memikat dan disukai semua kalangan anak muda hingga dewasa",
        "Minuman ini bernama serbat jahe yang dimana minuman ini terbilang sangat bersahabat untuk tenggorokan yang sangat cocok disantap saat menghangatkan badan dan dinikmati bersama kawan-kawan seperjuangan.")

    private val minumanImages = intArrayOf(R.drawable.brem,
        R.drawable.reket,
        R.drawable.tuak,
        R.drawable.burung,
        R.drawable.kopi,
        R.drawable.jahe)

    val listMinuman: ArrayList<Minuman>
    get() {
        val list = arrayListOf<Minuman>()
        for (position in minumanNames.indices) {
            val Minuman = Minuman()
            Minuman.name = minumanNames[position]
            Minuman.detail = minumanDetails[position]
            Minuman.photo = minumanImages[position]
            list.add(Minuman)
        }
        return list
    }
}