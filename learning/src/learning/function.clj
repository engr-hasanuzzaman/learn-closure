;; Multi-arity functions (method overloading)
(defn message
;; without any param   
  ([] (prn "Good Bye!"))
;;   with one param
  ([msg] (prn msg)))

(message)
(message "See you again!")

;; Variadic functions (function that take variable number of parameters)
;; variable number of paramerters will be place at the end of parameter
(defn wellcome [msg & persons]
  (println msg (clojure.string/join ", " persons)))

(wellcome "Wellcome to Clojure world" "hasan" "zaman")

;; annonymous function
;; full version
(defn greeting [msg name]
  (println msg, name))

;; annonymous version
(def greeting1 (fn [msg name] (println msg, name)))

;; shorter annonymous function
(def greeting2 #(println %1 %2))

(greeting "Wellcome" "hasan")
(greeting1 "Wellcome" "hasan")
(greeting2 "Wellcome" "hasan")
