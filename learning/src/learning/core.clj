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
