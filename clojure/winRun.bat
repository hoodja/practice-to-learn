@echo off

java -classpath "lib\algo.monads-0.1.0.jar;lib\clj-stacktrace-alex-0.2.5.jar;lib\clojure-1.3.0.jar;lib\colorize-0.1.1.jar;lib\core.incubator-0.1.0.jar;lib\core.unify-0.5.1.jar;lib\joda-time-2.0.jar;lib\math.combinatorics-0.0.1.jar;lib\midje-1.3.2-20120130.001801-3.jar;lib\ordered-1.0.0.jar;lib\tools.macro-0.1.1.jar;lib\utilize-0.2.2.jar;" clojure.main -i ".\PrimeFactors.clj"

