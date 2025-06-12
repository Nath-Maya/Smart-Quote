# 🧠 Planeación Inicial del Proyecto: SmartQuote

---

## 🎯 Objetivo del Proyecto

Desarrollar una aplicación en Java que integre un modelo GPT para convertir automáticamente textos de solicitud de cotización en presupuestos formateados, dirigidos a clientes del sector de artes gráficas Trade. Este sistema será utilizado por la empresa **APD Printing**.

---

## 🧩 Descripción General del Flujo

1. El usuario ingresa un texto con una solicitud de cotización, usualmente proveniente de un correo enviado por el cliente.
2. El sistema envía dicho texto a la API de OpenAI (u otro modelo GPT).
3. El modelo responde con un presupuesto estructurado, utilizando *templates* predefinidos por la empresa, que organizan las especificaciones de manera clara y con el lenguaje técnico utilizado en el sector.
4. El sistema muestra la respuesta en el formato definido, permitiendo al asesor comercial —usuario principal de la aplicación— seleccionar y copiar el texto generado para su posterior uso.

---

## 🗂️ Estructura Propuesta del Proyecto
