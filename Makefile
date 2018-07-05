publish:
	lein clean && lein cljsbuild once min
	lein deploy clojars
	npm publish