<?php

use PHPUnit\Framework\TestCase;
use App\Models\Usuario;

class UsuarioTest extends TestCase
{

    protected $novoUsario;

    public function setUP()
    {
        $this->novoUsario = new Usuario;
    }

    public function nomeUsario()
    {
        return[
            ['allythy',true],
            ['ALLYTHY',true],
            ['Allythy Renan', true],
        ];
    }

    /**
    *@dataProvider nomeUsario
    */

    public function testVerificaNomeDoUsuarioTemMaisDeCincoCaracteres($nome1, $nome2)
    {
        $nome = $this->novoUsario->setNome($nome1);
        $this->assertEquals($nome2, $this->novoUsario->getNome());
    }

    public function emailValido()
    {
        return[
            ['allythy@gmail.com','allythy@gmail.com'],
            ['allythy@gmail.com.br','allythy@gmail.com.br'],
            ['allythy@gmail.gov','allythy@gmail.gov'],
            ['allythy@gmail.br','allythy@gmail.br'],

        ];
    }

    /**
    *@dataProvider emailValido
    */

    public function testEmailValido($emailS, $emailM)
    {
        $nome = $this->novoUsario->setEmail($emailS);
        $this->assertEquals($emailM, $this->novoUsario->getEmail());
    }

    public function senhaValida()
    {
        return[
            [1234567899,1234567899],
            ['F89083?:>L&%$','F89083?:>L&%$'],
            ['jdsjkh33789kjk','jdsjkh33789kjk'],
        ];
    }

    /**
    *@dataProvider senhaValida
    */

    public function testSenhaValidoComMaisDeCincoCaracteres($senha1, $senha2)
    {

        $senha = $this->novoUsario->setSenha($senha1);
        $this->assertEquals($senha2, $this->novoUsario->getSenha());
    }
}
