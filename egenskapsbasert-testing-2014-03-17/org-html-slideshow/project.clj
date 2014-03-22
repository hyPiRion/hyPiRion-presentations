(defproject org-html-slides "0.0.1-SNAPSHOT"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0-RC1"]
                 [org.clojure/clojurescript "0.0-2173"]
                 [com.cemerick/clojurescript.test "0.2.2"]
                 [com.cemerick/double-check "0.5.6-SNAPSHOT"]
                 [hiccups "0.3.0"]
                 [domina "1.0.2"]]
  :plugins  [[lein-cljsbuild "1.0.2"]]
  :library-path "lib/jars"
  :source-paths ["lib/one/src/lib/cljs" "lib/gen-java-src/src/cljs/"]
  :cljsbuild {:builds
              {:development
               {:source-paths ["src/cljs"]
                :compiler {:output-to "out/development/org-html-slideshow.js"
                           :output-dir "out/development"
                           :optimizations :whitespace
                           :pretty-print true
                           :libs [""]}}
               :production
               {:source-paths ["src/cljs"]
                :compiler {:output-to "production/org-html-slideshow.js"
                           :output-dir "production"
                           :optimizations :advanced
                           :pretty-print false
                           :libs [""]}}}})
