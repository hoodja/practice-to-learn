(ns com.pillartechnology.practice
  (:use clojure.test midje.sweet))

(defn prime-factors-of [n] 
  (if (> n 1) [n] []))

(deftest testOne
  (fact (prime-factors-of 1) => []))

(deftest testTwo
  (fact (prime-factors-of 2) => [2]))

(deftest testThree
  (fact (prime-factors-of 3) => [3]))

(run-tests 'com.pillartechnology.practice)
