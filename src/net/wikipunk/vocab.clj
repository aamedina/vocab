(ns net.wikipunk.vocab
  (:require
   [clojure.string :as str]))

(defn data-fn
  "Example data-fn handler.

  Result is merged onto existing options data."
  [data]
  ;; returning nil means no changes to options data
  (println "data-fn returning nil")
  nil)

(defn template-fn
  "Example template-fn handler.

  Result is used as the EDN for the template."
  [edn data]
  ;; must return the whole EDN hash map
  (println "template-fn returning edn")
  (assoc-in edn [:transform 2 2 "rdf.tmpl"] (str (str/replace (:rdfa/prefix data) #"\." "/") ".clj")))
