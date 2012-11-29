(ns hbase.cascalog.ops
  (:use cascalog.api)
  (:require [cascalog [ops :as c] [vars :as v] [workflow :as w]])
  (:import [cascading.hbase.helper HBaseMapToTuples HBaseTuplesToMap]))

