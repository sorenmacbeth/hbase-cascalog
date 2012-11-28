(defproject hbase.cascalog "0.2-SNAPSHOT"
  :source-paths ["src/clj"]
  :description "simple cascalog wrapper for cascading.hbase"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojars.sorenmacbeth/cascading.hbase "1.2.9-SNAPSHOT"]
                 [cascalog "1.10.1-SNAPSHOT"]
                 [org.apache.thrift/libthrift "0.8.0"]]
  :profiles {:provided
             {:dependencies [[org.apache.hadoop/hadoop-core "1.0.3"]
                             [org.apache.hbase/hbase "0.92.0"
                              :exclusions [org.apache.thrift/libthrift]]]}
             :dev
             {:dependencies [[midje "1.4.0"]
                             [midje-cascalog "0.4.0"
                              :exclusions [org.clojure/clojure]]]}}
  :plugins [[lein-midje "2.0.0-SNAPSHOT"]]
  :min-lein-version "2.0.0"
  :aot :all)

