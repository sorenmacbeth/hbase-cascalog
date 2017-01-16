# hbase-cascalog

A very simple wrapper around cascading.hbase for use in cascalog.

## Usage

Using HBase as a sink is straightforward. Reading out of HBase as a source requires deserializing the bytes on the way back out. Helper functions are included under hbase.cascalog.ops

Like so at a repl (assuming hbase is running on localhost):

```clojure
(use '[cascalog api playground])
(use '[hbase.cascalog core ops])

;; write to hbase as sink
(?<- (hbase-tap "age-table" "?person" "cf" "?age") [?person ?age] (age ?person ?age))

;; read from hbase as source
(let [age-table (hbase-tap "age-table" "?person" "cf" "?age")]
  (?<- (stdout) [?p ?a] (age-table ?p ?age) (as-string ?age :> ?a))) 
```
## License

```
Copyright (C) 2011 Soren Macbeth

Distributed under the Eclipse Public License, the same as Clojure.
```
