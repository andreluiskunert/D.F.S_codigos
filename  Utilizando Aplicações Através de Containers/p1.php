<?php
echo "Hello PHP";
// docker build -t my-php-app .
// docker run -it --rm --name my-running-app my-php-app
// docker run -it --rm --name my-running-script -v "$PWD":/usr/src/myapp -w /usr/src/myapp php:7.4-cli php your-script.php