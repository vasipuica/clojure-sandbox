(ns fwpd.core
  (:gen-class))

(def vampire-keys [:name :glitter-index])

(defn str->int
      [str]
      (Integer. str))

(def conversions {:name identity
                  :glitter-index str->int})

(defn convert
      [vamp-key value]
      ((get conversions vamp-key) value))

(defn parse
      "Convert a CSV into rows of columns"
      [string]
      (map #(clojure.string/split % #",")
           (clojure.string/split string #"\n")))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
