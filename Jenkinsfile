pipeline {
    agent any
    stages {
        parameters {
	    choice(name: 'OPENSSL_VERSION', choices: ['latest', '1.1.1l'], description: '')
	    choice(name: 'QT_VERSION', choices: ['5.15.6', '5.15.2'], defaultValue: '5.15.6', description: '')
	}
        stage("build") {
	    steps {
	        echo 'building the application ${params.QT_VERSION}...'
	    }
	}

        stage("test") {
	    steps {
	        echo 'testing the application...'
	    }
	}

        stage("deploy") {
	    steps {
	        echo 'dpeloying the application...'
	    }
	}

    }
}

