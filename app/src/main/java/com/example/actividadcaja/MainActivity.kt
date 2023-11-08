package com.example.actividadcaja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TITULO DE LA APP
        val TextTitulo = findViewById<TextView>(R.id.txtTitulo)
        TextTitulo.text = getString(R.string.titulo_app)

        //BOLETA TEXTVIEWS
        val TextTituloBoleta = findViewById<TextView>(R.id.txtTituloBoleta)
        val TextSol = findViewById<TextView>(R.id.txtSol)
        val TextMenos = findViewById<TextView>(R.id.txtMenos)
        val TextMontoSinDescuentoLabel = findViewById<TextView>(R.id.txtMontoSinDescuentoLabel)
        val TextMontoSinDescuento = findViewById<TextView>(R.id.txtMontoSinDescuento)
        val TextMontoConDescuentoLabel = findViewById<TextView>(R.id.txtMontoConDescuentoLabel)
        val TextMontoConDescuento = findViewById<TextView>(R.id.txtMontoConDescuento)
        val TextIgvLabel = findViewById<TextView>(R.id.txtIgvLabel)
        val TextIgv = findViewById<TextView>(R.id.txtIgv)
        val TextMontoFinalLabel = findViewById<TextView>(R.id.txtMontoFinalLabel)
        val TextMontoFinal = findViewById<TextView>(R.id.txtMontoFinal)
        val TextSolfinal = findViewById<TextView>(R.id.txtSolFinal)

        val TextDescuentoLabel = findViewById<TextView>(R.id.txtDescuentoLabel)
        val TextDescuento = findViewById<TextView>(R.id.txtDescuento)

        val EditProducto = findViewById<EditText>(R.id.txtProducto)
        val EditCantidad = findViewById<EditText>(R.id.txtCantidad)
        val BtnPagar = findViewById<Button>(R.id.btnPagar)




        BtnPagar.setOnClickListener{

            TextTituloBoleta.text = "Boleta de venta"
            TextSol.text = "S/"
            TextMenos.text = "-"
            TextMontoSinDescuentoLabel.text = "Monto sin descuento:"
            TextMontoConDescuentoLabel.text = "Monto con descuento:"
            TextIgvLabel.text = "IGV (18%):"
            TextMontoFinalLabel.text = "Total:"
            TextSolfinal.text = "S/"

            //Variables que cambiaran su valor
            var MontoOriginal: Double = 0.0
            var PrecioIgv: Double = 0.0
            var PrecioDescuento: Double = 0.0
            var MontoDescuento: Double = 0.0
            var MontoFinal: Double = 0.0

            val igv = 0.18

            //CONDICIONAL PARA EL ZAPATO
            if (EditProducto.text.trim().toString().toLowerCase() == "zapato" || EditProducto.text.trim().toString().toLowerCase() == "zapatos"){

                MontoOriginal = EditCantidad.text.toString().toDouble()

                if (MontoOriginal > 1000){
                    TextDescuentoLabel.text = "Descuento (-10%):"
                    PrecioDescuento = MontoOriginal * 0.10
                    MontoDescuento = MontoOriginal - PrecioDescuento
                    PrecioIgv = (MontoOriginal - PrecioDescuento) * igv

                }else{

                    TextDescuentoLabel.text = "Descuento (0%):"
                    MontoDescuento = MontoOriginal
                    PrecioIgv = MontoOriginal * 0.18

                }
            //CONDICIONAL PARA LAS PRENDAS PARA DAMAS
            }else if(EditProducto.text.trim().toString().toLowerCase() == "prenda para dama" || EditProducto.text.trim().toString().toLowerCase() == "ropa de mujeres"){

                MontoOriginal = EditCantidad.text.toString().toDouble()

                if (MontoOriginal > 500){

                    TextDescuentoLabel.text = "Descuento (18%):"
                    PrecioDescuento = MontoOriginal * 0.18
                    MontoDescuento = MontoOriginal - PrecioDescuento
                    PrecioIgv = (MontoOriginal - PrecioDescuento) * igv

                }else{

                    TextDescuentoLabel.text = "Descuento (0%):"
                    MontoDescuento = MontoOriginal
                    PrecioIgv = MontoOriginal * 0.18

                }
            //CONDICIONAL PARA ELECTRODOMESTICOS
            }else if(EditProducto.text.trim().toString().toLowerCase() == "electrodomestico" || EditProducto.text.trim().toString().toLowerCase() == "electrodomesticos"){

                MontoOriginal = EditCantidad.text.toString().toDouble()

                if (MontoOriginal > 6000){

                    TextDescuentoLabel.text = "Descuento (7%):"
                    PrecioDescuento = MontoOriginal * 0.07
                    MontoDescuento = MontoOriginal - PrecioDescuento
                    PrecioIgv = (MontoOriginal - PrecioDescuento) * igv

                }else{
                    TextDescuentoLabel.text = "Descuento (0%):"
                    MontoDescuento = MontoOriginal
                    PrecioIgv = MontoOriginal * 0.18
                }

            //CONDICIONAL PARA CELULARES
            }else if(EditProducto.text.trim().toString().toLowerCase() == "celular" || EditProducto.text.trim().toString().toLowerCase() == "celulares"){

                MontoOriginal = EditCantidad.text.toString().toDouble()

                if (MontoOriginal > 3500){

                    TextDescuentoLabel.text = "Descuento (9%):"
                    PrecioDescuento = MontoOriginal * 0.09
                    MontoDescuento = MontoOriginal - PrecioDescuento
                    PrecioIgv = (MontoOriginal - PrecioDescuento) * igv

                }else{
                    TextDescuentoLabel.text = "Descuento (0%):"
                    MontoDescuento = MontoOriginal
                    PrecioIgv = MontoOriginal * 0.18
                }

            //CONDICIONAL PARA ROPA PARA CABALLERO
            }else if(EditProducto.text.trim().toString().toLowerCase() == "ropa de hombres" || EditProducto.text.trim().toString().toLowerCase() == "ropa para caballeros"){

                MontoOriginal = EditCantidad.text.toString().toDouble()

                if (MontoOriginal > 1500){

                    TextDescuentoLabel.text = "Descuento (5%):"
                    PrecioDescuento = MontoOriginal * 0.05
                    MontoDescuento = MontoOriginal - PrecioDescuento
                    PrecioIgv = (MontoOriginal - PrecioDescuento) * igv

                }else{
                    TextDescuentoLabel.text = "Descuento (0%):"
                    MontoDescuento = MontoOriginal
                    PrecioIgv = MontoOriginal * 0.18
                }

            //CONDICIONAL PARA JUGUETES PARA NIÑO
            }else if(EditProducto.text.trim().toString().toLowerCase() == "juguetes" || EditProducto.text.trim().toString().toLowerCase() == "juguetes para ninos"){

                MontoOriginal = EditCantidad.text.toString().toDouble()

                if (MontoOriginal > 2500){

                    TextDescuentoLabel.text = "Descuento (13%):"
                    PrecioDescuento = MontoOriginal * 0.13
                    MontoDescuento = MontoOriginal - PrecioDescuento
                    PrecioIgv = (MontoOriginal - PrecioDescuento) * igv

                }else{
                    TextDescuentoLabel.text = "Descuento (0%):"
                    MontoDescuento = MontoOriginal
                    PrecioIgv = MontoOriginal * 0.18
                }


            }else if(EditProducto.text.trim().toString().toLowerCase() == "laptops" || EditProducto.text.trim().toString().toLowerCase() == "laptop"){

                MontoOriginal = EditCantidad.text.toString().toDouble()

                if (MontoOriginal > 8000){

                    TextDescuentoLabel.text = "Descuento (19%):"
                    PrecioDescuento = MontoOriginal * 0.19
                    MontoDescuento = MontoOriginal - PrecioDescuento
                    PrecioIgv = (MontoOriginal - PrecioDescuento) * igv

                }else{
                    TextDescuentoLabel.text = "Descuento (0%):"
                    MontoDescuento = MontoOriginal
                    PrecioIgv = MontoOriginal * 0.18
                }
            } else{
                MontoOriginal = EditCantidad.text.toString().toDouble()
                PrecioDescuento = MontoOriginal * 0
                TextDescuentoLabel.text = "Descuento (0%):"
                MontoDescuento = MontoOriginal
                PrecioIgv = MontoOriginal * 0.18
            }

            MontoFinal = MontoDescuento + PrecioIgv
            TextMontoSinDescuento.text = String.format("%.2f", MontoOriginal)
            TextDescuento.text = String.format("%.2f", PrecioDescuento)
            TextMontoConDescuento.text = String.format("%.2f", MontoDescuento)
            TextIgv.text = String.format("%.2f", PrecioIgv)
            TextMontoFinal.text = String.format("%.2f", MontoFinal)


        }




    }
}