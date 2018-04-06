<?php

use PHPUnit\Framework\TestCase;
use App\Models\Chamado;
use App\Models\Usuario;

class ChamadoTest extends TestCase
{
    protected $novoUsario;
    protected $novoChamado;

    public function setUP()
    {
        $this->novoUsario = new Usuario;
        $this->novoChamado = new Chamado;
    }

    public function nomeDoUsarioChamado()
    {
        return[
            ['allythy','allythy'],
            ['Renannn','Renannn'],
        ];
    }

    /**
    *@dataProvider nomeDoUsarioChamado
    */

    public function testVerificaNomeDoUsuarioDoChamado($nomeUserChamado, $nomeUserChamadoExp)
    {
        $this->novoUsario->setNome($nomeUserChamado);

        $nome = $this->novoChamado->setUsuario($this->novoUsario);
        $this->assertEquals($nomeUserChamadoExp, $this->novoChamado->getUsuario());

        $this->novoUsario->setNome($nomeUserChamado);

        $nome = $this->novoChamado->setUsuario($this->novoUsario);
        $this->assertEquals($nomeUserChamadoExp, $this->novoChamado->getUsuario());
    }

    public function nomeChamado()
    {
        return[
            ['Os computadores não estão pegando','Os computadores não estão pegando'],
            ['Sem internet','Sem internet'],
        ];
    }

    /**
    *@dataProvider nomeChamado
    */

    public function testNomeDoChamado($chamado1, $chamado2)
    {
        $nome = $this->novoChamado->setChamado($chamado1);
        $this->assertEquals($chamado2, $this->novoChamado->getChamado());
    }
}
