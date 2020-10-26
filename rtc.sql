-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.11-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para rtc
CREATE DATABASE IF NOT EXISTS `rtc` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `rtc`;

-- Copiando estrutura para tabela rtc.associados
CREATE TABLE IF NOT EXISTS `associados` (
  `pkassociado` int(11) NOT NULL,
  `txnomeassociado` char(200) NOT NULL,
  `fkcargo` int(11) NOT NULL,
  `dtentradaassociado` date NOT NULL,
  PRIMARY KEY (`pkassociado`),
  KEY `FK_associados_cargos` (`fkcargo`),
  CONSTRAINT `FK_associados_cargos` FOREIGN KEY (`fkcargo`) REFERENCES `cargos` (`pkcargo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Tabela contando todos os associados do clube';

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela rtc.cargos
CREATE TABLE IF NOT EXISTS `cargos` (
  `pkcargo` int(11) NOT NULL,
  `txcargo` char(200) NOT NULL,
  PRIMARY KEY (`pkcargo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Tabela contendo todos os cargos ';

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela rtc.mensalidades
CREATE TABLE IF NOT EXISTS `mensalidades` (
  `pkmensalidade` int(11) NOT NULL,
  `txnomemes` char(20) NOT NULL DEFAULT '',
  `vlmensalidade` float NOT NULL DEFAULT 0,
  `dtmensalidade` date NOT NULL,
  PRIMARY KEY (`pkmensalidade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Tabela contendo todas as mensalidades do clube ';

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela rtc.pagamentos
CREATE TABLE IF NOT EXISTS `pagamentos` (
  `pkpagamentos` int(11) NOT NULL,
  `fkassociado` int(11) NOT NULL,
  `fkmensalidade` int(11) NOT NULL,
  `dtpagamento` date NOT NULL,
  PRIMARY KEY (`pkpagamentos`),
  KEY `FK__associados` (`fkassociado`),
  KEY `FK__mensalidades` (`fkmensalidade`),
  CONSTRAINT `FK__associados` FOREIGN KEY (`fkassociado`) REFERENCES `associados` (`pkassociado`) ON DELETE NO ACTION,
  CONSTRAINT `FK__mensalidades` FOREIGN KEY (`fkmensalidade`) REFERENCES `mensalidades` (`pkmensalidade`) ON DELETE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Exportação de dados foi desmarcado.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
