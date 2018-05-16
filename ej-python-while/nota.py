contador = 1
limite = 3
promedio = 0

cadena = "{0:15}{1:15}{2:15}{3:15}{4:15}\n".format("Nombre", "Nota1", "Nota2", "Nota3", "Promedio")
while contador <= limite:
    nombre = input("Ingrese su nombre: \n")
    Nota1 = input("Ingrese Nota1: \n")
    Nota2 = input("Ingrese Nota2: \n")
    Nota3 = input("Ingrese Nota3: \n")
    suma = (float(Nota1) + float(Nota2) + float(Nota3))

    promedio = float(suma / limite)

    contador = contador + 1

    cadena = "{0}{1:15}{2:15}{3:15}{4:15}{5:<15}\n".format(cadena, nombre, Nota1, Nota2, Nota3, promedio)

print(cadena)