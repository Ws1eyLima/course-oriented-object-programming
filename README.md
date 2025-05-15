

# 📦 Gerenciamento de Produto em Estoque (Java)

Este projeto em Java é um exemplo simples de como **gerenciar um produto em estoque** utilizando programação orientada a objetos (POO). O usuário insere os dados de um produto, e o programa permite **adicionar ou remover unidades do estoque**, mostrando as informações atualizadas a cada passo.

## 🧾 Estrutura do Projeto

```
src/
├── application/
│   └── Program.java      → Classe principal que executa o programa
└── entities/
    └── Product.java      → Classe que representa um produto (não incluída neste trecho)
```

## 📄 Descrição do Código `Program.java`

```java
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;
```

**🔹 Importações e pacote**
Define o pacote `application` e importa classes necessárias: `Locale`, `Scanner` e a classe `Product`.

---

```java
public class Program {
    public static void main(String[] args) {
```

**🔹 Método Principal (`main`)**
Ponto de entrada da aplicação.

---

```java
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
```

**🔹 Configuração de localidade e scanner**
Define a localidade para `US` (ponto como separador decimal) e cria o objeto `Scanner` para entrada de dados.

---

```java
        Product product = new Product();
```

**🔹 Instanciação do produto**
Cria um novo objeto da classe `Product`.

---

```java
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();
```

**🔹 Entrada dos dados do produto**
Solicita ao usuário o nome, preço e quantidade em estoque do produto.

---

```java
        product.toString();
        System.out.println();
        System.out.println("Product data: " + product);
```

**🔹 Exibição dos dados iniciais**
Chama o método `toString()` (implícito) e exibe os dados atuais do produto.

---

```java
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
```

**🔹 Adicionar produtos ao estoque**
Usuário informa quantos produtos deseja adicionar. O método `addProducts` atualiza o estoque.

---

```java
        System.out.println();
        System.out.println("Updated data: " + product);
```

**🔹 Exibe dados atualizados**
Mostra o produto com o estoque atualizado.

---

```java
        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
```

**🔹 Remover produtos do estoque**
Usuário informa quantos produtos deseja remover. O método `removeProducts` atualiza o estoque.

---

```java
        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }
}
```

**🔹 Finalização**
Mostra os dados finais e fecha o `Scanner`.

---

## 📘 Requisitos

* Java JDK 11 ou superior
* Classe `Product` com os seguintes membros (esperados):

  * Atributos: `name`, `price`, `quantity`
  * Métodos: `addProducts(int)`, `removeProducts(int)`, `toString()`

---

## ▶️ Exemplo de Execução

```bash
Enter product data:
Name: Laptop
Price: 1200.00
Quantity: 5

Product data: Laptop, $1200.00, 5 units

Enter the number of products to be added in stock: 3

Updated data: Laptop, $1200.00, 8 units

Enter the number of products to be removed in stock: 2

Updated data: Laptop, $1200.00, 6 units
```

---

