;; covert to lowercase
(.toLowerCase "HELLOW WORLD")

(let [[s k](map (fn [ns] (Integer/parseInt ns)) (clojure.string/split (read-line) #" "))]
  (println s k))