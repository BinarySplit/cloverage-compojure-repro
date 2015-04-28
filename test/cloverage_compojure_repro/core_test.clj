(ns cloverage-compojure-repro.core-test
  (:require [clojure.test :refer :all]
            [cloverage-compojure-repro.core :refer :all]))

(deftest a-test
  (app {:scheme :http
        :uri "/api/plus"
        :request-method :get
        :body ""
        :headers ""
        :query-params {:x 1 :y 1}}))
