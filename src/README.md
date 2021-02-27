Необходимо:
- java 11
- LINUX

собрать: 
```bash 
./gradlew
```

запустить: из папки проекта после сборки
```bash
java -cp build/libs/sort-files-1.0-SNAPSHOT.jar com.ter.sort.Main {data type flag} [{sort direction type}] {output file path} {input file path} [{input file path} ...]
```