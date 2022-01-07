(ns adventofcode.2021.day2
  (:require [clojure.string :as string]))

(def input "forward 5
down 5
forward 8
up 3
down 8
forward 2")

(defn multiply [in]
  (* (:h in) (:d in)))

(defn parseInt [x]
  (Integer/parseInt x))

; Part 1
(->> (slurp "resources/2021/day2/input.txt")
     (string/split-lines)
     (reduce (fn [acc x]
               (let [[move raw-value] (string/split x #" ")
                     value (parseInt raw-value)]
                 (cond
                   (= move "forward") (update acc :h + value)
                   (= move "backward") (update acc :h - value)
                   (= move "up") (update acc :d + value)
                   (= move "down") (update acc :d - value)))) {:h 0 :d 0})
     (multiply)
     (Math/abs))





; Part 2
