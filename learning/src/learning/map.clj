(ns learning.map)

;; create map
(def person {
             :name "sumon"
             :age 30
             :address {
                       :country {:name "Bangladesh" :phoneCode "+008"},
                       :district "Bogura"
                       }
             })
(println person)

;; access map data
(println (str "The name of the person is ", (:name person)))
(println (str "The age of the person is ", (get person :age)))
;; access nested key
(println (str "The Nested name ", (get-in person [:address :country :name])))
(println (str "The Nested name ", (get-in person [:address :policeStation :name] "No Police Statin")))
;; access nested element using pipeline
(println (str "The Nested name ", (-> person :address :country :name)))
