# # UTS Pemrograman Berorientasi Obyek 1
<ul>
  <li>Mata Kuliah: Pemrograman Berorientasi Obyek 1</li>
  <li>Dosen Pengampu: <a href="https://github.com/Muhammad-Ikhwan-Fathulloh">Muhammad Ikhwan Fathulloh</a></li>
</ul>

## Profil
<ul>
  <li>Nama: Rachel Simanjuntak</li>
  <li>NIM: 23552011035</li>
  <li>Studi Kasus: Sistem Manajemen Properti</li>
</ul>

## Judul Studi Kasus
<p>SISTEM MANAJEMEN PROPERTI</p>

## Penjelasan Studi Kasus
<p>Studi kasus dari program ini adalah implementasi sistem manajemen properti yang menggunakan konsep Object-Oriented Programming (OOP) dalam bahasa Java. Program ini terdiri dari kelas abstrak, pewarisan kelas (inheritance), dan overriding metode untuk menggambarkan bagaimana properti (seperti rumah dan apartemen) dikelola, diperiksa statusnya, dan dihitung pajaknya.

Mari kita uraikan bagian-bagian utama dari program ini:

1. Kelas Aset (Abstrak)
Kelas ini adalah kelas abstrak yang berfungsi sebagai blueprint atau template untuk kelas-kelas lain. Kelas Aset memiliki dua metode abstrak:

periksaStatus(): untuk memeriksa status properti, apakah sedang disewa atau kosong.
updateHarga(double hargaBaru): untuk memperbarui harga properti.
Kelas ini tidak mengimplementasikan metode tersebut, sehingga harus diimplementasikan oleh kelas turunannya.

2. Kelas Properti (Turunan dari Aset)
Kelas Properti mewarisi kelas Aset dan mengimplementasikan metode periksaStatus() dan updateHarga(double hargaBaru) sesuai dengan fungsinya masing-masing. Selain itu, kelas ini juga memiliki atribut-atribut properti seperti alamat, luas, harga, dan status sewa:

alamat: lokasi properti.
luas: ukuran properti.
harga: harga properti.
statusSewa: status apakah properti disewa atau kosong.
Kelas Properti juga memiliki metode hitungPajak() dengan nilai default 0, yang bisa di-overridden oleh kelas turunannya (seperti rumah atau apartemen) untuk menghitung pajak properti berdasarkan harga.

3. Kelas Rumah (Turunan dari Properti)
Kelas Rumah adalah turunan dari Properti. Kelas ini mengoverride metode hitungPajak() untuk menghitung pajak properti rumah dengan tarif 1% dari harga rumah.

4. Kelas Apartemen (Turunan dari Properti)
Kelas Apartemen juga turunan dari Properti. Kelas ini mengoverride metode hitungPajak() dengan tarif pajak yang berbeda, yaitu 1.5% dari harga apartemen.

5. Kelas SistemManajemenProperti (Kelas Utama)
Kelas utama ini adalah tempat di mana objek dari Rumah dan Apartemen dibuat dan diuji. Dalam metode main, berikut adalah langkah-langkah yang dilakukan:

Membuat objek Rumah dan Apartemen dengan data alamat, luas, dan harga.
Menghitung pajak properti rumah dan apartemen dengan memanggil metode hitungPajak().
Mengubah status sewa dari rumah menjadi "Disewa" dan apartemen menjadi "Kosong" menggunakan setter setStatusSewa().
Memeriksa status sewa properti dengan memanggil metode periksaStatus().
Ringkasan Studi Kasus
Program ini mensimulasikan manajemen properti dengan cara berikut:

Memungkinkan pengelolaan berbagai jenis properti (rumah, apartemen) yang memiliki perbedaan dalam cara perhitungan pajak.
Menggunakan inheritance untuk menurunkan sifat-sifat umum dari kelas Aset ke kelas Properti, dan kemudian dari Properti ke Rumah dan Apartemen, sehingga kode menjadi lebih modular dan reusable.
Memanfaatkan polimorfisme untuk mengoverride metode hitungPajak() pada masing-masing tipe properti (rumah dan apartemen) untuk menghitung pajak dengan cara yang berbeda.
Memberikan fitur untuk mengubah status sewa properti dan memperbarui harga properti.
Manfaat dan Penggunaan dalam Dunia Nyata
Program ini dapat digunakan dalam aplikasi manajemen properti, seperti:

Pengelolaan aset properti yang berbeda (misalnya rumah, apartemen, atau properti lainnya).
Penyewaan properti dengan kemampuan untuk memeriksa status sewa.
Perhitungan pajak properti yang berbeda sesuai dengan jenis properti.</p>

## Penjelasan 4 Pilar OOP dalam Studi Kasus

### 1. Inheritance
<p>Kelas Aset adalah kelas dasar (superclass) yang mendefinisikan metode abstrak periksaStatus() dan updateHarga(double hargaBaru). Kelas ini tidak mengimplementasikan metode-metode tersebut, tetapi memberi pedoman pada kelas turunan untuk mengimplementasikannya.
Kelas Properti adalah kelas turunan dari Aset. Kelas ini mengimplementasikan kedua metode abstrak yang didefinisikan di kelas Aset, yaitu periksaStatus() dan updateHarga(double hargaBaru). Selain itu, kelas ini juga menambahkan atribut baru yang lebih spesifik untuk properti, seperti alamat, luas, harga, dan statusSewa.
Kelas Rumah dan Apartemen adalah kelas-kelas yang lebih spesifik, masing-masing mewarisi kelas Properti. Keduanya mengoverride metode hitungPajak() untuk memberikan implementasi pajak yang berbeda berdasarkan jenis properti.</p>

### 2. Encapsulation
<p>Enkapsulasi adalah teknik untuk menyembunyikan implementasi internal suatu kelas dan hanya memberikan akses ke data melalui metode publik yang disediakan (getter dan setter). Ini melindungi data agar tidak dapat diubah sembarangan oleh kelas lain.

Pada kelas Properti, atribut seperti alamat, luas, harga, dan statusSewa disembunyikan menggunakan modifier private.
Untuk mengakses atau memodifikasi nilai-nilai ini, program menyediakan getter dan setter sebagai metode publik. Misalnya, getAlamat(), setHarga(double harga), dan getStatusSewa().</p>

### 3. Polymorphism
<p>Polimorfisme memungkinkan objek dari kelas turunan untuk menggantikan objek dari kelas induk, serta memungkinkan metode yang sama untuk memiliki perilaku berbeda tergantung pada objek yang memanggilnya. Ada dua bentuk polimorfisme yang diterapkan dalam program ini:

Polimorfisme pada Metode (Method Overriding): Pada kelas Rumah dan Apartemen, metode hitungPajak() di-override untuk memberikan perhitungan pajak yang berbeda. Ini menunjukkan polimorfisme, di mana metode yang sama (hitungPajak()) berperilaku berbeda tergantung pada jenis objek yang memanggilnya.</p>

### 4. Abstract
<p>Abstraksi adalah proses menyembunyikan detail implementasi dan hanya menampilkan fungsionalitas yang relevan bagi pengguna. Program ini menggunakan kelas abstrak dan metode abstrak untuk mendefinisikan struktur dasar yang harus diikuti oleh kelas-kelas turunan.

Kelas Aset adalah kelas abstrak yang mendefinisikan dua metode abstrak: periksaStatus() dan updateHarga(double hargaBaru). Kelas abstrak ini tidak mengimplementasikan metode tersebut, tetapi memberikan pedoman bagi kelas turunan untuk menyediakan implementasi yang lebih spesifik.
Kelas Properti dan kelas turunannya (Rumah dan Apartemen) mengimplementasikan metode-metode abstrak ini, sehingga memberikan detail implementasi yang sesuai dengan jenis properti yang dikelola.</p>

## Demo Proyek
<ul>
  <li>Github: <a href="">Github</a></li>
  <li>Youtube: <a href="https://youtu.be/Gu6Op1lRjzA?si=DXWD8ELzW7VebQsM">Youtube</a></li>
</ul>
