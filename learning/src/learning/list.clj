(ns learning.list)

(def add (fn [nums] (reduce + nums)))
(defn make-double [nums] (map #(* % 2) nums))
(def words ["accident" "initiative" "clothes" "library" "cancer" "mixture" "aspect" "bathroom" "photo" "cousin" "recipe" "speech" "story" "debt" "engine" "direction" "tooth" "interaction" "river" "magazine" "thing" "internet" "awareness" "desk" "math" "role" "ratio" "negotiation" "grandmother" "statement"])