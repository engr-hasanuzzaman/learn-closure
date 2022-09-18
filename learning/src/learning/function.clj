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
  (print msg (clojure.string/join ", " persons)))

(wellcome "Wellcome to Clojure world" "hasan" "zaman")