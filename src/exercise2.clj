(ns exercise2)

(defn only-greater-than-five
  [list]
  (filter (fn [x] (> x 5)) list)
)
