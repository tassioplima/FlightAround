# Flight Around 

Automation project with Java + Gradle using Browser Stack as a Device Farm and Github Action (CI) to automate the Flight Around App, GithubPages to deploy Allure Serve to see test result/report, PageObject/Screen and PageFactory as a structure.

[![Appium Execution](https://github.com/tassioplima/badge.svg)](https://github.com/tassioplima/FlightRound/actions)
[![Allure Report](https://img.shields.io/badge/Allure%20Report-deployed-yellowgreen)](https://tassioplima.github.io/FlightRound/)

Configuration:

- Java JDK 8 or 11
- Android SDK updated
- Android Emulator or physical device
- Appium Server
- Browser Stack Account and Keys

Running:

```
./gradlew test --tests "AppTest"
```

You can run with different devices like iOS and Android using properties when running this command line:

Android:

```
./gradlew test --tests "AppTest" -DMOBILE=ANDROID
```

iOS:

```
./gradlew test --tests "AppTest" -DMOBILE=iOS
```
For use local user name by json or remote you can use Exec true or false:

true = execution using environment variable from secret key

```
./gradlew test --tests "AppTest" -DMOBILE=ANDROID -DEXEC=true
```

false = execution using json name and key from browser stack

```
./gradlew test --tests "AppTest" -DMOBILE=ANDROID -DEXEC=false
```

### Building Allure report

To build a report, and browse it use the following command:

```
./gradlew allureServe
```

Github Pages with Allure report results: [ALLURE](https://tassioplima.github.io/FlightAround/)
