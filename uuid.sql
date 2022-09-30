-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 30, 2022 at 02:10 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rent`
--

-- --------------------------------------------------------

--
-- Table structure for table `uuid`
--

CREATE TABLE `uuid` (
  `UUID` varchar(256) NOT NULL,
  `Tenet_Name` varchar(15) NOT NULL,
  `Tenet_Phone` varchar(13) NOT NULL,
  `Tenet_Room` varchar(20) NOT NULL,
  `Rent` int(20) NOT NULL,
  `file` mediumblob NOT NULL,
  `date` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `uuid`
--

INSERT INTO `uuid` (`UUID`, `Tenet_Name`, `Tenet_Phone`, `Tenet_Room`, `Rent`, `file`, `date`) VALUES
('12550330-cfdd-4e0a-a084-598c83e0134f', 'kishore', '9884781834', 'BR1', 30000, 0x255044462d312e340a25e2e3cfd30a322030206f626a0a3c3c2f46696c7465722f466c6174654465636f64652f4c656e677468203335383e3e73747265616d0a789cb5535d6f8230147de757dcc7eda1d252d062e28b03331fe62663d97385ebec84c2a0cef8ef87595c6602cec4791e9a3639f7dc733ffa618d638bf741d03ec4a9458130b1bfd81306cc817869ddc065b87f7c790e210a677173dc85d3a7f8cf90dbf8bd71428f0cdd04d2200cc1a18e43a84f38bdd0d711264505f30d560aeb26874f051d78035fb05627671a8e3041551a98068d24733c8f724e49b24c53e222954452e112cf1789e04819779767263b8d5691d1bfa1553e468d066632df0f68adea5551e10962b92a3482dee40bacf6dd16c21d0826b87b22a62a8afc27641cb50fe6ca6546a8cda1cd23004e1bb4121fa4d246ea04bf894e07edb5d9e80ac62acb0e7aadb430c3c4542a5166b7a7b95d594937da1b5b1899fd2ac7f53a84afdcd6003f312b4a4c41ea1402ac957e6b1e8b5db31b2b63ca7a68dbdbedb69729bdc654e95e52e4b6d236669b5c66529192f425775cca7ccfeefc0c616ccdad2fe26113530a656e6473747265616d0a656e646f626a0a342030206f626a0a3c3c2f436f6e74656e74732032203020522f547970652f506167652f5265736f75726365733c3c2f50726f63536574205b2f504446202f54657874202f496d61676542202f496d61676543202f496d616765495d2f466f6e743c3c2f46312031203020523e3e3e3e2f506172656e742033203020522f4d65646961426f785b30203020353935203834325d3e3e0a656e646f626a0a312030206f626a0a3c3c2f537562747970652f54797065312f547970652f466f6e742f42617365466f6e742f48656c7665746963612f456e636f64696e672f57696e416e7369456e636f64696e673e3e0a656e646f626a0a332030206f626a0a3c3c2f4b6964735b34203020525d2f547970652f50616765732f436f756e7420312f4954585428352e312e30293e3e0a656e646f626a0a352030206f626a0a3c3c2f547970652f436174616c6f672f50616765732033203020523e3e0a656e646f626a0a362030206f626a0a3c3c2f4d6f644461746528443a32303232303933303136343531332b303527333027292f4372656174696f6e4461746528443a32303232303933303136343531332b303527333027292f50726f6475636572286954657874ae20352e312e3020a9323030302d323031312031543358542042564241293e3e0a656e646f626a0a787265660a3020370a303030303030303030302036353533352066200a30303030303030353937203030303030206e200a30303030303030303135203030303030206e200a30303030303030363835203030303030206e200a30303030303030343430203030303030206e200a30303030303030373438203030303030206e200a30303030303030373933203030303030206e200a747261696c65720a3c3c2f496e666f2036203020522f4944205b3c36336162393262343461613966343564653635633032316161383462306566653e3c31393733656439666365336432666438336537623136636464396263396132663e5d2f526f6f742035203020522f53697a6520373e3e0a7374617274787265660a3932390a2525454f460a, '2022-09-30'),
('2951a1c9-1101-4a43-817a-035eb8af467d', 'elumalai', '9080758981', 'tr1', 4500, 0x255044462d312e340a25e2e3cfd30a322030206f626a0a3c3c2f46696c7465722f466c6174654465636f64652f4c656e677468203335323e3e73747265616d0a789cb5934f4fc24010c5effd1473d4c3d2ddfea325e1822d918328b8c6f3d20eb2baddd6b248f8f6160918925648907768bac96f66debe4e3fad01b7dc00421a00cf2c0a8485db177bc88039c0e7d60d5ca6fbc797e704a6c998d78fbb64f4c44f96dcf2f7da093d3274130b83d003873a0ea11171e985be8e342c2a98acb092b8ac674434a45dbf1b85acd1c99986a798a22c0d8ce2adedc86782a511618c32e209cf2521eb0a425d1f67a1987b41373b73d8093576e9ff9b1adb73d468602cf2ed1742b5ca8512f20fb25c141a41aff2195687bcc3b6bc77355551e487125335a357bee714b5d9e7dc07f07c4a1bb90721b5113ac51de7b460aff54a5730904afd606e0b96284c4d25536936bba9412346dad51c6b6184fabd8cdfd6f7ca99c6f885aa283103a133887129f55b7d986deac55818532e7bb6bd5eaf3b4aea0fcca4eea4456e4b6defd78c942410aee35116f976ebaf90706b627d030109136e0a656e6473747265616d0a656e646f626a0a342030206f626a0a3c3c2f436f6e74656e74732032203020522f547970652f506167652f5265736f75726365733c3c2f50726f63536574205b2f504446202f54657874202f496d61676542202f496d61676543202f496d616765495d2f466f6e743c3c2f46312031203020523e3e3e3e2f506172656e742033203020522f4d65646961426f785b30203020353935203834325d3e3e0a656e646f626a0a312030206f626a0a3c3c2f537562747970652f54797065312f547970652f466f6e742f42617365466f6e742f48656c7665746963612f456e636f64696e672f57696e416e7369456e636f64696e673e3e0a656e646f626a0a332030206f626a0a3c3c2f4b6964735b34203020525d2f547970652f50616765732f436f756e7420312f4954585428352e312e30293e3e0a656e646f626a0a352030206f626a0a3c3c2f547970652f436174616c6f672f50616765732033203020523e3e0a656e646f626a0a362030206f626a0a3c3c2f4d6f644461746528443a32303232303933303136333633352b303527333027292f4372656174696f6e4461746528443a32303232303933303136333633352b303527333027292f50726f6475636572286954657874ae20352e312e3020a9323030302d323031312031543358542042564241293e3e0a656e646f626a0a787265660a3020370a303030303030303030302036353533352066200a30303030303030353931203030303030206e200a30303030303030303135203030303030206e200a30303030303030363739203030303030206e200a30303030303030343334203030303030206e200a30303030303030373432203030303030206e200a30303030303030373837203030303030206e200a747261696c65720a3c3c2f496e666f2036203020522f4944205b3c33303432386463323434363265373039383864323366373730633138323332303e3c63376630663935666434636264393132343939653736396335333837633964333e5d2f526f6f742035203020522f53697a6520373e3e0a7374617274787265660a3932330a2525454f460a, '2022-09-30');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `uuid`
--
ALTER TABLE `uuid`
  ADD PRIMARY KEY (`UUID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
