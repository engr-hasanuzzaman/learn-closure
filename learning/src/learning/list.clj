(ns learning.list
    (:gen-class))

(def add (fn [nums] (reduce + nums)))