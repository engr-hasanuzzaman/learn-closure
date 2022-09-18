(ns learning.list)

(def add (fn [nums] (reduce + nums)))
(defn make-double [nums] (map #(* % 2) nums))
(def words ["accident" "initiative" "clothes" "library" "cancer" "mixture" "aspect" "bathroom" "photo" "cousin" "recipe" "speech" "story" "debt" "engine" "direction" "tooth" "interaction" "river" "magazine" "thing" "internet" "awareness" "desk" "math" "role" "ratio" "negotiation" "grandmother" "statement"])

;; vector, 0-indexed
(def nums [1 2 3 4 5 6 7 8 9])
(def ages (vector 20 21 22 23 24 24))

;; Indexed access
(println (get nums 4))
(println (get ages 0))

;; conj create new vector
(def nums2 (conj nums 10 11))
(println nums2 nums)

