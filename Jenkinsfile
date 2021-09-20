def gv

pipeline {
    agent any
    parameters {
        choice(name: 'OPENSSL_VERSION', choices: ['latest', '1.1.1l'], description: '')
        choice(name: 'QT_VERSION', choices: ['5.15.6', '5.15.2'], description: '')
    }
    stages {

        stage("init") {
            steps {
                script {
		    gv = load "script.groovy"
		}
            }
        }

        stage("build") {
            steps {
		script {
		    gv.buildApp()
		}
            }
        }

        stage("test") {
            steps {
		script {
		    gv.testApp()
		}
            }
        }

        stage("deploy") {
            steps {
		script {
		    gv.deployApp()
		}
            }
        }

    }
}

