package com.example.anekalombok

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class CategoriesActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories2)
        supportActionBar?.elevation = 0f
        supportActionBar?.title = "Categories"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val cvFood: CardView = findViewById(R.id.cv_makanan)
        val cvMedicine: CardView = findViewById(R.id.cv_minuman)
        val cvSkincare: CardView = findViewById(R.id.cv_kerajinan)

        cvFood.setOnClickListener(this)
        cvMedicine.setOnClickListener(this)
        cvSkincare.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.cv_makanan -> {
                val foodIntent = Intent(this@CategoriesActivity, ListActivity::class.java)
                foodIntent.putExtra(ListActivity.EXTRA_STATUS, 1)
                startActivity(foodIntent)
            }
            R.id.cv_minuman -> {
                val medicIntent = Intent(this@CategoriesActivity, ListActivity::class.java)
                medicIntent.putExtra(ListActivity.EXTRA_STATUS, 2)
                startActivity(medicIntent)
            }
            R.id.cv_kerajinan -> {
                val scareIntent = Intent(this@CategoriesActivity, ListActivity::class.java)
                scareIntent.putExtra(ListActivity.EXTRA_STATUS, 3)
                startActivity(scareIntent)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

