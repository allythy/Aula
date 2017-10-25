<?php
$sexo = $_POST['sexo'];
$altura =$_POST['altura'];

if ($sexo == 'Masculino') {
  $form = (72.7 * $altura) -58;
  echo "O pesso ideal do Senhor é: " . $form;
} else {
  $form = (62.1 * $altura) -44.7;
  echo "O peso ideal da Senhora é: " . $form;
}
