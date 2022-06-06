#/bin/bash

GRADLE_FILE="gradle-7.4.2-bin.zip"
GRADLE_DIR=$HOME/gradle

mkdir -p $GRADLE_DIR
curl  https://downloads.gradle-dn.com/distributions/gradle-7.4.2-bin.zip  -o gradle.zip
unzip -d $GRADLE_DIR gradle.zip
rm -f gradle.zip