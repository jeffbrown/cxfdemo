package demo

class DemoController {

    def someClient

    def index() {
        def result = someClient.someMethod('foo')

        render "Result: $result"
    }
}
