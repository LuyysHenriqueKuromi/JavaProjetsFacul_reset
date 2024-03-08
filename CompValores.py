X = int(input("Digite o primeiro valor: "))
Y = int(input("Digite o segundo valor: "))

if X > Y:
    print(f"O maior valor é {X}")
elif Y > X:
    print(f"O maior valor é {Y}")
else:
    print("Não existe valor maior, ambos tem o mesmo valor")
