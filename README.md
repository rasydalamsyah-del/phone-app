# PhoneApp - Halaman Utama (Home Screen)

Project Android native (Kotlin + Jetpack Compose) yang mereplikasi gaya home screen
dengan grid ikon aplikasi, status bar, dan latar gradient sunset.

## Cara membuka & menjalankan

1. Download & extract folder `PhoneApp` ini.
2. Buka **Android Studio** (versi terbaru, disarankan Hedgehog/Iguana ke atas).
3. Pilih **Open** lalu arahkan ke folder `PhoneApp`.
4. Tunggu Android Studio melakukan **Gradle Sync** otomatis (akan mengunduh
   dependency & Gradle wrapper yang dibutuhkan — pastikan ada koneksi internet).
5. Jalankan di emulator atau HP fisik dengan tombol **Run ▶**.

## Struktur project

```
PhoneApp/
├── app/
│   └── src/main/
│       ├── java/com/example/phoneapp/
│       │   ├── MainActivity.kt        # Entry point + navigasi
│       │   └── ui/
│       │       ├── data/AppItem.kt    # Daftar aplikasi & ikon
│       │       ├── screens/
│       │       │   ├── HomeScreen.kt  # Tampilan utama (home screen)
│       │       │   └── ChatScreen.kt  # Placeholder layar saat ikon diklik
│       │       └── theme/             # Warna, tipografi, tema
│       └── AndroidManifest.xml
├── build.gradle.kts
└── settings.gradle.kts
```

## Fitur saat ini

- Status bar custom (jam, wifi, baterai)
- Grid ikon aplikasi (4 kolom), bisa diklik
- Klik ikon → navigasi ke halaman placeholder (siap diisi fitur chat)
- Background gradient sunset (gaya wallpaper)

## Langkah selanjutnya (belum dibuat)

- Isi `ChatScreen.kt` dengan UI bubble chat & input pesan
- Tambah karakter/avatar
- Sistem dialog/cerita
- Penyimpanan progres (DataStore/Room)

Beri tahu Claude kalau mau lanjut ke bagian fitur chat-nya.

## Cara dapat APK lewat GitHub Actions (tanpa install Android Studio)

Project ini sudah dilengkapi workflow otomatis di `.github/workflows/build-apk.yml`.
Caranya:

1. **Buat akun GitHub** (kalau belum punya): https://github.com/signup
2. **Buat repository baru**:
   - Klik tombol **+** di pojok kanan atas → **New repository**
   - Beri nama bebas, misal `phone-app`
   - Pilih **Public** atau **Private** (bebas), lalu klik **Create repository**
3. **Upload project**:
   - Di halaman repo yang baru dibuat, klik **uploading an existing file**
   - Drag & drop **seluruh isi folder `PhoneApp`** (bukan file zip-nya, tapi isinya setelah di-extract) ke halaman tersebut
   - Klik **Commit changes**
4. **Tunggu build otomatis jalan**:
   - Klik tab **Actions** di bagian atas repo
   - Akan muncul proses "Build APK" yang sedang berjalan (ada ikon kuning berputar)
   - Tunggu sampai selesai (~3-5 menit), ikon berubah jadi centang hijau ✅
5. **Download APK**:
   - Klik proses build yang sudah selesai tadi
   - Scroll ke bawah ke bagian **Artifacts**
   - Klik **PhoneApp-debug-apk** untuk download (berupa file .zip berisi APK)
   - Extract zip itu, di dalamnya ada `app-debug.apk`
6. **Install di HP**:
   - Pindahkan `app-debug.apk` ke HP Android kamu
   - Buka file-nya, izinkan "Install dari sumber tidak dikenal" kalau diminta
   - Install seperti biasa

Catatan: APK ini adalah versi **debug** (untuk testing), belum di-sign untuk rilis ke Play Store.
