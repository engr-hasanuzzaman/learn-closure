(ns learning.exm1 (:gen-class))
(def asym-hobbit-body-parts [{:name "head" :size 3}
                             {:name "left-eye" :size 1}
                             {:name "left-ear" :size 1}
                             {:name "mouth" :size 1}
                             {:name "nose" :size 1}
                             {:name "neck" :size 2}
                             {:name "left-shoulder" :size 3}
                             {:name "left-upper-arm" :size 3}
                             {:name "chest" :size 10}
                             {:name "back" :size 10}
                             {:name "left-forearm" :size 3}
                             {:name "abdomen" :size 6}
                             {:name "left-kidney" :size 1}
                             {:name "left-hand" :size 2}
                             {:name "left-knee" :size 2}
                             {:name "left-thigh" :size 4}
                             {:name "left-lower-leg" :size 3}
                             {:name "left-achilles" :size 1}
                             {:name "left-foot" :size 2}])
(defn matching-part
  [part]
  {:name (clojure.string/replace (:name part) #"^left-" "right-") :size (:size part)})

(defn symmetrize-body-parts
  [body-parts]
  (loop [rem-parts body-parts final-body-parts []]
    (if (empty? rem-parts)
      final-body-parts
      (let [[part & remaining] rem-parts]
        (recur remaining
               (into final-body-parts
                     (set [part (matching-part part)])))))))

(defn better-symmetrize-body-parts
  "Expects a seq of maps that have a :name and :size"
  [asym-body-parts]
  (reduce (fn [final-body-parts part]
            (into final-body-parts (set [part (matching-part part)])))
          []
          asym-body-parts))

(println (= (symmetrize-body-parts asym-hobbit-body-parts) (better-symmetrize-body-parts asym-hobbit-body-parts)))

;; basic loop practice
;; loop create an anonymous function and using recur we can call that recursively
(loop [count 0]
  (println "Count is: " count)
  (if (> count 3)
    (println "End")
    (recur (inc count))))