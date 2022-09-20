(ns learning.core
  (:require [learning.list :as list])
  (:gen-class))

(defn greeting [name]
  (str "Hello " name))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (greeting "Hasan"))
  ;; execute code in reverse way using pipe operator
  (->> (range 10) (map #(* 2 %)) (println))
  (println (list/add [1 2 3 44])))

;; how map work on list, map, vector and set
;; 1. It use seq method to convert the input with has first, rest & cons interface
;; then use these three method to map and apply transformation
(prn "Sequence example")
(seq {:name "sumon" :age 32 :phone "012333"})
(seq `(1 2 3 4 45 5))
(seq [1 2 3 4 45 5])
(seq #{:name :age 23 1 2 3 4 5})

