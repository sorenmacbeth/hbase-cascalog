(ns hbase.cascalog.core
  (:use cascalog.api)
  (:require [cascalog.workflow :as w])
  (:import [cascading.hbase HBaseTap HBaseScheme HBaseDynamicScheme]))

(defn hbase-tap [table-name key-field column-family & value-fields]
  (let [scheme (HBaseScheme. (w/fields key-field) column-family (w/fields value-fields))]
    (HBaseTap. table-name scheme)))

(defn dynamic-hbase-tap [table-name key-field value-field & column-families]
  (let [scheme (HBaseDynamicScheme. (w/fields key-field) (w/fields value-field) (into-array String column-families))]
    (HBaseTap. table-name scheme)))

