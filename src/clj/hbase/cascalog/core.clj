(ns hbase.cascalog.core
  (:use cascalog.api)
  (:require [cascalog.workflow :as w])
  (:import [cascading.hbase HBaseTap HBaseScheme HBaseDynamicScheme]))

(defn hbase-tap [table-name scan-options key-field column-family & value-fields]
  (let [scheme (HBaseScheme. (w/fields key-field) column-family (w/fields value-fields))]
    (with-job-conf scan-options
      (HBaseTap. table-name scheme))))

(defn dynamic-hbase-tap [table-name scan-options key-field value-field & column-families]
  (let [scheme (HBaseDynamicScheme. (w/fields key-field) (w/fields value-field) (into-array String column-families))]
    (with-job-conf scan-options
      (HBaseTap. table-name scheme))))

