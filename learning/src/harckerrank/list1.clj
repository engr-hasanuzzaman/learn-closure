;; Filter Positions in a List
(fn [lst] (take-nth 2 (drop 1 lst)))

;; sum the odd numbers
(fn [lst] (reduce + (filter #(odd? %) lst)))

;; find size without use count
(defn length [lst]
  (if (empty? lst) 0 (+ 1 (length (rest lst)))))

(fn[lst] (reduce + (for [_ lst] 1)))

(fn [lst] (reduce + (map (fn [_] 1) lst)))

;; convert negtive number to positive
(fn [lst] (map (fn [n] (if (neg? n) (* -1 n) n)) lst))

;; reverse list without using reverse function
(fn [lst]
  (reduce #(conj %1 %2) `() lst))