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

<img width="356" height="807" alt="image" src="https://github.com/user-attachments/assets/64323cb0-dbe3-4597-8016-7a227ac88e07" />
<img width="361" height="786" alt="image" src="https://github.com/user-attachments/assets/bc6655ed-5041-4ebf-901b-0fb55315b9b7" />
<img width="466" height="206" alt="image" src="https://github.com/user-attachments/assets/d88549c8-7d4b-4094-a908-4a28e269f2cd" />


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

## Slide
<img width="1920" height="1080" alt="1" src="https://github.com/user-attachments/assets/a73a08e0-7ae6-41ed-b04c-45897f3cbc29" />
<img width="1920" height="1080" alt="2" src="https://github.com/user-attachments/assets/c708aa71-ccbb-4309-afd2-fa18576d7260" />
<img width="1920" height="1080" alt="3" src="https://github.com/user-attachments/assets/32ee57e7-0582-439e-8312-6f7e242a1b9d" />
<img width="1920" height="1080" alt="4" src="https://github.com/user-attachments/assets/133a3dd5-5b78-4279-91c7-2e901cb5ac17" />
<img width="1920" height="1080" alt="5" src="https://github.com/user-attachments/assets/fb7e6337-b8e8-436c-912a-7561a1718ab6" />

---

## 🚀 Cara Menjalankan Proyek

1. **Clone Repository ini:**
   ```bash
