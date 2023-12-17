-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.30 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for k_atk
CREATE DATABASE IF NOT EXISTS `k_atk` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `k_atk`;

-- Dumping structure for table k_atk.tb_produk
CREATE TABLE IF NOT EXISTS `tb_produk` (
  `produk_id` char(5) NOT NULL,
  `nama_produk` varchar(100) NOT NULL,
  `harga_produk` int NOT NULL,
  `stok_produk` int NOT NULL,
  PRIMARY KEY (`produk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table k_atk.tb_produk: ~4 rows (approximately)
REPLACE INTO `tb_produk` (`produk_id`, `nama_produk`, `harga_produk`, `stok_produk`) VALUES
	('K0001', 'Pulpen', 5000, 150),
	('K0002', 'Buku', 3500, 200),
	('K0003', 'Penggaris', 8000, 100),
	('K0004', 'Penghapus', 2500, 300),
	('K0005', 'Pensil', 3000, 250);

-- Dumping structure for table k_atk.tb_transaksi
CREATE TABLE IF NOT EXISTS `tb_transaksi` (
  `transaksi_id` char(5) NOT NULL,
  `tanggal_transaksi` date NOT NULL,
  `jumlah_transaksi` int NOT NULL,
  PRIMARY KEY (`transaksi_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table k_atk.tb_transaksi: ~0 rows (approximately)
REPLACE INTO `tb_transaksi` (`transaksi_id`, `tanggal_transaksi`, `jumlah_transaksi`) VALUES
	('ID001', '2023-07-01', 25000),
	('ID002', '2023-07-05', 21000),
	('ID003', '2023-07-10', 30000),
	('ID004', '2023-07-15', 28000),
	('ID005', '2023-07-20', 22000),
	('ID006', '2023-07-25', 26000),
	('ID007', '2023-07-28', 27000),
	('ID008', '2023-07-29', 23000),
	('ID009', '2023-07-30', 24000),
	('ID010', '2023-07-31', 29000),
	('ID011', '2023-08-02', 31000),
	('ID012', '2023-08-05', 27000),
	('ID013', '2023-08-10', 22000),
	('ID014', '2023-08-15', 30000),
	('ID015', '2023-08-20', 25000),
	('ID016', '2023-08-25', 28000),
	('ID017', '2023-08-28', 29000),
	('ID018', '2023-08-29', 26000),
	('ID019', '2023-08-30', 27000),
	('ID020', '2023-08-31', 32000),
	('ID021', '2023-09-03', 33000),
	('ID022', '2023-09-07', 29000),
	('ID023', '2023-09-12', 24000),
	('ID024', '2023-09-17', 31000),
	('ID025', '2023-09-20', 28000),
	('ID026', '2023-09-22', 27000),
	('ID027', '2023-09-25', 26000),
	('ID028', '2023-09-27', 30000),
	('ID029', '2023-09-28', 29000),
	('ID030', '2023-09-30', 25000),
	('ID031', '2023-10-01', 28000),
	('ID032', '2023-10-05', 32000),
	('ID033', '2023-10-10', 27000),
	('ID034', '2023-10-15', 30000),
	('ID035', '2023-10-20', 31000),
	('ID036', '2023-10-25', 33000),
	('ID037', '2023-10-28', 29000),
	('ID038', '2023-10-29', 28000),
	('ID039', '2023-10-30', 26000),
	('ID040', '2023-10-31', 30000),
	('ID041', '2023-11-02', 31000),
	('ID042', '2023-11-05', 29000),
	('ID043', '2023-11-10', 32000),
	('ID044', '2023-11-15', 33000),
	('ID045', '2023-11-20', 28000),
	('ID046', '2023-11-22', 27000),
	('ID047', '2023-11-25', 30000),
	('ID048', '2023-11-27', 31000),
	('ID049', '2023-11-28', 29000),
	('ID050', '2023-11-30', 32000),
	('ID051', '2023-12-01', 25000),
	('ID052', '2023-12-05', 21000),
	('ID053', '2023-12-10', 30000),
	('ID054', '2023-12-15', 28000),
	('ID055', '2023-12-20', 22000),
	('ID056', '2023-12-25', 26000),
	('ID057', '2023-12-28', 27000),
	('ID058', '2023-12-29', 23000),
	('ID059', '2023-12-30', 24000),
	('ID060', '2023-12-31', 29000);

-- Dumping structure for table k_atk.tb_user
CREATE TABLE IF NOT EXISTS `tb_user` (
  `user_id` char(3) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table k_atk.tb_user: ~0 rows (approximately)
REPLACE INTO `tb_user` (`user_id`, `username`, `password`) VALUES
	('01A', 'admin', 'admin2611');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
