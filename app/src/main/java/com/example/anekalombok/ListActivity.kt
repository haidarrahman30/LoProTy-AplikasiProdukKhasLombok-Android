package com.example.anekalombok

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class ListActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_STATUS = "extra_status"
    }

    private lateinit var rvList: RecyclerView
    private var list1: ArrayList<Makanan> = arrayListOf()
    private var list2: ArrayList<Minuman> = arrayListOf()
    private var list3: ArrayList<Kerajinan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        supportActionBar?.elevation = 0f
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        rvList = findViewById(R.id.tv_item_name)
        rvList.setHasFixedSize(true)

        val status = intent.getIntExtra(EXTRA_STATUS , 0)
        var title: TextView = findViewById(R.id.list_title)

        list1.addAll(MakananData.listMakanan)
        list2.addAll(MinumanData.listMinuman)
        list3.addAll(KerajinanData.listKerajinan)
        when(status){
            1 -> {
                title.setText("Makanan")
                supportActionBar?.title = "List Makanan Lombok"
                showFoodList()
            }
            2 -> {
                title.setText("Minuman")
                supportActionBar?.title = "List Minuman Lombok"
                showMedList()
            }
            3 -> {
                title.setText("Kerajinan")
                supportActionBar?.title = "List Kerajinan Lombok"
                showSkincareList()
            }
        }

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Menambahkan Produk", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

    private fun showFoodList() {
        rvList.layoutManager = LinearLayoutManager (this)
        val listAdapter = MakananAdapter(list1)
        rvList.adapter = listAdapter
    }

    private fun showMedList() {
        rvList.layoutManager = LinearLayoutManager (this)
        val listAdapter2 = MinumanAdapter(list2)
        rvList.adapter = listAdapter2
    }

    private fun showSkincareList() {
        rvList.layoutManager = LinearLayoutManager (this)
        val listAdapter3 = KerajinanAdapter(list3)
        rvList.adapter = listAdapter3
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}