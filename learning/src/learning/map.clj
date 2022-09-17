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

(defn nested-keys [mapObj]
  (map (fn [[k v]] (if (map? v) (conj (nested-keys v) k) k)) mapObj))
  
(defn nested-keys-rev [mapObj]
  (->> mapObj (map (fn [[k v]] (if (map? v) (conj (nested-keys v) k) k)))))

;; access map data
(println (str "The name of the person is ", (:name person)))
(println (str "The age of the person is ", (get person :age)))
;; access nested key
(println (str "The Nested name ", (get-in person [:address :country :name])))
(println (str "The Nested name ", (get-in person [:address :policeStation :name] "No Police Statin")))
;; access nested element using pipeline
(println (str "The Nested name ", (-> person :address :country :name)))
(println (str "Print all the values", (vals person)))
(println "Print all the keys" (nested-keys person))
(println "Print all the keys" (nested-keys-rev person))
