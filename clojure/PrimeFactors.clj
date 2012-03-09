(ns com.pillartechnology.practice
  (:use clojure.test midje.sweet))

(defn prime-factors-of 
  ( [n] (prime-factors-of 2 n)) 
  ( [c n] 
  (if (> n 1) 
    (if (zero? (mod n c)) 
      (cons c (prime-factors-of c (/ n c)))
      (recur (inc c) n))
    [])))

(deftest testOne
  (fact (prime-factors-of 1) => []))

(deftest testTwo
  (fact (prime-factors-of 2) => [2]))

(deftest testThree
  (fact (prime-factors-of 3) => [3]))

(deftest testFour
  (fact (prime-factors-of 4) => [2, 2]))

(deftest testSix
  (fact (prime-factors-of 6) => [2, 3]))

(deftest testEight
  (fact (prime-factors-of 8) => [2, 2, 2]))

(deftest testNine
  (fact (prime-factors-of 9) => [3, 3]))

(run-tests 'com.pillartechnology.practice)
