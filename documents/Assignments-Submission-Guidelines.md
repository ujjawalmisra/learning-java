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