# :construction: - Desafio Empregados Auth

- Implemente as funcionalidades necessárias para que os testes do projeto abaixo passem

##

## :clipboard: - Diagrama:

![desafio-empregados drawio](https://github.com/carloshenriquefs/Empregados-Auth/assets/54969405/5b6b3dec-39bf-421c-a0f6-8d6137423d3b)

##

## :hourglass: - Testes:

#### :man_mechanic: - Employee:

      - insertShouldReturn403WhenOperatorLogged()
      - insertShouldReturn401WhenNoUserLogged()
      - insertShouldInsertResourceWhenAdminLoggedAndCorrectData()
      - insertShouldReturn422WhenAdminLoggedAndBlankName()
      - insertShouldReturn422WhenAdminLoggedAndInvalidEmail()
      - insertShouldReturn422WhenAdminLoggedAndNullDepartment()

#### :briefcase:- Department:

      - findAllShouldReturnAllResourcesSortedByNameWhenAdminLogged()
      - findAllShouldReturnAllResourcesSortedByNameWhenEmployeeLogged()
      - findAllShouldReturn401WhenNoUserLogged()

