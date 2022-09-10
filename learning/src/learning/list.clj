(ns learning.ls)

(def add (fn [nums] (reduce + nums)))
(defn make-double [nums] (map #(* % 2) nums))