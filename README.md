## 📬 Notification Processor - Test Suite

Este módulo contiene pruebas unitarias para la clase `NotificationProcessor`, encargada de enviar notificaciones mediante distintos canales y registrar el historial asociado. Utiliza Mockito para simular dependencias y JUnit 5 para la estructura de tests.

### 🧪 Tecnologías

- **JUnit 5 (`junit.jupiter`)**: Framework para ejecución de pruebas.
- **Mockito (`mockito-core`, `mockito-junit-jupiter`)**: Librería para mocks, captors y verificación de interacciones.
- **BDDMockito**: Estilo Given-When-Then para una sintaxis más expresiva.
- **AssertJ / JUnit Assertions**: Validación de resultados esperados.

### 📋 Cobertura de pruebas

#### ✅ Envío exitoso de notificaciones

- `testSendEmailNotification_Success`: Envía un correo y verifica que el historial se registre.
- `testSendSmsNotification_Success`: Envía un SMS y registra la notificación.

#### ❌ Casos inválidos

- `testSendNotification_EmptyMessage_ThrowsException`: Rechaza mensajes vacíos.
- `testSendNotification_NullRecipient_ThrowsException`: Rechaza destinatarios nulos.
- `testSendNotification_FailureInService_ReturnsFalse`: Simula un fallo en el canal.

#### 🧠 Validaciones complementarias

- `testBDDStyle_SendEmailNotification`: Usa sintaxis BDD con `given` y `should`.
- `testNotificationHistory_ContainsCorrectData`: Verifica que el historial tenga valores correctos y timestamp no nulo.

### 🛠 Cómo ejecutar los tests

```bash
mvn test
```

### ✅ Requisitos de compilación

- Java 8 o superior
- Dependencias:
  ```groovy
  testImplementation 'org.junit.jupiter:junit-jupiter:5.X.X'
  testImplementation 'org.mockito:mockito-core:4.X.X'
  testImplementation 'org.mockito:mockito-junit-jupiter:4.X.X'
  ```
