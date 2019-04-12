-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 12 Apr 2019 pada 14.42
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pengguna`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `email` varchar(25) NOT NULL,
  `nama-depan` varchar(10) NOT NULL,
  `nama-belakang` varchar(10) NOT NULL,
  `umur` int(11) NOT NULL,
  `jenis-kelamin` varchar(9) NOT NULL DEFAULT '',
  `agama` varchar(10) NOT NULL,
  `status` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`email`, `nama-depan`, `nama-belakang`, `umur`, `jenis-kelamin`, `agama`, `status`) VALUES
('emailbaru@gmail.com', 'nama', 'orang', 22, 'Perempuan', 'Kristen', 'Menikah'),
('gramdhani66@gmail.com', 'gilang', 'ramdani', 23, 'Laki-Laki', 'Islam', 'Menikah'),
('ilhamfidatama@gmail.com', 'Muhammad', 'Ilham', 21, 'Laki-Laki', 'Islam', 'Belum Menikah');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
