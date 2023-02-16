# Assignments Submission Guidelines

## Setup

### GitHub

Create an account on GitHub if you don't already have one.

Create a **private** repository in GitHub.

Ensure the repository is **private** else your assignments won't be accepted.

Name the repository appropriately. For example, _zs-java-assignments-<your-name>_. 
Replace _<your-name>_ with your name in lower-case.

The aim of this repository will be to contain all your assignments.

Initialize this repository with a .gitignore file. You can do that at the time of the repository creation. 
Choose the Java template for .gitignore. However, since we'll be using IntelliJ and Gradle, you should add their 
respective ignorable files and directories in the .gitignore. Refer .gitignore of this project.

Once your repository is ready on GitHub, you should configure your IntelliJ to use your GitHub account. 
Thereafter, you can clone the repository in IntelliJ using your GitHub account.

## How to submit assignments?

### Branches

Each assignment should be submitted in a separate branch drawn from the main/master branch.
The name of the branch should appropriately reflect the assignment.
For example, _assignment-1-<title-or-feature>_. Replace _<title-or-feature>_ with the title of the assignment.

### Pull-Requests (or PRs)

Each branch must be submitted as a Pull-Request (PR) to main branch. The PR must have:
1. An appropriate title to understand what it's about.
2. Description, with details of the assignment and any other thing you would want to add.
3. Create some labels in your project for easy identification of the stage the PR is in. 
   For example,
   1. _WIP_ label can be applied when you are still working on your branch and PR,
   2. _Ready-for-Review_ label can be applied when your PR is ready for review,
   3. _Changes-Requested_ label can be applied by whoever reviewed your PR and wants you to do some changed.

So, go ahead, create those labels and start using them.

### Errors/Mistakes to be avoided

1. While creating a PR ensure to have the correct nomenclature. Nomenclature for PRs to be as follows: <br>
   &lt;Assignment Number&gt; | &lt;High level representation of the assignment&gt; <br>
   eg : Assignment 3 | CRUD Operations on Products
2. While creating commit messages, please ensure to have the correct nomenclature.
   Nomenclature for commit messages to be as follows: <br>
   &lt;Assignment Number&gt; | &lt;Contributor name&gt; | &lt;High level representation of the commit&gt; <br>
   eg : Assignment 3 | John Doe | Added DAO create functionality
3. Please be aware of the files being committed. Using `git add .` commits all files that have changed. 
   Only commit source files that should be there in the project for others to use and modify. 
   Generated (output, class) files should **not** be committed. Files local to a developer machine, like intellij or m2, 
   should **not** be committed.
4. PRs should not have unwanted files. Unwanted files should be avoided and be mentioned in the `.gitignore` file.
   Some files that should **not** be present in the repository are:
   1. .idea
   2. .iml
   3. .gradle
   4. out
   5. build
   <br>Please do reach out in case of any doubt about whether a file should be pushed or not.
5. Please ensure the feature branches have the latest version of master. For this you need to keep merging master to 
   feature branch to ensure the latest changes are there in the feature branch.
6. Please ensure to use classes according to their functionality. Controllers hold logic to allow a user to interact 
   with the application. Service classes implement the core business logic. Main classes are used to just start the java 
   process. Please be aware of the functionalities being exposed in each class. Read about tiered-architectures.
7. Please use appropriate access specifiers against attributes, methods and classes.
8. Implement the functionalities only required by the assignments as mentioned in 
   [Assignments](https://github.com/ujjawalmisra/learning-java/blob/main/documents/Assignments.md).
9. Whenever raising a PR: <br>
   1. Add a brief description of what was the problem statement and what was done.
   2. Make sure to add the reviewers
10. Always respond to each and every review comments on the PR.
11. Follow the [Standard Naming Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html) 
    and always use meaningful names instead of using some random names for variables, methods, classes, etc.

