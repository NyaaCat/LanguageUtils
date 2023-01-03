#!/usr/bin/env python

"""
Export all the language files in Minecraft.
Please copy this program to ".minecraft/assets/" directory and use Python 3.4+ to run this program.
"""

import os
import json
import sys
import shutil
import zipfile

version_name = input("Version: (1.19.2) : ")
version_short_name = (version_name.rpartition('.')[0] if version_name.count('.') > 1 else version_name)

try:
    version_file = open("indexes/" + version_short_name + ".json", 'r', encoding='UTF-8')
except FileNotFoundError as err:
    print(err)
    sys.exit(1)

try:
    os.makedirs("lang", exist_ok=True)
except OSError as err:
    print(err)
    sys.exit(1)

indexes = json.loads(version_file.read())
with zipfile.ZipFile(f'../versions/{version_name}/{version_name}.jar', 'r') as zip_ref:
    info = zip_ref.getinfo('assets/minecraft/lang/en_us.json')
    info.filename = "lang/" + os.path.basename(info.filename)
    zip_ref.extract(info, path='.')

lang_keys = list(filter(lambda lang_key: "minecraft/lang/" in lang_key, indexes["objects"].keys()))
for key in lang_keys:
    lang_name = key.replace("minecraft/lang/", "").replace(".json", "").strip()
    lang_hash = indexes["objects"][key]['hash'].strip()
    try:
        shutil.copyfile("objects/" + lang_hash[:2] + "/" + lang_hash, "lang/" + lang_name + ".json")
    except OSError as err:
        print(lang_name + ":")
        print(err)


lang_keys.append("minecraft/lang/en_us")
for i, key in enumerate(sorted(lang_keys)):
    lang_name = key.replace("minecraft/lang/", "").replace(".json", "").strip()
    endl = ';' if i == len(lang_keys) - 1 else ','
    print(lang_name.upper() + "(\"" + lang_name + "\", new HashMap<>())" + endl)
    
version_file.close()
