package com.example.submisiandroidpemula

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val INTENT_PARCELABLLE = "OBJECT INTENT"
    }


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moveProfile : ImageView = findViewById(R.id.img_profile)
        moveProfile.setOnClickListener(this)

        val imageList = listOf(
            Image(
                R.drawable.black_clover,
                "Black Clover",
                """Action, Comedy, Fantasy, Magic, Shounen""",
                "7.4",
                """
                    Asta dan Yuno ditinggalkan bersama di gereja yang sama dan sejak itu tak 
                    terpisahkan.Sebagai anak-anak mereka berjanji akan saling bersaing untuk 
                    melihat siapa yang akan menjadi Kaisar Magus berikutnya.
                """.trimIndent()),
            Image(
                R.drawable.hxh,
                "Hunter X Hunter",
                """Action, Adventure, Fantasy, Shounen, Super Power""",
                "9.09",
                """
                    Bercerita tentang keberadaan para Hunter yang bertugas menyelesaikan pekerjaan berbahaya 
                    seperti menangkap para penjahat dan berani mencari harta karun di wilayah yang belum dikenal.
                """.trimIndent()),
            Image(
                R.drawable.jujutsu_kaisen,
                "Jujutsu Kaisen",
                """Action, Demons, Horror, School, Shounen, Supernatural""",
                "8.6",
                """
                    Yuuji Itadori,seorang siswa SMA yang berbakat dalam olahraga khususnya lari.Namun,
                    ia tertarik dengan olahraga dan justru bergabung dengan Klub Penelitian Ilmu Gaib.
                    Hari - hari biasa yang seharusnya ia jalani berubah ketika roh yang sebenarnya muncul 
                    di sekolah.
                """.trimIndent()),
            Image(
                R.drawable.kimono_jihen,
                "Kimono Jihen",
                "Action, Shounen, Supernatural",
                "9.9",
                """
                    Inugami, seorang detektif dari Tokyo yang bertugas dalam hal ghaib, mendapatkan panggilan
                    untuk menyeledikinya. Sementara itu, ia berteman dengan seorang anak laki-laki aneh yang
                    bekerja setiap hari.
                """.trimIndent()),
            Image(
                R.drawable.nanatsu,
                "Nanatsu no Taizai",
                """Action, Adventure, Fantasy, Magic, Shounen, Supernatural""",
                "7.87",
                """
                    Nanatsu no Taizai, adalah sekelompok ksatria jahat yang bersengkongkol untuk menggulingkan 
                    kerajaan Britannia, yang isunya telah dihabisi oleh Holy Knight, meskipun beberapa orang 
                    menduga kalah mereka masih hidup.
                """.trimIndent()),
            Image(
                R.drawable.one_piece,
                "One Piece",
                "Action, Fantasy, Shounen, Comedy, Super Power",
                "9.9",
                """
                    Bercerita tentang seorang laki-laki bernama Monkey D.Luffy yang menentang arti dari 
                    gelar raja bajak laut.
                """.trimIndent()),
            Image(
                R.drawable.opm,
                "One Punch Man",
                "Action, Comedy, Sci-Fi, Seinen, Super Power",
                "9.9",
                """
                    bercerita tentang seorang pemuda bernama Saitama yang selalu bilang "biasa-biasa saja"
                    dengan wajah tak bersemangatnya,dengan kepala botak,dengan kekuatan fisiknya yang mengagumkan.
                """.trimIndent()),
            Image(
                R.drawable.tensura,
                "That Time I Got Reincarnated as Slime",
                """Fantasy, Shounen, Super Natural""",
                "9.9",
                """
                    Seorang pria berusia 37 tahun bernama Mikami Satoru terjebak dalam pekerjaanya yang
                    membosankan, dan dia tidak menikmati kehidupan duniawinya, tetapi setelah terbunuh 
                    di tangan seorang perampok, ia terbangun dan kembali mengulang dari awal di dunia fantasi.
                    Sebagai monster Slime dengan skill yang unik.
                """.trimIndent()),
            Image (
                R.drawable.mushoku_tensei,
                "Jobless Reincarnation",
                """Drama, Fantasy, Magic""",
                "8.4",
                """
                    Terbunuh saat menyelamatkan orang asing dari kecelakan di jalan, Seorang NEET berumur
                    34 tahun bereinkarnasi ke dunia shiri sebagai Rudeus Greyrat,bayi yang baru lahir.
                """.trimIndent()
            ),
            Image(
                R.drawable.aot,
                "Attack On Titan",
                """Action, Drama, Fantasy, Mystery, Shounen, Super Power""",
                "9.15",
                """
                    Setelah meraih kemenangan dari para titan, kebenaran di luar dinding dan identitas
                    dari para titan akhirnya terungkap. Sampai menyentuh titik tersebut,umat manusia telah
                    memberikan pengorbanan yang sangat besar.
                """.trimIndent()
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_anime)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this,imageList) {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLLE,it)
            startActivity(intent)
        }

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.img_profile -> {
                val moveIntent = Intent(this@MainActivity,ProfileActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

}