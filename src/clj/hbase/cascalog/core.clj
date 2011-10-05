(ns hbase.cascalog.core
  (:require [cascalog.workflow :as w])
  (:import [cascading.hbase HBaseTap HBaseScheme ByteHolder]
           [cascading.tuple Fields]))

(defn hbase-tap [table-name key-field column-family & value-fields]
  (let [scheme (HBaseScheme. (w/fields key-field) column-family (w/fields value-fields))]
    (HBaseTap. table-name scheme)))

