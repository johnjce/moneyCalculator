# MoneyCalculator

MoneyCalculator es un conversor de divisas que te permite realizar cambios de monedas de una forma rápida y cómoda. MoneyCalculator está diseñado a partir del patrón de diseño MVC (Modelo, Vista y Controlador), que separa la lógica del conversor de divisasen sí y la lógica de la interfaz de usuario. Se aprovecha de esta forma la modularidad, con la que, con mucha facilidad, se pueden reutilizar e intercambiar módulos por otros.

Esta modularidad viene reflejada en distintas implementaciones de un mismo módulo, como por ejemplo, la implementación de las clases CurrencySetLoader y ExchangeRateLoader, las cuáles obtienen el conjunto de divisas y el ratio de intercambio entre ellas de distintas formas posibles.

Las distintas implementaciones son:

      * Implementación en SQLlite
      * Implementación en Oracle
      * Implementación en MySQL
      * Implementación de un proveedor vía Web
      * Implementación MOCK

