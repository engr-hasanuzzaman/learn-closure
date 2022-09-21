;; use reduce to create map
(defn red-map [fn lst]
  (reduce (fn [acc item] (conj acc item)) [] lst))