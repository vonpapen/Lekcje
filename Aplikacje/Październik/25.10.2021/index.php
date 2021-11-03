<?php 
function sprawdzHaslo($user, $pass){



    $fp = fopen("password.txt", "r");
    // echo($fp);

    $lancuch = fgets($fp);

    $tabela = explode(";",$lancuch);
    $u = $tabela[0];
    $p = $tabela[1];

    if($u == $user && $p = $pass){
        return 1;
    }

    return 2;
}

echo sprawdzHaslo("User1","Password1");