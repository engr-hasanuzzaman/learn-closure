;; Multi-arity functions
(defn message
;; without any param   
  ([] (prn "Good Bye!"))
;;   with one param
  ([msg] (prn msg)))

(message)
(message "See you again!")