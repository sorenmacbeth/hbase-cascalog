(ns hbase.cascalog.ops
  (:use cascalog.api)
  (:import cascading.hbase.ByteHolder
           org.apache.hadoop.hbase.util.Bytes))

(defn as-int [^ByteHolder bytes]
  (let [bytes (.getBytes bytes)]
    (Bytes/toInt bytes)))

(defn as-long [^ByteHolder bytes]
  (let [bytes (.getBytes bytes)]
    (Bytes/toLong bytes)))

(defn as-double [^ByteHolder bytes]
  (let [bytes (.getBytes bytes)]
    (Bytes/toDouble bytes)))

(defn as-string [^ByteHolder bytes]
  (.toString bytes))

