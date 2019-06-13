%Hechos
%Contenidos audio-visual
pelicula('childs play','terror',1988).
pelicula('avatar','ciencia ficcion',2009).
pelicula('the avangers','accion',2012).
pelicula('emoji the movie','animacion',2017).
pelicula('hotel transylvania 3: summer vacation','comedia de terror',2018).
pelicula('pixels','fantasia',2015).
pelicula('john wick: chapter 3-parabellum','cine policiaco de suspenso',2019).
pelicula('titanic','romance',1997).
pelicula('pacific rim','ciencia ficcion',2013).
pelicula('resident evil','accion',2002).
pelicula('alien: el octavo pasajero','terror',1979).
pelicula('paranormal activity','metraje encontrado',2007).

serie('the walking dead','terror',2010).
serie('the flash','ciencia ficcion',2014).
serie('lucifer','policiaca',2016).
serie('black mirror','drama',2011).
serie('chernobyl','drama historico',2019).
serie('stranger things','fantasia',2016).
serie('los intocables','adaptacion cinematografica',1959).
serie('los simuladores','comedia',2002).
serie('el chapo','drama televisivo',2017).
serie('game of thrones','fantasia',2011).

anime('one puch man','accion',2019).
anime('tate no yusha','fantasia oscura',2019).
anime('konosuba','comedia',2016).
anime('school days','drama',2007).
anime('oregairu','recuentos de la vida',2013).
anime('elfen lied','horror',2004).
anime('koi to uso','cine romantico',2017).
anime('konjiki no gash bell!!','comedia',2003).
anime('naruto','aventura',2002).
anime('chio-chan no tsuugakuro','comedia',2018).
anime('to love-ru','harem',2008).

%PERSONAS 
actor('catherine hicks').
actor('sam worthington').
actor('robert downey jr').
actor('anna faris').
actor('adam sandler').
actor('leonardo dicaprio').
actor('charlie hunnam').
actor('milla jovovich').
actor('tom skerritt').
actor('katie featherston').
actor('andrew lincoln').
actor('grant gustin').
actor('tom ellis').
actor('daniel lapaine').
actor('jared harris').
actor('winona ryder').
actor('robert stack').
actor('tony dalton').
actor('tete espinoza').
actor('sean bean').


director('tom holland').
director('james cameron').
director('joss whedon').
director('tony leondis').
director('chris columbus').
director('guillermo del toro').
director('paul w. s. anderson').
director('ridley scott').
director('oren peli').
director('robert kirkman').
director('greg berlanti').
director('tom kapinos').
director('charlie brooker').
director('craig mazin').
director('hermanos duffer').
director('walter grauman').
director('damian szifron').
director('ernesto contreras').
director('david benioff').

trabajo('catherine hicks','childs play').
trabajo('tom holland','childs play').

trabajo('sam worthington','avatar').
trabajo('james cameron','avatar').

trabajo('robert downey jr','the avengers').
trabajo('joss whedon','the avengers').

trabajo('anna faris','emoji the movie').
trabajo('tony leondis','emoji the movie').

trabajo('adam sandler','pixels').
trabajo('chris columbus','pixels').

trabajo('leonardo dicaprio','titanic').
trabajo('james cameron','titanic').

trabajo('charlie hunnam','pacific rim').
trabajo('guillermo del toro','pacific rim').

trabajo('milla jovovich','resident evil').
trabajo('paul w. s. anderson','resident evil').

trabajo('tom skerritt','alien: el octavo pasajero').
trabajo('ridley scott','alien:el octavo pasajero').

trabajo('katie featherston','paranormal activity').
trabajo('oren peli','paranormal activity').

trabajo('andrew lincoln','the walking dead').
trabajo('robert kirkman','the walking dead').

trabajo('grant gustin','the flash').
trabajo('greg berlanti','the flash').

trabajo('tom ellis','lucifer').
trabajo('tom kapinos','lucifer').

trabajo('daniel lapaine','black mirror').
trabajo('charlie brooker','black mirror').

trabajo('jared harris','chernobyl').
trabajo('craig mazin','chernobyl').

trabajo('winona ryder','stranger things').
trabajo('hermanos duffer','stranger things').

trabajo('robert stack','los intocables').
trabajo('walter grauman','los intocables').

trabajo('tony dalton','los simuladores').
trabajo('damian szifron','los simuladores').

trabajo('tete espinoza','el chapo').
trabajo('ernesto contreras','el chapo').

trabajo('sean bean','game of thrones').
trabajo('david benioff','game of thrones').

%Calificaciones
calificacion('buena',7,9).
calificacion('regular',4,6).
calificacion('mala',1,3).

score('childs play', 6).
score('avatar', 7).
score('the avangers',5).
score('emoji the movie', 4).
score('hotel transylvania 3: summer vacation', 8).
score('pixels', 4).
score('jon wick: chapter 3-parabellum', 9).
score('titanic', 6).
score('resident evil', 9).
score('alien: el octavo pasajero', 9).
score('paranomal activity', 4).

score('the walking dead', 6).
score('the flash', 7).
score('lucifer',7).
score('black mirror', 4).
score('chernobyl', 8).
score('strager things', 4).
score('los intocables', 9).
score('los simuladores', 6).
score('tate no yusha', 9).
score('el chapo', 7).
score('game of thrones', 5).

score('school days', 7).
score('elfen lied',5).
score('koi to uso', 4).
score('chio-chan no tsuugakuro', 8).
score('konjiki no gash bell!!', 4).
score('to love-ru', 9).
score('one puch man', 6).
score('tate no yusha', 9).
score('oregariu', 7).
score('naturo', 3).

/*REGLAS*/
review(P,C):-score(P,N),calificacion(C,X,Y),N>=X,N=<Y.
allGenres(X):-pelicula(_,X,_);serie(_,X,_);anime(_,X,_).
checkAll(A,B,C):-pelicula(A,B,C);serie(A,B,C);anime(A,B,C).
actuo_en(X,Y):-actor(X),(pelicula(Y,_,_);serie(Y,_,_)),trabajo(X,Y).
dirigio(X,Y):-director(X),(pelicula(Y,_,_);serie(Y,_,_)),trabajo(X,Y).