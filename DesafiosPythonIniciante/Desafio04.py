#DESAFIOS DA WEB
#ALUNO: MARCOS AURÉLIO LOPES DE ARAÚJO.

#OBEJTIVO: CRIAR UM PROGRAMA QUE SOLICITE UM NÚMERO INTEIRO E DIGA SE O MESMO PERTENCE A ARMSTRONG.

print("--------------------------------------------------------------------------")
print("\nDETECTOR DE NÚMEROS DE ARMSTRONG.\n")

def calcular():

    somaFinal = 0

    while (True):
        try:
            somaFinal = 0
            numero = int(input("Escolha um número: "))
        except ValueError:
            print("São permitidos apenas números...: ")
            continue

        lista = [int(a) for a in str(numero)]

        if (len(lista) <= 6):
            if len(lista) == 1:
                for x in lista:
                    potenciar = x ** 1
                    somaFinal = potenciar

            elif len(lista) == 2:
                for x in lista:
                    potenciar = x ** 2
                    somaFinal = somaFinal + potenciar

            elif len(lista) == 3:
                for x in lista:
                    potenciar = x ** 3
                    somaFinal = somaFinal + potenciar

            elif len(lista) == 4:
                for x in lista:
                    potenciar = x ** 4
                    somaFinal = somaFinal + potenciar

            elif len(lista) == 5:
                for x in lista:
                    potenciar = x ** 5
                    somaFinal = somaFinal + potenciar

            elif len(lista) == 6:
                for x in lista:
                    potenciar = x ** 6
                    somaFinal = somaFinal + potenciar

        elif (len(lista) > 6):
            print("\nErro, apenas 6 digitos. Tente novamente: \n")
        
        def finalizar():
            if (somaFinal == numero):
                print("O resultado final é:", somaFinal)
                print("O número escolhido pertence a Armstrong.\n")
                exit()
            elif (somaFinal != numero):
                print("O resultado final foi: ", somaFinal)
                print("O número escolhido não pertence a Armstrong.")

        finalizar()
        print("--------------------------------------------------------------------------")
calcular()