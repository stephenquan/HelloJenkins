pipeline {
    agent any
    parameters {
        choice(name: 'OPENSSL_VERSION', choices: ['latest', '1.1.1l'], description: '')
        choice(name: 'QT_VERSION', choices: ['5.15.6', '5.15.2'], description: '')
    }
    stages {

        stage("build") {
            steps {
                echo "Build Step for ${params.QT_VERSION}"
                sh "#!/bin/bash \n" +
                "echo \"Hello from \$SHELL\""
                # sh "hostname"
                # sh "uptime"
                # sh "pwd"
            }
        }

        stage("test") {
            steps {
                echo "Testing step for ${params.QT_VERSION}"
                # bat "dir"
            }
        }

        stage("deploy") {
            steps {
                echo "Deployinment step for ${params.QT_VERSION}"
                # sh "adb"
            }
        }

    }
}

