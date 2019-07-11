javac:
	#javac -sourcepath src -d target src/PhoneNumber.java
	#javac -sourcepath src -d target src/Person.java
	#java compile do source-path src para o diretório target  uando uma biblioteca do meu classpath o arquivo src/Calculadora
	javac -sourcepath src -d target -cp lib/xstream-1.4.11.1.jar src/Calculadora.java
	#java procurando na pasta targe rode o arquivo Caculadora
	java -cp ./lib/xstream-1.4.11.1.jar -classpath target  Calculadora

javac_v1:
	# Dado uma pasta especifica para o código fonte: source -> src
	# E Uma pasta de destino: alvo - target
	# Compile do fonte para a target
	#java compile do source-path src para o diretório target o arquivo src/Calculadora
	javac -sourcepath src -d target src/Calculadora.java

	#java procurando na pasta targe rode o arquivo Caculadora
	java -classpath target Calculadora

javac_v0:
# compila e roda com uma classe simples com o fonte na raiz
	javac Calculadora.java
	java Calculadora