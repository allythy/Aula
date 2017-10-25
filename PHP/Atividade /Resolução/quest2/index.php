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
        <h1>Questão 2</h1>

      <form action="resultado.php" method="post">
          <div class="form-row">
              <div class="form-group col-md-">
                  <label>Primeiro nota:</label>
                  <input type="text" name="nota1" class="form-control">
              </div>
              <div class="form-group col">
                  <label>Segundo nota:</label>
                  <input type="text" name="nota2" class="form-control">
              </div>
              <div class="form-group col">
                  <label>Terceiro nota:</label>
                  <input type="text" name="nota3" class="form-control">
              </div>
              <div class="form-group col">
                  <label>Quarto nota:</label>
                  <input type="text" name="nota4" class="form-control">
              </div>
              <div class="form-group col-md-12">
                <button type="submit" class="btn btn-primary">Enviar</button>
              </div>
          </div>
        </form>
      </div>
</body>
</html>
