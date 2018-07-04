(ns keechma-devtools.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [keechma-devtools.domain.accumulator-test]))

(doo-tests 'keechma-devtools.domain.accumulator-test)
