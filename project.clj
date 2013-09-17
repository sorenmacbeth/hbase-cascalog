(defproject hbase.cascalog "0.2.1-SNAPSHOT"
  :source-paths ["src/clj"]
  :description "simple cascalog wrapper for cascading.hbase"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojars.sorenmacbeth/cascading.hbase "1.3.0-SNAPSHOT"]
                 [cascalog/cascalog-core "2.0.0-SNAPSHOT"]
                 [org.apache.thrift/libthrift "0.8.0"
                  :exclusions
                  [org.slf4j/slf4j-api]]]
  :profiles {:provided
             {:dependencies [[org.apache.hadoop/hadoop-core "0.20.2"]
                             [org.apache.hbase/hbase "0.92.0"
                              :exclusions [org.apache.thrift/libthrift
                                           org.slf4j/slf4j-api]]]}
             :dev
             {:dependencies [[midje "1.5.0"]
                             [cascalog/midje-cascalog "2.0.0-SNAPSHOT"]]
              :plugins [[lein-midje "3.0.0"]]}}
  :min-lein-version "2.0.0"
  :aot :all)
