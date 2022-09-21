;; use reduce to create map
(defn red-map [f lst]
  (reduce (fn [acc item] (conj acc (f item))) `() (reverse lst)))

;; 