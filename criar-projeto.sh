#!/bin/bash

# Define o nome da aplicação
APP_NAME="MeuPrimeiroAppJava"
# Define o pacote base (adapte para seu nome ou algo como "seu.nome.projeto")
PACKAGE_BASE="com/meuprojeto" 

echo "Criando a estrutura de pastas simplificada para: $APP_NAME"

# Cria o diretório raiz do projeto e entra nele
mkdir "$APP_NAME"
cd "$APP_NAME" || exit

# Cria a estrutura src/main/java com o pacote base
mkdir -p "src/main/java/$PACKAGE_BASE"

# Cria o arquivo principal da aplicação
touch "src/main/java/$PACKAGE_BASE/MeuApp.java"
cat <<EOL > "src/main/java/$PACKAGE_BASE/MeuApp.java"
package com.meuprojeto; // Certifique-se que o pacote aqui corresponde ao PACKAGE_BASE

public class MeuApp {
    public static void main(String[] args) {
        System.out.println("Olá, mundo Java!");
    }
}
EOL

# Cria o arquivo README.md
touch README.md
cat <<EOL > README.md
# $APP_NAME

Este é o meu primeiro aplicativo Java!

## Como rodar

1. Compile o arquivo Java:
   \`\`\`bash
   javac src/main/java/$PACKAGE_BASE/MeuApp.java
   \`\`\`
   (Lembre-se de substituir '$PACKAGE_BASE' pelo seu caminho real, como 'com/meuprojeto')

2. Execute o programa:
   \`\`\`bash
   java -cp src/main/java com.meuprojeto.MeuApp
   \`\`\`
   (O '-cp src/main/java' indica onde o Java deve procurar as classes compiladas)
EOL

echo "Estrutura de pastas e arquivos básicos criados com sucesso em $APP_NAME/"
echo "Você pode entrar no diretório do projeto com: cd $APP_NAME"
echo "Lembre-se de ajustar o 'PACKAGE_BASE' no script e no arquivo 'MeuApp.java' conforme necessário!"