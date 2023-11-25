package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class carritoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_rv_carro_compras)

        val producto: Parcelable? = intent.getParcelableExtra("producto")

        // Hacer algo con el producto recibido, por ejemplo, mostrar detalles en la interfaz de usuario
        if (producto != null) {

        }
    }
}



