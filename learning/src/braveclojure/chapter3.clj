;; Use the str, vector, list, hash-map, and hash-set functions.
;; str concatinate using str method
((fn [](str "Hello " "World")))

(def v (vector 1 2 3 4 4 5))
(def l (list 1 2 3 4 4 5))
(def man (hash-map :name "sumon" :age 32))
(def skill (hash-set :ruby :clojure :javaScript :ruby))

;; -----------2nd problem (Write a function that takes a number and adds 100 to it.)
(defn second-solution []
  (println "After adding 10 with 100" (+ 10 100)))

;; ----------- 3rd problem (Write a function, dec-maker, that works exactly like the function inc-maker except with subtraction:)
(defn dec-maker [num]
  (- num 1))

(defn third-solution []
  (println "use dec-maker with 100 is: " (dec-maker 100)))

;; function to call particular problem
(defn first-solution []
  (println v l man skill))


;; run the solution
(println "->first solution")
(first-solution)
(println "->2nd solution")
(second-solution)
(println "->3rd solution")
(third-solution)
