# Testing the Virtual Store of the garment production company "New experience"

### The project directory structure
The project has build scripts for both Maven and Gradle, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + main
  + test
    + java                          Test runners and supporting code
      + starter
        + Login
        + Message
        + Validate
        + Stepdefinitions
    + resources
      + features
        + login
        + mesagge
        + validate
      + webdriver                   Bundled webdriver binaries
        + linux
        + mac
        + windows
          chromedriver.exe          OS-specific Webdriver binaries
          geckodriver.exe

```