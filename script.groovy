def buildApp() {
    echo "building the application ${params.QT_VERSION} ..."
}

def testApp() {
    echo "testing the application ${params.QT_VERSION} ..."
}

def deployApp() {
    echo "deploying the application ${params.QT_VERSION} ..."
}

return this

