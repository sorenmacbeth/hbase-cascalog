(ns hbase.cascalog.core
  (:use cascalog.api)
  (:require [cascalog.cascading.util :refer (fields)])
  (:import [cascading.hbase HBaseTap HBaseScheme HBaseDynamicScheme]))

(defn hbase-tap [table-name key-field column-family & value-fields]
  (let [scheme (HBaseScheme. (fields key-field) column-family (fields value-fields))]
    (HBaseTap. table-name scheme)))

(defn dynamic-hbase-tap [table-name key-field value-field & column-families]
  (let [scheme (HBaseDynamicScheme. (fields key-field) (fields value-field) (into-array String column-families))]
    (HBaseTap. table-name scheme)))
