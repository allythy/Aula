<?php
$primeiroNum = $_POST['primeiroNum'];
$segundoNum = $_POST['segundoNum'];

foreach (range($primeiroNum + 1 , $segundoNum - 1) as $numero) {
    echo $numero . " ";
}
