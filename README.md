## 𝗜𝗡𝗧𝗘𝗡𝗧 𝗥𝗘𝗦𝗨𝗟𝗧 & 𝗙𝗥𝗔𝗚𝗠𝗘𝗡𝗧

<img align="center" src="https://github.com/memorezasabana/IntentResult-Fragment_TravelApp/blob/master/Asset_IntentRes_Fragment/Video.gif">

### 𝗜𝗡𝗧𝗘𝗡𝗧 𝗥𝗘𝗦𝗨𝗟𝗧

| 𝗠𝗔𝗧𝗘𝗥𝗜 | 𝗣𝗘𝗡𝗝𝗘𝗟𝗔𝗦𝗔𝗡 |
|--------|-------------|
| 'startActivityForResult()' | Dalam latihan sebelumnya [Menghubungkan Antar Activity Menggunakan Intent], method 'startActivity()' memanggil activity yang lain tetapi tidak mengembalikan hasil apapun ke activity yang memanggil. Misalnya, kita mungkin memiliki activity yang akan mengajukan ke user 'nama dan password'. Informasi yang dimasukkan user dalam activity tersebut perlu dikembalikan ke activity yang memanggil untu diproses lebih lanjut. Bila kita melewatkan kembali data dari suatu activity, sebagai gantinya kita akan menggunakan method 'startActivityForResult()' (dan bukan 'startActivity()'). Untuk memanggil suatu activity dan menunggu hasil yang akan dikembalikannya, kita perlu menggunakan method 'startActivityForResult()' seperti berikut: '''startActivityForResult(new Intent("com.example.usingintent.SecondActivity"), request_Code);''' |
| 'request code' | Selain melewatkan parameter object 'Intent', kita juga perlu melewatkan parameter 'request code'. Request code ini sederhananya adalah suatu nilai integer yang mengidentifikasi activity yang kita panggil. Kode ini diperlukan karena bila suatu activity mengembalikan suatu nilai, kita harus punya cara untuk mengidentifikasinya. Misalnya, kita mungkin memanggil banyak activity pada saat yang sama, dan beberapa activity mungkin tidak merespon dengan segera (misalnya menunggu jawaban dari suatu server). Bila activity merespon, kita perlu request code tersebut untuk menentukan activity mana yang merespon ini. |

### 𝗣𝗿𝗼𝗷𝗲𝗰𝘁 

𝗼 Halaman Kirim Komentar
> <img align="center" src="https://github.com/memorezasabana/IntentResult-Fragment_TravelApp/blob/master/Asset_IntentRes_Fragment/1.png"> 

𝗼 Halaman Edit Komentar
> <img align="center" src="https://github.com/memorezasabana/IntentResult-Fragment_TravelApp/blob/master/Asset_IntentRes_Fragment/2.png"> 

𝗼 Halaman Simpan Komentar
> <img align="center" src="https://github.com/memorezasabana/IntentResult-Fragment_TravelApp/blob/master/Asset_IntentRes_Fragment/3.png"> 

𝗼 Halaman Tampil Komentar
> <img align="center" src="https://github.com/memorezasabana/IntentResult-Fragment_TravelApp/blob/master/Asset_IntentRes_Fragment/4.png"> 


### 𝗙𝗥𝗔𝗚𝗠𝗘𝗡𝗧

> Fragment adalah sebuah reuseable class yang mengimplement beberapa fitur sebuah Activity. Fragment biasanya dibuat sebagai bagian dari suatu antarmuka. Sebuah fragment harus berada di dalam sebuah activity, mereka tidak dapat berjalan sendiri tanpa adanya activity tempat mereka menempel.

| 𝗙𝗥𝗔𝗚𝗠𝗘𝗡𝗧 𝗟𝗜𝗙𝗘𝗖𝗬𝗖𝗟𝗘| 𝗣𝗘𝗡𝗝𝗘𝗟𝗔𝗦𝗔𝗡 |
|--------------------|-------------|
| 'onAttach()' | dipanggil saat sebuah fragment terhubung ke activity. |
| 'onCreate()' | dipanggil saat sebuah fragment dibuat (objeknya di memori). |
| 'onCreateView()' | dipanggil saat fragment sudah siap membaca sebuah layout. |
| 'onViewCreated()' | dipanggil setelah 'onCreateView()' dan memastikan layout yang dibaca fragment adalah non-null. Semua pengaturan view seperti pembacaan findViewById, menambah onClickListener dapat dilakukan di sini. |
| 'onActivityCreated()' |  dipanggil setelah activity pembaca sudah menyelesaikan 'onCreate()'-nya. |
| 'onStart()' | dipanggil setelah fragment siap untuk ditampilkan di layar. |
| 'onResume()' | Dipakai untuk melakukan pembacaan data yang lebih “rumit” seperti lokasi, sensor, dll. |
| 'onPause()' | Tempat melepas data “rumit”. Lakukan commit di sini. |
| 'onDestroyView()' | dipanggil saat layout sebuah fragment akan dihapus dari memori, namun fragmentnya masih ada di memori. |
| 'onDestroy()' | dipanggil jika fragment sudah tidak dipakai. |
| 'onDetach()' | dipanggil saat fragment tidak lagi terhubung ke sebuah activity. |
 
 
### 𝗣𝗿𝗼𝗷𝗲𝗰𝘁  
 
𝗼 Halaman Utama >> Malioboro
> <img align="center" src="https://github.com/memorezasabana/IntentResult-Fragment_TravelApp/blob/master/Asset_IntentRes_Fragment/5.png"> 

𝗼 Halaman Malioboro Malam
> <img align="center" src="https://github.com/memorezasabana/IntentResult-Fragment_TravelApp/blob/master/Asset_IntentRes_Fragment/6.png"> 

𝗼 Halaman Malioboro Siang
> <img align="center" src="https://github.com/memorezasabana/IntentResult-Fragment_TravelApp/blob/master/Asset_IntentRes_Fragment/7.png"> 

 
## *Jangan Pernah Berhenti Bermimpi Cita-cita* 


