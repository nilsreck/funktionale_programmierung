(ns praesenz.02)
(comment "8.11")

(def people [{:name "John Doe", :age 42}
           {:name "Average Joe", :age 36}
           {:name "Fred Bloggs", :age 30}])

(defn durchschnitt [data] (/(reduce + (map :age data))
   (count data)))

(durchschnitt people)

;; fragen!
(defn any? [function collection]
  (contains? (apply vector (map function collection)) true)) ;;[true false true false] => sobald true kommt return true

(any? odd? [1 2 3 4])

;;mapv?
(defn mapv [function collection] 
  (reduce (fn [a e] (conj a (function e)))
          []  ;; startwert
          collection)) ;; unsere collection

(mapv (fn [x] (str x '!')) '(:name1 :hannes :name2 :Nils :name3 :modar)) ;; klappt
;;(mapv (fn [x] (str x '!')) {:name1 :hannes :name2 :Nils :name3 :modar})



;;Flipping Out

(defn flip [f]
  (fn [& args] (apply f (reverse args))))

 ((flip >) 7)




