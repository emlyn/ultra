(ns ^:demo ultra.demo.class-test
  "Tests for comparing classes and instances"
  (:require [clojure.test :refer :all]))

(deftest class-test-1
  (is (= "1" 2)))

(deftest class-test-multiline
  (is (= nil
         {:alphabet-soup "A delicious treat for all ages"
          :gummy-dinosaurs "Probably only for children"})))
