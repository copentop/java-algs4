#!/bin/bash

# java test Snippet

if [ $# -ne 1 ];then
	echo "Usage: ./snip.sh ClassName ";
	exit 0;
fi


cls=$1
templ="//import \n
\n
\npublic class ${cls}\n{\n\tpublic static void main(String[] args)\n
\t{\n\t\t // System.out.println("");\n\t}\n}\n
";

echo -e $templ >> ${cls}Test.java
