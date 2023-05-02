# JPA-Hibernate
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/VinciusGoulart/JPA-Hibernate/blob/main/LICENSE)

This is a project developed during a JPA and Hibernate course. The aim is to provide a basic project structure for those learning these technologies.

## Prerequisites
Before running the project, you must have the following installed on your machine:

- Java 11 or higher
- Maven 3 or higher
- MySQL database

## Database Configuration
The persistence.xml file contains the database configuration. You need to configure the javax.persistence.jdbc.url, javax.persistence.jdbc.user, and javax.persistence.jdbc.password properties according to your MySQL database configuration.

## Running the Project
To run the project, run the following command in the project root directory:

```bash
# clone repository
git clone https://github.com/VinciusGoulart/JPA-Hibernate.git

# Run project
mvn exec:java -Dexec.mainClass="application.Program"
```

# Usage
The project is a console-based application that demonstrates the usage of JPA and Hibernate to persist data to a MySQL database. The application allows you to create, read, update, and delete objects from the database.

# Contribution
This project was developed only as an example for learning purposes. Contributions are welcome, but are not guaranteed to be accepted. To contribute, open an issue or a pull request.
