<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Project/PHP/PHPProject.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        
        <style>
            table{
                border: 3px solid blue;
            }
            td{
                border: 1px solid black;
                background-color: grey;
            }
            th{
                border: 2px solid red;
                background-color: violet;
            }
        </style>
    </head>
    <body>
        <?php
            $host = "localhost";
            $username = "root";
            $passwd = "";
            $dbname = "ludzie";
            $db = mysqli_connect($host, $username, $passwd, $dbname);
            
            $query = "SELECT * FROM osoby;";
            
            $result = mysqli_query($db, $query);
            
            echo '<table>';
            echo '<th>id</th><th>imie</th><th>nazwisko</th>';
            while ($row= mysqli_fetch_row($result)){
                echo '<tr>';
                echo "<td>$row[0]</td>";
                echo "<td>$row[1]</td>";
                echo "<td>$row[2]</td>";
                echo '</tr>';
            }
            echo '</table>';
        ?>
    </body>
</html>
