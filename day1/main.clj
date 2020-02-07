(ns clojure.examples.hello (:gen-class))

(defn calculate_fuel_requirement [mass] (int (- (Math/floor (/ mass 3)) 2)))

(def result (atom 0))
(with-open [rdr (clojure.java.io/reader "day1/input.txt")] 
    (doseq [line (line-seq rdr)] 
        (def result (atom (+ @result (calculate_fuel_requirement (Integer. line)))))))
(print (format "%d\n" @result))
