# 𝗟𝗮𝘆𝗼𝘂𝘁

### 𝗔𝗽𝗮 𝗶𝘁𝘂 𝗟𝗮𝘆𝗼𝘂𝘁?

𝗟𝗮𝘆𝗼𝘂𝘁 𝗺𝗲𝗿𝘂𝗽𝗮𝗸𝗮𝗻 𝘀𝘂𝗮𝘁𝘂 𝘁𝗮𝗺𝗽𝗶𝗹𝗮𝗻 𝘁𝗮𝘁𝗮 𝗹𝗲𝘁𝗮𝗸 𝗱𝗶 𝗔𝗻𝗱𝗿𝗼𝗶𝗱 𝘂𝗻𝘁𝘂𝗸 𝗺𝗲𝗻𝗴𝗮𝘁𝘂𝗿 𝗽𝗲𝗻𝗲𝗺𝗽𝗮𝘁𝗮𝗻 𝘁𝗲𝗸𝘀, 𝗴𝗮𝗺𝗯𝗮𝗿, 𝗮𝘁𝗮𝘂𝗽𝘂𝗻 𝗸𝗼𝗺𝗽𝗼𝗻𝗲𝗻 𝗹𝗮𝗶𝗻𝗻𝘆𝗮 𝘀𝗲𝗵𝗶𝗻𝗴𝗴𝗮 𝘁𝗮𝗺𝗽𝗶𝗹𝗮𝗻 𝗽𝗮𝗱𝗮 𝗮𝗽𝗹𝗶𝗸𝗮𝘀𝗶 𝘆𝗮𝗻𝗴 𝗱𝗶𝗯𝘂𝗮𝘁 𝘁𝗲𝗿𝗹𝗶𝗵𝗮𝘁 𝗿𝗮𝗽𝗶𝗵 𝗱𝗮𝗻 𝗻𝘆𝗮𝗺𝗮𝗻 𝘂𝗻𝘁𝘂𝗸 𝗱𝗶𝗹𝗶𝗵𝗮𝘁 𝗼𝗹𝗲𝗵 𝗽𝗲𝗻𝗴𝗴𝘂𝗻𝗮.


### 𝗝𝗲𝗻𝗶𝘀 𝗱𝗮𝗻 𝗙𝘂𝗻𝗴𝘀𝗶 𝗟𝗮𝘆𝗼𝘂𝘁:

- [x] 𝗟𝗶𝗻𝗲𝗮𝗿 𝗟𝗮𝘆𝗼𝘂𝘁
> Linear Layout adalah layout yang menyejajarkan semua child view-nya dalam satu arah, secara vertikal atau horizontal. Anda bisa menetapkan arah layout dengan atribut android:orientation.
>>> Semua anak LinearLayout akan ditumpuk satu sama lain, jadi daftar vertikal hanya akan memiliki satu anak per baris, seberapa pun lebarnya, dan daftar horizontal hanya akan setinggi satu baris (tinggi anak yang tertinggi, ditambah pengisi). LinearLayout akan mengikuti margin antara anak dan gravity (sejajar kanan, tengah, atau kiri) setiap anak.

- [x] 𝗥𝗲𝗹𝗮𝘁𝗶𝘃𝗲 𝗟𝗮𝘆𝗼𝘂𝘁
> Relative Layout adalah layout yang penataan nya ini adalah penataan yang menempatkan widget-widget didalamnya seperti layer, sehingga sebuah widget dapat berada di atas/di bawah widget lainnya atau dengan kata lain Relative merupakan layout yang penataannya lebih bebas (Relative) sehingga bisa di tata di mana saja. 
>>> Jadi dapat diartikan bahwa Relative Layout adalah desain tampilan pada aplikasi dengan tata letak objek atau komponen secara bebas tanpa aturan sesuai orientasi (horizontal atau vertical) seperti yang diterapkan pada Linear Layout.

- [x] 𝗖𝗼𝗻𝘀𝘁𝗿𝗮𝗶𝗻𝘁 𝗟𝗮𝘆𝗼𝘂𝘁
>  Constraint Layout mirip dengan Relative Layout, karena letak View bergantung pada View lain dalam satu Layout ataupun dengan Parent Layoutnya. Contohnya di Relative Layout kita bisa meletakkan sebuah View di atas, bawah, atau samping View lain. Kita juga dapat mengatur posisinya berdasarkan Parent Layout menggunakan tag seperti centerVertical, alignParentBottom, dll. Akan tetapi, Constraint Layout jauh lebih fleksibel dan lebih mudah digunakan di Layout Editor.
>>> Pada Constraint Layout, setiap View memiliki tali (Constraint) yang menarik tiap sisinya, yang mana tali tersebut bisa kita atur Elastisitas, Margin, dsb. Tali tersebut wajib kita “ikatkan” kepada anchor point atau suatu titik yang dapat berupa sisi dari Parent Layout, View lain, ataupun titik bantu (helper) yang bisa kita buat sendiri.


### 𝗼𝗻𝗖𝗿𝗲𝗮𝘁𝗲() 𝗱𝗮𝗻 𝗼𝗻𝗣𝗮𝘂𝘀𝗲()

- [x] 𝗼𝗻𝗖𝗿𝗲𝗮𝘁𝗲()
Metode onCreate() menunjukkan penyiapan dasar untuk aktivitas, seperti mendeklarasikan antarmuka pengguna (didefinisikan dalam file tata letak XML), mendefinisikan variabel anggota, dan mengonfigurasi beberapa UI. Dalam contoh ini, file tata letak XML ditentukan dengan mengirimkan ID resource file R.layout.main_activity ke setContentView().
>>> Anda harus menerapkan callback ini, yang aktif saat sistem pertama kali membuat aktivitas. Pada pembuatan aktivitas, aktivitas memasuki status Dibuat. Dalam metode onCreate(), Anda menjalankan logika startup aplikasi dasar yang hanya boleh terjadi sekali selama siklus aktivitas.
>>> Jika Anda memiliki komponen berbasis siklus proses yang terhubung dengan siklus proses aktivitas Anda, aktivitas akan menerima peristiwa ON_CREATE. 

- [x] 𝗼𝗻𝗣𝗮𝘂𝘀𝗲()
metode onPause() untuk menjeda atau menyesuaikan operasi yang tidak boleh dilanjutkan (atau harus dilanjutkan dalam jumlah sedang) sementara Activity berada dalam status Dijeda, dan Anda berharap untuk segera melanjutkan. 
>>> Juga dapat menggunakan metode onPause() untuk melepaskan resource sistem, menangani sensor (seperti GPS), atau resource apa pun yang dapat memengaruhi masa pakai baterai saat aktivitas Anda dijeda dan pengguna tidak membutuhkannya. 
>>> Saat aktivitas berpindah ke status dijeda, komponen berbasis siklus proses yang terkait dengan siklus proses aktivitas akan menerima peristiwa ON_PAUSE. Di sinilah komponen siklus proses dapat menghentikan fungsi apa pun yang tidak perlu dijalankan saat komponen tidak ada di latar depan, seperti menghentikan pratinjau kamera.


### 𝗣𝗿𝗼𝗷𝗲𝗰𝘁 𝗟𝗶𝗻𝗲𝗮𝗿 𝗟𝗮𝘆𝗼𝘂𝘁
  
  - [x] 𝗛𝗮𝘀𝗶𝗹
  >> <img align="center" src="https://github.com/memorezasabana/LinearLayout_TravelApp/blob/master/AssetApp/halutama.png">
