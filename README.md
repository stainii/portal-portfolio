# portal-portfolio
[![Build Status](https://server.stijnhooft.be/jenkins/buildStatus/icon?job=portal-portfolio/master)](https://server.stijnhooft.be/jenkins/job/portal-portfolio/job/master/)

A public portfolio of my work. You can find it on [stijnhooft.be](https://www.stijnhooft.be).

## Integration with the other portal modules
The goal is to integrate this with a personal knowledge base. 
Articles can be written privately and - if fine-tuned and polished - can be published on the portfolio's blog.

## Front-end
The front-enc can be found in `src/main/web`.

**All commands below need to be executed in that folder.**

### Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

### Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

### Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

### Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

### Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

### Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).

### Release
#### Maven release
To release a module, this project makes use of the JGitflow plugin.
More information can be found [here](https://gist.github.com/lemiorhan/97b4f827c08aed58a9d8).

At the moment, releases are made on a local machine. No Jenkins job has been made (yet).

#### NPM release
No npm release is made, only a Maven release.

#### Docker release
A Docker release is made, by running `mvn clean deploy` on the Maven release branch.
