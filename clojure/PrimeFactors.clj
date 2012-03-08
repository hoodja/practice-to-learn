(ns com.pillartechnology.practice
  (:use clojure.test midje.sweet))

(defn prime-factors-of [n] 
  (if (> n 1) [2] []))

(deftest testOne
  (fact (prime-factors-of 1) => []))

(deftest testTwo
  (fact (prime-factors-of 2) => [2]))

(run-tests 'com.pillartechnology.practice)
