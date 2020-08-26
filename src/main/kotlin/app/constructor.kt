package app

import data.Alamat

fun main() {

    val rumah = Alamat("Kalibata", "Jakarta")
    println(rumah.nama)
    println(rumah.kota)
    println(rumah.negara)

}