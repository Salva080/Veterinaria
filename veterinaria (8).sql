-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-06-2022 a las 17:00:35
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `veterinaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` int(11) NOT NULL,
  `contactoAlternativo` varchar(50) NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `dni`, `nombre`, `apellido`, `direccion`, `telefono`, `contactoAlternativo`, `activo`) VALUES
(15, 33333, 'Franco', 'Soria', 'Mitre 333', 2666666, 'Juan', 1),
(16, 44444, 'Mariana', 'Soria', 'Mitre 333', 2666666, 'Martin', 1),
(17, 22222, 'Julio', 'Franz', 'Lavalle 555', 2668888, 'Florencia', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consulta`
--

CREATE TABLE `consulta` (
  `idConsulta` int(11) NOT NULL,
  `precio` double NOT NULL,
  `fechaConsulta` date NOT NULL,
  `idMascota` int(11) NOT NULL,
  `idTratamiento` int(11) NOT NULL,
  `activo` tinyint(4) NOT NULL,
  `pesoConsulta` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `consulta`
--

INSERT INTO `consulta` (`idConsulta`, `precio`, `fechaConsulta`, `idMascota`, `idTratamiento`, `activo`, `pesoConsulta`) VALUES
(15, 500, '2022-06-06', 25, 7, 1, 20),
(24, 500, '2022-06-15', 23, 16, 0, 2.5),
(27, 300, '2022-06-07', 25, 16, 1, 35),
(30, 500, '2022-06-02', 23, 16, 1, 2.5),
(32, 120, '2022-06-02', 23, 16, 1, 5.5),
(33, 355, '2022-06-30', 23, 13, 1, 7),
(34, 500, '2016-06-01', 59, 8, 1, 5.5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `idMascota` int(11) NOT NULL,
  `alias` varchar(50) NOT NULL,
  `sexo` varchar(50) NOT NULL,
  `especie` varchar(50) NOT NULL,
  `raza` varchar(50) NOT NULL,
  `colorPelaje` varchar(50) NOT NULL,
  `fechaNac` date NOT NULL,
  `pesoMascota` double NOT NULL,
  `activo` tinyint(1) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `pesoActual` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`idMascota`, `alias`, `sexo`, `especie`, `raza`, `colorPelaje`, `fechaNac`, `pesoMascota`, `activo`, `idCliente`, `pesoActual`) VALUES
(23, 'Kitty', 'Hembra', 'felino', 'Angora', 'gris', '2019-06-28', 3.2, 1, 15, 0),
(25, 'Bruno', 'Macho', 'Canino', 'Pitbull', 'atigrado', '2012-06-13', 30, 1, 16, 0),
(29, 'Pepe', 'Macho', 'ave', 'loro', 'verde', '2012-06-07', 0.1, 1, 17, 0),
(35, 'Mili', 'Hembra', 'felino', 'pichichu', 'atigrado', '2012-06-07', 5, 1, 17, 0),
(59, 'Pepita', 'Femenino', 'ave', 'loro', 'verde', '2022-02-10', 39, 1, 15, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `idTratamiento` int(11) NOT NULL,
  `tipoTratamiento` varchar(50) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `medicamento` varchar(100) NOT NULL,
  `precio` double NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`idTratamiento`, `tipoTratamiento`, `descripcion`, `medicamento`, `precio`, `activo`) VALUES
(7, 'vacunacion', 'rutina 6 meses- 1° dosis', 'Parvovirus', 1200, 1),
(8, 'enfermedad', 'poco apaetito, decaimiento, vision  borrosa', 'vitaminas', 500, 1),
(12, 'baño', 'masajes', 'pildoras', 12389, 1),
(13, 'cirugia', 'corte', 'pildoras', 12389, 1),
(14, 'baño', 'masajes', 'pildoras', 12389, 1),
(15, 'cirugia', 'corte', 'pildoras', 12389, 1),
(16, 'baño', 'masajes', 'pildoras', 12389, 1),
(17, 'cirugia', 'corte', 'pildoras', 12389, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `consulta`
--
ALTER TABLE `consulta`
  ADD PRIMARY KEY (`idConsulta`),
  ADD KEY `idTratamiento` (`idTratamiento`) USING BTREE,
  ADD KEY `idMascota` (`idMascota`) USING BTREE;

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`idMascota`),
  ADD KEY `idCliente_2` (`idCliente`),
  ADD KEY `idCliente` (`idCliente`) USING BTREE;

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`idTratamiento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `consulta`
--
ALTER TABLE `consulta`
  MODIFY `idConsulta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `idMascota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=234;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `idTratamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `consulta`
--
ALTER TABLE `consulta`
  ADD CONSTRAINT `consulta_ibfk_2` FOREIGN KEY (`idMascota`) REFERENCES `mascota` (`idMascota`),
  ADD CONSTRAINT `consulta_ibfk_3` FOREIGN KEY (`idTratamiento`) REFERENCES `tratamiento` (`idTratamiento`);

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
