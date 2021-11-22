<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- <ul> -->
<?php
    // $path = "C:";
    // $h = opendir($path);

    // $pliki = scandir($path);

    // print_r($pliki);


    // foreach($pliki as $plik){
    //     echo '<li>';
    //     echo $plik;
    //     echo '</li>';
    // }

    $books = array(
        array("autor"=>"Karasinski", "tytul"=> "jak grac w lige"),
        array("autor"=>"Bepti", "tytul"=> "jak pocic sie zeby nikt nie widzial")
    );

    print_r($books);

?>

    <!-- </ul> -->

</body>
</html>