CREATE TABLE `usuarios` (
  `id_usuario` bigint PRIMARY KEY AUTO_INCREMENT,
  `nombre_usuario` varchar(50) UNIQUE NOT NULL,
  `password_hash` varchar(255) NOT NULL,
  `fecha_nacimiento` timestamp NOT NULL,
  `correo` varchar(255) UNIQUE NOT NULL,
  `foto` longblob
);
