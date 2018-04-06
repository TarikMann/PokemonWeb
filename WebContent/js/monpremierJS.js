window.onload = function(){
var bt1 = document.getElementById('myImagecara');
bt1.onmouseover = monGestionnairecara;
bt1.onmouseout = monGestionnairevierge1 ;

var bt2 = document.getElementById('myImagesala');
bt2.onmouseover = monGestionnairesala ;
bt2.onmouseout = monGestionnairevierge2 ;

var bt3 = document.getElementById('myImagebulbi');
bt3.onmouseover = monGestionnairebulb ;
bt3.onmouseout = monGestionnairevierge3 ;
}

function monGestionnairecara(){
	document.getElementById('myImagecara').src='img/poke1.jpg';
document.getElementById('demo').innerHTML = "Pokemon Eau Carapuce"
}

function monGestionnairesala(){
	document.getElementById('myImagesala').src='img/poke3.png';
document.getElementById('demo').innerHTML = "Pokemon Feu Salameche"
}

function monGestionnairebulb(){
	document.getElementById('myImagebulbi').src='img/poke2.jpg';
document.getElementById('demo').innerHTML = "Pokemon Plante  Bulbizarre"
}

function monGestionnairevierge1(){
	document.getElementById('myImagecara').src='img/pkb.jpg';

}
function monGestionnairevierge2(){
	document.getElementById('myImagesala').src='img/pkb.jpg';

}
function monGestionnairevierge3(){
	document.getElementById('myImagebulbi').src='img/pkb.jpg';

}