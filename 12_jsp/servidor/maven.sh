mvn org.apache.maven.plugins:maven-archetype-plugin:3.1.2:generate -DarchetypeArtifactId="maven-archetype-webapp" -DarchetypeGroupId="org.apache.maven.archetypes" -DarchetypeVersion="1.4" -DgroupId="com.miguelangelplaza" -DartifactId="$1"

mkdir $1/vscode
cp ../.vscode/*.* $1/vscode
#creo la estructura de carpeta que falta para crear las clases java
mv $1/vscode $1/.vscode

mkdir -p $1/src/main/java/modules

mkdir -p $1/src/main/webapp/assets/css
mkdir -p $1/src/main/webapp/assets/img

cd $1
code .


