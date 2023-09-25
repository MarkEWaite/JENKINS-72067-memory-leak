// A hello world declarative Pipeline
def call() {
    pipeline {
	agent none
	stages {
	    stage('Greet') {
		steps {
		    echo 'Hello world'
		}
	    }
	}
    }
}
