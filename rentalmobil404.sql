-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 25 Jul 2021 pada 06.34
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rentalmobil404`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `mobil`
--

CREATE TABLE `mobil` (
  `id_mobil` int(20) NOT NULL,
  `merek` varchar(20) DEFAULT NULL,
  `tipe` varchar(20) DEFAULT NULL,
  `tahun` varchar(20) DEFAULT NULL,
  `nopol` varchar(10) DEFAULT NULL,
  `harga` int(20) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `mobil`
--

INSERT INTO `mobil` (`id_mobil`, `merek`, `tipe`, `tahun`, `nopol`, `harga`, `status`) VALUES
(1, 'Hyundai', 'Starex Mover', '2021', 'R 1234 HR', 500000, 'Tersedia'),
(2, 'Toyota', 'Alphard', '2018', 'D 2345 SH', 5000000, 'Tersedia'),
(3, 'Nissan', 'Serena', '2019', 'B 4563 K', 400000, 'Tersedia'),
(4, 'Mitsubishi', 'Xpander', '2019', 'Z 1413 PT', 300000, 'Tersedia'),
(5, 'Chevrolet', 'Colorado', '2019', 'KH 3212 W', 500000, 'Tersedia'),
(6, 'BMW', 'X1', '2020', 'A 5115 KF', 1500000, 'Tersedia'),
(7, 'Jeep', 'Rubicon', '2021', 'J 3322 P', 10000000, 'Tersedia'),
(8, 'Mazda', 'Mazda 2 R A/T', '2021', 'B 4468 R', 700000, 'Keluar');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penyewa`
--

CREATE TABLE `penyewa` (
  `id_penyewa` int(20) NOT NULL,
  `nama` varchar(20) DEFAULT NULL,
  `nik` int(20) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `telp` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `penyewa`
--

INSERT INTO `penyewa` (`id_penyewa`, `nama`, `nik`, `alamat`, `telp`, `email`) VALUES
(1, 'Melinta', 333333, 'Banyumas', '085326728916', 'melmel@gmail.com'),
(2, 'Satya', 444444, 'Kediri', '085289388123', 'satya@gmail.com'),
(3, 'Sekar', 555555, 'Jakarta Selatan', '08135366908', 'sekar@gmail.com'),
(4, 'Laeli', 666666, 'Purwokerto', '085276878345', 'laeli@gmail.com'),
(5, 'Fernanda', 777777, 'Purwokerto', '081317814567', 'fernanda@gmail'),
(6, 'Nur Hutama', 888888, 'Surabaya', '089232098096', 'hutama@gmail.com'),
(7, 'Nurul Islam', 999999, 'Purbalingga', '085326728914', 'nurul@gmail.com'),
(8, 'Isaneni', 768909, 'Sokaraja', '08986438878', 'isnaenio@gmail.com'),
(9, 'Imansyah', 122356, 'Kebumen', '08267543234', 'imansyah@gmail.com'),
(10, 'Lutfiana', 221356, 'Banjarnegara', '08998765432', 'lutfiana@gmail.com'),
(11, 'Aksaningtyas', 109876, 'Gg.Bunga Malang', '082145678901', 'aksaningtyas@gmail.c'),
(12, 'Andreano', 127892, 'Jl.Mangga Dua', '08976543219', 'andreano@gmail.com'),
(13, 'Gonzales', 247981, 'JL.Sadewa', '08214567891', 'gonzales@gmail.com'),
(2000, 'marta diaz', 890765, 'JL.Kembang Setaman', '085432178923', 'diaz@gmail.com');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(20) NOT NULL,
  `penyewa` varchar(20) DEFAULT NULL,
  `nopol` varchar(20) DEFAULT NULL,
  `harga` varchar(20) DEFAULT NULL,
  `tgl_pinjam` date DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `lama` varchar(10) DEFAULT NULL,
  `total` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `nama`, `username`, `password`, `type`) VALUES
(1, 'penyewa', 'penyewa', 'penyewa', 'Penyewa'),
(8, 'admin', 'admin', 'admin', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`id_mobil`);

--
-- Indeks untuk tabel `penyewa`
--
ALTER TABLE `penyewa`
  ADD PRIMARY KEY (`id_penyewa`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `mobil`
--
ALTER TABLE `mobil`
  MODIFY `id_mobil` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `penyewa`
--
ALTER TABLE `penyewa`
  MODIFY `id_penyewa` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2005;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
