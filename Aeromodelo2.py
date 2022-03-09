print("\nBem-vindo ao sistema. Siga as teclas de comando:\n\n0. Acelerar\n1. Decolar\n2. Planar\n3. Piloto automatico\n4. Pousar\n9. Ligar\n8. Desligar")
comandos = [0, 1, 2, 3, 4, 8, 9]
acoes = ["Acelerando...", "Decolando...", "Planando...", "Piloto automatico...", "Pousando...", "Desligando sistema.\nDesligado com sucesso", "Sistema ligado com sucesso."]
ligado = False

while(ligado == False):
    try:
        escolher = int(input("\nSistema desligado. Pressione < 9 > para ligar: "))
    except ValueError:
            print("Erro, esse comando não existe.")
            continue
    if (escolher in comandos):
        if escolher == 9:
            ligado = True
            print("Iniciando sistema, aguarde um momento...\n\nSistema ligado com sucesso.")
        else:
            print("Sistema desligado. Por favor, pressione < 9 > para ligar: ")
    else:
        print("Erro, esse comando não existe.")


    while(ligado == True):
        try:
            escolher = int(input("\nPressione uma tecla de comando para executar uma ação: "))
        except ValueError:
            print("Erro, esse comando não existe.")
            continue

        for x in range (0, escolher + 1):
            if (x == escolher):
                print(acoes[x])









'''
        if escolher == 0:
            print(acoes[0])

        elif escolher == 2:
            print(acoes[2])

        elif escolher == 3:
            print(acoes[3])

        elif escolher == 4:
            print(acoes[4])

        elif escolher == 8:
            print(acoes[5])
            ligado == False
'''