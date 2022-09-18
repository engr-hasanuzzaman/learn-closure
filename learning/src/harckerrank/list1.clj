;; Filter Positions in a List
(fn [lst] (take-nth 2 (drop 1 lst)))

;; sum the odd numbers
(fn [lst] (reduce + (filter #(odd? %) lst)))

;; find size without use count
(defn length [lst]
  (if (empty? lst) 0 (+ 1 (length (rest lst)))))