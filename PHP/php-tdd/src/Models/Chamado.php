<?php

namespace App\Models;

class Chamado
{
    private $usuario;
    private $chamado;

    public function getUsuario()
    {
        return $this->usuario;
    }

    public function getChamado()
    {
        return $this->senha;
    }

    public function setUsuario(Usuario $user)
    {
        $this->usuario = $user->getNome();
    }

    public function setChamado($chamado)
    {
        $this->senha = $chamado;
    }

}
