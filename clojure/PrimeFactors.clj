(ns com.pillartechnology.practice
  (:use clojure.test midje.sweet))

(deftest testOne
  (fact true => false))

(run-tests 'com.pillartechnology.practice)
