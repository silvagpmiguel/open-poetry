# Open Poetry

## Project

`cd <project-root>`

### Build

``` 
mvn package
```

### Clean

``` 
mvn clean
``` 

## Poem API 

`cd <project-root>/poem-app`

### Compile and run Poem API

```
mvn spring-boot:run
```

## Poem WEB

`cd <project-root>/poem-web`

### Project setup

```
npm install
```

### Compiles and hot-reloads for development

```
npm run serve
```

### Compiles and minifies for production

```
npm run build
```

### Lints and fixes files

```
npm run lint
```

### Customize configuration

See [Configuration Reference](https://cli.vuejs.org/config/).

## Configurations

### Datasource (Postgres)

Update url, username and password in `<project-root>/poem-app/src/main/resources/application.properties`
