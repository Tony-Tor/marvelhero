# marvelhero

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/6a4cd4bab39d48b7abea23569619c340)](https://app.codacy.com/gh/Tony-Tor/marvelhero?utm_source=github.com&utm_medium=referral&utm_content=Tony-Tor/marvelhero&utm_campaign=Badge_Grade_Settings)

Rest API Spring Postgres Docker app. This is an application for storing information about comic book characters. Swagger docs on localhost:8080/swagger-ui/index.html
## Filters
+ Characters

| Сommand | Description |
|----------------|---------|
|name={text}|Find by name consists {text}|
|nameStartWith={text}|Find by name start with {text}|
|after={YYYY-MM-DD}|Find after date|
|before={YYYY-MM-DD}|Find before date|
|description={text}|Find by description consists|
|limit={number}|Limit item on page|

+ Comics

| Сommand | Description |
|----------------|---------|
|name={text}|Find by name consists {text}|
|nameStartWith={text}|Find by name start with {text}|
|after={YYYY-MM-DD}|Find after date|
|before={YYYY-MM-DD}|Find before date|
|startCountPage={number}|Find comics with a number of pages from {number}|
|endCountPage={number}|Find comics with the number of pages up to {number}|
|startPrise={number}|Find comics with a price from {number}|
|endPrise={number}|Find comics with a price up to {number}|
|description={text}|Find by description consists|
|limit={number}|Limit item on page|
