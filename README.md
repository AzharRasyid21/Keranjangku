# 📱 🛒 Keranjangku - Aplikasi Catatan Belanjaan Berbasis Jetpack Compose
Aplikasi pencatat daftar belanjaan (shopping list) lokal yang ringan, cepat, dan responsif. Dibangun menggunakan Jetpack Compose, MVVM Architecture, Unidirectional Data Flow (UDF), dan StateFlow.

---

## 👥 Identitas Kelompok
* **Azhar Rasyid Wisnadi** - `[23523051]`
* **Dianta Arya Zaki Hanif** - `[24523159]`
* **Muhammad Farhan Yusuf Azizi** - `[24533129]`

---

## 🎯 Masalah, Pengguna & Solusi

* **Masalah:** Banyak orang kesulitan melacak barang belanjaan harian atau bulanan secara cepat saat berada di toko/supermarket. Aplikasi pencatat belanjaan di pasaran sering kali terlalu kompleks, dipenuhi iklan, memerlukan proses login, atau membutuhkan koneksi internet hanya untuk membuat catatan sederhana.
* **Pengguna Sasaran:** Pengguna umum, mahasiswa, atau pembeli harian yang membutuhkan aplikasi pencatat keranjang belanjaan yang instan, praktis, dan tanpa kendala jaringan/otentikasi.
* **Solusi:** **Keranjangku**, sebuah aplikasi pencatat daftar belanjaan berbasis memori lokal yang sangat ringan. Aplikasi ini memungkinkan pengguna untuk langsung mencatat barang belanjaan, menandai barang yang sudah diambil, dan menghapus item dari daftar dalam satu layar responsif tanpa koneksi internet.

---

## ✨ Fitur Utama
1. **Tambah Barang Belanjaan dengan Validasi**: Menambahkan barang baru ke dalam keranjang belanja. Dilengkapi validasi logika bisnis untuk mencegah penginputan teks kosong/spasi dengan pesan peringatan.
2. **Ubah Status Dibeli (Toggle Completion)**: Menandai barang belanjaan yang sudah diambil/dibeli menggunakan kotak centang (checkbox) dan tampilan garis dicoret (strikethrough).
3. **Hapus Barang Belanjaan**: Menghapus item barang tertentu secara permanen dari keranjang berbasis memori lokal menggunakan ID unik.
4. **Adaptive Layout**: Tampilan antarmuka yang otomatis beradaptasi. Menyusun formulir input dan daftar belanjaan secara vertikal (Column) pada mode portrait (<600dp) dan secara horizontal berdampingan (Row) pada mode landscape atau tablet (≥600dp).

---

## 🔄 Contoh Alur UDF (Unidirectional Data Flow) - Fitur Tambah Tugas

1. **UI Event:** Pengguna menekan tombol "Tambah ke Belanjaan" pada komponen InputSection. UI tidak mengolah data sendiri, melainkan menembakkan event ke ViewModel melalui referensi fungsi viewModel::addTask.
2. **Business Logic & Validation:** TaskViewModel mengambil nilai inputText dari state. Jika nama barang kosong, ViewModel memperbarui errorMessage. Jika valid, objek Task baru dibuat.
3. **State Update:** ViewModel memperbarui data secara immutable menggunakan .update dan .copy(), sehingga menciptakan objek TaskUiState baru di memori.
4. **Recomposition:** Komponen TaskScreen yang mengamati uiState via collectAsStateWithLifecycle() mendeteksi perubahan referensi memori data dan secara otomatis memicu proses Recomposition untuk menggambar daftar barang belanjaan terbaru di layar.

---

## 🤝 Pembagian Kontribusi Anggota

| Anggota | Peran & Tanggung Jawab | Berkas yang Dikerjakan |
| :--- | :--- | :--- |
| **Muhammad Farhan Yusuf Azizi** | **Project Setup & Data Model**<br>• Inisialisasi proyek dan dependensi Gradle<br>• Perancangan struktur data `Task` & `TaskUiState`<br>• Konfigurasi *entry point* `MainActivity` | • `build.gradle.kts`<br>• `Task.kt`<br>• `MainActivity.kt` |
| **Azhar Rasyid Wisnadi** | **Business Logic & State Management**<br>• Pembuatan `TaskViewModel`<br>• Penerapan Enkapsulasi & `StateFlow`<br>• Logika validasi form & manipulasi data | • `TaskViewModel.kt` |
| **Dianta Arya Zaki Hanif** | **UI Components & Adaptive Layout**<br>• Pembuatan `TaskScreen`, `InputSection`, `TaskListSection`<br>• Implementasi `collectAsStateWithLifecycle`<br>• Penanganan *breakpoint* layar (600dp) | • `TaskScreen.kt` |

---

## 🚀 Cara Menjalankan Proyek

1. **Clone Repository ini:**
   ```bash
