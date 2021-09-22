//Pierwsze
function dodawanie(){
    let a,b,c,wynik;

    a=prompt("Podaj a: ","a");
    b=prompt("Podaj b: ","b");
    c=prompt("Podaj c: ","c");

    a=parseInt(a);
    b=parseInt(b);
    c=parseInt(c);
    wynik=a+b+c;

    document.write(wynik);
}

//Drugie
function srednia(){
    let a,b,c,wynik;

    a=prompt("Podaj a: ","a");
    b=prompt("Podaj b: ","b");
    c=prompt("Podaj c: ","c");

    a=parseInt(a);
    b=parseInt(b);
    c=parseInt(c);

    wynik=(a+b+c)/3;

    document.write(wynik);
}

//Trzecie
function wieleDzialan(){
    let a,b,wynikD,wynikO,wynikI;

    a=prompt("Podaj a: ","a");
    b=prompt("Podaj b: ","b");

    a=parseInt(a);
    b=parseInt(b);

    wynikD=a+b;
    document.write(wynikD + "</br>");

    wynikO=a-b;
    document.write(wynikO + "</br>");

    wynikI=a*b;
    document.write(wynikI + "</br>");
}

//Czwarte
function pierwiastek(){
    let a;
    a=prompt("Podaj a: ","a");

    a=parseInt(a);

    wynik=Math.sqrt(a);

    document.write(wynik);
}

//Piate
function kwadrat(){
    let a;
    a=prompt("Podaj a: ","a");

    a=parseInt(a);

    wynik=a*a;

    document.write(wynik);
}

function a(){
    let a;
    a=prompt("Podaj a: ","a");

    a=parseFloat(a);

    wynik=++a-0.5;

    document.write(wynik);
}