#!/usr/bin/env python3

import os
import pathlib
import stat
import urllib.request
from zipfile import ZipFile

gradle= "gradle-7.4.2"

home = str(pathlib.Path.home())
dir = f'{home}/gradle'

def path():
    path = os.environ['PATH']
    if not f'/gradle/{gradle}/bin' in path:
        os.system(f"echo 'export PATH=\"$HOME/gradle/{gradle}/bin:$PATH\"' >> $HOME/.bashrc")
        os.system("source $HOME/.bashrc")


def download(path):
    if not os.path.exists(path):
        print(f"Downloading {file}")
        url = f'https://downloads.gradle-dn.com/distributions/{gradle}-bin.zip'
        urllib.request.urlretrieve(url, path)

def make_executable(file):
    st = os.stat(file)
    os.chmod(file, st.st_mode | stat.S_IEXEC)

if not os.path.exists(dir):
    os.makedirs(dir)
    print(f"Make dir {dir}")

file = f'{dir}/{gradle}-bin.zip'
download(file)

with ZipFile(file, 'r') as zipObj:
       zipObj.extractall(dir)

make_executable(f'{dir}/{gradle}/bin/gradle')

path()