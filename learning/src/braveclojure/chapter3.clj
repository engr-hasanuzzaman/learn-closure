;; Use the str, vector, list, hash-map, and hash-set functions.
;; str concatinate using str method
((fn [](str "Hello " "World")))

(def v (vector 1 2 3 4 4 5))
(def l (list 1 2 3 4 4 5))
(def man (hash-map :name "sumon" :age 32))
(def skill (hash-set :ruby :clojure :javaScript :ruby))

(println v l man skill)