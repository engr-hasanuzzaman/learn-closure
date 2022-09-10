(ns learning.core
  (:gen-class))

(defn greeting [name] 
  (str "Hello " name))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (greeting "Hasan"))
  ;; (println (ls.list.make-double (range 10)))
  ;; execute code in reverse way using pipe operator
  (->> (range 10) (map #(* 2 %)) (println))
)
