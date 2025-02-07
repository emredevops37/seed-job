job('simple-freestyle-job') {
    description('This is a simple Freestyle Job created using Job DSL plugin.')
    keepDependencies(false)
    
    steps {
        // "Hello, Jenkins!" mesajını ekrana yazdırır
        shell('echo "Hello, Jenkins! This is a freestyle job created using DSL."')
        
        // test.txt dosyasını oluşturur
        shell('echo "This is a test file" > test.txt')

        shell('echo "en son burayı ekledim."')
    }
    
    triggers {
        // Kaynak kod değişikliklerini her 5 dakikada kontrol eder
        scm('* * * * *')
    }

    // Node seçimini agent (any) gibi düşünebilmek için kullanılabilir
    label('any')
}
