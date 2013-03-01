(defproject hbase.cascalog "0.2-SNAPSHOT"
  :source-paths ["src/clj"]
  :description "simple cascalog wrapper for cascading.hbase"
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [org.clojars.sorenmacbeth/cascading.hbase "1.2.9-SNAPSHOT"]
                 [cascalog "1.10.0"]
                 [org.apache.thrift/libthrift "0.8.0"
                  :exclusions
                  [org.slf4j/slf4j-api]]]
  :profiles {:provided
             {:dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]
                             [org.apache.hbase/hbase "0.92.0"
                              :exclusions [org.apache.thrift/libthrift]]]}
             :dev
             {:dependencies [[midje "1.5-alpha9"]
                             [midje-cascalog "0.4.0"
                              :exclusions [org.clojure/clojure]]]}}
  :plugins [[lein-midje "3.0-alpha4"]]
  :min-lein-version "2.0.0"
  :aot :all)
