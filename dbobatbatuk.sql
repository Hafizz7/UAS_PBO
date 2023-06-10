-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 10 Jun 2023 pada 18.12
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbobatbatuk`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `dataobat`
--

CREATE TABLE `dataobat` (
  `id_obat` int(8) NOT NULL,
  `nama_obat` varchar(120) NOT NULL,
  `harga_obat` int(250) NOT NULL,
  `stock_obat` int(70) NOT NULL,
  `jenis_obat` varchar(20) NOT NULL,
  `ketersediaan` varchar(20) NOT NULL,
  `dosis` varchar(20) NOT NULL,
  `expired_obat` date NOT NULL,
  `deskripsi_obat` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `dataobat`
--

INSERT INTO `dataobat` (`id_obat`, `nama_obat`, `harga_obat`, `stock_obat`, `jenis_obat`, `ketersediaan`, `dosis`, `expired_obat`, `deskripsi_obat`) VALUES
(11, 'Bodrex Flu', 15000, 22, 'Pill', 'Tersedia', 'Pagi - Siang - Malam', '2023-06-22', 'Obat untuk flu berat disertai dengan batuk'),
(12, 'Triaminic Batuk Syrup ', 85000, 15, 'Cairan', 'Tersedia', 'Pagi - Siang - Malam', '2025-12-15', 'obat batuk anak yang digunakan untuk membantu meringankan gejala flu pada anak, seperti bersin-bersin, pilek, dan hidung tersumbat yang diikuti dengan batuk kering atau batuk tidak berdahak. Obat ini mengandung dextromethorphan Hbr dan pseudoephedrine yang membantu melegakan tenggorokan serta mengurangi sakit tenggorokan karena batuk'),
(14, 'Siladex Batuk Pilek', 15000, 9, 'Cairan', 'Tersedia', 'Pagi - Siang - Malam', '2024-09-23', 'obat batuk bebas alkohol dan gula untuk batuk tidak berdahak sekaligus melegakan hidung tersumbat karena flu. Obat mengandung dextromethorphan Hbr, doksilamin suksinat, dan pseudoephedrine'),
(15, 'Mixagrip Flu ', 5000, 21, 'Pill', 'Tersedia', 'Pagi', '2026-08-11', 'Dengan kandungan dextromethorphan HBr, paracetamol, dan pseudoephedrine HCl untuk meringankan gejala flu, seperti sakit kepala, pilek, hidung tersumbat, dan batuk'),
(16, 'HerbaKOF', 105000, 15, 'Kapsul', 'Tersedia', 'Pagi - Siang - Malam', '2025-05-16', 'Obat batuk herbal berfungsi untuk membantu meredakan batuk dan membantu melegakan tenggorokan'),
(17, 'Levosif Sirup', 75000, 10, 'Cairan', 'Tersedia', 'Pagi - Siang - Malam', '2025-10-30', 'Obat ini digunakan sebagai terapi simtomatik batuk, khususnya untuk batuk kering baik untuk usia dewasa maupun anak'),
(21, 'Cordialung', 90000, 14, 'Kapsul', 'Tersedia', 'Malam', '2023-10-26', 'ordialung merupakan suplemen herbal yang berguna untuk menguatkan paru-paru dengan tujuan membuat fungsi pernafasan anda menjadi sehat'),
(42, 'Intunal F Tablet ', 10000, 0, 'Pill', 'Tidak Tersedia', 'Malam', '2023-06-22', 'Obat dalam sediaan tablet yang digunakan untuk meredakan gejala flu, seperti hidung tersumbat, pilek, sakit kepala, bersin-bersin, demam, dan batuk.');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login_user`
--

CREATE TABLE `login_user` (
  `username` varchar(20) NOT NULL,
  `psw` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `login_user`
--

INSERT INTO `login_user` (`username`, `psw`) VALUES
('14', '2'),
('2', '22'),
('hafiz', '123'),
('hafizc', '123'),
('jTextField1', '2'),
('riski', '123'),
('user', '123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pesanan_user`
--

CREATE TABLE `pesanan_user` (
  `id_pesanan` int(10) NOT NULL,
  `id_obat` int(10) NOT NULL,
  `username` varchar(70) NOT NULL,
  `nama_obat` varchar(70) NOT NULL,
  `jenis_obat` varchar(70) NOT NULL,
  `dosis` varchar(70) NOT NULL,
  `expired_obat` date NOT NULL,
  `jumlah_barang` int(70) NOT NULL,
  `harga_obat` int(150) NOT NULL,
  `alamat_pesanan` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pesanan_user`
--

INSERT INTO `pesanan_user` (`id_pesanan`, `id_obat`, `username`, `nama_obat`, `jenis_obat`, `dosis`, `expired_obat`, `jumlah_barang`, `harga_obat`, `alamat_pesanan`) VALUES
(1, 452, 'hafiz', 'Obat Batuk', 'Cairan', 'Pagi', '2023-06-24', 2, 100000, 'Pinrang'),
(2, 452, 'hafiz', 'Obat Batuk', 'Cairan', 'Pagi', '2023-06-24', 2, 100000, '22'),
(3, 14, 'riski', 'Siladex Batuk Pilek', 'Cairan', 'Pagi - Siang - Malam', '2024-09-23', 3, 45000, 'Samarinda Kota');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `dataobat`
--
ALTER TABLE `dataobat`
  ADD PRIMARY KEY (`id_obat`);

--
-- Indeks untuk tabel `login_user`
--
ALTER TABLE `login_user`
  ADD PRIMARY KEY (`username`);

--
-- Indeks untuk tabel `pesanan_user`
--
ALTER TABLE `pesanan_user`
  ADD PRIMARY KEY (`id_pesanan`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `pesanan_user`
--
ALTER TABLE `pesanan_user`
  MODIFY `id_pesanan` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
