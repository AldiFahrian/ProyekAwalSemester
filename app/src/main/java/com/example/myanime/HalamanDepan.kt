package com.example.myanime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HalamanDepan : AppCompatActivity() {

    companion object{
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_depan)

        val animeList = listOf(
            Anime(
                R.drawable.chainsawman,
                "Chainsaw-Man",
                "Chainsaw Man menceritakan tentang seorang pemuda yang bernama Denji. Denji hidup bersama dengan Pochita, sang iblis dengan gergaji mesin. Kehidupan Denji sangat miris karena selain miskin dia juga harus melunasi hutang peninggalan orang tuanya. Suatu ketika ada kejadian yang membuat Denji terbunuh"
            ),
            Anime(
                R.drawable.classroomelite,
                "Classroom of the Elite",
                "Classroom of The Elite mengisahkan tentang seorang siswa bernama Kiyotaka yang masuk sebuah sekolah elit dan prestisius. Namun, sialnya dia masuk ke kelas D, di mana isinya adalah anak-anak nakal dan berandal. Kiyotaka tidak menyukai teman-teman kelasnya, hingga dia bertemu dengan Suzune Horikita dan Kikyo Kushida"
            ),
            Anime(
                R.drawable.mushokutensei,
                "Mushoku Tensei",
                "Berawal dari seorang pria berusia 34 tahun di Jepang yang tidak diketahui namanya diusir dari rumah setelah kematian orang tuanya. Mirisnya, ia tidak sedang mengenyam pendidikan atau pun tidak memiliki pekerjaan. \n" +
                        "\n" +
                        "Setelah berkaca, dengan melihat seperti apa keadaannya sendiri, ia menyimpulkan bahwa kehidupan yang dijalani pada akhirnya hanya sia-sia dan tidak ada gunanya. Namun demikian, ia selalu mencoba untuk melakukan hal yang berguna bagi dirinya. \n" +
                        "\n" +
                        "Lalu, ia mencoba untuk mencegat truk yang sedang melaju menuju sekelompok remaja dan mencoba melakukan hal yang sangat berarti dalam hidupnya. Akhirnya ia berhasil menyelamatkan salah satu dari mereka, tetapi, sayangnya pada akhirnya ia meninggal.\n" +
                        "\n" +
                        "Sangat menarik sekali ternyata kehidupan pria ini masih belum berakhir, ia tiba-tiba terbangun dalam tubuh bayi. Ia pun sadar bahwa dirinya telah bereinkarnasi ke dunia pedang dan sihir. Ia pun berpikir karena melihat kehidupan sebelumnya yang gagal, ia memutuskan untuk menjadi sukses di kehidupan barunya ini.\n" +
                        "\n" +
                        "Dalam kehidupan barunya tersebut, ia dipanggil dengan nama Rudeus Greyrat. \n" +
                        "\n" +
                        "Lantas, seperti apa kehidupan baru Rudeus Greyrat di dunia pedang dan sihir? "
            ),
            Anime(
                R.drawable.jujutsu,
                "Jujutsu Kaisen",
                "Jujutsu Kaisen bercerita tentang Yuji Itadori yang menjadi murid SMA karena sebuah kejadian. Iseng-iseng melakukan aktivitas melakukan aktivitas paranormal tanpa dasaar dengan klub gaib, siswa sekolah menengah Yuuji Itadori menghabiskan hari-harinya di ruang klub atau rumah sakit, dimana dia mengunjungi kakeknya yang terbaring di tempat tidur.\n" +
                        "\n" +
                        "Namun, gaya hidup santai ini segera berubah menjadi aneh ketika dia tanpa sadar menemukan barang terkutuk. Yuuji menemukan rangkaian kejadian supernatural. Yuuji menemukan dirinya tiba-tiba terdorong ke dunia kutukan."
            ),
            Anime(
                R.drawable.tokyo,
                "Tokyo Revengers",
                "Tokyo Revengers mengawali kisah dari sosok remaja SMP bernama Hanagaki Takemichi yang saat itu menjalani kehidupan sempurna.\n" +
                        "Baginya masa-masa SMP adalah fase hidup paling indah. Ia memiliki kekasih cantik yaitu Tachibana Hinata dan ada juga teman-teman sebaya yang hebat mengelilinginya.\n" +
                        "\n" +
                        "Tak hanya itu, masa sekolah Hanagaki sangat penuh warna dan hampir selalu berbahagia setiap waktu. Tapi setelah lulus sekolah, Hanagaki seakan bukan siapa-siapa lagi bahkan nasibnya sangat malang.\n" +
                        "\n" +
                        "Kehidupan Hanagaki berubah drastis menjadi pemuda berusia dewasa namun payah, pecundang, dan tidak memiliki tujuan hidup jelas.\n" +
                        "\n" +
                        "Hanagaki pun kerap membandingkan takdir hidupnya dengan teman-teman lain karena dianggap lebih beruntung daripada dirinya."
            ),
            Anime(
                R.drawable.dressup,
                "My DressUp Darling",
                "Wakana Gojo adalah siswa sekolah menengah tahun pertama yang bermimpi menjadi pengrajin boneka hina. Suatu hari selama semester pertamanya, teman sekelasnya yang populer Marin Kitagawa melihatnya membuat kostum boneka di ruang jahit sekolah.\n" +
                        "\n" +
                        "Kitagawa, yang ingin cosplay untuk sementara waktu dan telah mengamati keterampilan Goj dalam menjahit, memintanya untuk membuat kostum karakter dari video game yang dia kagumi. Terlepas dari kenyataan bahwa Goj tidak memiliki pengalaman membuat kostum dalam skala manusia, ia terinspirasi oleh keuletan Kitagawa dan setuju untuk membuatnya untuknya.\n" +
                        "\n"
            ),
            Anime(
                R.drawable.hero,
                "Boku No Hero Academia",
                "Deku adalah seorang pemuda yang hidup di dunia istimewa karena setiap orang memiliki kekuatan super atau disebut Quirk.\n" +
                        "\n" +
                        "Sebagian besar dari mereka juga telah menjadi seorang pahlawan super dengan kekuatan yang dimiliki. Sayangnya, walaupun berasal dan tinggal di tempat yang sama, Deku punya nasib berbeda. Ia terlahir tanpa kekuatan atau Quirk apa pun, membuatnya sulit mencapai mimpi untuk menjadi pahlawan nomor satu. Selain tidak memiliki kekuatan, Deku juga dikenal sebagai pemuda dengan tubuh yang lemah. \n" +
                        "\n" +
                        "Demi bisa menggapai impiannya menjadi seorang pahlawan, Deku pun berniat untuk menemui All Might.\n" +
                        " \n" +
                        "Sesaat setelah bertemu, All Might melihat bahwa Deku dapat menjadi sosok pahlawan yang baik.\n"
            ),
            Anime(
                R.drawable.titan,
                "Attack On Titan",
                "bercerita tentang umat manusia yang dibantai sejak berabad-abad yang lalu hingga hampir punah oleh makhluk mengerikan menyerupai manusia yang disebut Titan. Hal ini memaksa manusia untuk bersembunyi dan diam dalam ketakutan di balik tembok konsentris yang sangat tinggi dan besar.\n" +
                        "\n" +
                        "Wujud Titan mirip dengan manusia pada umumnya, hanya saja ukurannya bagai raksasa dan gaya berjalan atau larinya yang tidak normal. Hal lainnya yang membuat Titan benar-benar mengerikan adalah bahwa nafsu mereka terhadap daging manusia tidak muncul dari rasa lapar, tetapi hanya seperti kesenangan membunuh semata atau obsesi yang muncul begitu saja setiap melihat manusia.\n" +
                        "\n" +
                        "Manusia yang tersisa dari ancaman kepunahan mulai menjalankan berbagai hal demi kelangsungan hidupnya dalam penghalang pertahanan agar keberadaannya tidak terdeteksi oleh Titan. Hal ini berhasil membuat mereka terjaga dari kontak dengan Titan selama seratus tahun. Namun, upaya dan ketenangan mereka berakhir ketika Titan Kolosal menembus tembok luar pertahanan pertama yang seharusnya tidak tertembus."
            ),
            Anime(
                R.drawable.tensura,
                "Tensei shitara slime",
                "Tensei Shitara Slime Datta Ken atau disingkat Tensura bercerita tentang seorang pria pekerja kantoran yang bernama Satoru Mikami yang bereinkarnasi sebagai slime setelah terbunuh oleh seorang kriminal. Di dunia baru tersebut, slime tersebut bertemu seekor naga bernama Veldora dan menjalin persahabatan."
            ),
            Anime(
                R.drawable.ousama,
                "Ousama Rangking",
                "Ousama Ranking menceritakan tentang seorang pangeran muda bernama Bojji yang terlahir tuli dan bisu. Dikarenakan kekurangan Pangeran Bojji, banyak orang yang memandang rendah dirinya dan menganggap tidak pantas menjadi seorang penerus raja."
            // menampilkan film anime di list, nameanime untuk judul film, descanime untuk sinopsis, drawable untuk gambar film
            )

        )
    // pada baris anime,name aniime, des

        val recyclerView = findViewById<RecyclerView>(R.id.rv_anime)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = AnimeAdapter (this, animeList){
            val intent = Intent (this, DetailAnime::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
            //disini menggunakan recycleviewer yaitu agar halaman dapat di scroll keatas dan kebawah
        }
    }
}

