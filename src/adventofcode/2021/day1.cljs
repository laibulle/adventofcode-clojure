(ns adventofcode.2021.day1
  (:require [clojure.string :as str]))

(->> (slurp "resources/input.txt")
     (str/split-lines)
     (map (fn [x] (Integer/parseInt x)))
     (partition 3 1)
     (map #(+ (first %) (nth % 1) (nth % 2)))
     (partition 2 1)
     (reduce (fn [acc [a b]] (if (< a b) (+ acc 1) acc)) 0))

(->> (slurp "resources/input.txt")
     (str/split-lines)
     (map (fn [x] (Integer/parseInt x)))
     (partition 2 1)
     (reduce (fn [acc [a b]] (if (< a b) (+ acc 1) acc)) 0))
