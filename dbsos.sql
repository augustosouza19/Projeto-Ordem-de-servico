-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 19-Nov-2017 às 16:54
-- Versão do servidor: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbinfox`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbclientes`
--

CREATE TABLE `tbclientes` (
  `idcli` int(11) NOT NULL,
  `nomecli` varchar(50) NOT NULL,
  `endcli` varchar(100) DEFAULT NULL,
  `fonecli` varchar(50) NOT NULL,
  `emailcli` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbclientes`
--

INSERT INTO `tbclientes` (`idcli`, `nomecli`, `endcli`, `fonecli`, `emailcli`) VALUES
(8, 'Fátima Bonemer', 'Rua Barra', '2232-3345', 'encontro@globo.com'),
(9, 'Fausto Silva', 'Rua Ipanema', '2232-3454', 'fausto@globo.com'),
(10, 'Sivio Santos', 'Rua da Lapa', '3343-4564', 'gss@sol.com.br'),
(11, 'Ana Maria Braga', 'Rua Jardim Botanico', '4455-6755', 'maisvc@globo.com'),
(12, 'Louro José', 'Casinha do mais vc', '2235-4559', 'puxasacodaana@globo.com'),
(13, 'Ana Hickman', 'Rua Itu', '2235-4556', 'hjemdia@record.com'),
(14, 'JAMES AGUIAR', 'BRASILIA ende', '9817-0006', 'james@james.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbos`
--

CREATE TABLE `tbos` (
  `os` int(11) NOT NULL,
  `data_os` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `tipo` varchar(150) NOT NULL,
  `situacao` varchar(150) NOT NULL,
  `equipamento` varchar(150) NOT NULL,
  `defeito` varchar(150) NOT NULL,
  `servico` varchar(150) DEFAULT NULL,
  `tecnico` varchar(150) DEFAULT NULL,
  `valor` decimal(10,2) DEFAULT NULL,
  `idcli` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbos`
--

INSERT INTO `tbos` (`os`, `data_os`, `tipo`, `situacao`, `equipamento`, `defeito`, `servico`, `tecnico`, `valor`, `idcli`) VALUES
(19, '2016-12-30 01:03:52', 'ORÇAMENTO', 'AGUARDANDO APROVACAO', 'Lapela', 'Abafamento de som', 'Troca de espuma', 'Marcelo', '40.00', 8),
(20, '2016-12-30 01:06:38', 'ORÇAMENTO', 'AGUARDANDO PECAS', 'Microfone', 'áudio sem volume', 'Troca pilhas', 'Santos', '99.00', 9),
(21, '2016-12-30 01:09:49', 'ORÇAMENTO', 'ENTREGA OK', 'Carro', 'Problemas no carburador', 'Troca de peças', 'Luís', '450.00', 10),
(22, '2016-12-30 01:14:55', 'ORÇAMENTO', 'ORCAMENTO REPROVADO', 'Fogão', 'Problemas no gás', 'Troca de porcas', 'Geraldo', '250.00', 11),
(23, '2016-12-30 01:19:50', 'ORÇAMENTO', 'AGUARDANDO APROVACAO', 'Roupa de Mascote', 'Troca de Espuma e Tecido', 'Troca de itens', 'Sergião', '2500.00', 12),
(24, '2016-12-30 01:21:35', 'ORÇAMENTO', 'AGUARDANDO PECAS', 'Sapato', 'Salto quebrado', 'Troca de Salto', 'Didi', '200.00', 13),
(25, '2017-05-27 21:38:37', 'ORÇAMENTO', 'AGUARDANDO PECAS', 'Iphone', 'Bateria', 'trocar bateria', 'james', '2650.00', 8),
(26, '2017-05-29 23:21:58', 'ORDEM DE SERVIÇO', 'ORCAMENTO REPROVADO', 'Iphone 6', 'Não liga', '', 'José Aldo', '0.00', 14),
(27, '2017-11-08 22:56:50', 'ORÇAMENTO', 'AGUARDANDO APROVACAO', 'iPHONE', 'FONTE DEFEITO', 'TROCA DA ', 'JAMESSSS', '50.00', 14);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbusuario`
--

CREATE TABLE `tbusuario` (
  `iduser` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `fone` varchar(15) DEFAULT NULL,
  `login` varchar(15) NOT NULL,
  `senha` varchar(15) NOT NULL,
  `perfil` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbusuario`
--

INSERT INTO `tbusuario` (`iduser`, `usuario`, `fone`, `login`, `senha`, `perfil`) VALUES
(9, 'Fabrício Pinheiro Machado', '2234-3446', 'fabipin', '887876', 'user'),
(7, 'Bono Vox', '2232-4456', 'admin', 'admin', 'admin'),
(8, 'Mario César Dantas', '2232-3343', 'mariod', '2212', 'user'),
(4, 'Fabiana Maranhão Duarte Peña', '2234-7634', 'fabi22', '22323', 'user'),
(5, 'Brenda Alquerque Lima França', '2234-6567', 'br32', '2232', 'user'),
(6, 'Daiana Caxias', '2234-3432', 'dxss', '2234', 'user'),
(3, 'Adam Cleyton', '2567-5542', 'adam', '123', 'admin'),
(10, 'Sasha Cordeiro Pontes', '4435-5346', 'sashaxuxa', '42325', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbclientes`
--
ALTER TABLE `tbclientes`
  ADD PRIMARY KEY (`idcli`);

--
-- Indexes for table `tbos`
--
ALTER TABLE `tbos`
  ADD PRIMARY KEY (`os`),
  ADD KEY `idcli` (`idcli`),
  ADD KEY `idcli_2` (`idcli`);

--
-- Indexes for table `tbusuario`
--
ALTER TABLE `tbusuario`
  ADD PRIMARY KEY (`iduser`),
  ADD UNIQUE KEY `login` (`login`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbclientes`
--
ALTER TABLE `tbclientes`
  MODIFY `idcli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `tbos`
--
ALTER TABLE `tbos`
  MODIFY `os` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `tbos`
--
ALTER TABLE `tbos`
  ADD CONSTRAINT `idcli` FOREIGN KEY (`idcli`) REFERENCES `tbclientes` (`idcli`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
