package com.example.simpleadapter

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var listview : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listview = findViewById(R.id.listview)
        val produits  = listOf(
            mapOf("name" to "produit1", "prix" to 100.0),
            mapOf("name" to "produit2", "prix" to 190.0),
            mapOf("name" to "produit3", "prix" to 90.0),
            mapOf("name" to "produit4", "prix" to 100.0),
            mapOf("name" to "produit5", "prix" to 190.0),
            mapOf("name" to "produit6", "prix" to 90.0)
        )

        val adapter = SimpleAdapter(this, produits, R.layout.layout_item,
            arrayOf("name", "prix"), intArrayOf(R.id.nom, R.id.prix)
        )
        listview.adapter = adapter
    }
}