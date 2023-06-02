# EXAMEN DE RECUPERACIÓN PROGRAMACIÓN  

## 1er trimestre
1. El paradigma que defiende que la implementación de un programa se divida de forma
sucesiva en subproblemas es:

2. ¿Cómo se denomina el paradigma de programación que basa la implementación de
   todos los programas en 3 tipos de estructuras? ¿Qué tipos de estructuras emplea?

3. Si la clase A hereda de B, y B hereda de C:

   a. A también hereda de C.

   b. Elementos declarados de tipo A podrán almacenar elementos declarados de
   tipo B.

   c. Elementos declarados de tipo A podrán almacenar elementos declarados de
   tipo C.

   d. Todas las opciones anteriores son incorrectas.

4. Para la creación de una instancia de una clase (objeto), se hace uso de los métodos

5. ¿Qué instrucción imprime por pantalla un salto de línea retorno de carro al final del
   texto que recibe?
   a. System.out.write
   b. System.out.print
   c. System.out.println
   d. Todas las opciones anteriores son incorrectas.

6. Si se desea ejecutar un bloque de instrucciones hasta que se cumple una condición,
   pero que se ejecute como mínimo una vez, se deberá emplear:

   a. While

   b. Do while

   c. For

   d. Todas las opciones anteriores son correctas.

7. Implementa un programa que genere 100 números e imprima por pantalla, por cada
   uno de ellos, si se trata de un número par, impar, o si es 0. Al finalizar, deberá
   informar del recuento de 0, pares e impares generados. Realiza también su
   pseudocódigo y diagrama de flujo.

## 2º Trimestre

1. Se desea realizar una aplicación Java para la gestión de un instituto, almacenando
   sus especialidades, alumnos y profesores.

   De las especialidades hay que almacenar su identificador y su nombre.
   Sobre los miembros del instituto se deberán almacenar los datos propios de
   persona (el DNI, el nombre, la edad y la dirección) y la fecha de incorporación al
   centro como atributo propio. Existirán 2 tipos de miembros: alumnos y profesores.
   En el caso de los alumnos, se almacenará el ciclo que se encuentra realizando, su
   media de notas y el importe de su matrícula.

   Para los profesores se registrará el tipo de jornada (parcial o completa), su sueldo
   y la especialidad que imparte.

   En cuanto a los constructores, en cada clase deberá existir uno por defecto que
   asigne valores a todos los atributos, propios y heredados; y otro parametrizado con
   todos los atributos.

   Existirá un método común a alumnos y profesores, aplicarBonificacion, que en
   función de la clase sobre la que se implemente, actuará de una manera u otra. En el
   caso de los alumnos, si el alumno se ha incorporado al centro hace más de 2 años,
   el importe de su matrícula se verá reducido en un 10%. En el caso de profesores, si
   su incorporación al centro fue hace más de 3 años, su sueldo se incrementará en un
   15%.

   Por último, desarrolla una clase ejecutable que realice lo siguiente:

    Cree un array de Miembros de 10 posiciones.

    Asigna a cada posición un objeto de las clases anteriores con los valores que
   desees, haciendo uso de los distintos constructores de cada clase.

    Ahora, recorre este array y ejecuta el método aplicarBonificacion().

    Muestra la media de salario de profesores

## 3º Trimestre

1. Se desea realizar una aplicación Java para la gestión de un almacén de bebidas,
   almacenando los productos que éste distribuye y los comerciales que distribuyen
   dichos productos.

   De los productos se almacenará su precio y su nombre, y podrán ser de las
   categorías bebida azucarada y agua mineral. Las bebidas azucaradas tendrán un
   atributo propio denominado porcentajeAzucar, mientras que el agua mineral tendrá
   un atributo denominado manantial.

   De los comerciales se almacenará su nombre, apellidos, edad y zona asignada
   (zona 1, zona 2 o zona 3).

   Además, se deberá llevar un registro de los productos que ha ido distribuyendo cada
   comercial a lo largo del tiempo, en una estructura de clave (identificador de tipo
   numérico), valor

   Con respecto a los constructores, en cada clase deberá existir uno por defecto que
   asigne valores a todos los atributos, propios y heredados; y otro parametrizado con
   todos los atributos.

   Por último, desarrolla una clase ejecutable que realice lo siguiente:
    Crear una lista de productos y otra de comerciales.

    Cubrir los datos de cada producto (No hace falta recogerlos por teclado).

    Recorrer la lista de productos y comprobar que el precio sea correcto. Para ello,
   se lanzará una excepción informando de lo sucedido en caso de que el precio
   introducido sea un número negativo. Se deberá crear una clase para la
   excepción.

    Elimina de la lista aquellos productos con un porcentaje de azúcar superior al
   10%, ya que no se distribuyen en el almacén.

    Calcula el coste medio de las bebidas azucaradas.

   FICHEROS

2. Programa que cree una carpeta en una ruta introducida por teclado, y dos archivos
   en dicha carpeta. A continuación listar sus nombres, si tiene permisos de lectura y
   escritura, y su tamaño en KB. Posteriormente, eliminar uno de ellos.
   NOTA: REALIZAR ÚNICAMENTE PARA RECUPERACIÓN DEL 3er TRIMESTRE Y
   FICHEROS.

3. Utilizando ficheros binarios, implementa un programa que, partiendo de un fichero
   con nombres de películas, permita añadir, modificar y eliminar elementos. Para
   eliminar o modificar, se solicitará primero por teclado al usuario el nombre de la
   película a modificar o borrar