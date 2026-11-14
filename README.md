# F1 Driver Lookup (JavaFX)

[![Build](https://github.com/Nedavefo/Java_F1/actions/workflows/build.yml/badge.svg)](https://github.com/Nedavefo/Java_F1/actions/workflows/build.yml)

Desktop app that looks up a Formula 1 driver by car number using the public [OpenF1 API](https://openf1.org/). Built as a lab project for a Java course.

Enter a driver number and the app shows the driver's full name, broadcast name, acronym, country code, team, team colour and headshot.

## Tech stack

- Java 22, JavaFX (FXML views + controller)
- `java.net.http.HttpClient` for the API call, Gson for JSON parsing
- Maven (wrapper included)

## Run

```bash
./mvnw javafx:run
```

## Project structure

```
src/main/java/org/example/lab12/
  MainApp.java             # Application entry point
  MainAppController.java   # UI logic: reads the number, calls the API, fills the labels
  ApiClient.java           # HTTP request to OpenF1 and JSON mapping
  User.java                # Driver model
src/main/resources/org/example/lab12/   # FXML layout, styles, logo
video.mp4                  # Demo recording
```
