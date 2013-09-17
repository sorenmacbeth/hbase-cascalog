(ns hbase.cascalog.helpers
  (:import [cascading.hbase.helper TableInputFormat]
           [org.apache.hadoop.hbase.util Bytes]
           [org.apache.hadoop.hbase.client Scan]))

(defn mk-scan-options [start-row stop-row]
  (let [scan (doto (Scan.)
               (.setStartRow (Bytes/toBytes start-row))
               (.setStopRow (Bytes/toBytes stop-row)))]
    {TableInputFormat/SCAN (TableInputFormat/convertScanToString scan)}))
