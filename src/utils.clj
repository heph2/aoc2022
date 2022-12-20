(ns utils
  (:require [org.httpkit.client :as http]))

(eval (read-string (slurp "src/secrets.clj")))

(defn aoc_input
  "Download the YEAR DAY input as a string"
  [ year day ]
  (let [ resp 
        (http/get
         (str "https://adventofcode.com/" year "/day/" day "/input")
         {:headers {"cookie" mycookie}})]
    (:body @resp)))

;; create a function that post the Answer of the current day/year
