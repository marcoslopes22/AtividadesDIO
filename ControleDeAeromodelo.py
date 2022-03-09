# ALUNO: MARCOS AURELIO LOPES DE ARAUJO - IX III XXII
# CURSANDO DESENVOLVIMENTO DE SISTEMAS - ETE PORTO DIGITAL
# ATIVIDADE ADAPTADA

# DESCRIAÇÃO: ATIVIDADE ORIGINAL(GITHUB) > https://github.com/marcoslopes22/EstudosLCPI/blob/main/AtividadeAeromodelo.py <
# CONTROLE REMOTO PARA TESTAR UM O FUNCIONMENTO DE UM AEROMODELO, COM AS FUNÇÕES: LIGAR, DESLIGAR, ACELERAR, DECOLAR, PLANAR, PILOTO AUTOMATICO E POUSAR.

print("\nBem-vindo ao sistema. Siga as teclas de comando:\n\n0. Acelerar\n1. Decolar\n2. Planar\n3. Piloto automatico\n4. Pousar\n9. Ligar\n8. Desligar")
comandos = [0, 1, 2, 3, 4, 8, 9]
acoes = ["Acelerando...", "Decolando...", "Planando...", "Piloto automatico...", "Pousando...", "Aguarde, desligando o sistema....\nDesligado com sucesso.", "Sistema ligado com sucesso."]
ligado = False

while(ligado == False):
    try:
        escolher = int(input("\nPressione < 9 > para ligar: "))
    except ValueError:
            print("Erro, esse comando não existe.")
            continue
    if (escolher in comandos):
        if escolher == 9:
            ligado = True
            print("Iniciando sistema, aguarde um momento...\n\nSistema ligado com sucesso.")
        else:
            print("\nStatus: Desligado.")
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
                if x == 9:
                    print("\nStatus: Ligado.")
                elif x == 8:
                    ligado = False
                    print(acoes[5])
                else:
                    print(acoes[x])
