/**
 * Created by windel on 2/24/17.
 */


// use groovy.util.XmlSlurper

println "W)00T" // args[0]


def beers = new XmlSlurper().parse('../../beer.stackexchange.com/Users.xml')

def a = 0
for (beer in beers.children()) {
    println "-----------"
    println beer.@DisplayName
    println beer.@AboutMe // toString()
    a += 1
}

println "Processed ${a} beers!"
//beers.findAll {  node ->
//    println node
//}

println beers