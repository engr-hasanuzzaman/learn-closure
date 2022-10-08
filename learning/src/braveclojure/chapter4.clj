;; use reduce to create map
(defn red-map [f lst]
  (reduce (fn [acc item] (conj acc (f item))) `() (reverse lst)))

;; with shorthand function
(defn red-map-2 [f lst]
  (reduce #(conj %1 (f %2)) `() (reverse lst)))

;; keep same key but update value
(defn change-val [f mp]
  (reduce (fn [ac [key val]]
            (conj ac {key (f val)}))
          {}
          mp))

function to generate random string with given length
(defn generate-string
  ([] (generate-string 10))
  ([length] (apply str (take length (repeatedly #(char (+ (rand-int 26) 65)))))))