[Instagram account creator](#instagram-account-creator)

[Login](#login)

[Like](#like)

[Comment](#comment)



# Instagram-Tools
📷 Instagram tools (creating accounts, login with those accounts and like/comment someone post)


# Contribution [![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/dwyl/esta/issues)

- Fork this repo

- Add new features

- Create a new pull request for this branch

## Task list

- [x] Put first version on GitHub
- [ ] Add feature for DM


## Instagram Account Creator

`modules/IAC.kt` -> File

### Usage

`val iac = IAC(true, true, "proxy", "username", "password", "email)` -> defining iac as IAC with parameters

Calling function for creating

`iac.createAccount()`


## Login

`modules/Login.kt` -> File

### Usage

`val login = Login(true, true, "proxy", "username", "password")` -> defining login as Login with parameters

Calling function for creating

`login.login()`


## Like

`modules/Like.kt` -> File

### Usage

`val like = Like("link to post")` -> defining like as Like with parameters

Calling function for creating

`like.like()`


## Comment

`modules/Comment.kt` -> File

### Usage

`val comment = Comment("link to post", "text")` -> defining comment as Comment with parameters

Calling function for creating

`comment.comment()`
