(ns com.pillartechnology.practice
  (:use clojure.test midje.sweet))

(deftest testOne
  (fact (prime-factors-of 1) => []))

(run-tests 'com.pillartechnology.practice)
