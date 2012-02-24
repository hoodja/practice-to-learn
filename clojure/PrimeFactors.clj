(ns com.pillartechnology.practice
  (:use clojure.test midje.sweet))

(defn factors-starting-at [f n]
  (cond
    (> f (Math/sqrt n)) (if (= n 1) [] [n])
    (= 0 (mod n f)) (cons f (factors-starting-at f (/ n f)))
    :else (recur (inc f) n)))

(defn prime-factors-of [n]
  (factors-starting-at 2 n))

(deftest prime-factors
  (fact (prime-factors-of 1) => [])
  (fact (prime-factors-of 2) => [2])
  (fact (prime-factors-of 3) => [3])
  (fact (prime-factors-of 4) => [2 2])
  (fact (prime-factors-of 5) => [5])
  (fact (prime-factors-of 6) => [2 3])
  (fact (prime-factors-of 7) => [7])
  (fact (prime-factors-of 8) => [2 2 2])
  (fact (prime-factors-of 9) => [3 3])
  )

(run-tests 'com.pillartechnology.practice)
