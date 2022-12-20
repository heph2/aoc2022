(ns day01
    (:require
     [utils :as u]
     [clojure.string :as str]))

(def sample "1000
2000
3000

4000

5000
6000

7000
8000
9000

10000")

(def input (u/aoc_input 2022 1))

(defn process [value]
  (->>
   (str/split value #"\n\n")
   (map #(str/split % #"\n"))
   (map (fn [array]
          (reduce +
                  (map #(Integer/parseInt %) array))))
   (sort)
   (reverse)))

(defn part1 [input]
  (->> input
       process
       first))

(defn part2 [input]
  (->> input
       process
       (take 3)
       (reduce +)))

