<?php

namespace App\Models;

class Usuario
{
    private $nome;
    private $email;
    private $senha;

    public function getNome()
    {
        return $this->nome;
    }

    public function getEmail()
    {
        return $this->email;
    }

    public function getSenha()
    {
        return $this->senha;
    }


    public function setNome($nome)
    {
        if(strlen($nome) <= 5 || strlen($nome) > 20 )
        {
            $this->nome = null;
            return false;
        }else
        {   $this->nome = $nome;
            return true;
        }
    }

    public function setEmail($email)
    {
        $regex = "/^[a-z0-9_\.\-]+@[a-z0-9_\.\-]*[a-z0-9_\.\-]+\.[a-z]{2,4}$/i";

        if (preg_match($regex, $email))
        {
            $this->email = $email;
        } else
        {
            $this->email = null;
        }


    }

    public function setSenha($senha)
    {
        if(strlen($senha) < 10 || strlen($senha) > 20 )
        {
            $this->senha = null;
        }else
        {
            $this->senha = $senha;
        }

    }

}
