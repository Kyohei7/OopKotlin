package app

import data.Manusia


fun main() {

    // membuat objek manusia
    val saya = Manusia()
    // Memanipulasi Properties
    saya.namaDepan = "Muhammad"
    saya.namaBelakang = "Rizki"

    println(saya.namaDepan)
    println(saya.namaBelakang)

}