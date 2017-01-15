#Brief
Collect resterant info from m.dianping.com. Results can be printed to screen or to a file. Built with Maven.
#Command Line
`java -jar dzdp-0.0.1-SNAPSHOT-jar-with-dependencies.jar -c Syd -M 1000 -f ./resut.txt`

`-c` choose the city: Syd, Mel, default Syd.

`-M` the max item to retrive, default retrive all(about 5000 shops in Sydney).

`-f` output file, default print on screen

#build from source

`mvn package`