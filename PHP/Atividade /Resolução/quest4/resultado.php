<?php
$numero = $_POST['numero'];

foreach (range(0, $numero) as $numero) {
    echo $numero . " ";
}
