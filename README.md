## Delimitación tecnológica
Para Vitalis SV proponemos desarrollar una aplicación de escritorio que permita administrar pacientes, médicos y citas. Trabajaremos con Java SE y Microsoft SQL Server. Las siguientes versiones y recursos serán nuestra referencia para el desarrollo y las pruebas.

Utilizaremos Java SE 21 con Oracle JDK 21.0.12+7 y Swing para crear las ventanas y los formularios. Organizaremos el código separando la interfaz, las validaciones y la conexión con la base de datos. No utilizaremos un marco de trabajo web, porque el prototipo funcionará como una aplicación de escritorio.

Para guardar la información proponemos Microsoft SQL Server 2022 Developer, actualización CU27, compilación 16.0.4295.3. La conexión con Java se realizará mediante Microsoft JDBC Driver for SQL Server 12.10.2. Incluiremos validaciones para evitar citas duplicadas y conflictos de horarios, además de consultas y reportes básicos. También registraremos los medicamentos indicados por el médico.

Como requisitos mínimos de referencia, proponemos un procesador x64 compatible con Windows 11, 8 GB de memoria RAM y 20 GB de espacio libre para las herramientas y los datos de prueba, aparte del espacio ocupado por Windows. Recomendamos usar un SSD para agilizar la carga. Usaremos como referencia Windows 11 Home 24H2 de 64 bits. Comprobaremos mediante pruebas si estos recursos permiten trabajar adecuadamente con el prototipo.

La aplicación y la base de datos funcionarán en el mismo equipo. Realizaremos las pruebas con información ficticia y una cantidad limitada de registros. El alcance no incluirá aplicaciones móviles, servicios en la nube ni conexiones con los sistemas reales del Instituto Salvadoreño del Seguro Social.

Antes de las pruebas registraremos el modelo del procesador, la memoria, el almacenamiento y la compilación exacta de Windows del equipo utilizado. En GitHub guardaremos el código, las versiones, los scripts de la base de datos y las instrucciones de ejecución. Esto permitirá repetir las pruebas y documentar los cambios.


Delimitación teórica

El presente proyecto se fundamenta teóricamente en el área de los sistemas de información aplicados al sector salud, específicamente en la gestión y organización de citas médicas. Un sistema de información puede entenderse como un conjunto de elementos relacionados que permiten recopilar, procesar, almacenar y proporcionar información para apoyar las actividades de una organización. En este contexto, Vitalis SV se plantea como una herramienta orientada a mejorar la administración de las citas y facilitar el acceso organizado a la información de pacientes y profesionales de la salud.

La propuesta se fundamenta en los principios de la gestión de citas médicas, entendida como el conjunto de procedimientos utilizados para organizar la atención de los pacientes de acuerdo con la disponibilidad de los médicos, fechas y horarios establecidos. Una adecuada gestión permite reducir conflictos de horarios, evitar la duplicación de citas y contribuir a una distribución ordenada de los pacientes. Por medio del sistema se busca que la información relacionada con las citas pueda registrarse, modificarse, consultarse y mantenerse actualizada.

Otro fundamento importante es la gestión de la información del paciente. Para que una institución de salud pueda brindar una atención organizada, es necesario mantener información estructurada sobre los pacientes y sus consultas. En el sistema se contempla el manejo de datos básicos del paciente, información del médico, fecha y hora de la consulta, diagnóstico registrado por el profesional y, cuando corresponda, los medicamentos indicados. El tratamiento de esta información deberá realizarse bajo criterios de confidencialidad, integridad y disponibilidad, considerando que se trata de información relacionada con la atención médica.

El proyecto también se sustenta en los principios de la programación orientada a objetos, paradigma que permite representar los elementos de un sistema mediante clases y objetos que contienen atributos y comportamientos. Bajo este enfoque, los principales elementos del sistema, como pacientes, médicos y citas, pueden ser representados como entidades independientes relacionadas entre sí. La aplicación de conceptos como encapsulamiento, abstracción


## Delimitación expresiva
Vitalis SV nace no solo como una respuesta técnica, sino como un compromiso con la eficiencia y la precisión en el entorno de la gestión médica en El Salvador. Este proyecto se delimita bajo una visión donde la robustez del desarrollo de escritorio se fusiona con la rigurosidad conceptual de los sistemas de información en salud. 

No buscamos construir una solución genérica, sino un prototipo de escritorio de alta fidelidad, cimentado en la arquitectura clásica de Java SE 21 con interfaces visuales en Swing y la potencia transaccional de Microsoft SQL Server 2022. La separación estricta de responsabilidades —desde la interfaz hasta el acceso a datos mediante el driver JDBC 12.10.2— garantiza un código limpio, auditable y mantenible. Al operar de forma local y controlada en un entorno estándar de Windows 11, el sistema se enfoca en resolver con maestría absoluta la lógica crítica del negocio: mitigar conflictos de horarios, erradicar citas duplicadas y estructurar de manera infalible el registro de pacientes, médicos y diagnósticos. 

Desde la perspectiva teórica, Vitalis SV abraza la esencia del paradigma orientado a objetos, transformando entidades del mundo real como pacientes y médicos en abstracciones lógicas perfectamente encapsuladas. Este sustento metodológico asegura que cada consulta, reporte o registro de medicamentos respete los pilares de confidencialidad, integridad y disponibilidad de la información médica. El alcance del proyecto está firmemente acotado a un entorno de pruebas local, transparente y reproducible a través de GitHub, dejando fuera la complejidad de los servicios en la nube o integraciones externas con el ISSS, para concentrar todo el valor en la creación de una base sólida, funcional y escalable para el futuro de la administración clínica.
