## Delimitación tecnológica
Para Vitalis SV proponemos desarrollar una aplicación de escritorio que permita administrar pacientes, médicos y citas. Trabajaremos con Java SE y Microsoft SQL Server. Las siguientes versiones y recursos serán nuestra referencia para el desarrollo y las pruebas.

Utilizaremos Java SE 21 con Oracle JDK 21.0.12+7 y Swing para crear las ventanas y los formularios. Organizaremos el código separando la interfaz, las validaciones y la conexión con la base de datos. No utilizaremos un marco de trabajo web, porque el prototipo funcionará como una aplicación de escritorio.

Para guardar la información proponemos Microsoft SQL Server 2022 Developer, actualización CU27, compilación 16.0.4295.3. La conexión con Java se realizará mediante Microsoft JDBC Driver for SQL Server 12.10.2. Incluiremos validaciones para evitar citas duplicadas y conflictos de horarios, además de consultas y reportes básicos. También registraremos los medicamentos indicados por el médico.

Como requisitos mínimos de referencia, proponemos un procesador x64 compatible con Windows 11, 8 GB de memoria RAM y 20 GB de espacio libre para las herramientas y los datos de prueba, aparte del espacio ocupado por Windows. Recomendamos usar un SSD para agilizar la carga. Usaremos como referencia Windows 11 Home 24H2 de 64 bits. Comprobaremos mediante pruebas si estos recursos permiten trabajar adecuadamente con el prototipo.

La aplicación y la base de datos funcionarán en el mismo equipo. Realizaremos las pruebas con información ficticia y una cantidad limitada de registros. El alcance no incluirá aplicaciones móviles, servicios en la nube ni conexiones con los sistemas reales del Instituto Salvadoreño del Seguro Social.

Antes de las pruebas registraremos el modelo del procesador, la memoria, el almacenamiento y la compilación exacta de Windows del equipo utilizado. En GitHub guardaremos el código, las versiones, los scripts de la base de datos y las instrucciones de ejecución. Esto permitirá repetir las pruebas y documentar los cambios.
