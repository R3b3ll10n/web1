var text1="¿Has olvidado el ID o la contraseña?"
var text2="¿No tienes Usuario?Créate uno ahora."
var text3="ID de Usuario";
var text4="Contraseña";
var text5="Inicia sesión";

function start(){
	add_text("forget_pwd",text1)
	add_text("create_count",text2);
	config_input("id",text3,"text");
	config_input("pwd",text4,"password");
	config_btn("SignIn",text5,"submit");
}
function add_text(n_id, text){
	var l = document.getElementById(n_id);
	l.innerHTML=text
}
function config_input(n_id, text_place,type){
	var l = document.getElementById(n_id);
	l.required = true;
	l.placeholder= text_place;
	l.type=type
}
function config_btn(n_id,value,type){
	var l = document.getElementById(n_id);
	l.type=type;
	l.value=value;
}
window.onload = start;