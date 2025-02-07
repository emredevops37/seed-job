job('simple-freestyle-job') {
    description('This is a simple Freestyle Job created using Job DSL plugin.')
    keepDependencies(false)
    
    steps {
        shell('echo "Hello, Jenkins! This is a freestyle job created using DSL."')
    }
    
    publishers {
        archiveArtifacts('**/target/*.jar') // Eğer bir çıktı dosyasını saklamak istiyorsanız
    }
    
    triggers {
        scm('* * * * *') // Kaynak kod değişikliklerini her 5 dakikada kontrol eder
    }
}
