#!/usr/bin/env python

"""
Export all the language files in Minecraft.
Please copy this program to ".minecraft/assets/" directory and use Python 3.4+ to run this program.
"""

import os
import json
import sys
import shutil

version_filename = input("Version: ") + ".json"

try:
    version_file = open("indexes/" + version_filename, 'r', encoding='UTF-8')
except FileNotFoundError as err:
    print(err)
    sys.exit(1)

try:
    os.makedirs("lang", exist_ok=True)
except OSError as err:
    print(err)
    sys.exit(1)

indexes = json.loads(version_file.read())
for key in sorted(indexes["objects"].keys()):
    if key.__contains__("minecraft/lang/"):
        lang_name = key.replace("minecraft/lang/", "").replace(".json", "").strip()
        lang_hash = indexes["objects"][key]['hash'].strip()
        print(lang_name.upper() + "(\"" + lang_name + "\", new HashMap<>()),")
        try:
            shutil.copyfile("objects/" + lang_hash[:2] + "/" + lang_hash, "lang/" + lang_name + ".json")
        except OSError as err:
            print(lang_name + ":")
            print(err)

version_file.close()
