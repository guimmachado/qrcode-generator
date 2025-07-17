# Gerador de QR Code

Este é um simples gerador de QR Code desenvolvido em Java com Spring Boot. A aplicação gera um QR Code a partir de um texto fornecido, faz o upload da imagem para um bucket AWS S3 e retorna a URL pública do arquivo.

## Tecnologias Utilizadas

* **Java 21**: Versão da linguagem Java utilizada no projeto.
* **Spring Boot 3.5.3**: Framework principal para a criação da aplicação.
* **Maven**: Ferramenta de automação e gerenciamento de dependências.
* **Google ZXing 3.5.3**: Biblioteca para a geração de QR Codes ("Zebra Crossing").
* **AWS SDK for Java 2.24.12**: Kit de desenvolvimento da AWS para integração com o serviço S3.

## Funcionalidades

* Gera uma imagem de QR Code no formato PNG a partir de um texto.
* Salva a imagem gerada em um bucket do Amazon S3.
* Disponibiliza um endpoint REST para solicitar a geração do QR Code.

## Exemplo de Uso

Request `POST` para o endpoint `/qrcode`.

* **URL:** `http://localhost:8080/qrcode`
* **Método:** `POST`
* **Headers:**
    * `Content-Type: application/json`
* **Corpo da Requisição (Request Body):**
    ```json
    {
      "text": "https://link-do-site.com"
    }
    ```
* **Exemplo de saída**
     ```json
    {
       "url": "https://qrcode-testgui.s3.us-east-1.amazonaws.com/link-do-qrcode"
    }
     ```
  
  
