def get(String resource, type) {
    type = type[0] as String
    def hcl = new Object()
    hcl.metaClass.methodMissing { String name, args ->
        Closure body = args[0]
        println "${resource}.${type}.${name}"
        println body
    }
    return hcl
}
