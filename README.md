# Festival de Música - Sistema de Gerenciamento

## Tema
Este projeto tem como objetivo a implementação de um sistema de gerenciamento de festivais de música utilizando conceitos de orientação a objetos em Java.

## Objetivo
O objetivo deste projeto é simular o gerenciamento básico de um festival de música, aplicando conceitos como classes, objetos, herança, polimorfismo, encapsulamento e listas.

## Requisitos

### 1. Classes
#### Artista
- Classe abstrata representando um artista ou banda que se apresentará no festival.
- Atributos:
  - `nome` (String): Nome do artista ou banda.
  - `genero` (enum): Gênero musical.
  - `cache` (double): Valor do cachê cobrado pelo artista.

#### Palco
- Classe representando um palco do festival onde as apresentações ocorrem.
- Atributos:
  - `nome` (String): Nome do palco.
  - `capacidade` (int): Capacidade máxima de público.
  - `horarios` (List): Lista de datas, horários e artistas que se apresentarão no palco.

#### Festival
- Classe principal que representa o festival de música como um todo.
- Deverá conter o método `Main` para iniciar o programa.
- Responsável por atribuir artistas aos palcos e alimentar uma lista para exibição dos dados do festival.

### 2. Métodos
- Implementar métodos nas classes para gerenciar a programação do festival.
- Verificar a necessidade de criar mais classes para organizar melhor o código.
- Criar subclasses de `Artista` para representar diferentes tipos de artistas (ex: Cantor, Banda, DJ).
- Cada subclasse pode ter atributos e métodos específicos, bem como sobrecarga de métodos.

## Como Executar
1. Clone o repositório para sua máquina local.
2. Abra o projeto em sua IDE Java preferida.
3. Compile e execute o arquivo `Festival.java`.

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para propor melhorias, correções ou adições ao projeto.

---

Sinta-se livre para ajustar e expandir conforme necessário!
