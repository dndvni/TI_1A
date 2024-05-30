#!/bin/bash

INVENTORY_FILE="inventory.txt"
USER_FILE="users.txt"
HISTORY_FILE="history.txt"
PRINT_FILE="print_output.txt"

trap 'echo "Operasi dibatalkan"; exit' SIGINT SIGTERM

# Fungsi untuk membuat user baru
create_user() {
    echo "Masukkan username baru:"
    read new_username
    echo "Masukkan password baru:"
    read -s new_password
    echo "Masukkan hak akses (admin/user):"
    read access
    echo "$new_username,$new_password,$access" >> $USER_FILE
    echo "User baru berhasil dibuat."
}

# Fungsi untuk login
login() {
    echo "Masukkan username:"
    read username
    echo "Masukkan password:"
    read -s password
    access=$(grep "$username,$password" $USER_FILE | cut -d ',' -f3)
    if [ -z "$access" ]; then
        echo "Login gagal!"
    else
        echo "Login berhasil! Hak akses: $access"
    fi
}

# Fungsi untuk menampilkan menu barang
show_menu() {
    echo "Daftar Barang Elektronik dan Komputer:"
    cat $INVENTORY_FILE
}

# Fungsi untuk menampilkan harga sewa
show_prices() {
    echo "Harga Sewa Per Barang:"
    awk -F, '{print $1, $3}' $INVENTORY_FILE
}

# Fungsi untuk mencetak informasi ke file .txt
print_to_file() {
    echo "Mencetak informasi ke file..."
    echo "Daftar Barang Elektronik dan Komputer:" > $PRINT_FILE
    cat $INVENTORY_FILE >> $PRINT_FILE
    echo "\nHarga Sewa Per Barang:" >> $PRINT_FILE
    awk -F, '{print $1, $3}' $INVENTORY_FILE >> $PRINT_FILE
    echo "\nHistory Peminjaman:" >> $PRINT_FILE
    cat $HISTORY_FILE >> $PRINT_FILE
    echo "Informasi telah dicetak ke $PRINT_FILE"
}

# Menu utama
while true; do
    echo "1. Login"
    echo "2. Buat User Baru"
    echo "3. Lihat Menu Barang"
    echo "4. Lihat Harga Sewa"
    echo "5. Cetak Informasi"
    echo "6. Keluar"
    read -p "Pilih opsi: " choice

    case $choice in
        1) login ;;
        2) create_user ;;
        3) show_menu ;;
        4) show_prices ;;
        5) print_to_file ;;
        6) break ;;
        *) echo "Opsi tidak valid. Coba lagi." ;;
    esac
done