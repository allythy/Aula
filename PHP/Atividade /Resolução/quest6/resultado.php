<?php
$nome = $_POST['nome'];
$nome = str_replace(' ', '', $nome);
$qtdCaracteres = strlen($nome);

foreach (range(1, $qtdCaracteres) as $numeros) {
    echo $numeros . " ";
}
