(ns learning.core
  (:gen-class))

(defn greeting [name] 
  (str "Hello " name))
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (greeting "Hasan")))
