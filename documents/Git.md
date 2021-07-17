# Git

## Top 20 commands that we use everyday

```shell
git config
git init
git clone
git add
git commit
git diff
git reset
git status
git rm
git log
git show
git tag
git branch
git checkout
git merge
git remote
git push
git pull
git stash
```

### git config
```shell
Usage: git config –global user.name “[name]”
Usage: git config –global user.email “[email address]”
```

### git init
```shell
Usage: git init [repository name]
```

### git clone
```shell
Usage: git clone [url]
```

### git add
```shell 
Usage: git add [file]
Usage: git add *
```

### git commit
```shell
Usage: git commit -m “[ Type in the commit message]”
Usage: git commit –a
```

### git diff
```shell
#This command shows the file differences which are not yet staged.
Usage: git diff –staged

#This command shows the file differences which are staged.
Usage: git diff [first branch] [second branch]
```

### git reset
```shell
#This command unstages the file, but it preserves the file contents.
Usage: git reset [file]

#This command undoes all the commits after the specified commit and preserves the changes locally.
Usage: git reset [commit]

#This command discards all history and goes back to the specified commit.
Usage: git reset –hard [commit]
```
*Note: Be very cautious before and while using this.*

### git status
```shell
#This command lists all the files that have to be committed.
Usage: git status
```

### git rm
```shell
#This command deletes the file from your working directory and stages the deletion.
Usage: git rm [file]
```

### git log
```shell
#This command is used to list the version history for the current branch.
Usage: git log
``` 

### git show
```shell
#This command shows the metadata and content changes of the specified commit.
Usage: git show [commit]
```

### git tag
```shell
#This command is used to give tags to the specified commit.
Usage: git tag [commitID]
```

### git branch
```shell
#This command lists all the local branches in the current repository.
Usage: git branch

Usage: git branch [branch name]

Usage: git branch -d [branch name]
-D: DELETE
```

### git checkout
```shell
#This command is used to switch from one branch to another.
Usage: git checkout [branch name]

#This command creates a new branch and also switches to it.
Usage: git checkout -b [branch name]
```

### git merge
```shell
#This command merges the specified branch’s history into the current branch.
Usage: git merge [branch name]
```

### git remote
```shell
#This command is used to connect your local repository to the remote server.
Usage: git remote add [variable name] [Remote Server Link]
```

### git push
```shell
#This command sends the committed changes of master branch to your remote repository.
Usage: git push [variable name] master

#This command sends the branch commits to your remote repository.
Usage: git push [variable name] [branch]

#This command pushes all branches to your remote repository.
Usage: git push –all [variable name]

#This command deletes a branch on your remote repository.
Usage: git push [variable name] :[branch name]
```

### git pull
```shell
#This command fetches and merges changes on the remote server to your working directory.
Usage: git pull [Repository Link]
```

### git stash
```
#This command temporarily stores all the modified tracked files.
Usage: git stash save
Usage: git stash pop
Usage: git stash list
Usage: git stash drop
```

