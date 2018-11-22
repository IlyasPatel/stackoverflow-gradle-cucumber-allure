    buildscript {
        repositories {
            mavenLocal()
            mavenCentral()
            jcenter()
        }
        dependencies {
            classpath "io.qameta.allure:allure-gradle:2.5"
        }
    }

    apply plugin: 'java'
    apply plugin: 'io.qameta.allure'

    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
    }

    allure {
        autoconfigure = true
        version = '2.4.1'
    }

    dependencies {
        compile 'io.cucumber:cucumber-java:3.0.2'
        compile 'io.cucumber:cucumber-junit:3.0.2'
        compile 'io.qameta.allure:allure-cucumber3-jvm:2.7.0'
    }


    com.github.letsrokk.steps.CucumberTest > Test mechanism.classMethod STARTED

    com.github.letsrokk.steps.CucumberTest > Test mechanism.classMethod FAILED
       java.lang.NullPointerException
           at io.qameta.allure.junit4.AllureJunit4.createTestResult(AllureJunit4.java:258)
           at io.qameta.allure.junit4.AllureJunit4.testStarted(AllureJunit4.java:83)
           at org.junit.runner.notification.RunNotifier$3.notifyListener(RunNotifier.java:121)
           at org.junit.runner.notification.RunNotifier$SafeNotifier.run(RunNotifier.java:72)
           at org.junit.runner.notification.RunNotifier.fireTestStarted(RunNotifier.java:118)
           at cucumber.runtime.junit.JUnitReporter$EachTestNotifier.fireTestStarted(JUnitReporter.java:257)
           at cucumber.runtime.junit.JUnitReporter.handleTestCaseStarted(JUnitReporter.java:88)
           at cucumber.runtime.junit.JUnitReporter$1.receive(JUnitReporter.java:33)
           at cucumber.runtime.junit.JUnitReporter$1.receive(JUnitReporter.java:29)
           at cucumber.runner.EventBus.send(EventBus.java:28)
           at cucumber.runner.TestCase.run(TestCase.java:37)
           at cucumber.runner.Runner.runPickle(Runner.java:44)
           at cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)
           at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)
           at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)
           at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
           at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
           at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
           at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
           at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
           at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
           at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)
           at cucumber.api.junit.Cucumber.runChild(Cucumber.java:98)
           at cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)
           at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
           at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
           at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
           at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
           at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
           at cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:107)
           at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
           at org.gradle.api.internal.tasks.testing.junit.JUnitTestClassExecutor.runTestClass(JUnitTestClassExecutor.java:106)
           at org.gradle.api.internal.tasks.testing.junit.JUnitTestClassExecutor.execute(JUnitTestClassExecutor.java:58)
           at org.gradle.api.internal.tasks.testing.junit.JUnitTestClassExecutor.execute(JUnitTestClassExecutor.java:38)
           at org.gradle.api.internal.tasks.testing.junit.AbstractJUnitTestClassProcessor.processTestClass(AbstractJUnitTestClassProcessor.java:66)
           at org.gradle.api.internal.tasks.testing.SuiteTestClassProcessor.processTestClass(SuiteTestClassProcessor.java:51)
           at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
           at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
           at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
           at java.lang.reflect.Method.invoke(Method.java:498)
           at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:35)
           at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)
           at org.gradle.internal.dispatch.ContextClassLoaderDispatch.dispatch(ContextClassLoaderDispatch.java:32)
           at org.gradle.internal.dispatch.ProxyDispatchAdapter$DispatchingInvocationHandler.invoke(ProxyDispatchAdapter.java:93)
           at com.sun.proxy.$Proxy2.processTestClass(Unknown Source)
           at org.gradle.api.internal.tasks.testing.worker.TestWorker.processTestClass(TestWorker.java:117)
           at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
           at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
           at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
           at java.lang.reflect.Method.invoke(Method.java:498)
           at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:35)
           at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)
           at org.gradle.internal.remote.internal.hub.MessageHubBackedObjectConnection$DispatchWrapper.dispatch(MessageHubBackedObjectConnection.java:155)
           at org.gradle.internal.remote.internal.hub.MessageHubBackedObjectConnection$DispatchWrapper.dispatch(MessageHubBackedObjectConnection.java:137)
           at org.gradle.internal.remote.internal.hub.MessageHub$Handler.run(MessageHub.java:404)
           at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:63)
           at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:46)
           at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
           at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
           at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:55)
           at java.lang.Thread.run(Thread.java:748)
