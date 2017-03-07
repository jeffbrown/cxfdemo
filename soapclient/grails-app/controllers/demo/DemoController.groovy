package demo

class DemoController {

    SomeService someClient

    def index() {
        def result = someClient.someMethod('foo')

        render "Result: $result"
    }
}
