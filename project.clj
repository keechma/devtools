(defproject keechma-devtools "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.238"]
                 [reagent "0.8.1"]
                 [keechma "0.3.10" :exclusions [cljsjs/react-with-addons cljsjs/react-dom cljsjs/react-dom-server]]
                 [keechma/toolbox "0.1.17" :exclusions [cljsjs/react-with-addons cljsjs/react-dom cljsjs/react-dom-server]]
                 [garden "1.3.2"]
                 [org.clojars.mihaelkonjevic/garden-basscss "0.1.0"]
                 [cljsjs/socket-io "2.0.1-0"]
                 [binaryage/oops "0.6.2"]
                 [com.cognitect/transit-cljs "0.8.256"]
                 [fipp "0.6.8"]]

  :min-lein-version "2.5.3"

  :source-paths ["src/clj"]

  :plugins [[lein-cljsbuild "1.1.7"]]

  :clean-targets ^{:protect false} ["resources/public/js"
                                    "target"
                                    "test/js"]

  :figwheel {:css-dirs ["resources/public/css"]
             :server-port 3450}


  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :profiles
  {:dev
   {:dependencies [
                   [figwheel-sidecar "0.5.10"]
                   [com.cemerick/piggieback "0.2.1"]
                   [binaryage/devtools "0.8.2"]]

    :plugins      [[lein-figwheel "0.5.14"]
                   [lein-doo "0.1.7"]]}}

  :cljsbuild
  {:builds
   [{:id           "dev"
     :source-paths ["src/cljs"]
     :figwheel     {:on-jsload "keechma-devtools.core/reload"}
     :compiler     {:main                 keechma-devtools.core
                    :optimizations        :none
                    :output-to            "resources/public/js/app.js"
                    :output-dir           "resources/public/js/dev"
                    :asset-path           "js/dev"
                    :source-map-timestamp true
                    :preloads             [devtools.preload]
                    :external-config
                    {:devtools/config
                     {:features-to-install    [:formatters :hints]
                      :fn-symbol              "F"
                      :print-config-overrides true}}}}

    {:id           "min"
     :source-paths ["src/cljs"]
     :compiler     {:main            keechma-devtools.core
                    :optimizations   :advanced
                    :output-to       "resources/public/js/app.js"
                    :output-dir      "resources/public/js/min"
                    :elide-asserts   true
                    :closure-defines {goog.DEBUG false}
                    :pretty-print    false}}

    {:id           "test"
     :source-paths ["src/cljs" "test/cljs"]
     :compiler     {:output-to     "resources/public/js/test.js"
                    :output-dir    "resources/public/js/test"
                    :main          keechma-devtools.runner
                    :optimizations :none}}
    ]})
