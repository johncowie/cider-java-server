(defproject cider-java-server "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [cider/cider-nrepl "0.8.2"]
                 [org.clojure/tools.nrepl "0.2.10"]]
  :main cider.java.server.Example
  :prep-tasks [["compile" "cider.java.server.core"]
               ["compile" "cider.java.server.main"]
               ["javac"]]
  :java-source-paths ["src-java"]
  )
