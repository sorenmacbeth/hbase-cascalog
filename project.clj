(defproject hbase.cascalog "0.1-SNAPSHOT"
  :source-path "src/clj"
  :java-fork "true"
  :java-debug "true"
  :description "simple cascalog wrapper for cascading.hbase"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojars.sorenmacbeth/cascading.hbase "0.1-SNAPSHOT"]
                 [cascalog "1.8.2"]]
  :dev-dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]
                     [org.apache.hbase/hbase "0.90.4"]
                     [lein-midje "1.0.3"]
                     [midje-cascalog "0.2.2"]]
  :aot :all)

