publish:
	lein deploy clojars
	lein clean && lein cljsbuild once min
	npm publish
