Entrada = str(input("Digite os itens que serão utilizados na entrada: "))

print(f"Com o {Entrada} em mãos, é realizado o processo da troca do pneu")

atividade = True

while atividade:
    Saida = str(input("Gostaria de finalizar o processo: "))

    if Saida == "sim":
        print("O processo da troca de pneu do carro foi finalizado")
        atividade = False 

    elif Saida == "não":
        print("Okey, quando você quiser")

print("tenha uma boa vaigem")