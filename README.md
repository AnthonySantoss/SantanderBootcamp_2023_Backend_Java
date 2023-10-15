# SantanderBootcamp_2023_Backend_Java
Curso da bolsa de estudos Santander Bootcamp 2023
## Diagrama de Classes
```mermaid
classDiagram
  class User {
    +name: string
    +account: Account
    +features: Feature[]
    +card: Card
    +news: News[]
  }

  class Account {
    +Number: string
    +Balance: number
    +Limit: number
  }

  class Feature {
    +icon: string
    +description: string
  }

  class Card {
    +Number: string
    +Limit: number
  }

  class News {
    +icon: string
    +description: string
  }

  User "1"*--"1" Account
  User "1"*--"N" Feature
  User "1"*--"1" Card
  User "1"*--"N" News
```
