<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
   <head>
      <!-- Boostrap CSS -->
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
      <!--  importamos fuentes -->
      <link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">
      <!-- Bootstrap JS -->
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
      <!-- mobile First -->
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <meta charset="UTF-8">
      <title>Insertar usuario</title>
   </head>
   <body>
      <div class="container-fluid">
         <div class="row">
            <div class="col-md-12">
               <nav class="navbar navbar-expand-lg navbar-light bg-light">
                  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                  <span class="navbar-toggler-icon"></span>
                  </button> <a class="navbar-brand" href="#">Brand</a>
                  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                     <ul class="navbar-nav">
                        <li class="nav-item active">
                           <a class="nav-link" href="#">Link <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                           <a class="nav-link" href="#">Link</a>
                        </li>
                        <li class="nav-item dropdown">
                           <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown">Dropdown link</a>
                           <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                              <a class="dropdown-item" href="#">Action</a> <a class="dropdown-item" href="#">Another action</a> <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider">
                              </div>
                              <a class="dropdown-item" href="#">Separated link</a>
                           </div>
                        </li>
                     </ul>
                     <form class="form-inline">
                        <input class="form-control mr-sm-2" type="text" /> 
                        <button class="btn btn-primary my-2 my-sm-0" type="submit">
                        Search
                        </button>
                     </form>
                     <ul class="navbar-nav ml-md-auto">
                        <li class="nav-item active">
                           <a class="nav-link" href="#">Link <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item dropdown">
                           <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown">Dropdown link</a>
                           <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                              <a class="dropdown-item" href="#">Action</a> <a class="dropdown-item" href="#">Another action</a> <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider">
                              </div>
                              <a class="dropdown-item" href="#">Separated link</a>
                           </div>
                        </li>
                     </ul>
                  </div>
               </nav>
               <div class="jumbotron card card-block">
                <h2>
                  Insertar registro en la BBDD
               </h2>
                  <form action="./Servlet" method="post">
                     <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Nombre</label>
                        <div class="col-sm-10">
                           <input type="text" class="form-control" placeholder="Nombre" name="name">
                        </div>
                     </div>
                     <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Apellido</label>
                        <div class="col-sm-10">
                           <input type="text" class="form-control" placeholder="Apellido" name="lastname">
                        </div>
                     </div>
                     <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Password</label>
                        <div class="col-sm-10">
                           <input type="password" class="form-control" placeholder="Password" name="password">
                        </div>
                     </div>
                     <div class="form-group row">
                        <div class="col-sm-10">
                           <button type="submit" class="btn btn-primary">Enviar</button>
                        </div>
                     </div>
                  </form>
               </div>
               <div class="jumbotron card card-block">
                <h2>
                  Consultar registro en la BBDD
               </h2>
                  <form action="./ServletConsulta" method="post">
                     <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Nombre</label>
                        <div class="col-sm-10">
                           <input type="text" class="form-control" placeholder="Nombre" name="name">
                        </div>
                     </div>
                     <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Apellido</label>
                        <div class="col-sm-10">
                           <input type="text" class="form-control" placeholder="Apellido" name="lastname">
                        </div>
                     </div>
                     <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Password</label>
                        <div class="col-sm-10">
                           <input type="password" class="form-control" placeholder="Password" name="password">
                        </div>
                     </div>
                     <div class="form-group row">
                        <div class="col-sm-10">
                           <button type="submit" class="btn btn-primary">Enviar</button>
                        </div>
                     </div>
                  </form>
               </div>
            </div>
         </div>
         <div class="row">
            <div class="col-md-4">
               <h2>
                  Heading
               </h2>
               <p>
                  Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
               </p>
               <p>
                  <a class="btn" href="#">View details</a>
               </p>
            </div>
            <div class="col-md-4">
               <h2>
                  Heading
               </h2>
               <p>
                  Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
               </p>
               <p>
                  <a class="btn" href="#">View details</a>
               </p>
            </div>
            <div class="col-md-4">
               <h2>
                  Heading
               </h2>
               <p>
                  Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
               </p>
               <p>
                  <a class="btn" href="#">View details</a>
               </p>
            </div>
         </div>
      </div>
   </body>
</html>