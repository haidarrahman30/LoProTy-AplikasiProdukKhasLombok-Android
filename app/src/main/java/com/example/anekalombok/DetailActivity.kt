package com.example.anekalombok

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    private var listMakanan: ArrayList<Makanan> = arrayListOf()
    private var listMinuman: ArrayList<Minuman> = arrayListOf()
    private var listKerajinan: ArrayList<Kerajinan> = arrayListOf()

    companion object{
        const val EXTRA_CATEGORY = "extra_category"
        const val EXTRA_POSITION = "extra_position"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.elevation = 0f
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val category = intent.getStringExtra(EXTRA_CATEGORY)
        val position = intent.getIntExtra(EXTRA_POSITION, 0)

        val tvTitleName: TextView = findViewById(R.id.tv_item_name)
        val imgItem: ImageView = findViewById(R.id.img_item_photo)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)

        when(category){
            "Makanan" -> {
                supportActionBar?.title = "Detail Makanan"
                listMakanan.addAll(MakananData.listMakanan)

                tvTitleName.setText(listMakanan[position].name)
                imgItem.setImageResource(listMakanan[position].photo)
                tvDetail.setText(listMakanan[position].detail)
            }
            "Minuman" -> {
                supportActionBar?.title = "Detail minuman"
                listMinuman.addAll(MinumanData.listMinuman)

                tvTitleName.setText(listMinuman[position].name)
                imgItem.setImageResource(listMinuman[position].photo)
                tvDetail.setText(listMinuman[position].detail)
            }
            "Kerajinan" -> {
                supportActionBar?.title = "Detail Kerajinan"
                listKerajinan.addAll(KerajinanData.listKerajinan)

                tvTitleName.setText(listKerajinan[position].name)
                imgItem.setImageResource(listKerajinan[position].photo)
                tvDetail.setText(listKerajinan[position].detail)

            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}