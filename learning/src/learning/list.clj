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

;; list
(def l `(1 2 3 4 5))
(println (first l))
(println (last l))
(println (nth l 1))
(println (rest l))
(println (for [num l] (* num 2)))

;; list as stack
(def stack '(:age :name :address))
(println (peek stack))
(println (pop stack))

;; reduce
(prn (reduce + ages))
;; reduce params: function, optional_initial val, seq
(prn (reduce + 100 ages))
;; product new map reducing ages
(prn (reduce (fn [final-result age]
               (conj final-result {:age age}))
             []
             ages))

;; practice take & drop function
(take 2 (range 10))
(drop 2 (range 10))
(take-while #(<= % 6) (range 20))
(drop-while #(<= % 6) (range 20))

;; use time method to check execution time
(time (drop-while #(<= % 6) (range 20)))

;; return n-th fibo
;; (def n (Integer/parseInt (read-line)))
(defn fibo [n]
    ;; (println "with in fibo " n)
  (if (<= n 2)
    (- n 1)
    (+ (fibo (- n 1)) (fibo (- n 2)))))
(println (fibo 5))

;; fibonacci using recur
(defn nth-fibo [n]
  (let [fibo (fn [one two iteration]
               (if (= n iteration)
                 one
                 (recur two (+ two one) (inc iteration))))]
    (fibo 0N 1N 0)))


;; infinite sequence
;; repeat creat infinite loop
(take 5 (repeat "test"))

(take 5 (repeatedly (fn [] (rand 10))))
(take 5 (repeatedly (fn [] (rand-int 10))))

;; lazy odd-number sequence
(defn odd-number 
  ([] (odd-number 1))
  ([n] (cons n (lazy-seq (odd-number (+ n 2))))))

;; convert sequence to vector
(into [] (map inc (range 10)))

;; \
(into {:favorite-emotion "gloomy"} [[:sunlight-reaction "Glitter!"]])

;; both arguments must be collection
(conj [1] [2]) ;; [1 [2]]
(conj {:name "sumon"} [:age 23] [:foo 23] [1 2])

(into [1] [2]) ;; [1 2]
