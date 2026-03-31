# TE-KTP-Reader with Verihubs

Aplikasi Android untuk verifikasi identitas menggunakan NFC e-KTP dan Verihubs API.

## Fitur

- **NFC e-KTP Reader**: Baca data dari e-KTP
- **Face Comparison**: Bandingkan wajah dengan Verihubs API
- **Liveness Detection**: Deteksi kehidupan (real person vs photo)
- **Deepfake Detection**: Deteksi gambar/video palsu
- **PDF Certificate**: Generate sertifikat verifikasi

## Setup

1. Tambahkan API Key Verihubs di `local.properties`:
```
VERIHUBS_API_KEY=your_api_key_here
```

2. Build project:
```bash
gradle assembleDebug
```

## GitHub Actions

Workflow otomatis build APK saat push ke branch `main`.

## Struktur Project

```
app/src/main/java/com/te/ktpreader/
├── data/
│   ├── remote/          # API Service
│   └── model/           # Data classes
├── di/                  # Dependency Injection
├── ui/                  # UI Screens
└── nfc/                 # NFC Reader
```
