<p>
Para ser capaz de reconhecer padr&otilde;es mais complexos que simples sequ&ecirc;ncias de caracteres,
&eacute; poss&iacute;vel definir <strong>classes de caracteres.</strong> Uma classe de caracteres funciona
como se fosse um caractere capaz de reconhecer v&aacute;rios caracteres diferentes.
</p>

<p>
Para definir uma classe de caracteres, voc&ecirc; utiliza os caracteres <code>[</code> e <code>]</code> 
envolvendo os caracteres que voc&ecirc; quer que as classes de caracteres reconhe&ccedil;a.
</p>

Exemplo:
<ul>
	<li>A RegEx <code>[c9]</code> <strong>reconhece</strong> o padr&atilde;o <code>c</code> e o padr&atilde;o <code>9</code>.</li>
	<li>A RegEx <code>[Aa]</code> <strong>reconhece</strong> o padr&atilde;o <code>A</code> e o padr&atilde;o <code>a</code>.</li>
	<li>A RegEx <code>[ab]</code> <strong>reconhece</strong> o padr&atilde;o <code>a</code> e o padr&atilde;o <code>b</code>, mas n&atilde;o reconhece o padr&atilde;o <code>ab</code>, pois este tem 2 caracteres.</li>
</ul>

<p>
Uma classe de caracteres para reconhecer todas as letras mai&uacute;sculas seria algo como 
<code>[ABCDEFGHJKLMNOPQRSTUVWXYZ]</code>, o que &eacute; bem ileg&iacute;vel e talvez voc&ecirc; n&atilde;o note que falta algum caractere
(notou que aquela RegEx n&atilde;o reconhece o caractere <code>I</code>?). Para resolver esse problema, &eacute; poss&iacute;vel
criar uma classe de caracteres para uma sequ&ecirc;ncia de caracteres, utilizando o caractere <code>-</code>.
</p>

Exemplo:
<ul>
	<li>A RegEx <code>[A-Z]</code> <strong>reconhece todas</strong> as letras mai&uacute;sculas.</li>   
	<li>A RegEx <code>[A-Z0-9]</code> <strong>reconhece todas</strong> as letras mai&uacute;sculas e n&uacute;meros.</li>
	<li>A RegEx <code>[f-h]</code> <strong>reconhece</strong> as letras <code>f</code>, <code>g</code> e <code>h</code>.</li>
</ul>	

<p>
Como existem algumas classes de caracteres que s&atilde;o muito comuns, existem algumas classes pr&eacute;-definidas. S&atilde;o elas:
<ul>
	<li>A classe <code>\d</code> &eacute; equivalente &agrave; classe [0-9]</li>
	<li>A classe <code>\s</code> &eacute; equivalente &agrave; classe [ \t\n\x0B\f\r]</li>
	<li>A classe <code>\w</code> &eacute; equivalente &agrave; classe [a-zA-Z_0-9]</li>
	<li>A classe <code>.</code>  reconhece todos os tipos de caracteres, exceto o <code>\n</code>.</li>
</ul>
</p>

Exemplo:
<ul>
	<li>A RegEx <code>.</code> <strong>reconhece</strong> todos os caracteres.</li>
	<li>A RegEx <code>\d\w</code> <strong> reconhece</strong> o padr&atilde;o <code>9a</code> e o <code>11</code>, mas n&atilde;o reconhece o padr&atilde;o <code>a9</code>.</li>
</ul>