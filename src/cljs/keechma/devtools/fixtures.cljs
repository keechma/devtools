(ns keechma.devtools.fixtures)

(def fixtures [{:app {:name :application, :version :v1},
  :event
  {:type :reporter,
   :direction nil,
   :topic nil,
   :name :clear,
   :payload nil,
   :cmd-info nil,
   :severity nil,
   :id "evid45"}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :in,
   :topic nil,
   :name :start,
   :payload
   [:redirect
    :initializer
    :logout
    :user-actions
    :keechma.toolbox.dataloader.core/dataloader
    :keechma.toolbox.forms.core/forms
    :keechma.toolbox.forms.mount-controller/id],
   :cmd-info
   {:id :cmd2, :created-at 1531741737098, :duration 0, :status :done},
   :severity :info,
   :id :cmd2}}
 {:app {:name :application, :version :v1},
  :event
  {:type :router,
   :direction :out,
   :topic nil,
   :name :route-changed,
   :payload
   {:route ":page/:subpage",
    :data
    {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"}},
   :cmd-info
   {:id :cmd3, :created-at 1531741737099, :duration 0, :status :done},
   :severity :info,
   :id :cmd3}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :start]],
   :payload
   {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"},
   :cmd-info
   {:id :cmd4, :created-at 1531741737100, :duration 0, :status :done},
   :severity :info,
   :id :cmd4}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :start],
   :payload
   {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"},
   :cmd-info
   {:id :cmd5,
    :created-at 1531741737100,
    :duration 0,
    :status :done,
    :origin-id :cmd4},
   :severity :info,
   :id :cmd5}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :start,
   :payload
   {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"},
   :cmd-info
   {:id :cmd6, :created-at 1531741737101, :duration 0, :status :done},
   :severity :info,
   :id :cmd6}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:initializer [:keechma/lifecycle :start]],
   :payload true,
   :cmd-info
   {:id :cmd7, :created-at 1531741737101, :duration 0, :status :done},
   :severity :info,
   :id :cmd7}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name [:keechma/lifecycle :start],
   :payload true,
   :cmd-info
   {:id :cmd8,
    :created-at 1531741737102,
    :duration 0,
    :status :done,
    :origin-id :cmd7},
   :severity :info,
   :id :cmd8}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :start,
   :payload true,
   :cmd-info
   {:id :cmd9, :created-at 1531741737102, :duration 0, :status :done},
   :severity :info,
   :id :cmd9}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:user-actions [:keechma/lifecycle :start]],
   :payload true,
   :cmd-info
   {:id :cmd10, :created-at 1531741737102, :duration 0, :status :done},
   :severity :info,
   :id :cmd10}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name [:keechma/lifecycle :start],
   :payload true,
   :cmd-info
   {:id :cmd11,
    :created-at 1531741737102,
    :duration 0,
    :status :done,
    :origin-id :cmd10},
   :severity :info,
   :id :cmd11}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :start,
   :payload true,
   :cmd-info
   {:id :cmd12, :created-at 1531741737102, :duration 0, :status :done},
   :severity :info,
   :id :cmd12}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :start]],
   :payload
   {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"},
   :cmd-info
   {:id :cmd13, :created-at 1531741737102, :duration 0, :status :done},
   :severity :info,
   :id :cmd13}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :start],
   :payload
   {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"},
   :cmd-info
   {:id :cmd14,
    :created-at 1531741737102,
    :duration 0,
    :status :done,
    :origin-id :cmd13},
   :severity :info,
   :id :cmd14}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.core/forms [:keechma/lifecycle :start]],
   :payload true,
   :cmd-info
   {:id :cmd15, :created-at 1531741737103, :duration 0, :status :done},
   :severity :info,
   :id :cmd15}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name [:keechma/lifecycle :start],
   :payload true,
   :cmd-info
   {:id :cmd16,
    :created-at 1531741737103,
    :duration 0,
    :status :done,
    :origin-id :cmd15},
   :severity :info,
   :id :cmd16}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :start,
   :payload true,
   :cmd-info
   {:id :cmd17, :created-at 1531741737104, :duration 0, :status :done},
   :severity :info,
   :id :cmd17}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :start]],
   :payload
   {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"},
   :cmd-info
   {:id :cmd18, :created-at 1531741737104, :duration 0, :status :done},
   :severity :info,
   :id :cmd18}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :start],
   :payload
   {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"},
   :cmd-info
   {:id :cmd19,
    :created-at 1531741737104,
    :duration 0,
    :status :done,
    :origin-id :cmd18},
   :severity :info,
   :id :cmd19}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd20, :created-at 1531741737105, :duration 0, :status :done},
   :severity :info,
   :id :cmd20}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd21,
    :created-at 1531741737105,
    :duration 0,
    :status :done,
    :origin-id :cmd20},
   :severity :info,
   :id :cmd21}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:initializer [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd22, :created-at 1531741737105, :duration 0, :status :done},
   :severity :info,
   :id :cmd22}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd23,
    :created-at 1531741737105,
    :duration 0,
    :status :done,
    :origin-id :cmd22},
   :severity :info,
   :id :cmd23}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:user-actions [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd24, :created-at 1531741737106, :duration 0, :status :done},
   :severity :info,
   :id :cmd24}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd25,
    :created-at 1531741737106,
    :duration 0,
    :status :done,
    :origin-id :cmd24},
   :severity :info,
   :id :cmd25}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd26, :created-at 1531741737106, :duration 0, :status :done},
   :severity :info,
   :id :cmd26}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd27,
    :created-at 1531741737106,
    :duration 0,
    :status :done,
    :origin-id :cmd26},
   :severity :info,
   :id :cmd27}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd28, :created-at 1531741737107, :duration 0, :status :done},
   :severity :info,
   :id :cmd28}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd29, :created-at 1531741737107, :duration 0, :status :done},
   :severity :info,
   :id :cmd29}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd30, :created-at 1531741737107, :duration 0, :status :done},
   :severity :info,
   :id :cmd30}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd31, :created-at 1531741737107, :duration 0, :status :done},
   :severity :info,
   :id :cmd31}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd32, :created-at 1531741737107, :duration 0, :status :done},
   :severity :info,
   :id :cmd32}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.core/forms [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd34, :created-at 1531741737117, :duration 0, :status :done},
   :severity :info,
   :id :cmd34}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd35,
    :created-at 1531741737117,
    :duration 0,
    :status :done,
    :origin-id :cmd34},
   :severity :info,
   :id :cmd35}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd36, :created-at 1531741737118, :duration 0, :status :done},
   :severity :info,
   :id :cmd36}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd37,
    :created-at 1531741737118,
    :duration 0,
    :status :done,
    :origin-id :cmd36},
   :severity :info,
   :id :cmd37}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma.toolbox.forms.core/forms :mount-form],
   :payload [:comment :form],
   :cmd-info
   {:id :cmd38, :created-at 1531741737119, :duration 0, :status :done},
   :severity :info,
   :id :cmd38}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :in,
   :topic nil,
   :name :running-controllers,
   :payload
   {:redirect
    {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"},
    :initializer true,
    :user-actions true,
    :keechma.toolbox.dataloader.core/dataloader
    {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"},
    :keechma.toolbox.forms.core/forms true,
    :keechma.toolbox.forms.mount-controller/id
    {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"}},
   :cmd-info
   {:id :cmd39, :created-at 1531741737119, :duration 0, :status :done},
   :severity :info,
   :id :cmd39}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd40,
    :created-at 1531741737169,
    :duration 0,
    :status :done,
    :origin-id :cmd28},
   :severity :info,
   :id :cmd40}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd41,
    :created-at 1531741737169,
    :duration 0,
    :status :done,
    :origin-id :cmd29},
   :severity :info,
   :id :cmd41}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd42,
    :created-at 1531741737169,
    :duration 0,
    :status :done,
    :origin-id :cmd30},
   :severity :info,
   :id :cmd42}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd43,
    :created-at 1531741737170,
    :duration 0,
    :status :done,
    :origin-id :cmd31},
   :severity :info,
   :id :cmd43}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd44,
    :created-at 1531741737170,
    :duration 0,
    :status :done,
    :origin-id :cmd32},
   :severity :info,
   :id :cmd44}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :mount-form,
   :payload [:comment :form],
   :cmd-info
   {:id :cmd45,
    :created-at 1531741737170,
    :duration 0,
    :status :done,
    :origin-id :cmd38},
   :severity :info,
   :id :cmd45}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd50, :created-at 1531741737597, :duration 0, :status :done},
   :severity :info,
   :id :cmd50}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd51, :created-at 1531741737598, :duration 0, :status :done},
   :severity :info,
   :id :cmd51}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd52, :created-at 1531741737598, :duration 0, :status :done},
   :severity :info,
   :id :cmd52}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd53, :created-at 1531741737598, :duration 0, :status :done},
   :severity :info,
   :id :cmd53}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd54, :created-at 1531741737598, :duration 0, :status :done},
   :severity :info,
   :id :cmd54}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd55,
    :created-at 1531741737598,
    :duration 0,
    :status :done,
    :origin-id :cmd50},
   :severity :info,
   :id :cmd55}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd56,
    :created-at 1531741737599,
    :duration 0,
    :status :done,
    :origin-id :cmd51},
   :severity :info,
   :id :cmd56}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd57,
    :created-at 1531741737599,
    :duration 0,
    :status :done,
    :origin-id :cmd52},
   :severity :info,
   :id :cmd57}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd58,
    :created-at 1531741737599,
    :duration 0,
    :status :done,
    :origin-id :cmd53},
   :severity :info,
   :id :cmd58}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd59,
    :created-at 1531741737600,
    :duration 0,
    :status :done,
    :origin-id :cmd54},
   :severity :info,
   :id :cmd59}}
 {:app {:name :application, :version :v1},
  :event
  {:type :router,
   :direction :out,
   :topic nil,
   :name :route-changed,
   :payload {:route ":page", :data {:page "home"}},
   :cmd-info
   {:id :cmd60, :created-at 1531741745742, :duration 0, :status :done},
   :severity :info,
   :id :cmd60}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :stop]],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd61, :created-at 1531741745743, :duration 0, :status :done},
   :severity :info,
   :id :cmd61}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :stop],
   :payload
   {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"},
   :cmd-info
   {:id :cmd62,
    :created-at 1531741745743,
    :duration 0,
    :status :done,
    :origin-id :cmd61},
   :severity :info,
   :id :cmd62}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :stop,
   :payload
   {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"},
   :cmd-info
   {:id :cmd63, :created-at 1531741745744, :duration 0, :status :done},
   :severity :info,
   :id :cmd63}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :stop]],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd64, :created-at 1531741745745, :duration 0, :status :done},
   :severity :info,
   :id :cmd64}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :stop],
   :payload
   {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"},
   :cmd-info
   {:id :cmd65,
    :created-at 1531741745745,
    :duration 0,
    :status :done,
    :origin-id :cmd64},
   :severity :info,
   :id :cmd65}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :stop]],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd66, :created-at 1531741745745, :duration 0, :status :done},
   :severity :info,
   :id :cmd66}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :stop],
   :payload
   {:page "article", :subpage "how-to-train-your-dragon-fzj8vc"},
   :cmd-info
   {:id :cmd67,
    :created-at 1531741745745,
    :duration 0,
    :status :done,
    :origin-id :cmd66},
   :severity :info,
   :id :cmd67}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :start]],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd68, :created-at 1531741745745, :duration 0, :status :done},
   :severity :info,
   :id :cmd68}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :start],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd69,
    :created-at 1531741745745,
    :duration 0,
    :status :done,
    :origin-id :cmd68},
   :severity :info,
   :id :cmd69}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :start,
   :payload {:page "home"},
   :cmd-info
   {:id :cmd70, :created-at 1531741745745, :duration 0, :status :done},
   :severity :info,
   :id :cmd70}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :start]],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd71, :created-at 1531741745746, :duration 0, :status :done},
   :severity :info,
   :id :cmd71}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :start],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd72,
    :created-at 1531741745746,
    :duration 0,
    :status :done,
    :origin-id :cmd71},
   :severity :info,
   :id :cmd72}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :start]],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd73, :created-at 1531741745746, :duration 0, :status :done},
   :severity :info,
   :id :cmd73}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :start],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd74,
    :created-at 1531741745746,
    :duration 0,
    :status :done,
    :origin-id :cmd73},
   :severity :info,
   :id :cmd74}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd75, :created-at 1531741745747, :duration 0, :status :done},
   :severity :info,
   :id :cmd75}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd76,
    :created-at 1531741745747,
    :duration 0,
    :status :done,
    :origin-id :cmd75},
   :severity :info,
   :id :cmd76}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd77, :created-at 1531741745747, :duration 0, :status :done},
   :severity :info,
   :id :cmd77}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd78,
    :created-at 1531741745747,
    :duration 0,
    :status :done,
    :origin-id :cmd77},
   :severity :info,
   :id :cmd78}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd79, :created-at 1531741745747, :duration 0, :status :done},
   :severity :info,
   :id :cmd79}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd80, :created-at 1531741745747, :duration 0, :status :done},
   :severity :info,
   :id :cmd80}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd81, :created-at 1531741745748, :duration 0, :status :done},
   :severity :info,
   :id :cmd81}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd82, :created-at 1531741745748, :duration 0, :status :done},
   :severity :info,
   :id :cmd82}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd83, :created-at 1531741745748, :duration 0, :status :done},
   :severity :info,
   :id :cmd83}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd85, :created-at 1531741745752, :duration 0, :status :done},
   :severity :info,
   :id :cmd85}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd86,
    :created-at 1531741745753,
    :duration 0,
    :status :done,
    :origin-id :cmd85},
   :severity :info,
   :id :cmd86}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma.toolbox.forms.core/forms :unmount-form],
   :payload [:comment :form],
   :cmd-info
   {:id :cmd87, :created-at 1531741745753, :duration 0, :status :done},
   :severity :info,
   :id :cmd87}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:initializer :route-changed],
   :payload {:route ":page", :data {:page "home"}},
   :cmd-info
   {:id :cmd88, :created-at 1531741745753, :duration 0, :status :done},
   :severity :info,
   :id :cmd88}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :route-changed,
   :payload {:route ":page", :data {:page "home"}},
   :cmd-info
   {:id :cmd89,
    :created-at 1531741745753,
    :duration 0,
    :status :done,
    :origin-id :cmd88},
   :severity :info,
   :id :cmd89}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:user-actions :route-changed],
   :payload {:route ":page", :data {:page "home"}},
   :cmd-info
   {:id :cmd90, :created-at 1531741745753, :duration 0, :status :done},
   :severity :info,
   :id :cmd90}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :route-changed,
   :payload {:route ":page", :data {:page "home"}},
   :cmd-info
   {:id :cmd91,
    :created-at 1531741745753,
    :duration 0,
    :status :done,
    :origin-id :cmd90},
   :severity :info,
   :id :cmd91}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:keechma.toolbox.forms.core/forms :route-changed],
   :payload {:route ":page", :data {:page "home"}},
   :cmd-info
   {:id :cmd92, :created-at 1531741745754, :duration 0, :status :done},
   :severity :info,
   :id :cmd92}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :route-changed,
   :payload {:route ":page", :data {:page "home"}},
   :cmd-info
   {:id :cmd93,
    :created-at 1531741745754,
    :duration 0,
    :status :done,
    :origin-id :cmd92},
   :severity :info,
   :id :cmd93}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :in,
   :topic nil,
   :name :running-controllers,
   :payload
   {:initializer true,
    :user-actions true,
    :keechma.toolbox.forms.core/forms true,
    :redirect {:page "home"},
    :keechma.toolbox.dataloader.core/dataloader {:page "home"},
    :keechma.toolbox.forms.mount-controller/id {:page "home"}},
   :cmd-info
   {:id :cmd94, :created-at 1531741745755, :duration 0, :status :done},
   :severity :info,
   :id :cmd94}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd95,
    :created-at 1531741745757,
    :duration 0,
    :status :done,
    :origin-id :cmd79},
   :severity :info,
   :id :cmd95}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd96,
    :created-at 1531741745757,
    :duration 0,
    :status :done,
    :origin-id :cmd80},
   :severity :info,
   :id :cmd96}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd97,
    :created-at 1531741745757,
    :duration 0,
    :status :done,
    :origin-id :cmd81},
   :severity :info,
   :id :cmd97}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd98,
    :created-at 1531741745758,
    :duration 0,
    :status :done,
    :origin-id :cmd82},
   :severity :info,
   :id :cmd98}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd99,
    :created-at 1531741745758,
    :duration 0,
    :status :done,
    :origin-id :cmd83},
   :severity :info,
   :id :cmd99}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :unmount-form,
   :payload [:comment :form],
   :cmd-info
   {:id :cmd100,
    :created-at 1531741745758,
    :duration 0,
    :status :done,
    :origin-id :cmd87},
   :severity :info,
   :id :cmd100}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd103,
    :created-at 1531741746268,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd103}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd104,
    :created-at 1531741746268,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd104}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd105,
    :created-at 1531741746269,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd105}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd106,
    :created-at 1531741746269,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd106}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd107,
    :created-at 1531741746269,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd107}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd108,
    :created-at 1531741746269,
    :duration 0,
    :status :done,
    :origin-id :cmd103},
   :severity :info,
   :id :cmd108}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd109,
    :created-at 1531741746269,
    :duration 0,
    :status :done,
    :origin-id :cmd104},
   :severity :info,
   :id :cmd109}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd110,
    :created-at 1531741746269,
    :duration 0,
    :status :done,
    :origin-id :cmd105},
   :severity :info,
   :id :cmd110}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd111,
    :created-at 1531741746269,
    :duration 0,
    :status :done,
    :origin-id :cmd106},
   :severity :info,
   :id :cmd111}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd112,
    :created-at 1531741746270,
    :duration 0,
    :status :done,
    :origin-id :cmd107},
   :severity :info,
   :id :cmd112}}
 {:app {:name :application, :version :v1},
  :event
  {:type :router,
   :direction :out,
   :topic nil,
   :name :route-changed,
   :payload {:route ":page", :data {:page "login"}},
   :cmd-info
   {:id :cmd113,
    :created-at 1531741749900,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd113}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :stop]],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd114,
    :created-at 1531741749902,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd114}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :stop],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd115,
    :created-at 1531741749902,
    :duration 0,
    :status :done,
    :origin-id :cmd114},
   :severity :info,
   :id :cmd115}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :stop,
   :payload {:page "home"},
   :cmd-info
   {:id :cmd116,
    :created-at 1531741749902,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd116}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :stop]],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd117,
    :created-at 1531741749902,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd117}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :stop],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd118,
    :created-at 1531741749902,
    :duration 0,
    :status :done,
    :origin-id :cmd117},
   :severity :info,
   :id :cmd118}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :stop]],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd119,
    :created-at 1531741749903,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd119}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :stop],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd120,
    :created-at 1531741749903,
    :duration 0,
    :status :done,
    :origin-id :cmd119},
   :severity :info,
   :id :cmd120}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :start]],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd121,
    :created-at 1531741749903,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd121}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :start],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd122,
    :created-at 1531741749903,
    :duration 0,
    :status :done,
    :origin-id :cmd121},
   :severity :info,
   :id :cmd122}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :start,
   :payload {:page "login"},
   :cmd-info
   {:id :cmd123,
    :created-at 1531741749904,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd123}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :start]],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd124,
    :created-at 1531741749904,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd124}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :start],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd125,
    :created-at 1531741749904,
    :duration 0,
    :status :done,
    :origin-id :cmd124},
   :severity :info,
   :id :cmd125}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :start]],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd126,
    :created-at 1531741749904,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd126}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :start],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd127,
    :created-at 1531741749904,
    :duration 0,
    :status :done,
    :origin-id :cmd126},
   :severity :info,
   :id :cmd127}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd128,
    :created-at 1531741749905,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd128}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd129,
    :created-at 1531741749905,
    :duration 0,
    :status :done,
    :origin-id :cmd128},
   :severity :info,
   :id :cmd129}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd130,
    :created-at 1531741749905,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd130}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd131,
    :created-at 1531741749905,
    :duration 0,
    :status :done,
    :origin-id :cmd130},
   :severity :info,
   :id :cmd131}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd132,
    :created-at 1531741749905,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd132}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd133,
    :created-at 1531741749905,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd133}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd134,
    :created-at 1531741749905,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd134}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd135,
    :created-at 1531741749905,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd135}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd136,
    :created-at 1531741749906,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd136}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd138,
    :created-at 1531741749918,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd138}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd139,
    :created-at 1531741749918,
    :duration 0,
    :status :done,
    :origin-id :cmd138},
   :severity :info,
   :id :cmd139}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma.toolbox.forms.core/forms :mount-form],
   :payload [:login :form],
   :cmd-info
   {:id :cmd140,
    :created-at 1531741749919,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd140}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:initializer :route-changed],
   :payload {:route ":page", :data {:page "login"}},
   :cmd-info
   {:id :cmd141,
    :created-at 1531741749919,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd141}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :route-changed,
   :payload {:route ":page", :data {:page "login"}},
   :cmd-info
   {:id :cmd142,
    :created-at 1531741749919,
    :duration 0,
    :status :done,
    :origin-id :cmd141},
   :severity :info,
   :id :cmd142}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:user-actions :route-changed],
   :payload {:route ":page", :data {:page "login"}},
   :cmd-info
   {:id :cmd143,
    :created-at 1531741749920,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd143}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :route-changed,
   :payload {:route ":page", :data {:page "login"}},
   :cmd-info
   {:id :cmd144,
    :created-at 1531741749920,
    :duration 0,
    :status :done,
    :origin-id :cmd143},
   :severity :info,
   :id :cmd144}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:keechma.toolbox.forms.core/forms :route-changed],
   :payload {:route ":page", :data {:page "login"}},
   :cmd-info
   {:id :cmd145,
    :created-at 1531741749920,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd145}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :route-changed,
   :payload {:route ":page", :data {:page "login"}},
   :cmd-info
   {:id :cmd146,
    :created-at 1531741749920,
    :duration 0,
    :status :done,
    :origin-id :cmd145},
   :severity :info,
   :id :cmd146}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :in,
   :topic nil,
   :name :running-controllers,
   :payload
   {:initializer true,
    :user-actions true,
    :keechma.toolbox.forms.core/forms true,
    :redirect {:page "login"},
    :keechma.toolbox.dataloader.core/dataloader {:page "login"},
    :keechma.toolbox.forms.mount-controller/id {:page "login"}},
   :cmd-info
   {:id :cmd147,
    :created-at 1531741749920,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd147}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd148,
    :created-at 1531741749922,
    :duration 0,
    :status :done,
    :origin-id :cmd132},
   :severity :info,
   :id :cmd148}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd149,
    :created-at 1531741749922,
    :duration 0,
    :status :done,
    :origin-id :cmd133},
   :severity :info,
   :id :cmd149}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd150,
    :created-at 1531741749922,
    :duration 0,
    :status :done,
    :origin-id :cmd134},
   :severity :info,
   :id :cmd150}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd151,
    :created-at 1531741749922,
    :duration 0,
    :status :done,
    :origin-id :cmd135},
   :severity :info,
   :id :cmd151}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd152,
    :created-at 1531741749922,
    :duration 0,
    :status :done,
    :origin-id :cmd136},
   :severity :info,
   :id :cmd152}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :mount-form,
   :payload [:login :form],
   :cmd-info
   {:id :cmd153,
    :created-at 1531741749923,
    :duration 0,
    :status :done,
    :origin-id :cmd140},
   :severity :info,
   :id :cmd153}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd156,
    :created-at 1531741749927,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd156}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd157,
    :created-at 1531741749927,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd157}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd158,
    :created-at 1531741749927,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd158}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd159,
    :created-at 1531741749927,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd159}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd160,
    :created-at 1531741749927,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd160}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd161,
    :created-at 1531741749929,
    :duration 0,
    :status :done,
    :origin-id :cmd156},
   :severity :info,
   :id :cmd161}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd162,
    :created-at 1531741749929,
    :duration 0,
    :status :done,
    :origin-id :cmd157},
   :severity :info,
   :id :cmd162}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd163,
    :created-at 1531741749929,
    :duration 0,
    :status :done,
    :origin-id :cmd158},
   :severity :info,
   :id :cmd163}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd164,
    :created-at 1531741749929,
    :duration 0,
    :status :done,
    :origin-id :cmd159},
   :severity :info,
   :id :cmd164}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd165,
    :created-at 1531741749929,
    :duration 0,
    :status :done,
    :origin-id :cmd160},
   :severity :info,
   :id :cmd165}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "k"
    1],
   :cmd-info
   {:id :cmd169,
    :created-at 1531741751322,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd169}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "k"
    1],
   :cmd-info
   {:id :cmd170,
    :created-at 1531741751324,
    :duration 0,
    :status :done,
    :origin-id :cmd169},
   :severity :info,
   :id :cmd170}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "ko"
    2],
   :cmd-info
   {:id :cmd171,
    :created-at 1531741751383,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd171}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "ko"
    2],
   :cmd-info
   {:id :cmd172,
    :created-at 1531741751386,
    :duration 0,
    :status :done,
    :origin-id :cmd171},
   :severity :info,
   :id :cmd172}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "kon"
    3],
   :cmd-info
   {:id :cmd173,
    :created-at 1531741751606,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd173}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "kon"
    3],
   :cmd-info
   {:id :cmd174,
    :created-at 1531741751608,
    :duration 0,
    :status :done,
    :origin-id :cmd173},
   :severity :info,
   :id :cmd174}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konj"
    4],
   :cmd-info
   {:id :cmd175,
    :created-at 1531741751634,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd175}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konj"
    4],
   :cmd-info
   {:id :cmd176,
    :created-at 1531741751635,
    :duration 0,
    :status :done,
    :origin-id :cmd175},
   :severity :info,
   :id :cmd176}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konje"
    5],
   :cmd-info
   {:id :cmd177,
    :created-at 1531741751687,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd177}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konje"
    5],
   :cmd-info
   {:id :cmd178,
    :created-at 1531741751687,
    :duration 0,
    :status :done,
    :origin-id :cmd177},
   :severity :info,
   :id :cmd178}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjev"
    6],
   :cmd-info
   {:id :cmd179,
    :created-at 1531741751880,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd179}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjev"
    6],
   :cmd-info
   {:id :cmd180,
    :created-at 1531741751882,
    :duration 0,
    :status :done,
    :origin-id :cmd179},
   :severity :info,
   :id :cmd180}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevi"
    7],
   :cmd-info
   {:id :cmd181,
    :created-at 1531741751979,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd181}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevi"
    7],
   :cmd-info
   {:id :cmd182,
    :created-at 1531741751981,
    :duration 0,
    :status :done,
    :origin-id :cmd181},
   :severity :info,
   :id :cmd182}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic"
    8],
   :cmd-info
   {:id :cmd183,
    :created-at 1531741752100,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd183}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic"
    8],
   :cmd-info
   {:id :cmd184,
    :created-at 1531741752102,
    :duration 0,
    :status :done,
    :origin-id :cmd183},
   :severity :info,
   :id :cmd184}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@"
    9],
   :cmd-info
   {:id :cmd185,
    :created-at 1531741752345,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd185}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@"
    9],
   :cmd-info
   {:id :cmd186,
    :created-at 1531741752347,
    :duration 0,
    :status :done,
    :origin-id :cmd185},
   :severity :info,
   :id :cmd186}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@g"
    10],
   :cmd-info
   {:id :cmd187,
    :created-at 1531741752616,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd187}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@g"
    10],
   :cmd-info
   {:id :cmd188,
    :created-at 1531741752617,
    :duration 0,
    :status :done,
    :origin-id :cmd187},
   :severity :info,
   :id :cmd188}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gm"
    11],
   :cmd-info
   {:id :cmd189,
    :created-at 1531741752704,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd189}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gm"
    11],
   :cmd-info
   {:id :cmd190,
    :created-at 1531741752707,
    :duration 0,
    :status :done,
    :origin-id :cmd189},
   :severity :info,
   :id :cmd190}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gma"
    12],
   :cmd-info
   {:id :cmd191,
    :created-at 1531741752858,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd191}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gma"
    12],
   :cmd-info
   {:id :cmd192,
    :created-at 1531741752859,
    :duration 0,
    :status :done,
    :origin-id :cmd191},
   :severity :info,
   :id :cmd192}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmai"
    13],
   :cmd-info
   {:id :cmd193,
    :created-at 1531741752954,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd193}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmai"
    13],
   :cmd-info
   {:id :cmd194,
    :created-at 1531741752955,
    :duration 0,
    :status :done,
    :origin-id :cmd193},
   :severity :info,
   :id :cmd194}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail"
    14],
   :cmd-info
   {:id :cmd195,
    :created-at 1531741753255,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd195}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail"
    14],
   :cmd-info
   {:id :cmd196,
    :created-at 1531741753258,
    :duration 0,
    :status :done,
    :origin-id :cmd195},
   :severity :info,
   :id :cmd196}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail;"
    15],
   :cmd-info
   {:id :cmd197,
    :created-at 1531741753264,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd197}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail;"
    15],
   :cmd-info
   {:id :cmd198,
    :created-at 1531741753264,
    :duration 0,
    :status :done,
    :origin-id :cmd197},
   :severity :info,
   :id :cmd198}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-submit]],
   :payload [:login :form],
   :cmd-info
   {:id :cmd199,
    :created-at 1531741753700,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd199}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-submit,
   :payload [:login :form],
   :cmd-info
   {:id :cmd200,
    :created-at 1531741753700,
    :duration 0,
    :status :done,
    :origin-id :cmd199},
   :severity :info,
   :id :cmd200}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail"
    14],
   :cmd-info
   {:id :cmd201,
    :created-at 1531741753703,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd201}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail"
    14],
   :cmd-info
   {:id :cmd202,
    :created-at 1531741753714,
    :duration 0,
    :status :done,
    :origin-id :cmd201},
   :severity :info,
   :id :cmd202}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail/"
    15],
   :cmd-info
   {:id :cmd203,
    :created-at 1531741754011,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd203}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail/"
    15],
   :cmd-info
   {:id :cmd204,
    :created-at 1531741754012,
    :duration 0,
    :status :done,
    :origin-id :cmd203},
   :severity :info,
   :id :cmd204}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail/."
    16],
   :cmd-info
   {:id :cmd205,
    :created-at 1531741754074,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd205}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail/."
    16],
   :cmd-info
   {:id :cmd206,
    :created-at 1531741754075,
    :duration 0,
    :status :done,
    :origin-id :cmd205},
   :severity :info,
   :id :cmd206}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail/"
    15],
   :cmd-info
   {:id :cmd207,
    :created-at 1531741754536,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd207}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail/"
    15],
   :cmd-info
   {:id :cmd208,
    :created-at 1531741754537,
    :duration 0,
    :status :done,
    :origin-id :cmd207},
   :severity :info,
   :id :cmd208}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-submit]],
   :payload [:login :form],
   :cmd-info
   {:id :cmd209,
    :created-at 1531741754542,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd209}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-submit,
   :payload [:login :form],
   :cmd-info
   {:id :cmd210,
    :created-at 1531741754544,
    :duration 0,
    :status :done,
    :origin-id :cmd209},
   :severity :info,
   :id :cmd210}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail"
    14],
   :cmd-info
   {:id :cmd211,
    :created-at 1531741754696,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd211}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail"
    14],
   :cmd-info
   {:id :cmd212,
    :created-at 1531741754699,
    :duration 0,
    :status :done,
    :origin-id :cmd211},
   :severity :info,
   :id :cmd212}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail."
    15],
   :cmd-info
   {:id :cmd213,
    :created-at 1531741755240,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd213}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail."
    15],
   :cmd-info
   {:id :cmd214,
    :created-at 1531741755242,
    :duration 0,
    :status :done,
    :origin-id :cmd213},
   :severity :info,
   :id :cmd214}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail.c"
    16],
   :cmd-info
   {:id :cmd215,
    :created-at 1531741755388,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd215}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail.c"
    16],
   :cmd-info
   {:id :cmd216,
    :created-at 1531741755390,
    :duration 0,
    :status :done,
    :origin-id :cmd215},
   :severity :info,
   :id :cmd216}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail.co"
    17],
   :cmd-info
   {:id :cmd217,
    :created-at 1531741755487,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd217}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail.co"
    17],
   :cmd-info
   {:id :cmd218,
    :created-at 1531741755489,
    :duration 0,
    :status :done,
    :origin-id :cmd217},
   :severity :info,
   :id :cmd218}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail.com"
    18],
   :cmd-info
   {:id :cmd219,
    :created-at 1531741755583,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd219}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:email]
    "[HTMLInputElement [object HTMLInputElement]]"
    "konjevic@gmail.com"
    18],
   :cmd-info
   {:id :cmd220,
    :created-at 1531741755584,
    :duration 0,
    :status :done,
    :origin-id :cmd219},
   :severity :info,
   :id :cmd220}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-blur]],
   :payload [[:login :form] [:email]],
   :cmd-info
   {:id :cmd221,
    :created-at 1531741755719,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd221}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-blur,
   :payload [[:login :form] [:email]],
   :cmd-info
   {:id :cmd222,
    :created-at 1531741755722,
    :duration 0,
    :status :done,
    :origin-id :cmd221},
   :severity :info,
   :id :cmd222}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d"
    nil],
   :cmd-info
   {:id :cmd223,
    :created-at 1531741756073,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd223}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d"
    nil],
   :cmd-info
   {:id :cmd224,
    :created-at 1531741756075,
    :duration 0,
    :status :done,
    :origin-id :cmd223},
   :severity :info,
   :id :cmd224}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d3"
    nil],
   :cmd-info
   {:id :cmd225,
    :created-at 1531741756300,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd225}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d3"
    nil],
   :cmd-info
   {:id :cmd226,
    :created-at 1531741756301,
    :duration 0,
    :status :done,
    :origin-id :cmd225},
   :severity :info,
   :id :cmd226}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d33"
    nil],
   :cmd-info
   {:id :cmd227,
    :created-at 1531741756443,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd227}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d33"
    nil],
   :cmd-info
   {:id :cmd228,
    :created-at 1531741756445,
    :duration 0,
    :status :done,
    :origin-id :cmd227},
   :severity :info,
   :id :cmd228}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335"
    nil],
   :cmd-info
   {:id :cmd229,
    :created-at 1531741756551,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd229}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335"
    nil],
   :cmd-info
   {:id :cmd230,
    :created-at 1531741756553,
    :duration 0,
    :status :done,
    :origin-id :cmd229},
   :severity :info,
   :id :cmd230}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p"
    nil],
   :cmd-info
   {:id :cmd231,
    :created-at 1531741756651,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd231}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p"
    nil],
   :cmd-info
   {:id :cmd232,
    :created-at 1531741756653,
    :duration 0,
    :status :done,
    :origin-id :cmd231},
   :severity :info,
   :id :cmd232}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3"
    nil],
   :cmd-info
   {:id :cmd233,
    :created-at 1531741756759,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd233}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3"
    nil],
   :cmd-info
   {:id :cmd234,
    :created-at 1531741756761,
    :duration 0,
    :status :done,
    :origin-id :cmd233},
   :severity :info,
   :id :cmd234}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3d"
    nil],
   :cmd-info
   {:id :cmd235,
    :created-at 1531741756970,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd235}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3d"
    nil],
   :cmd-info
   {:id :cmd236,
    :created-at 1531741756972,
    :duration 0,
    :status :done,
    :origin-id :cmd235},
   :severity :info,
   :id :cmd236}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3de"
    nil],
   :cmd-info
   {:id :cmd237,
    :created-at 1531741757162,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd237}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3de"
    nil],
   :cmd-info
   {:id :cmd238,
    :created-at 1531741757164,
    :duration 0,
    :status :done,
    :origin-id :cmd237},
   :severity :info,
   :id :cmd238}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3dee"
    nil],
   :cmd-info
   {:id :cmd239,
    :created-at 1531741757307,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd239}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3dee"
    nil],
   :cmd-info
   {:id :cmd240,
    :created-at 1531741757309,
    :duration 0,
    :status :done,
    :origin-id :cmd239},
   :severity :info,
   :id :cmd240}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3dees"
    nil],
   :cmd-info
   {:id :cmd241,
    :created-at 1531741757473,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd241}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3dees"
    nil],
   :cmd-info
   {:id :cmd242,
    :created-at 1531741757475,
    :duration 0,
    :status :done,
    :origin-id :cmd241},
   :severity :info,
   :id :cmd242}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deesp"
    nil],
   :cmd-info
   {:id :cmd243,
    :created-at 1531741757557,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd243}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deesp"
    nil],
   :cmd-info
   {:id :cmd244,
    :created-at 1531741757558,
    :duration 0,
    :status :done,
    :origin-id :cmd243},
   :severity :info,
   :id :cmd244}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deespe"
    nil],
   :cmd-info
   {:id :cmd245,
    :created-at 1531741757702,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd245}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deespe"
    nil],
   :cmd-info
   {:id :cmd246,
    :created-at 1531741757703,
    :duration 0,
    :status :done,
    :origin-id :cmd245},
   :severity :info,
   :id :cmd246}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deespeD"
    nil],
   :cmd-info
   {:id :cmd247,
    :created-at 1531741757918,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd247}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deespeD"
    nil],
   :cmd-info
   {:id :cmd248,
    :created-at 1531741757919,
    :duration 0,
    :status :done,
    :origin-id :cmd247},
   :severity :info,
   :id :cmd248}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deespeD#"
    nil],
   :cmd-info
   {:id :cmd249,
    :created-at 1531741758121,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd249}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deespeD#"
    nil],
   :cmd-info
   {:id :cmd250,
    :created-at 1531741758123,
    :duration 0,
    :status :done,
    :origin-id :cmd249},
   :severity :info,
   :id :cmd250}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deespeD##"
    nil],
   :cmd-info
   {:id :cmd251,
    :created-at 1531741758281,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd251}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deespeD##"
    nil],
   :cmd-info
   {:id :cmd252,
    :created-at 1531741758284,
    :duration 0,
    :status :done,
    :origin-id :cmd251},
   :severity :info,
   :id :cmd252}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deespeD##%"
    nil],
   :cmd-info
   {:id :cmd253,
    :created-at 1531741758353,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd253}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deespeD##%"
    nil],
   :cmd-info
   {:id :cmd254,
    :created-at 1531741758355,
    :duration 0,
    :status :done,
    :origin-id :cmd253},
   :severity :info,
   :id :cmd254}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deespeD##%P"
    nil],
   :cmd-info
   {:id :cmd255,
    :created-at 1531741758413,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd255}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deespeD##%P"
    nil],
   :cmd-info
   {:id :cmd256,
    :created-at 1531741758417,
    :duration 0,
    :status :done,
    :origin-id :cmd255},
   :severity :info,
   :id :cmd256}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-change]],
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deespeD##%P#"
    nil],
   :cmd-info
   {:id :cmd257,
    :created-at 1531741758590,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd257}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-change,
   :payload
   [[:login :form]
    [:password]
    "[HTMLInputElement [object HTMLInputElement]]"
    "d335p3deespeD##%P#"
    nil],
   :cmd-info
   {:id :cmd258,
    :created-at 1531741758591,
    :duration 0,
    :status :done,
    :origin-id :cmd257},
   :severity :info,
   :id :cmd258}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-blur]],
   :payload [[:login :form] [:password]],
   :cmd-info
   {:id :cmd259,
    :created-at 1531741759534,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd259}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-blur,
   :payload [[:login :form] [:password]],
   :cmd-info
   {:id :cmd260,
    :created-at 1531741759536,
    :duration 0,
    :status :done,
    :origin-id :cmd259},
   :severity :info,
   :id :cmd260}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-submit]],
   :payload [:login :form],
   :cmd-info
   {:id :cmd261,
    :created-at 1531741759632,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd261}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-submit,
   :payload [:login :form],
   :cmd-info
   {:id :cmd262,
    :created-at 1531741759634,
    :duration 0,
    :status :done,
    :origin-id :cmd261},
   :severity :info,
   :id :cmd262}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :submit-form,
   :payload {:form-props [:login :form]},
   :cmd-info
   {:id :cmd263,
    :created-at 1531741759634,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd263}}
 {:app {:name :application, :version :v1},
  :event
  {:type :router,
   :direction :out,
   :topic nil,
   :name :route-changed,
   :payload
   {:route ":page/:subpage",
    :data {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd264,
    :created-at 1531741759950,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd264}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :stop]],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd265,
    :created-at 1531741759951,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd265}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :stop],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd266,
    :created-at 1531741759951,
    :duration 0,
    :status :done,
    :origin-id :cmd265},
   :severity :info,
   :id :cmd266}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :stop,
   :payload {:page "login"},
   :cmd-info
   {:id :cmd267,
    :created-at 1531741759951,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd267}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :stop]],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd268,
    :created-at 1531741759951,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd268}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :stop],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd269,
    :created-at 1531741759951,
    :duration 0,
    :status :done,
    :origin-id :cmd268},
   :severity :info,
   :id :cmd269}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :stop]],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd270,
    :created-at 1531741759951,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd270}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :stop],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd271,
    :created-at 1531741759951,
    :duration 0,
    :status :done,
    :origin-id :cmd270},
   :severity :info,
   :id :cmd271}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :start]],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd272,
    :created-at 1531741759951,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd272}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :start],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd273,
    :created-at 1531741759951,
    :duration 0,
    :status :done,
    :origin-id :cmd272},
   :severity :info,
   :id :cmd273}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :start,
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd274,
    :created-at 1531741759952,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd274}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :start]],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd275,
    :created-at 1531741759952,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd275}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :start],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd276,
    :created-at 1531741759952,
    :duration 0,
    :status :done,
    :origin-id :cmd275},
   :severity :info,
   :id :cmd276}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :start]],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd277,
    :created-at 1531741759953,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd277}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :start],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd278,
    :created-at 1531741759953,
    :duration 0,
    :status :done,
    :origin-id :cmd277},
   :severity :info,
   :id :cmd278}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd279,
    :created-at 1531741759954,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd279}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd280,
    :created-at 1531741759954,
    :duration 0,
    :status :done,
    :origin-id :cmd279},
   :severity :info,
   :id :cmd280}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd281,
    :created-at 1531741759954,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd281}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd282,
    :created-at 1531741759954,
    :duration 0,
    :status :done,
    :origin-id :cmd281},
   :severity :info,
   :id :cmd282}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd283,
    :created-at 1531741759954,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd283}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd284,
    :created-at 1531741759954,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd284}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd285,
    :created-at 1531741759954,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd285}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd286,
    :created-at 1531741759954,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd286}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd287,
    :created-at 1531741759954,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd287}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd289,
    :created-at 1531741759958,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd289}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd290,
    :created-at 1531741759958,
    :duration 0,
    :status :done,
    :origin-id :cmd289},
   :severity :info,
   :id :cmd290}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma.toolbox.forms.core/forms :unmount-form],
   :payload [:login :form],
   :cmd-info
   {:id :cmd291,
    :created-at 1531741759958,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd291}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:initializer :route-changed],
   :payload
   {:route ":page/:subpage",
    :data {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd292,
    :created-at 1531741759958,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd292}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :route-changed,
   :payload
   {:route ":page/:subpage",
    :data {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd293,
    :created-at 1531741759958,
    :duration 0,
    :status :done,
    :origin-id :cmd292},
   :severity :info,
   :id :cmd293}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:user-actions :route-changed],
   :payload
   {:route ":page/:subpage",
    :data {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd294,
    :created-at 1531741759959,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd294}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :route-changed,
   :payload
   {:route ":page/:subpage",
    :data {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd295,
    :created-at 1531741759959,
    :duration 0,
    :status :done,
    :origin-id :cmd294},
   :severity :info,
   :id :cmd295}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:keechma.toolbox.forms.core/forms :route-changed],
   :payload
   {:route ":page/:subpage",
    :data {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd296,
    :created-at 1531741759959,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd296}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :route-changed,
   :payload
   {:route ":page/:subpage",
    :data {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd297,
    :created-at 1531741759959,
    :duration 0,
    :status :done,
    :origin-id :cmd296},
   :severity :info,
   :id :cmd297}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :in,
   :topic nil,
   :name :running-controllers,
   :payload
   {:initializer true,
    :user-actions true,
    :keechma.toolbox.forms.core/forms true,
    :redirect {:page "home", :subpage "personal"},
    :keechma.toolbox.dataloader.core/dataloader
    {:page "home", :subpage "personal"},
    :keechma.toolbox.forms.mount-controller/id
    {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd298,
    :created-at 1531741759959,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd298}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd299,
    :created-at 1531741759960,
    :duration 0,
    :status :done,
    :origin-id :cmd283},
   :severity :info,
   :id :cmd299}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd300,
    :created-at 1531741759960,
    :duration 0,
    :status :done,
    :origin-id :cmd284},
   :severity :info,
   :id :cmd300}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd301,
    :created-at 1531741759960,
    :duration 0,
    :status :done,
    :origin-id :cmd285},
   :severity :info,
   :id :cmd301}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd302,
    :created-at 1531741759960,
    :duration 0,
    :status :done,
    :origin-id :cmd286},
   :severity :info,
   :id :cmd302}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd303,
    :created-at 1531741759960,
    :duration 0,
    :status :done,
    :origin-id :cmd287},
   :severity :info,
   :id :cmd303}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :unmount-form,
   :payload [:login :form],
   :cmd-info
   {:id :cmd304,
    :created-at 1531741759961,
    :duration 0,
    :status :done,
    :origin-id :cmd291},
   :severity :info,
   :id :cmd304}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd307,
    :created-at 1531741760519,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd307}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd308,
    :created-at 1531741760519,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd308}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd309,
    :created-at 1531741760519,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd309}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd310,
    :created-at 1531741760519,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd310}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd311,
    :created-at 1531741760519,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd311}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd312,
    :created-at 1531741760519,
    :duration 0,
    :status :done,
    :origin-id :cmd307},
   :severity :info,
   :id :cmd312}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd313,
    :created-at 1531741760519,
    :duration 0,
    :status :done,
    :origin-id :cmd308},
   :severity :info,
   :id :cmd313}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd314,
    :created-at 1531741760519,
    :duration 0,
    :status :done,
    :origin-id :cmd309},
   :severity :info,
   :id :cmd314}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd315,
    :created-at 1531741760519,
    :duration 0,
    :status :done,
    :origin-id :cmd310},
   :severity :info,
   :id :cmd315}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd316,
    :created-at 1531741760519,
    :duration 0,
    :status :done,
    :origin-id :cmd311},
   :severity :info,
   :id :cmd316}}
 {:app {:name :application, :version :v1},
  :event
  {:type :router,
   :direction :out,
   :topic nil,
   :name :route-changed,
   :payload {:route ":page", :data {:page "editor"}},
   :cmd-info
   {:id :cmd317,
    :created-at 1531741761650,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd317}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :stop]],
   :payload {:page "editor"},
   :cmd-info
   {:id :cmd318,
    :created-at 1531741761650,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd318}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :stop],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd319,
    :created-at 1531741761650,
    :duration 0,
    :status :done,
    :origin-id :cmd318},
   :severity :info,
   :id :cmd319}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :stop,
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd320,
    :created-at 1531741761651,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd320}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :stop]],
   :payload {:page "editor"},
   :cmd-info
   {:id :cmd321,
    :created-at 1531741761651,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd321}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :stop],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd322,
    :created-at 1531741761651,
    :duration 0,
    :status :done,
    :origin-id :cmd321},
   :severity :info,
   :id :cmd322}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :stop]],
   :payload {:page "editor"},
   :cmd-info
   {:id :cmd323,
    :created-at 1531741761651,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd323}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :stop],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd324,
    :created-at 1531741761651,
    :duration 0,
    :status :done,
    :origin-id :cmd323},
   :severity :info,
   :id :cmd324}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :start]],
   :payload {:page "editor"},
   :cmd-info
   {:id :cmd325,
    :created-at 1531741761651,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd325}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :start],
   :payload {:page "editor"},
   :cmd-info
   {:id :cmd326,
    :created-at 1531741761651,
    :duration 0,
    :status :done,
    :origin-id :cmd325},
   :severity :info,
   :id :cmd326}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :start,
   :payload {:page "editor"},
   :cmd-info
   {:id :cmd327,
    :created-at 1531741761652,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd327}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :start]],
   :payload {:page "editor"},
   :cmd-info
   {:id :cmd328,
    :created-at 1531741761653,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd328}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :start],
   :payload {:page "editor"},
   :cmd-info
   {:id :cmd329,
    :created-at 1531741761653,
    :duration 0,
    :status :done,
    :origin-id :cmd328},
   :severity :info,
   :id :cmd329}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :start]],
   :payload {:page "editor"},
   :cmd-info
   {:id :cmd330,
    :created-at 1531741761653,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd330}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :start],
   :payload {:page "editor"},
   :cmd-info
   {:id :cmd331,
    :created-at 1531741761653,
    :duration 0,
    :status :done,
    :origin-id :cmd330},
   :severity :info,
   :id :cmd331}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd332,
    :created-at 1531741761654,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd332}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd333,
    :created-at 1531741761654,
    :duration 0,
    :status :done,
    :origin-id :cmd332},
   :severity :info,
   :id :cmd333}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd334,
    :created-at 1531741761654,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd334}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd335,
    :created-at 1531741761654,
    :duration 0,
    :status :done,
    :origin-id :cmd334},
   :severity :info,
   :id :cmd335}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd336,
    :created-at 1531741761654,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd336}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd337,
    :created-at 1531741761654,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd337}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd338,
    :created-at 1531741761654,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd338}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd339,
    :created-at 1531741761654,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd339}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd340,
    :created-at 1531741761654,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd340}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd342,
    :created-at 1531741761661,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd342}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd343,
    :created-at 1531741761661,
    :duration 0,
    :status :done,
    :origin-id :cmd342},
   :severity :info,
   :id :cmd343}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma.toolbox.forms.core/forms :mount-form],
   :payload [:editor :new],
   :cmd-info
   {:id :cmd344,
    :created-at 1531741761661,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd344}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:initializer :route-changed],
   :payload {:route ":page", :data {:page "editor"}},
   :cmd-info
   {:id :cmd345,
    :created-at 1531741761661,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd345}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :route-changed,
   :payload {:route ":page", :data {:page "editor"}},
   :cmd-info
   {:id :cmd346,
    :created-at 1531741761661,
    :duration 0,
    :status :done,
    :origin-id :cmd345},
   :severity :info,
   :id :cmd346}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:user-actions :route-changed],
   :payload {:route ":page", :data {:page "editor"}},
   :cmd-info
   {:id :cmd347,
    :created-at 1531741761661,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd347}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :route-changed,
   :payload {:route ":page", :data {:page "editor"}},
   :cmd-info
   {:id :cmd348,
    :created-at 1531741761661,
    :duration 0,
    :status :done,
    :origin-id :cmd347},
   :severity :info,
   :id :cmd348}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:keechma.toolbox.forms.core/forms :route-changed],
   :payload {:route ":page", :data {:page "editor"}},
   :cmd-info
   {:id :cmd349,
    :created-at 1531741761662,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd349}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :route-changed,
   :payload {:route ":page", :data {:page "editor"}},
   :cmd-info
   {:id :cmd350,
    :created-at 1531741761662,
    :duration 0,
    :status :done,
    :origin-id :cmd349},
   :severity :info,
   :id :cmd350}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :in,
   :topic nil,
   :name :running-controllers,
   :payload
   {:initializer true,
    :user-actions true,
    :keechma.toolbox.forms.core/forms true,
    :redirect {:page "editor"},
    :keechma.toolbox.dataloader.core/dataloader {:page "editor"},
    :keechma.toolbox.forms.mount-controller/id {:page "editor"}},
   :cmd-info
   {:id :cmd351,
    :created-at 1531741761662,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd351}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd352,
    :created-at 1531741761664,
    :duration 0,
    :status :done,
    :origin-id :cmd336},
   :severity :info,
   :id :cmd352}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd353,
    :created-at 1531741761664,
    :duration 0,
    :status :done,
    :origin-id :cmd337},
   :severity :info,
   :id :cmd353}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd354,
    :created-at 1531741761664,
    :duration 0,
    :status :done,
    :origin-id :cmd338},
   :severity :info,
   :id :cmd354}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd355,
    :created-at 1531741761664,
    :duration 0,
    :status :done,
    :origin-id :cmd339},
   :severity :info,
   :id :cmd355}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd356,
    :created-at 1531741761664,
    :duration 0,
    :status :done,
    :origin-id :cmd340},
   :severity :info,
   :id :cmd356}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :mount-form,
   :payload [:editor :new],
   :cmd-info
   {:id :cmd357,
    :created-at 1531741761664,
    :duration 0,
    :status :done,
    :origin-id :cmd344},
   :severity :info,
   :id :cmd357}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd360,
    :created-at 1531741761668,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd360}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd361,
    :created-at 1531741761668,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd361}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd362,
    :created-at 1531741761668,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd362}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd363,
    :created-at 1531741761668,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd363}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd364,
    :created-at 1531741761668,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd364}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd365,
    :created-at 1531741761669,
    :duration 0,
    :status :done,
    :origin-id :cmd360},
   :severity :info,
   :id :cmd365}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd366,
    :created-at 1531741761669,
    :duration 0,
    :status :done,
    :origin-id :cmd361},
   :severity :info,
   :id :cmd366}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd367,
    :created-at 1531741761670,
    :duration 0,
    :status :done,
    :origin-id :cmd362},
   :severity :info,
   :id :cmd367}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd368,
    :created-at 1531741761670,
    :duration 0,
    :status :done,
    :origin-id :cmd363},
   :severity :info,
   :id :cmd368}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd369,
    :created-at 1531741761670,
    :duration 0,
    :status :done,
    :origin-id :cmd364},
   :severity :info,
   :id :cmd369}}
 {:app {:name :application, :version :v1},
  :event
  {:type :router,
   :direction :out,
   :topic nil,
   :name :route-changed,
   :payload
   {:route ":page/:subpage",
    :data {:page "profile", :subpage "retro"}},
   :cmd-info
   {:id :cmd375,
    :created-at 1531741762494,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd375}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :stop]],
   :payload {:page "profile", :subpage "retro"},
   :cmd-info
   {:id :cmd376,
    :created-at 1531741762494,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd376}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :stop],
   :payload {:page "editor"},
   :cmd-info
   {:id :cmd377,
    :created-at 1531741762494,
    :duration 0,
    :status :done,
    :origin-id :cmd376},
   :severity :info,
   :id :cmd377}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :stop,
   :payload {:page "editor"},
   :cmd-info
   {:id :cmd378,
    :created-at 1531741762495,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd378}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :stop]],
   :payload {:page "profile", :subpage "retro"},
   :cmd-info
   {:id :cmd379,
    :created-at 1531741762495,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd379}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :stop],
   :payload {:page "editor"},
   :cmd-info
   {:id :cmd380,
    :created-at 1531741762495,
    :duration 0,
    :status :done,
    :origin-id :cmd379},
   :severity :info,
   :id :cmd380}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :stop]],
   :payload {:page "profile", :subpage "retro"},
   :cmd-info
   {:id :cmd381,
    :created-at 1531741762495,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd381}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :stop],
   :payload {:page "editor"},
   :cmd-info
   {:id :cmd382,
    :created-at 1531741762495,
    :duration 0,
    :status :done,
    :origin-id :cmd381},
   :severity :info,
   :id :cmd382}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :start]],
   :payload {:page "profile", :subpage "retro"},
   :cmd-info
   {:id :cmd383,
    :created-at 1531741762496,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd383}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :start],
   :payload {:page "profile", :subpage "retro"},
   :cmd-info
   {:id :cmd384,
    :created-at 1531741762496,
    :duration 0,
    :status :done,
    :origin-id :cmd383},
   :severity :info,
   :id :cmd384}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :start,
   :payload {:page "profile", :subpage "retro"},
   :cmd-info
   {:id :cmd385,
    :created-at 1531741762496,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd385}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :start]],
   :payload {:page "profile", :subpage "retro"},
   :cmd-info
   {:id :cmd386,
    :created-at 1531741762497,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd386}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :start],
   :payload {:page "profile", :subpage "retro"},
   :cmd-info
   {:id :cmd387,
    :created-at 1531741762497,
    :duration 0,
    :status :done,
    :origin-id :cmd386},
   :severity :info,
   :id :cmd387}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :start]],
   :payload {:page "profile", :subpage "retro"},
   :cmd-info
   {:id :cmd388,
    :created-at 1531741762497,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd388}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :start],
   :payload {:page "profile", :subpage "retro"},
   :cmd-info
   {:id :cmd389,
    :created-at 1531741762497,
    :duration 0,
    :status :done,
    :origin-id :cmd388},
   :severity :info,
   :id :cmd389}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd390,
    :created-at 1531741762497,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd390}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd391,
    :created-at 1531741762497,
    :duration 0,
    :status :done,
    :origin-id :cmd390},
   :severity :info,
   :id :cmd391}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd392,
    :created-at 1531741762497,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd392}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd393,
    :created-at 1531741762497,
    :duration 0,
    :status :done,
    :origin-id :cmd392},
   :severity :info,
   :id :cmd393}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd394,
    :created-at 1531741762497,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd394}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd395,
    :created-at 1531741762498,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd395}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd396,
    :created-at 1531741762498,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd396}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd397,
    :created-at 1531741762498,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd397}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd398,
    :created-at 1531741762498,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd398}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd400,
    :created-at 1531741762502,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd400}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd401,
    :created-at 1531741762502,
    :duration 0,
    :status :done,
    :origin-id :cmd400},
   :severity :info,
   :id :cmd401}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma.toolbox.forms.core/forms :unmount-form],
   :payload [:editor :new],
   :cmd-info
   {:id :cmd402,
    :created-at 1531741762502,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd402}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:initializer :route-changed],
   :payload
   {:route ":page/:subpage",
    :data {:page "profile", :subpage "retro"}},
   :cmd-info
   {:id :cmd403,
    :created-at 1531741762502,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd403}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :route-changed,
   :payload
   {:route ":page/:subpage",
    :data {:page "profile", :subpage "retro"}},
   :cmd-info
   {:id :cmd404,
    :created-at 1531741762502,
    :duration 0,
    :status :done,
    :origin-id :cmd403},
   :severity :info,
   :id :cmd404}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:user-actions :route-changed],
   :payload
   {:route ":page/:subpage",
    :data {:page "profile", :subpage "retro"}},
   :cmd-info
   {:id :cmd405,
    :created-at 1531741762503,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd405}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :route-changed,
   :payload
   {:route ":page/:subpage",
    :data {:page "profile", :subpage "retro"}},
   :cmd-info
   {:id :cmd406,
    :created-at 1531741762503,
    :duration 0,
    :status :done,
    :origin-id :cmd405},
   :severity :info,
   :id :cmd406}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:keechma.toolbox.forms.core/forms :route-changed],
   :payload
   {:route ":page/:subpage",
    :data {:page "profile", :subpage "retro"}},
   :cmd-info
   {:id :cmd407,
    :created-at 1531741762503,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd407}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :route-changed,
   :payload
   {:route ":page/:subpage",
    :data {:page "profile", :subpage "retro"}},
   :cmd-info
   {:id :cmd408,
    :created-at 1531741762503,
    :duration 0,
    :status :done,
    :origin-id :cmd407},
   :severity :info,
   :id :cmd408}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :in,
   :topic nil,
   :name :running-controllers,
   :payload
   {:initializer true,
    :user-actions true,
    :keechma.toolbox.forms.core/forms true,
    :redirect {:page "profile", :subpage "retro"},
    :keechma.toolbox.dataloader.core/dataloader
    {:page "profile", :subpage "retro"},
    :keechma.toolbox.forms.mount-controller/id
    {:page "profile", :subpage "retro"}},
   :cmd-info
   {:id :cmd409,
    :created-at 1531741762503,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd409}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd410,
    :created-at 1531741762505,
    :duration 0,
    :status :done,
    :origin-id :cmd394},
   :severity :info,
   :id :cmd410}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd411,
    :created-at 1531741762505,
    :duration 0,
    :status :done,
    :origin-id :cmd395},
   :severity :info,
   :id :cmd411}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd412,
    :created-at 1531741762505,
    :duration 0,
    :status :done,
    :origin-id :cmd396},
   :severity :info,
   :id :cmd412}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd413,
    :created-at 1531741762505,
    :duration 0,
    :status :done,
    :origin-id :cmd397},
   :severity :info,
   :id :cmd413}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd414,
    :created-at 1531741762505,
    :duration 0,
    :status :done,
    :origin-id :cmd398},
   :severity :info,
   :id :cmd414}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :unmount-form,
   :payload [:editor :new],
   :cmd-info
   {:id :cmd415,
    :created-at 1531741762505,
    :duration 0,
    :status :done,
    :origin-id :cmd402},
   :severity :info,
   :id :cmd415}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd418,
    :created-at 1531741763210,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd418}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd419,
    :created-at 1531741763210,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd419}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd420,
    :created-at 1531741763210,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd420}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd421,
    :created-at 1531741763210,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd421}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd422,
    :created-at 1531741763210,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd422}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd423,
    :created-at 1531741763211,
    :duration 0,
    :status :done,
    :origin-id :cmd418},
   :severity :info,
   :id :cmd423}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd424,
    :created-at 1531741763211,
    :duration 0,
    :status :done,
    :origin-id :cmd419},
   :severity :info,
   :id :cmd424}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd425,
    :created-at 1531741763211,
    :duration 0,
    :status :done,
    :origin-id :cmd420},
   :severity :info,
   :id :cmd425}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd426,
    :created-at 1531741763212,
    :duration 0,
    :status :done,
    :origin-id :cmd421},
   :severity :info,
   :id :cmd426}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd427,
    :created-at 1531741763212,
    :duration 0,
    :status :done,
    :origin-id :cmd422},
   :severity :info,
   :id :cmd427}}
 {:app {:name :application, :version :v1},
  :event
  {:type :router,
   :direction :out,
   :topic nil,
   :name :route-changed,
   :payload
   {:route ":page/:subpage/:detail",
    :data {:page "profile", :subpage "retro", :detail "favorites"}},
   :cmd-info
   {:id :cmd428,
    :created-at 1531741764072,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd428}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :stop]],
   :payload {:page "profile", :subpage "retro", :detail "favorites"},
   :cmd-info
   {:id :cmd429,
    :created-at 1531741764072,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd429}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :stop],
   :payload {:page "profile", :subpage "retro"},
   :cmd-info
   {:id :cmd430,
    :created-at 1531741764072,
    :duration 0,
    :status :done,
    :origin-id :cmd429},
   :severity :info,
   :id :cmd430}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :stop,
   :payload {:page "profile", :subpage "retro"},
   :cmd-info
   {:id :cmd431,
    :created-at 1531741764072,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd431}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :stop]],
   :payload {:page "profile", :subpage "retro", :detail "favorites"},
   :cmd-info
   {:id :cmd432,
    :created-at 1531741764073,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd432}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :stop],
   :payload {:page "profile", :subpage "retro"},
   :cmd-info
   {:id :cmd433,
    :created-at 1531741764073,
    :duration 0,
    :status :done,
    :origin-id :cmd432},
   :severity :info,
   :id :cmd433}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :stop]],
   :payload {:page "profile", :subpage "retro", :detail "favorites"},
   :cmd-info
   {:id :cmd434,
    :created-at 1531741764073,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd434}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :stop],
   :payload {:page "profile", :subpage "retro"},
   :cmd-info
   {:id :cmd435,
    :created-at 1531741764073,
    :duration 0,
    :status :done,
    :origin-id :cmd434},
   :severity :info,
   :id :cmd435}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :start]],
   :payload {:page "profile", :subpage "retro", :detail "favorites"},
   :cmd-info
   {:id :cmd436,
    :created-at 1531741764074,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd436}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :start],
   :payload {:page "profile", :subpage "retro", :detail "favorites"},
   :cmd-info
   {:id :cmd437,
    :created-at 1531741764074,
    :duration 0,
    :status :done,
    :origin-id :cmd436},
   :severity :info,
   :id :cmd437}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :start,
   :payload {:page "profile", :subpage "retro", :detail "favorites"},
   :cmd-info
   {:id :cmd438,
    :created-at 1531741764074,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd438}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :start]],
   :payload {:page "profile", :subpage "retro", :detail "favorites"},
   :cmd-info
   {:id :cmd439,
    :created-at 1531741764074,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd439}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :start],
   :payload {:page "profile", :subpage "retro", :detail "favorites"},
   :cmd-info
   {:id :cmd440,
    :created-at 1531741764074,
    :duration 0,
    :status :done,
    :origin-id :cmd439},
   :severity :info,
   :id :cmd440}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :start]],
   :payload {:page "profile", :subpage "retro", :detail "favorites"},
   :cmd-info
   {:id :cmd441,
    :created-at 1531741764075,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd441}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :start],
   :payload {:page "profile", :subpage "retro", :detail "favorites"},
   :cmd-info
   {:id :cmd442,
    :created-at 1531741764075,
    :duration 0,
    :status :done,
    :origin-id :cmd441},
   :severity :info,
   :id :cmd442}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd443,
    :created-at 1531741764075,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd443}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd444,
    :created-at 1531741764075,
    :duration 0,
    :status :done,
    :origin-id :cmd443},
   :severity :info,
   :id :cmd444}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd445,
    :created-at 1531741764075,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd445}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd446,
    :created-at 1531741764075,
    :duration 0,
    :status :done,
    :origin-id :cmd445},
   :severity :info,
   :id :cmd446}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd447,
    :created-at 1531741764076,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd447}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd448,
    :created-at 1531741764076,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd448}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd449,
    :created-at 1531741764076,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd449}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd450,
    :created-at 1531741764076,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd450}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd451,
    :created-at 1531741764076,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd451}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd453,
    :created-at 1531741764080,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd453}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd454,
    :created-at 1531741764080,
    :duration 0,
    :status :done,
    :origin-id :cmd453},
   :severity :info,
   :id :cmd454}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:initializer :route-changed],
   :payload
   {:route ":page/:subpage/:detail",
    :data {:page "profile", :subpage "retro", :detail "favorites"}},
   :cmd-info
   {:id :cmd455,
    :created-at 1531741764081,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd455}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :route-changed,
   :payload
   {:route ":page/:subpage/:detail",
    :data {:page "profile", :subpage "retro", :detail "favorites"}},
   :cmd-info
   {:id :cmd456,
    :created-at 1531741764081,
    :duration 0,
    :status :done,
    :origin-id :cmd455},
   :severity :info,
   :id :cmd456}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:user-actions :route-changed],
   :payload
   {:route ":page/:subpage/:detail",
    :data {:page "profile", :subpage "retro", :detail "favorites"}},
   :cmd-info
   {:id :cmd457,
    :created-at 1531741764081,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd457}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :route-changed,
   :payload
   {:route ":page/:subpage/:detail",
    :data {:page "profile", :subpage "retro", :detail "favorites"}},
   :cmd-info
   {:id :cmd458,
    :created-at 1531741764081,
    :duration 0,
    :status :done,
    :origin-id :cmd457},
   :severity :info,
   :id :cmd458}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:keechma.toolbox.forms.core/forms :route-changed],
   :payload
   {:route ":page/:subpage/:detail",
    :data {:page "profile", :subpage "retro", :detail "favorites"}},
   :cmd-info
   {:id :cmd459,
    :created-at 1531741764081,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd459}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :route-changed,
   :payload
   {:route ":page/:subpage/:detail",
    :data {:page "profile", :subpage "retro", :detail "favorites"}},
   :cmd-info
   {:id :cmd460,
    :created-at 1531741764081,
    :duration 0,
    :status :done,
    :origin-id :cmd459},
   :severity :info,
   :id :cmd460}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :in,
   :topic nil,
   :name :running-controllers,
   :payload
   {:initializer true,
    :user-actions true,
    :keechma.toolbox.forms.core/forms true,
    :redirect {:page "profile", :subpage "retro", :detail "favorites"},
    :keechma.toolbox.dataloader.core/dataloader
    {:page "profile", :subpage "retro", :detail "favorites"},
    :keechma.toolbox.forms.mount-controller/id
    {:page "profile", :subpage "retro", :detail "favorites"}},
   :cmd-info
   {:id :cmd461,
    :created-at 1531741764081,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd461}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd462,
    :created-at 1531741764083,
    :duration 0,
    :status :done,
    :origin-id :cmd447},
   :severity :info,
   :id :cmd462}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd463,
    :created-at 1531741764083,
    :duration 0,
    :status :done,
    :origin-id :cmd448},
   :severity :info,
   :id :cmd463}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd464,
    :created-at 1531741764083,
    :duration 0,
    :status :done,
    :origin-id :cmd449},
   :severity :info,
   :id :cmd464}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd465,
    :created-at 1531741764083,
    :duration 0,
    :status :done,
    :origin-id :cmd450},
   :severity :info,
   :id :cmd465}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd466,
    :created-at 1531741764084,
    :duration 0,
    :status :done,
    :origin-id :cmd451},
   :severity :info,
   :id :cmd466}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-blur]],
   :payload [[:login :form] [:password]],
   :cmd-info
   {:id :cmd837,
    :created-at 1531741787728,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd837}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-blur,
   :payload [[:login :form] [:password]],
   :cmd-info
   {:id :cmd838,
    :created-at 1531741787728,
    :duration 0,
    :status :done,
    :origin-id :cmd837},
   :severity :info,
   :id :cmd838}}
 {:app {:name :application, :version :v1},
  :event
  {:type :component,
   :direction :out,
   :topic :page-login,
   :name [:ui [:keechma.toolbox.forms.core/forms :on-submit]],
   :payload [:login :form],
   :cmd-info
   {:id :cmd839,
    :created-at 1531741787806,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd839}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :on-submit,
   :payload [:login :form],
   :cmd-info
   {:id :cmd840,
    :created-at 1531741787807,
    :duration 0,
    :status :done,
    :origin-id :cmd839},
   :severity :info,
   :id :cmd840}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :submit-form,
   :payload {:form-props [:login :form]},
   :cmd-info
   {:id :cmd841,
    :created-at 1531741787809,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd841}}
 {:app {:name :application, :version :v1},
  :event
  {:type :router,
   :direction :out,
   :topic nil,
   :name :route-changed,
   :payload
   {:route ":page/:subpage",
    :data {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd842,
    :created-at 1531741788189,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd842}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :stop]],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd843,
    :created-at 1531741788190,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd843}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :stop],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd844,
    :created-at 1531741788190,
    :duration 0,
    :status :done,
    :origin-id :cmd843},
   :severity :info,
   :id :cmd844}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :stop,
   :payload {:page "login"},
   :cmd-info
   {:id :cmd845,
    :created-at 1531741788190,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd845}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :stop]],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd846,
    :created-at 1531741788190,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd846}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :stop],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd847,
    :created-at 1531741788190,
    :duration 0,
    :status :done,
    :origin-id :cmd846},
   :severity :info,
   :id :cmd847}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :stop]],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd848,
    :created-at 1531741788191,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd848}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :stop],
   :payload {:page "login"},
   :cmd-info
   {:id :cmd849,
    :created-at 1531741788191,
    :duration 0,
    :status :done,
    :origin-id :cmd848},
   :severity :info,
   :id :cmd849}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :start]],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd850,
    :created-at 1531741788191,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd850}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :start],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd851,
    :created-at 1531741788191,
    :duration 0,
    :status :done,
    :origin-id :cmd850},
   :severity :info,
   :id :cmd851}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :start,
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd852,
    :created-at 1531741788191,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd852}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :start]],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd853,
    :created-at 1531741788191,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd853}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :start],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd854,
    :created-at 1531741788191,
    :duration 0,
    :status :done,
    :origin-id :cmd853},
   :severity :info,
   :id :cmd854}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :start]],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd855,
    :created-at 1531741788192,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd855}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :start],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd856,
    :created-at 1531741788192,
    :duration 0,
    :status :done,
    :origin-id :cmd855},
   :severity :info,
   :id :cmd856}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd857,
    :created-at 1531741788193,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd857}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd858,
    :created-at 1531741788193,
    :duration 0,
    :status :done,
    :origin-id :cmd857},
   :severity :info,
   :id :cmd858}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd859,
    :created-at 1531741788193,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd859}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd860,
    :created-at 1531741788193,
    :duration 0,
    :status :done,
    :origin-id :cmd859},
   :severity :info,
   :id :cmd860}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd861,
    :created-at 1531741788193,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd861}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd862,
    :created-at 1531741788193,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd862}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd863,
    :created-at 1531741788193,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd863}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd864,
    :created-at 1531741788193,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd864}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd865,
    :created-at 1531741788193,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd865}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd867,
    :created-at 1531741788197,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd867}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd868,
    :created-at 1531741788197,
    :duration 0,
    :status :done,
    :origin-id :cmd867},
   :severity :info,
   :id :cmd868}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma.toolbox.forms.core/forms :unmount-form],
   :payload [:login :form],
   :cmd-info
   {:id :cmd869,
    :created-at 1531741788197,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd869}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:initializer :route-changed],
   :payload
   {:route ":page/:subpage",
    :data {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd870,
    :created-at 1531741788197,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd870}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :route-changed,
   :payload
   {:route ":page/:subpage",
    :data {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd871,
    :created-at 1531741788197,
    :duration 0,
    :status :done,
    :origin-id :cmd870},
   :severity :info,
   :id :cmd871}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:user-actions :route-changed],
   :payload
   {:route ":page/:subpage",
    :data {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd872,
    :created-at 1531741788199,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd872}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :route-changed,
   :payload
   {:route ":page/:subpage",
    :data {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd873,
    :created-at 1531741788199,
    :duration 0,
    :status :done,
    :origin-id :cmd872},
   :severity :info,
   :id :cmd873}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:keechma.toolbox.forms.core/forms :route-changed],
   :payload
   {:route ":page/:subpage",
    :data {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd874,
    :created-at 1531741788199,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd874}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :route-changed,
   :payload
   {:route ":page/:subpage",
    :data {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd875,
    :created-at 1531741788199,
    :duration 0,
    :status :done,
    :origin-id :cmd874},
   :severity :info,
   :id :cmd875}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :in,
   :topic nil,
   :name :running-controllers,
   :payload
   {:initializer true,
    :user-actions true,
    :keechma.toolbox.forms.core/forms true,
    :redirect {:page "home", :subpage "personal"},
    :keechma.toolbox.dataloader.core/dataloader
    {:page "home", :subpage "personal"},
    :keechma.toolbox.forms.mount-controller/id
    {:page "home", :subpage "personal"}},
   :cmd-info
   {:id :cmd876,
    :created-at 1531741788199,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd876}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd877,
    :created-at 1531741788201,
    :duration 0,
    :status :done,
    :origin-id :cmd861},
   :severity :info,
   :id :cmd877}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd878,
    :created-at 1531741788201,
    :duration 0,
    :status :done,
    :origin-id :cmd862},
   :severity :info,
   :id :cmd878}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd879,
    :created-at 1531741788201,
    :duration 0,
    :status :done,
    :origin-id :cmd863},
   :severity :info,
   :id :cmd879}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd880,
    :created-at 1531741788201,
    :duration 0,
    :status :done,
    :origin-id :cmd864},
   :severity :info,
   :id :cmd880}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd881,
    :created-at 1531741788201,
    :duration 0,
    :status :done,
    :origin-id :cmd865},
   :severity :info,
   :id :cmd881}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :unmount-form,
   :payload [:login :form],
   :cmd-info
   {:id :cmd882,
    :created-at 1531741788201,
    :duration 0,
    :status :done,
    :origin-id :cmd869},
   :severity :info,
   :id :cmd882}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd885,
    :created-at 1531741788806,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd885}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd886,
    :created-at 1531741788806,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd886}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd887,
    :created-at 1531741788806,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd887}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd888,
    :created-at 1531741788806,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd888}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd889,
    :created-at 1531741788806,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd889}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd890,
    :created-at 1531741788807,
    :duration 0,
    :status :done,
    :origin-id :cmd885},
   :severity :info,
   :id :cmd890}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd891,
    :created-at 1531741788807,
    :duration 0,
    :status :done,
    :origin-id :cmd886},
   :severity :info,
   :id :cmd891}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd892,
    :created-at 1531741788807,
    :duration 0,
    :status :done,
    :origin-id :cmd887},
   :severity :info,
   :id :cmd892}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd893,
    :created-at 1531741788807,
    :duration 0,
    :status :done,
    :origin-id :cmd888},
   :severity :info,
   :id :cmd893}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd894,
    :created-at 1531741788807,
    :duration 0,
    :status :done,
    :origin-id :cmd889},
   :severity :info,
   :id :cmd894}}
 {:app {:name :application, :version :v1},
  :event
  {:type :router,
   :direction :out,
   :topic nil,
   :name :route-changed,
   :payload
   {:route ":page/:subpage/:detail",
    :data {:page "home", :subpage "tag", :detail "animation"}},
   :cmd-info
   {:id :cmd895,
    :created-at 1531741790631,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd895}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :stop]],
   :payload {:page "home", :subpage "tag", :detail "animation"},
   :cmd-info
   {:id :cmd896,
    :created-at 1531741790632,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd896}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :stop],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd897,
    :created-at 1531741790632,
    :duration 0,
    :status :done,
    :origin-id :cmd896},
   :severity :info,
   :id :cmd897}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :stop,
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd898,
    :created-at 1531741790633,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd898}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :stop]],
   :payload {:page "home", :subpage "tag", :detail "animation"},
   :cmd-info
   {:id :cmd899,
    :created-at 1531741790633,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd899}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :stop],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd900,
    :created-at 1531741790633,
    :duration 0,
    :status :done,
    :origin-id :cmd899},
   :severity :info,
   :id :cmd900}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :stop]],
   :payload {:page "home", :subpage "tag", :detail "animation"},
   :cmd-info
   {:id :cmd901,
    :created-at 1531741790633,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd901}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :stop],
   :payload {:page "home", :subpage "personal"},
   :cmd-info
   {:id :cmd902,
    :created-at 1531741790633,
    :duration 0,
    :status :done,
    :origin-id :cmd901},
   :severity :info,
   :id :cmd902}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :start]],
   :payload {:page "home", :subpage "tag", :detail "animation"},
   :cmd-info
   {:id :cmd903,
    :created-at 1531741790634,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd903}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :start],
   :payload {:page "home", :subpage "tag", :detail "animation"},
   :cmd-info
   {:id :cmd904,
    :created-at 1531741790634,
    :duration 0,
    :status :done,
    :origin-id :cmd903},
   :severity :info,
   :id :cmd904}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :start,
   :payload {:page "home", :subpage "tag", :detail "animation"},
   :cmd-info
   {:id :cmd905,
    :created-at 1531741790635,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd905}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :start]],
   :payload {:page "home", :subpage "tag", :detail "animation"},
   :cmd-info
   {:id :cmd906,
    :created-at 1531741790635,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd906}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :start],
   :payload {:page "home", :subpage "tag", :detail "animation"},
   :cmd-info
   {:id :cmd907,
    :created-at 1531741790635,
    :duration 0,
    :status :done,
    :origin-id :cmd906},
   :severity :info,
   :id :cmd907}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :start]],
   :payload {:page "home", :subpage "tag", :detail "animation"},
   :cmd-info
   {:id :cmd908,
    :created-at 1531741790636,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd908}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :start],
   :payload {:page "home", :subpage "tag", :detail "animation"},
   :cmd-info
   {:id :cmd909,
    :created-at 1531741790636,
    :duration 0,
    :status :done,
    :origin-id :cmd908},
   :severity :info,
   :id :cmd909}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd910,
    :created-at 1531741790637,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd910}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd911,
    :created-at 1531741790637,
    :duration 0,
    :status :done,
    :origin-id :cmd910},
   :severity :info,
   :id :cmd911}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd912,
    :created-at 1531741790637,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd912}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd913,
    :created-at 1531741790637,
    :duration 0,
    :status :done,
    :origin-id :cmd912},
   :severity :info,
   :id :cmd913}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd914,
    :created-at 1531741790637,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd914}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd915,
    :created-at 1531741790637,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd915}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd916,
    :created-at 1531741790637,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd916}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd917,
    :created-at 1531741790638,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd917}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd918,
    :created-at 1531741790639,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd918}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd920,
    :created-at 1531741790646,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd920}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd921,
    :created-at 1531741790646,
    :duration 0,
    :status :done,
    :origin-id :cmd920},
   :severity :info,
   :id :cmd921}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:initializer :route-changed],
   :payload
   {:route ":page/:subpage/:detail",
    :data {:page "home", :subpage "tag", :detail "animation"}},
   :cmd-info
   {:id :cmd922,
    :created-at 1531741790647,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd922}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :route-changed,
   :payload
   {:route ":page/:subpage/:detail",
    :data {:page "home", :subpage "tag", :detail "animation"}},
   :cmd-info
   {:id :cmd923,
    :created-at 1531741790647,
    :duration 0,
    :status :done,
    :origin-id :cmd922},
   :severity :info,
   :id :cmd923}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:user-actions :route-changed],
   :payload
   {:route ":page/:subpage/:detail",
    :data {:page "home", :subpage "tag", :detail "animation"}},
   :cmd-info
   {:id :cmd924,
    :created-at 1531741790648,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd924}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :route-changed,
   :payload
   {:route ":page/:subpage/:detail",
    :data {:page "home", :subpage "tag", :detail "animation"}},
   :cmd-info
   {:id :cmd925,
    :created-at 1531741790648,
    :duration 0,
    :status :done,
    :origin-id :cmd924},
   :severity :info,
   :id :cmd925}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:keechma.toolbox.forms.core/forms :route-changed],
   :payload
   {:route ":page/:subpage/:detail",
    :data {:page "home", :subpage "tag", :detail "animation"}},
   :cmd-info
   {:id :cmd926,
    :created-at 1531741790648,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd926}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :route-changed,
   :payload
   {:route ":page/:subpage/:detail",
    :data {:page "home", :subpage "tag", :detail "animation"}},
   :cmd-info
   {:id :cmd927,
    :created-at 1531741790648,
    :duration 0,
    :status :done,
    :origin-id :cmd926},
   :severity :info,
   :id :cmd927}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :in,
   :topic nil,
   :name :running-controllers,
   :payload
   {:initializer true,
    :user-actions true,
    :keechma.toolbox.forms.core/forms true,
    :redirect {:page "home", :subpage "tag", :detail "animation"},
    :keechma.toolbox.dataloader.core/dataloader
    {:page "home", :subpage "tag", :detail "animation"},
    :keechma.toolbox.forms.mount-controller/id
    {:page "home", :subpage "tag", :detail "animation"}},
   :cmd-info
   {:id :cmd928,
    :created-at 1531741790649,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd928}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd929,
    :created-at 1531741790650,
    :duration 0,
    :status :done,
    :origin-id :cmd914},
   :severity :info,
   :id :cmd929}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd930,
    :created-at 1531741790650,
    :duration 0,
    :status :done,
    :origin-id :cmd915},
   :severity :info,
   :id :cmd930}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd931,
    :created-at 1531741790650,
    :duration 0,
    :status :done,
    :origin-id :cmd916},
   :severity :info,
   :id :cmd931}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd932,
    :created-at 1531741790650,
    :duration 0,
    :status :done,
    :origin-id :cmd917},
   :severity :info,
   :id :cmd932}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd933,
    :created-at 1531741790650,
    :duration 0,
    :status :done,
    :origin-id :cmd918},
   :severity :info,
   :id :cmd933}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd936,
    :created-at 1531741792193,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd936}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd937,
    :created-at 1531741792193,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd937}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd938,
    :created-at 1531741792193,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd938}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd939,
    :created-at 1531741792193,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd939}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd940,
    :created-at 1531741792193,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd940}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd941,
    :created-at 1531741792194,
    :duration 0,
    :status :done,
    :origin-id :cmd936},
   :severity :info,
   :id :cmd941}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd942,
    :created-at 1531741792194,
    :duration 0,
    :status :done,
    :origin-id :cmd937},
   :severity :info,
   :id :cmd942}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd943,
    :created-at 1531741792194,
    :duration 0,
    :status :done,
    :origin-id :cmd938},
   :severity :info,
   :id :cmd943}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd944,
    :created-at 1531741792194,
    :duration 0,
    :status :done,
    :origin-id :cmd939},
   :severity :info,
   :id :cmd944}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd945,
    :created-at 1531741792195,
    :duration 0,
    :status :done,
    :origin-id :cmd940},
   :severity :info,
   :id :cmd945}}
 {:app {:name :application, :version :v1},
  :event
  {:type :router,
   :direction :out,
   :topic nil,
   :name :route-changed,
   :payload {:route ":page", :data {:page "settings"}},
   :cmd-info
   {:id :cmd946,
    :created-at 1531741792977,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd946}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :stop]],
   :payload {:page "settings"},
   :cmd-info
   {:id :cmd947,
    :created-at 1531741792978,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd947}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :stop],
   :payload {:page "home", :subpage "tag", :detail "animation"},
   :cmd-info
   {:id :cmd948,
    :created-at 1531741792978,
    :duration 0,
    :status :done,
    :origin-id :cmd947},
   :severity :info,
   :id :cmd948}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :stop,
   :payload {:page "home", :subpage "tag", :detail "animation"},
   :cmd-info
   {:id :cmd949,
    :created-at 1531741792978,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd949}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :stop]],
   :payload {:page "settings"},
   :cmd-info
   {:id :cmd950,
    :created-at 1531741792978,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd950}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :stop],
   :payload {:page "home", :subpage "tag", :detail "animation"},
   :cmd-info
   {:id :cmd951,
    :created-at 1531741792978,
    :duration 0,
    :status :done,
    :origin-id :cmd950},
   :severity :info,
   :id :cmd951}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :stop]],
   :payload {:page "settings"},
   :cmd-info
   {:id :cmd952,
    :created-at 1531741792978,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd952}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :stop],
   :payload {:page "home", :subpage "tag", :detail "animation"},
   :cmd-info
   {:id :cmd953,
    :created-at 1531741792978,
    :duration 0,
    :status :done,
    :origin-id :cmd952},
   :severity :info,
   :id :cmd953}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :start]],
   :payload {:page "settings"},
   :cmd-info
   {:id :cmd954,
    :created-at 1531741792979,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd954}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :start],
   :payload {:page "settings"},
   :cmd-info
   {:id :cmd955,
    :created-at 1531741792979,
    :duration 0,
    :status :done,
    :origin-id :cmd954},
   :severity :info,
   :id :cmd955}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :start,
   :payload {:page "settings"},
   :cmd-info
   {:id :cmd956,
    :created-at 1531741792979,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd956}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :start]],
   :payload {:page "settings"},
   :cmd-info
   {:id :cmd957,
    :created-at 1531741792979,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd957}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :start],
   :payload {:page "settings"},
   :cmd-info
   {:id :cmd958,
    :created-at 1531741792979,
    :duration 0,
    :status :done,
    :origin-id :cmd957},
   :severity :info,
   :id :cmd958}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :start]],
   :payload {:page "settings"},
   :cmd-info
   {:id :cmd959,
    :created-at 1531741792979,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd959}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :start],
   :payload {:page "settings"},
   :cmd-info
   {:id :cmd960,
    :created-at 1531741792979,
    :duration 0,
    :status :done,
    :origin-id :cmd959},
   :severity :info,
   :id :cmd960}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd961,
    :created-at 1531741792980,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd961}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd962,
    :created-at 1531741792980,
    :duration 0,
    :status :done,
    :origin-id :cmd961},
   :severity :info,
   :id :cmd962}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd963,
    :created-at 1531741792980,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd963}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd964,
    :created-at 1531741792980,
    :duration 0,
    :status :done,
    :origin-id :cmd963},
   :severity :info,
   :id :cmd964}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd965,
    :created-at 1531741792980,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd965}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd966,
    :created-at 1531741792981,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd966}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd967,
    :created-at 1531741792981,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd967}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd968,
    :created-at 1531741792981,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd968}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd969,
    :created-at 1531741792981,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd969}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd971,
    :created-at 1531741792985,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd971}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd972,
    :created-at 1531741792985,
    :duration 0,
    :status :done,
    :origin-id :cmd971},
   :severity :info,
   :id :cmd972}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma.toolbox.forms.core/forms :mount-form],
   :payload [:settings :form],
   :cmd-info
   {:id :cmd973,
    :created-at 1531741792986,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd973}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:initializer :route-changed],
   :payload {:route ":page", :data {:page "settings"}},
   :cmd-info
   {:id :cmd974,
    :created-at 1531741792986,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd974}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :route-changed,
   :payload {:route ":page", :data {:page "settings"}},
   :cmd-info
   {:id :cmd975,
    :created-at 1531741792986,
    :duration 0,
    :status :done,
    :origin-id :cmd974},
   :severity :info,
   :id :cmd975}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:user-actions :route-changed],
   :payload {:route ":page", :data {:page "settings"}},
   :cmd-info
   {:id :cmd976,
    :created-at 1531741792986,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd976}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :route-changed,
   :payload {:route ":page", :data {:page "settings"}},
   :cmd-info
   {:id :cmd977,
    :created-at 1531741792986,
    :duration 0,
    :status :done,
    :origin-id :cmd976},
   :severity :info,
   :id :cmd977}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:keechma.toolbox.forms.core/forms :route-changed],
   :payload {:route ":page", :data {:page "settings"}},
   :cmd-info
   {:id :cmd978,
    :created-at 1531741792986,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd978}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :route-changed,
   :payload {:route ":page", :data {:page "settings"}},
   :cmd-info
   {:id :cmd979,
    :created-at 1531741792986,
    :duration 0,
    :status :done,
    :origin-id :cmd978},
   :severity :info,
   :id :cmd979}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :in,
   :topic nil,
   :name :running-controllers,
   :payload
   {:initializer true,
    :user-actions true,
    :keechma.toolbox.forms.core/forms true,
    :redirect {:page "settings"},
    :keechma.toolbox.dataloader.core/dataloader {:page "settings"},
    :keechma.toolbox.forms.mount-controller/id {:page "settings"}},
   :cmd-info
   {:id :cmd980,
    :created-at 1531741792986,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd980}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd981,
    :created-at 1531741792987,
    :duration 0,
    :status :done,
    :origin-id :cmd965},
   :severity :info,
   :id :cmd981}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd982,
    :created-at 1531741792987,
    :duration 0,
    :status :done,
    :origin-id :cmd966},
   :severity :info,
   :id :cmd982}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd983,
    :created-at 1531741792987,
    :duration 0,
    :status :done,
    :origin-id :cmd967},
   :severity :info,
   :id :cmd983}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd984,
    :created-at 1531741792987,
    :duration 0,
    :status :done,
    :origin-id :cmd968},
   :severity :info,
   :id :cmd984}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd985,
    :created-at 1531741792987,
    :duration 0,
    :status :done,
    :origin-id :cmd969},
   :severity :info,
   :id :cmd985}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :mount-form,
   :payload [:settings :form],
   :cmd-info
   {:id :cmd986,
    :created-at 1531741792987,
    :duration 0,
    :status :done,
    :origin-id :cmd973},
   :severity :info,
   :id :cmd986}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd991,
    :created-at 1531741792990,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd991}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd992,
    :created-at 1531741792990,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd992}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd993,
    :created-at 1531741792990,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd993}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd994,
    :created-at 1531741792991,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd994}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd995,
    :created-at 1531741792991,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd995}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd996,
    :created-at 1531741792991,
    :duration 0,
    :status :done,
    :origin-id :cmd991},
   :severity :info,
   :id :cmd996}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd997,
    :created-at 1531741792991,
    :duration 0,
    :status :done,
    :origin-id :cmd992},
   :severity :info,
   :id :cmd997}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd998,
    :created-at 1531741792991,
    :duration 0,
    :status :done,
    :origin-id :cmd993},
   :severity :info,
   :id :cmd998}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd999,
    :created-at 1531741792991,
    :duration 0,
    :status :done,
    :origin-id :cmd994},
   :severity :info,
   :id :cmd999}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd1000,
    :created-at 1531741792991,
    :duration 0,
    :status :done,
    :origin-id :cmd995},
   :severity :info,
   :id :cmd1000}}
 {:app {:name :application, :version :v1},
  :event
  {:type :router,
   :direction :out,
   :topic nil,
   :name :route-changed,
   :payload {:route ":page", :data {:page "logout"}},
   :cmd-info
   {:id :cmd1006,
    :created-at 1531741793944,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1006}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :stop]],
   :payload {:page "logout"},
   :cmd-info
   {:id :cmd1007,
    :created-at 1531741793945,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1007}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :stop],
   :payload {:page "settings"},
   :cmd-info
   {:id :cmd1008,
    :created-at 1531741793945,
    :duration 0,
    :status :done,
    :origin-id :cmd1007},
   :severity :info,
   :id :cmd1008}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :stop,
   :payload {:page "settings"},
   :cmd-info
   {:id :cmd1009,
    :created-at 1531741793945,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1009}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :stop]],
   :payload {:page "logout"},
   :cmd-info
   {:id :cmd1010,
    :created-at 1531741793945,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1010}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :stop],
   :payload {:page "settings"},
   :cmd-info
   {:id :cmd1011,
    :created-at 1531741793945,
    :duration 0,
    :status :done,
    :origin-id :cmd1010},
   :severity :info,
   :id :cmd1011}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :stop]],
   :payload {:page "logout"},
   :cmd-info
   {:id :cmd1012,
    :created-at 1531741793945,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1012}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :stop],
   :payload {:page "settings"},
   :cmd-info
   {:id :cmd1013,
    :created-at 1531741793945,
    :duration 0,
    :status :done,
    :origin-id :cmd1012},
   :severity :info,
   :id :cmd1013}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :start]],
   :payload {:page "logout"},
   :cmd-info
   {:id :cmd1014,
    :created-at 1531741793945,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1014}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :start],
   :payload {:page "logout"},
   :cmd-info
   {:id :cmd1015,
    :created-at 1531741793945,
    :duration 0,
    :status :done,
    :origin-id :cmd1014},
   :severity :info,
   :id :cmd1015}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :start,
   :payload {:page "logout"},
   :cmd-info
   {:id :cmd1016,
    :created-at 1531741793946,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1016}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:logout [:keechma/lifecycle :start]],
   :payload true,
   :cmd-info
   {:id :cmd1017,
    :created-at 1531741793946,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1017}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :logout,
   :name [:keechma/lifecycle :start],
   :payload true,
   :cmd-info
   {:id :cmd1018,
    :created-at 1531741793946,
    :duration 0,
    :status :done,
    :origin-id :cmd1017},
   :severity :info,
   :id :cmd1018}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :logout,
   :name :start,
   :payload true,
   :cmd-info
   {:id :cmd1019,
    :created-at 1531741793946,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1019}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :start]],
   :payload {:page "logout"},
   :cmd-info
   {:id :cmd1020,
    :created-at 1531741793946,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1020}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :start],
   :payload {:page "logout"},
   :cmd-info
   {:id :cmd1021,
    :created-at 1531741793946,
    :duration 0,
    :status :done,
    :origin-id :cmd1020},
   :severity :info,
   :id :cmd1021}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :start]],
   :payload {:page "logout"},
   :cmd-info
   {:id :cmd1022,
    :created-at 1531741793946,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1022}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :start],
   :payload {:page "logout"},
   :cmd-info
   {:id :cmd1023,
    :created-at 1531741793946,
    :duration 0,
    :status :done,
    :origin-id :cmd1022},
   :severity :info,
   :id :cmd1023}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd1024,
    :created-at 1531741793946,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1024}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd1025,
    :created-at 1531741793946,
    :duration 0,
    :status :done,
    :origin-id :cmd1024},
   :severity :info,
   :id :cmd1025}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:logout [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd1026,
    :created-at 1531741793946,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1026}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :logout,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd1027,
    :created-at 1531741793946,
    :duration 0,
    :status :done,
    :origin-id :cmd1026},
   :severity :info,
   :id :cmd1027}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd1028,
    :created-at 1531741793948,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1028}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd1029,
    :created-at 1531741793948,
    :duration 0,
    :status :done,
    :origin-id :cmd1028},
   :severity :info,
   :id :cmd1029}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd1030,
    :created-at 1531741793948,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1030}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd1031,
    :created-at 1531741793948,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1031}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd1032,
    :created-at 1531741793948,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1032}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd1033,
    :created-at 1531741793949,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1033}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:logout :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd1034,
    :created-at 1531741793949,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1034}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd1035,
    :created-at 1531741793949,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1035}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd1037,
    :created-at 1531741793949,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1037}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd1038,
    :created-at 1531741793949,
    :duration 0,
    :status :done,
    :origin-id :cmd1037},
   :severity :info,
   :id :cmd1038}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma.toolbox.forms.core/forms :unmount-form],
   :payload [:settings :form],
   :cmd-info
   {:id :cmd1039,
    :created-at 1531741793950,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1039}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:initializer :route-changed],
   :payload {:route ":page", :data {:page "logout"}},
   :cmd-info
   {:id :cmd1040,
    :created-at 1531741793950,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1040}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :route-changed,
   :payload {:route ":page", :data {:page "logout"}},
   :cmd-info
   {:id :cmd1041,
    :created-at 1531741793950,
    :duration 0,
    :status :done,
    :origin-id :cmd1040},
   :severity :info,
   :id :cmd1041}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:user-actions :route-changed],
   :payload {:route ":page", :data {:page "logout"}},
   :cmd-info
   {:id :cmd1042,
    :created-at 1531741793951,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1042}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :route-changed,
   :payload {:route ":page", :data {:page "logout"}},
   :cmd-info
   {:id :cmd1043,
    :created-at 1531741793951,
    :duration 0,
    :status :done,
    :origin-id :cmd1042},
   :severity :info,
   :id :cmd1043}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:keechma.toolbox.forms.core/forms :route-changed],
   :payload {:route ":page", :data {:page "logout"}},
   :cmd-info
   {:id :cmd1044,
    :created-at 1531741793951,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1044}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :route-changed,
   :payload {:route ":page", :data {:page "logout"}},
   :cmd-info
   {:id :cmd1045,
    :created-at 1531741793951,
    :duration 0,
    :status :done,
    :origin-id :cmd1044},
   :severity :info,
   :id :cmd1045}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :in,
   :topic nil,
   :name :running-controllers,
   :payload
   {:initializer true,
    :user-actions true,
    :keechma.toolbox.forms.core/forms true,
    :redirect {:page "logout"},
    :logout true,
    :keechma.toolbox.dataloader.core/dataloader {:page "logout"},
    :keechma.toolbox.forms.mount-controller/id {:page "logout"}},
   :cmd-info
   {:id :cmd1046,
    :created-at 1531741793953,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1046}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd1047,
    :created-at 1531741793954,
    :duration 0,
    :status :done,
    :origin-id :cmd1030},
   :severity :info,
   :id :cmd1047}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd1048,
    :created-at 1531741793954,
    :duration 0,
    :status :done,
    :origin-id :cmd1031},
   :severity :info,
   :id :cmd1048}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd1049,
    :created-at 1531741793954,
    :duration 0,
    :status :done,
    :origin-id :cmd1032},
   :severity :info,
   :id :cmd1049}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd1050,
    :created-at 1531741793955,
    :duration 0,
    :status :done,
    :origin-id :cmd1033},
   :severity :info,
   :id :cmd1050}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :logout,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd1051,
    :created-at 1531741793955,
    :duration 0,
    :status :done,
    :origin-id :cmd1034},
   :severity :info,
   :id :cmd1051}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd1052,
    :created-at 1531741793955,
    :duration 0,
    :status :done,
    :origin-id :cmd1035},
   :severity :info,
   :id :cmd1052}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :unmount-form,
   :payload [:settings :form],
   :cmd-info
   {:id :cmd1053,
    :created-at 1531741793955,
    :duration 0,
    :status :done,
    :origin-id :cmd1039},
   :severity :info,
   :id :cmd1053}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd1056,
    :created-at 1531741793958,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1056}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd1057,
    :created-at 1531741793958,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1057}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd1058,
    :created-at 1531741793958,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1058}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd1059,
    :created-at 1531741793958,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1059}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:logout :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd1060,
    :created-at 1531741793958,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1060}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :loaded,
   :cmd-info
   {:id :cmd1061,
    :created-at 1531741793958,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1061}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd1062,
    :created-at 1531741793959,
    :duration 0,
    :status :done,
    :origin-id :cmd1056},
   :severity :info,
   :id :cmd1062}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd1063,
    :created-at 1531741793960,
    :duration 0,
    :status :done,
    :origin-id :cmd1057},
   :severity :info,
   :id :cmd1063}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd1064,
    :created-at 1531741793960,
    :duration 0,
    :status :done,
    :origin-id :cmd1058},
   :severity :info,
   :id :cmd1064}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd1065,
    :created-at 1531741793960,
    :duration 0,
    :status :done,
    :origin-id :cmd1059},
   :severity :info,
   :id :cmd1065}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :logout,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd1066,
    :created-at 1531741793960,
    :duration 0,
    :status :done,
    :origin-id :cmd1060},
   :severity :info,
   :id :cmd1066}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :loaded,
   :cmd-info
   {:id :cmd1067,
    :created-at 1531741793960,
    :duration 0,
    :status :done,
    :origin-id :cmd1061},
   :severity :info,
   :id :cmd1067}}
 {:app {:name :application, :version :v1},
  :event
  {:type :router,
   :direction :out,
   :topic nil,
   :name :route-changed,
   :payload {:route ":page", :data {:page "home"}},
   :cmd-info
   {:id :cmd1068,
    :created-at 1531741793962,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1068}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :stop]],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd1069,
    :created-at 1531741793963,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1069}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :stop],
   :payload {:page "logout"},
   :cmd-info
   {:id :cmd1070,
    :created-at 1531741793963,
    :duration 0,
    :status :done,
    :origin-id :cmd1069},
   :severity :info,
   :id :cmd1070}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :stop,
   :payload {:page "logout"},
   :cmd-info
   {:id :cmd1071,
    :created-at 1531741793963,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1071}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:logout [:keechma/lifecycle :stop]],
   :payload nil,
   :cmd-info
   {:id :cmd1072,
    :created-at 1531741793963,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1072}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :logout,
   :name [:keechma/lifecycle :stop],
   :payload true,
   :cmd-info
   {:id :cmd1073,
    :created-at 1531741793963,
    :duration 0,
    :status :done,
    :origin-id :cmd1072},
   :severity :info,
   :id :cmd1073}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :logout,
   :name :stop,
   :payload true,
   :cmd-info
   {:id :cmd1074,
    :created-at 1531741793963,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1074}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :stop]],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd1075,
    :created-at 1531741793963,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1075}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :stop],
   :payload {:page "logout"},
   :cmd-info
   {:id :cmd1076,
    :created-at 1531741793963,
    :duration 0,
    :status :done,
    :origin-id :cmd1075},
   :severity :info,
   :id :cmd1076}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :stop]],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd1077,
    :created-at 1531741793963,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1077}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :stop],
   :payload {:page "logout"},
   :cmd-info
   {:id :cmd1078,
    :created-at 1531741793963,
    :duration 0,
    :status :done,
    :origin-id :cmd1077},
   :severity :info,
   :id :cmd1078}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :start]],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd1079,
    :created-at 1531741793964,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1079}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :start],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd1080,
    :created-at 1531741793964,
    :duration 0,
    :status :done,
    :origin-id :cmd1079},
   :severity :info,
   :id :cmd1080}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :start,
   :payload {:page "home"},
   :cmd-info
   {:id :cmd1081,
    :created-at 1531741793965,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1081}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :start]],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd1082,
    :created-at 1531741793965,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1082}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :start],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd1083,
    :created-at 1531741793965,
    :duration 0,
    :status :done,
    :origin-id :cmd1082},
   :severity :info,
   :id :cmd1083}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :start]],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd1084,
    :created-at 1531741793965,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1084}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :start],
   :payload {:page "home"},
   :cmd-info
   {:id :cmd1085,
    :created-at 1531741793965,
    :duration 0,
    :status :done,
    :origin-id :cmd1084},
   :severity :info,
   :id :cmd1085}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:redirect [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd1086,
    :created-at 1531741793965,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1086}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd1087,
    :created-at 1531741793965,
    :duration 0,
    :status :done,
    :origin-id :cmd1086},
   :severity :info,
   :id :cmd1087}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.dataloader.core/dataloader
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd1088,
    :created-at 1531741793965,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1088}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd1089,
    :created-at 1531741793965,
    :duration 0,
    :status :done,
    :origin-id :cmd1088},
   :severity :info,
   :id :cmd1089}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:initializer :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd1090,
    :created-at 1531741793965,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1090}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:user-actions
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd1091,
    :created-at 1531741793965,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1091}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.core/forms
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd1092,
    :created-at 1531741793966,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1092}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:redirect :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd1093,
    :created-at 1531741793966,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1093}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :out,
   :topic :keechma.toolbox.dataloader.core/dataloader,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    :keechma.toolbox.dataloader.controller/status-change],
   :payload :pending,
   :cmd-info
   {:id :cmd1094,
    :created-at 1531741793966,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1094}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name
   [:keechma.toolbox.forms.mount-controller/id
    [:keechma/lifecycle :handler]],
   :payload nil,
   :cmd-info
   {:id :cmd1096,
    :created-at 1531741793972,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1096}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name [:keechma/lifecycle :handler],
   :payload nil,
   :cmd-info
   {:id :cmd1097,
    :created-at 1531741793972,
    :duration 0,
    :status :done,
    :origin-id :cmd1096},
   :severity :info,
   :id :cmd1097}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:initializer :route-changed],
   :payload {:route ":page", :data {:page "home"}},
   :cmd-info
   {:id :cmd1098,
    :created-at 1531741793972,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1098}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :route-changed,
   :payload {:route ":page", :data {:page "home"}},
   :cmd-info
   {:id :cmd1099,
    :created-at 1531741793972,
    :duration 0,
    :status :done,
    :origin-id :cmd1098},
   :severity :info,
   :id :cmd1099}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:user-actions :route-changed],
   :payload {:route ":page", :data {:page "home"}},
   :cmd-info
   {:id :cmd1100,
    :created-at 1531741793972,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1100}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :route-changed,
   :payload {:route ":page", :data {:page "home"}},
   :cmd-info
   {:id :cmd1101,
    :created-at 1531741793972,
    :duration 0,
    :status :done,
    :origin-id :cmd1100},
   :severity :info,
   :id :cmd1101}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :out,
   :topic :controller,
   :name [:keechma.toolbox.forms.core/forms :route-changed],
   :payload {:route ":page", :data {:page "home"}},
   :cmd-info
   {:id :cmd1102,
    :created-at 1531741793973,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1102}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :route-changed,
   :payload {:route ":page", :data {:page "home"}},
   :cmd-info
   {:id :cmd1103,
    :created-at 1531741793973,
    :duration 0,
    :status :done,
    :origin-id :cmd1102},
   :severity :info,
   :id :cmd1103}}
 {:app {:name :application, :version :v1},
  :event
  {:type :app,
   :direction :in,
   :topic nil,
   :name :running-controllers,
   :payload
   {:initializer true,
    :user-actions true,
    :keechma.toolbox.forms.core/forms true,
    :redirect {:page "home"},
    :keechma.toolbox.dataloader.core/dataloader {:page "home"},
    :keechma.toolbox.forms.mount-controller/id {:page "home"}},
   :cmd-info
   {:id :cmd1104,
    :created-at 1531741793974,
    :duration 0,
    :status :done},
   :severity :info,
   :id :cmd1104}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :initializer,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd1105,
    :created-at 1531741793975,
    :duration 0,
    :status :done,
    :origin-id :cmd1090},
   :severity :info,
   :id :cmd1105}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :user-actions,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd1106,
    :created-at 1531741793975,
    :duration 0,
    :status :done,
    :origin-id :cmd1091},
   :severity :info,
   :id :cmd1106}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.core/forms,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd1107,
    :created-at 1531741793975,
    :duration 0,
    :status :done,
    :origin-id :cmd1092},
   :severity :info,
   :id :cmd1107}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :redirect,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd1108,
    :created-at 1531741793975,
    :duration 0,
    :status :done,
    :origin-id :cmd1093},
   :severity :info,
   :id :cmd1108}}
 {:app {:name :application, :version :v1},
  :event
  {:type :controller,
   :direction :in,
   :topic :keechma.toolbox.forms.mount-controller/id,
   :name :keechma.toolbox.dataloader.controller/status-change,
   :payload :pending,
   :cmd-info
   {:id :cmd1109,
    :created-at 1531741793976,
    :duration 0,
    :status :done,
    :origin-id :cmd1094}, 
   :severity :info, 
   :id :cmd1109}}])