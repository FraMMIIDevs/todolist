<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Chi siamo</title>
    <!-- Import stylesheet global -->
    <link rel="stylesheet" href="styles/global.css">
    <!-- Import stylesheet della pagina -->
    <link rel="stylesheet" href="styles/chi-siamo.css">
    <!-- Import bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Import logo -->
    <link rel="stylesheet"
        href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0&icon_names=code" />
</head>

<body class="dark-theme">

    <!-- Inizio navbar -->
    <nav class="navbar fixed-top navbar-expand-lg bg-body-tertiary bg-dark" data-bs-theme="dark">
        <div class="container-fluid">
            <div id="logo-nome">
                <a class="navbar-brand" href="">
                    <span class="logo-icon material-symbols-outlined d-inline-block align-text-top">
                        code
                    </span>
                    MFMD
                </a>
            </div>
            <button class=" navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" aria-current="page" href="">Homepage</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="#">Chi siamo</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="" role="button" data-bs-toggle="dropdown"
                            aria-expanded="false">
                            Note
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="note.jsp">Visualizza note</a></li>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            <li><a class="dropdown-item" href="crea-note.jsp">Crea note</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Aggiunta immagine -->
    <div class="container">
        <img src="images/gruppo.jpg" width="500px">
    </div>

    <!-- Inizio Footer -->
    <div class="container fixed-bottom" data-bs-theme="dark">
        <footer class="py-3 my-4">
            <p class="text-center text-body-secondary">© 2025 MFMD, Inc</p>
        </footer>
    </div>

    <p class="chi-siamo">Siamo un team appassionato, impegnato a offrire soluzioni innovative che fanno la differenza. Con anni di esperienza nel settore, ci concentriamo sulla creazione di prodotti e servizi centrati sull'utente, che rispondano alle esigenze dei nostri clienti. La nostra missione è quella di evolverci continuamente e adattarci al panorama tecnologico in continua mutazione, assicurandoci di essere sempre un passo avanti e offrire un valore eccezionale. Al centro di tutto ciò che facciamo c'è una dedizione alla qualità, alla creatività e alla soddisfazione del cliente.</p>

    <!-- Import degli script javascript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="scripts/index.js" defer></script>

</body>

</html>