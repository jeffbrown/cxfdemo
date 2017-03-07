package demo

class DemoController {

    SomeClient someClient

    def index() {
        def result = someClient.someMethod('foo')

        render "Result: $result"
    }
}
