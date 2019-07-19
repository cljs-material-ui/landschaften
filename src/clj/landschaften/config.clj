(ns landschaften.config
  (:require [cprop.core :refer [load-config]]
            [cprop.source :as source]
            [mount.core :refer [args defstate]]))


(defstate env
  :start 
{:database-url "mysql://root:mysql123@127.0.0.1:3306/landschaften"}
  #_(load-config
    :merge
    [(args)
     (source/from-system-props)
     (source/from-env)]))
