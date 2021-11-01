(ns praesenz.01
  (:gen-class))

(defn flip [x y z]
  [z y x])

(let [random (rand)
      random2 (* 2 random)]
  [random random2])

(defn fizzbuzz [x]
  (if (and (= 0 (mod x 5)) (= 0 (mod x 3)))
    :fizzbuzz
    (if (= 0 (mod x 5))
      :buzz
      (if (= 0 (mod x 3))
        :fizz x)))
  )

(defn counter [x]
  (if (empty? x)
    0
    (+ (counter (rest x)) 1)))

(defn count-x [seq x]
  )


