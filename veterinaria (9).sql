-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-06-2022 a las 03:05:00
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
(26, 1111111, 'Franco', 'Soria', 'Mitre 333', 2666666, 'Juan', 1),
(28, 33333, 'Julio', 'suarez', 'Mitre 1234', 26666777, 'Juan', 1),
(30, 22222, 'Mariana', 'Soria', 'Mitre 333', 2666666, 'Florencia', 1),
(31, 44444, 'Juan Jose', 'Lopez', 'Lavalle 555', 26666777, 'Florencia', 1),
(33, 55555, 'Julio', 'Lopez', 'Lavalle 555', 2668888, 'Florencia', 1);

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
  `detallesConsulta` varchar(50) NOT NULL,
  `activo` tinyint(4) NOT NULL,
  `pesoConsulta` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `consulta`
--

INSERT INTO `consulta` (`idConsulta`, `precio`, `fechaConsulta`, `idMascota`, `idTratamiento`, `detallesConsulta`, `activo`, `pesoConsulta`) VALUES
(44, 500, '2022-06-17', 234, 26, '', 1, 20),
(45, 30000, '2015-06-11', 237, 25, 'cirugia de urgencia -cesarea', 1, 200),
(46, 1200, '2018-06-12', 234, 30, 'baja de peso ', 1, 17),
(47, 2000, '2016-01-19', 237, 34, 'control de 4 meses', 1, 150),
(48, 5000, '2022-06-09', 238, 25, 'cirugia de urgencia -columna rota', 1, 8),
(49, 1000, '2022-06-02', 234, 26, '', 1, 16);

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
(234, 'Kitty', 'Hembra', 'felino', 'Angora', 'atigrado', '2022-06-02', 25.5, 1, 30, 17),
(235, 'Pepe', 'Macho', 'ave', 'loro', 'verde', '2016-06-16', 0.5, 1, 33, 0.51),
(236, 'Bruno', 'Macho', 'Canino', 'Pitbull', 'atigrado', '2012-06-02', 35.5, 1, 28, 32.5),
(237, 'Mili', 'Hembra', 'caballo', 'ninguna', 'marron', '2012-06-08', 200, 1, 26, 215),
(238, 'Bola de Nieve', 'Macho', 'felino', 'ninguna', 'negro', '2017-06-10', 10.7, 1, 30, 12);

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
(7, 'vacunacion', 'rutina 6 meses- 1° dosis', 'Parvovirus', 300, 1),
(8, 'enfermedad', 'poco apaetito, decaimiento, vision  borrosa', 'vitaminas', 500, 1),
(13, 'cirugia', 'corte', 'pildoras', 12389, 1),
(15, 'cirugia', 'corte', 'pildoras', 12389, 1),
(16, 'baño', 'masajes', 'pildoras', 12389, 1),
(17, 'cirugia', 'corte', 'pildoras', 12389, 1),
(18, 'enfermedad', 'gritos', 'pastillas', 1.4, 1),
(19, 'enfermedad', 'dolores', 'analgesicos', 400.2, 1),
(20, 'cirugia', 'sdfksd', 'dfsdfs', 12, 0),
(22, 'vacunacion', 'corte', 'pildoras', 1238.2, 0),
(23, 'vacunacion', 'ada', 'adad', 12122, 1),
(24, 'vacunacion', 'ada', 'adad', 12122, 0),
(25, 'cirugia', 'Accidente', 'Antibioticos', 3000, 0),
(26, 'castracion', 'Se aplican inyecciones, cirugia, dias de reposo en clinica', 'Analgesicos', 3000, 0),
(27, 'castracion', 'Se aplican inyecciones, cirugia, dias de reposo en clinica', 'Analgesicos', 3000, 0),
(28, 'cirugia', 'Estomago	', 'analgesicos', 5000, 1),
(29, 'vacunas', 'antirrabicas	', 'vacunas', 1500, 1),
(30, 'Control veterinario', 'Peso, lavado y corte de pelo, cepillado.', 'vitaminas', 1.2, 0),
(31, 'cirugia', 'cirugia de columna', 'varios', 12000, 0),
(32, 'vacunacion', 'rutina 6 meses- 1° dosis', 'Parvovirus', 400, 1),
(33, 'vacunacion', 'rutina 6 meses- 1° dosis', 'Parvovirus', 400, 1),
(34, 'control', 'se controla a la mascota			', 'ninguno', 500.56, 1),
(35, 'jdkajds', 'dkñakdñal	', 'adkñlaskñ', 1500.3, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD UNIQUE KEY `dni_2` (`dni`);

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
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de la tabla `consulta`
--
ALTER TABLE `consulta`
  MODIFY `idConsulta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `idMascota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=239;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `idTratamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

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
