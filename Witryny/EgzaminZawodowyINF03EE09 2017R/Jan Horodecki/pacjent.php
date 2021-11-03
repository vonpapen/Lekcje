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
        $db = mysqli_connect("localhost", "root", "", "przychodnia");

        $query = "SELECT * FROM pacjenci;";

        $result = mysqli_query($db, $query);

        while($row = mysqli_fetch_row($result)){
            echo $row[0];
            echo " ";
            echo $row[1];
            echo " ";
            echo $row[2];
            echo '<br/>';
        };
        ?>

        <form action="pacjent.php">
            Podaj id:<br />
            <input type="number" name="liczba">

            <input type="submit" value="Pokaż dane">
        </form>

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
            $db = mysqli_connect("localhost", "root", "", "przychodnia");
            $query= "SELECT * FROM pacjenci WHERE id=$_GET[liczba];";
            
            $result = mysqli_query($db, $query);
            $row = mysqli_fetch_row($result);
            
            echo 'Imie i nazwisko: '.$row[1]." ".$row[2].'<br>';
            
            echo 'Choroby przewlekłe: '.$row[3].'<br>';
            
            echo 'Uczulenia: '.$row[4];
        ?>

    </main>
    <footer>
        <small><i>Jan Horodecki 2TP</i></small>
    </footer>
</body>

</html>