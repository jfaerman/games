<p>
A parte mais b&aacute;sica para a constru&ccedil;&atilde;o de uma Express&atilde;o Regular (RegEx)
s&atilde;o os caracteres simples. As RegEx mais b&aacute;sicas s&atilde;o compostas 
apenas por caracteres simples, como <code>a</code>, <code>1</code> e <code>C</code>.
</p>

Exemplo:
<ul>
	<li>A RegEx <code>z</code> <strong>reconhece</strong> o padr&atilde;o <code>z</code></li>
	<li>A RegEx <code>abcde</code> <strong>reconhece</strong> o padr&atilde;o <code>abcde</code></li>
	<li>A RegEx <code>q</code> <strong>n&atilde;o</strong> reconhece o padr&atilde;o <code>m</code></li>
</ul>

<p>	
A exce&ccedil;&atilde;o &agrave; essa regra s&atilde;o alguns caracteres, que possuem 
um <strong>significado especial</strong> dentro das RegEx 
(<code>$, ^, *, (, ), +, {, }, [, ], \, |, ?, -</code>). Para utiliz&aacute;-los 
como caracteres normais, voc&ecirc; precisa colocar uma <strong><code>\</code></strong> antes deles.
</p>

<p>
Al&eacute;m desses, existem ainda alguns caracteres que n&atilde;o s&atilde;o vis&iacute;veis, e dentro de RegEx eles s&atilde;o representados usando
caracteres escapados:
<ul>
	<li>O <code>tab</code> &eacute; representado por <code>-Tab-</code>, mas na RegEx voc&ecirc; deve usar <code>\t</code></li>
	<li>A <code>quebra de linha</code> &eacute; representada por <code>-Quebra-de-Linha-</code>, mas na RegEx voc&ecirc; deve usar <code>\n</code></li>
	<li>A <code>quebra de p&aacute;gina</code> &eacute; representada por <code>-Quebra-de-Pagina-</code>, mas na RegEx voc&ecirc; deve usar <code>\f</code></li>
	<li>O <code>retorno</code> &eacute; representada por <code>-Retorno-</code>, mas na RegEx voc&ecirc; deve usar <code>\r</code></li>
	<li>O <code>tab vertical</code> &eacute; representada por <code>-Tab-Vertical-</code>, mas na RegEx voc&ecirc; deve usar <code>\x0B</code></li>
	<li>O <code>espa&ccedil;o em branco</code> &eacute; representado por <code>-Espa&ccedil;o-</code>, mas voc&ecirc; continua apenas apertando a barra de espa&ccedil;o :)</li>
	<li>O <code>padr&atilde;o vazio</code> &eacute; representado por <code>-Vazio-</code>, mas voc&ecirc; simplesmente n&atilde;o escreve nada :)</li>
</ul>
</p>

Exemplo:
<ul>
	<li>A RegEx <code>$</code> <strong>n&atilde;o</strong> reconhece o padr&atilde;o <code>$</code></li>
	<li>A RegEx <code>\$</code> <strong>reconhece</strong> o padr&atilde;o <code>$</code></li>
	<li>A RegEx <code>(</code> <strong>n&atilde;o</strong> reconhece o padr&atilde;o <code>(</code> e &eacute; inv&aacute;lida.</li>
	<li>A RegEx <code>ac\$\{6</code> <strong>reconhece</strong> o padr&atilde;o <code>ac${6</code></li>
</ul>

<p>
O &uacute;ltimo detalhe que &eacute; importante levar em considera&ccedil;&atilde;o &eacute; que as RegEx diferenciam 
caracteres mai&uacute;sculos de caracteres min&uacute;sculos. 
</p>