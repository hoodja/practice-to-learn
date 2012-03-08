(ns com.pillartechnology.practice
  (:use clojure.test midje.sweet))

(defn prime-factors-of [n] 
  [])

(deftest testOne
  (fact (prime-factors-of 1) => []))

(run-tests 'com.pillartechnology.practice)
