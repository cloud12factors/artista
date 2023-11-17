##Descargamos una versión concreta de UBUNTU, a través del tag
FROM ubuntu:22.04
MAINTAINER el profe FARIAS 16112023 "sincorreo@sindireccion" 
##Actualizamos el sistema
RUN apt-get update && apt-get install -y openjdk-17-jdk openjdk-17-jre
RUN apt  install wget -y
ENV JAVA_HOME /usr/lib/jvm/java-17-openjdk-amd64
ENV PATH $PATH:$JAVA_HOME/bin
#Directorio donde va a funcionar el archivo jar
RUN mkdir /var/ELJAR
RUN chmod 755 /var/ELJAR
#Volumen donde va a funcionar el archivo jar
COPY  ELJAR.jar /var/ELJAR/
CMD ["java", "-jar" , "/var/ELJAR/ELJAR.jar"]
EXPOSE 8083
