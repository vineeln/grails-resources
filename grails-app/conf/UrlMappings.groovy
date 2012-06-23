class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

                "/rindex"(view:"/rindex")
		"/"(view:"/index")
		"500"(view:'/error')
	}
}
