# My Rental Appartments 🏘

[![License](https://img.shields.io/github/license/IkariMeister/myRentalAppartments.svg?style=flat-square)](LICENSE)
[![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)
![Android CI](https://github.com/IkariMeister/myRentalAppartments/workflows/Android%20CI/badge.svg)

My Rental Appartments is an example App created inside [Architect Coders Program](https://architectcoders.com/)

![Architect Coders Logo](https://architectcoders.com/wp-content/uploads/2019/03/horizontal-logo-light.png)

## Contents
* [Objectives](#objectives-)
* [How](#how-)
* [GitHooks](#git-hooks-%EF%B8%8F)
* [Templates](#templates-)


## Objectives 🎯

- The main goal of this App is develop it following all the good practices learned about coding, architecture and testing.
- The App should show a picture of the house and a brief resume of it.
- The App should show availability of the house.
- The App should sync up with AirBnb and Booking platforms to show availability of apartments.
- The App should show a detail view of the house showing a huge description of the house.
- The detail view of the App should show a button to make a reservation.
- The detail view should allow to make reservations on platforms like AirBnb and Booking.
- The App should work offline *reasonably*.

## How 🛠

- **Clean Architecture** will be used.
- A reasonable **test coverage** will be provided.
- **Design Patterns** is a must.
- **Android Jetpack** will be used.
- For local storage, **Room** will be the database implementation.
- The UI design will follow **Material Design**

## Git Hooks ⚙️

There are some Git hooks included. They are inside the `doc/hooks` folder and They will run some gradle tasks before committing and pushing to any remote.

This `prec` task is intended to run all the checks you consider before committing. At this very moment, it runs a `ktlint` and `detekt` checks for code style with `ktlint`.

This `prep` task is intended to run all the checks you consider before pushing. At this very moment, it builds the app and launches unit tests.
 
You can define what this task does modifying the `prep` task in the `gradle/hooks.gradle` file. We like the approach of just running 1 single Gradle task as the hook instead of multiple tasks because it's more efficient (the hook doesn't have to run Gradle multiple times), and also because this way we can control the pre commit and pre push tasks with the gradle alias defined at the `gradle/hooks.gradle` without altering the hooks.
 
In order to install this hook, just `cd doc/hooks` and run `./install-hooks.sh`.

## Templates 📝

There are some templates for *Pull Request* and *Issues* added on `.github`. Those templates are *mandatory* for issues and pull request.
Those templates are based on [Karumi Quality Assurance Project](https://github.com/Karumi/project-quality-assurance)