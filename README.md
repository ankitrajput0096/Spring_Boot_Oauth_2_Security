# Spring Boot Oauth 2 Security using role based approach along with Database

Dockerized Spring Boot applications (Authorization and Resource Server) with Dockerized postgreSQL server with Oauth 2 security (JPA, Hibernate, PostgreSQL)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development purposes. See running for notes on how to run the project on a system.

### Prerequisites

1. Clone the project to your local environment:
    ```
    git clone https://github.com/ankitrajput0096/Spring_Boot_Oauth_2_Security
    ```

2. You need Docker to be installed:

    #### Windows:
    https://download.docker.com/win/stable/Docker%20for%20Windows%20Installer.exe
    
    #### Mac:
    https://download.docker.com/mac/stable/Docker.dmg
    
    #### Ubuntu:
    https://docs.docker.com/install/linux/docker-ce/ubuntu/

### Installing

Once you have docker installed on your environment, install the project dependencies via:

Build docker Image:

```
docker-compose build
```

Start docker:

```
docker-compose up
```

## Running

Start docker:
```
docker-compose up
```

Your Authorization server should be now running on http://localhost:8090
Your Resource server should be now running on http://localhost:8080

## Get an access to all exposed API's with Postman

1. Install Postman (https://www.getpostman.com)
2. Import Postman collection from the `Spring_Boot_Ouath2.postman_collection.json` file
3. Enjoy !!

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - Spring Boot 2
* [Maven](https://maven.apache.org/) - Dependency Management
* [Docker](https://www.docker.com/) - For containerization of application
* [PostgreSQL](https://www.postgresql.org/) - Database
* [OAuth2 Boot](https://docs.spring.io/spring-security-oauth2-boot/docs/current/reference/htmlsingle/) - OAuth2 Boot

## Contributing

If you have any improvement suggestions please create a pull request and I'll review it.


## Authors

* **Ankit Rajput** - *Initial work* - [Github](https://github.com/ankitrajput0096)

## License

This project is licensed under the MIT License

## Acknowledgments

* Big thanks to Pivotal for Spring Boot framework, love it!

