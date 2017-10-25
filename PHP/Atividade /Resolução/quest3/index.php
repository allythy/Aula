<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="bootstrap.css">
    <style>
        h1{
          margin-top: 2rem;
          margin-bottom: 2rem;
        }
    </style>
  </head>
  <body>
      <div class="container">
          <h1>Questão 3</h1>

          <form action="resultado.php" method="post">
              <div class="form-group">
                  <label>Informe a sua altura:</label>
                  <input type="text" name="altura" class="form-control">
              </div>
              <div class="form-group">
                  <label>Informe o sexo:</label>
                  <select class="form-control" name="sexo">
                      <option>Masculino</option>
                      <option>Feminino</option>
                  </select>
              </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
          </form>
      </div>
  </body>
</html>
