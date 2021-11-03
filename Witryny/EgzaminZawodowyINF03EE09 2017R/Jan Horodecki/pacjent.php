<!DOCTYPE html>
<html lang="PL-pl">
<head>
    <meta charset="UTF-8">
    <title>Przychodnia</title>
    <link rel="stylesheet" href="przychodnia.css">
</head>
<body>
    <header>
        <h1>PRAKTYKA LEKARZA RODZINNEGO</h1>
    </header>

    <nav>
        <h3>LISTA PACJENTÓW</h3>
        <?php

        ?>

        <h3>LEKARZE</h3>

        <ul>
            <li>pn-śr</li>
            <ol>
                <li>Anna kwiatkowska</li>
                <li>Jan Kowalewski</li>
            </ol>
            <li>czw-pt</li>
            <ol>
                <li>Krzysztof Nowak</li>
            </ol>
        </ul>
    </nav>

    <main>
        <h2>INFORMACJE SZCZEGÓŁOWE O PACJENCIE</h2>

        <?php 

            $query= "SELECT * FROM pacjenci WHERE id=$wybranaLiczba;";
        ?>

    </main>
    <footer>
        <small><i>Jan Horodecki 2TP</i></small>
    </footer>
</body>
</html>