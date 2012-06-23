modules = {
  application {
    resource url:'js/application.js'
  }
  'nb.js' {
    dependsOn 'nbos.jquery, nbos.jqueryui'
  }

  'nbos.jquery' {
    resource url:'js/jquery-1.7.2.min.js', disposition: 'head'
  }
  'nbos.jqueryui' {
    resource url:'js/jquery-ui-1.8.21.custom.min.js', disposition: 'head'
  }
  'nbos.brand.sunny' {
    resource url:'/css/sunny/jquery-ui-1.8.21.custom.css'
  }
  'nbos.brand.pepper' {
    resource url:'/css/pepper-grinder/jquery-ui-1.8.21.custom.css'
  }
}
