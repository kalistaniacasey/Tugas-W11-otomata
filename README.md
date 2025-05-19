### Pengumpulan Tugas W11 Otomata E 2025
Anggota Kelompok:
|    NRP     |      Name      |
| :--------: | :------------: |
| 5025231146 | Salsabila Purnama   |
| 5025231220 | Salwa Fitri Fadiyah Hanan   |
| 5025231302 | Kalistania Casey Tangkemanda   |

Penjelasan Mengenai CYK Algorithm dan Cara Kerjanya

CYK (Cocke–Younger–Kasami) Algorithm adalah algoritma yang digunakan untuk mengecek apakah sebuah string bisa dibentuk dari sebuah grammar bebas konteks (CFG) yang sudah ditulis dalam bentuk Chomsky Normal Form (CNF).

Apa itu CNF (Chomsky Normal Form)?
Grammar disebut dalam bentuk CNF jika semua aturannya (produksi) memenuhi syarat berikut:

Bentuknya hanya boleh:
A → BC (dua non-terminal), atau
A → a (satu terminal).

Tidak boleh ada ε-productions, unit productions, atau produksi dengan lebih dari dua non-terminal.

Cara kerja algoritma CYK:
1. Siapkan tabel segitiga bawah berukuran n x n (n = panjang input string).
2. Isi bagian diagonal tabel dengan non-terminal yang menghasilkan karakter terminal pada string input.
3. Lanjutkan mengisi bagian atasnya dengan cara mencari kombinasi dua bagian dari tabel yang bisa digabungkan melalui aturan A → BC.
4. Di akhir, jika simbol awal (start symbol, biasanya S) muncul di tabel paling atas (table[0][n-1]), berarti string diterima oleh grammar.

Cara Menggunakan Program
Program ini ditulis dalam bahasa Java dan dijalankan menggunakan BlueJ. Berikut langkah-langkah menjalankannya:
1. Buka BlueJ dan buat project baru.
2. Tambahkan class baru dengan nama CYKParser.
3. Salin dan tempel kode program ke dalam class tersebut.
4. Klik Compile untuk memastikan tidak ada error.
5. Klik kanan class CYKParser → pilih void main(String[] args) → klik OK.
6. Jika berhasil, hasil output akan muncul di jendela terminal.

![image](https://github.com/user-attachments/assets/2de2ada8-0617-40bf-a5b2-af07f59f10ef)

1.Contoh 1
Program mengecek apakah string "baaba" bisa dibentuk dari grammar yang sudah ditulis dalam bentuk Chomsky Normal Form (CNF).
Ternyata, berdasarkan aturan-aturan grammar yang ada, string ini bisa dibentuk, sehingga hasilnya YES (diterima oleh grammar).

2.Contoh 2
Program dicek lagi dengan string "bb".
Setelah diproses oleh algoritma CYK, ternyata tidak ada kombinasi aturan dalam grammar yang bisa menghasilkan string "bb".
Makanya hasilnya NO (tidak diterima oleh grammar).



