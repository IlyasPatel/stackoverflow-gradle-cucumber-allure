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


    16:41:46.540 [DEBUG] [TestEventLogger] com.github.letsrokk.steps.CucumberTest > Test mechanism.classMethod STARTED
    16:41:46.541 [DEBUG] [TestEventLogger]
    16:41:46.541 [DEBUG] [TestEventLogger] com.github.letsrokk.steps.CucumberTest > Test mechanism.classMethod FAILED
    16:41:46.541 [DEBUG] [TestEventLogger]     java.lang.NullPointerException
    16:41:46.541 [DEBUG] [TestEventLogger]         at io.qameta.allure.junit4.AllureJunit4.createTestResult(AllureJunit4.java:258)
    16:41:46.542 [DEBUG] [TestEventLogger]         at io.qameta.allure.junit4.AllureJunit4.testStarted(AllureJunit4.java:83)
    16:41:46.542 [DEBUG] [TestEventLogger]         at org.junit.runner.notification.RunNotifier$3.notifyListener(RunNotifier.java:121)
    16:41:46.542 [DEBUG] [TestEventLogger]         at org.junit.runner.notification.RunNotifier$SafeNotifier.run(RunNotifier.java:72)
    16:41:46.542 [DEBUG] [TestEventLogger]         at org.junit.runner.notification.RunNotifier.fireTestStarted(RunNotifier.java:118)
    16:41:46.542 [DEBUG] [TestEventLogger]         at cucumber.runtime.junit.JUnitReporter$EachTestNotifier.fireTestStarted(JUnitReporter.java:257)
    16:41:46.542 [DEBUG] [TestEventLogger]         at cucumber.runtime.junit.JUnitReporter.handleTestCaseStarted(JUnitReporter.java:88)
    16:41:46.542 [DEBUG] [TestEventLogger]         at cucumber.runtime.junit.JUnitReporter$1.receive(JUnitReporter.java:33)
    16:41:46.542 [DEBUG] [TestEventLogger]         at cucumber.runtime.junit.JUnitReporter$1.receive(JUnitReporter.java:29)
    16:41:46.542 [DEBUG] [TestEventLogger]         at cucumber.runner.EventBus.send(EventBus.java:28)
    16:41:46.542 [DEBUG] [TestEventLogger]         at cucumber.runner.TestCase.run(TestCase.java:37)
    16:41:46.543 [DEBUG] [TestEventLogger]         at cucumber.runner.Runner.runPickle(Runner.java:44)
    16:41:46.543 [DEBUG] [TestEventLogger]         at cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)
    16:41:46.543 [DEBUG] [TestEventLogger]         at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)
    16:41:46.543 [DEBUG] [TestEventLogger]         at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)
    16:41:46.543 [DEBUG] [TestEventLogger]         at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
    16:41:46.543 [DEBUG] [TestEventLogger]         at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
    16:41:46.543 [DEBUG] [TestEventLogger]         at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
    16:41:46.543 [DEBUG] [TestEventLogger]         at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
    16:41:46.543 [DEBUG] [TestEventLogger]         at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
    16:41:46.544 [DEBUG] [TestEventLogger]         at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
    16:41:46.544 [DEBUG] [TestEventLogger]         at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)
    16:41:46.544 [DEBUG] [TestEventLogger]         at cucumber.api.junit.Cucumber.runChild(Cucumber.java:98)
    16:41:46.544 [DEBUG] [TestEventLogger]         at cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)
    16:41:46.544 [DEBUG] [TestEventLogger]         at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
    16:41:46.544 [DEBUG] [TestEventLogger]         at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
    16:41:46.544 [DEBUG] [TestEventLogger]         at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
    16:41:46.544 [DEBUG] [TestEventLogger]         at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
    16:41:46.544 [DEBUG] [TestEventLogger]         at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
    16:41:46.544 [DEBUG] [TestEventLogger]         at cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:107)
    16:41:46.544 [DEBUG] [TestEventLogger]         at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
    16:41:46.545 [DEBUG] [TestEventLogger]         at org.gradle.api.internal.tasks.testing.junit.JUnitTestClassExecutor.runTestClass(JUnitTestClassExecutor.java:106)
    16:41:46.545 [DEBUG] [TestEventLogger]         at org.gradle.api.internal.tasks.testing.junit.JUnitTestClassExecutor.execute(JUnitTestClassExecutor.java:58)
    16:41:46.545 [DEBUG] [TestEventLogger]         at org.gradle.api.internal.tasks.testing.junit.JUnitTestClassExecutor.execute(JUnitTestClassExecutor.java:38)
    16:41:46.545 [DEBUG] [TestEventLogger]         at org.gradle.api.internal.tasks.testing.junit.AbstractJUnitTestClassProcessor.processTestClass(AbstractJUnitTestClassProcessor.java:66)
    16:41:46.545 [DEBUG] [TestEventLogger]         at org.gradle.api.internal.tasks.testing.SuiteTestClassProcessor.processTestClass(SuiteTestClassProcessor.java:51)
    16:41:46.545 [DEBUG] [TestEventLogger]         at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    16:41:46.545 [DEBUG] [TestEventLogger]         at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    16:41:46.545 [DEBUG] [TestEventLogger]         at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    16:41:46.545 [DEBUG] [TestEventLogger]         at java.lang.reflect.Method.invoke(Method.java:498)
    16:41:46.546 [DEBUG] [TestEventLogger]         at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:35)
    16:41:46.546 [DEBUG] [TestEventLogger]         at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)
    16:41:46.546 [DEBUG] [TestEventLogger]         at org.gradle.internal.dispatch.ContextClassLoaderDispatch.dispatch(ContextClassLoaderDispatch.java:32)
    16:41:46.546 [DEBUG] [TestEventLogger]         at org.gradle.internal.dispatch.ProxyDispatchAdapter$DispatchingInvocationHandler.invoke(ProxyDispatchAdapter.java:93)
    16:41:46.546 [DEBUG] [TestEventLogger]         at com.sun.proxy.$Proxy2.processTestClass(Unknown Source)
    16:41:46.546 [DEBUG] [TestEventLogger]         at org.gradle.api.internal.tasks.testing.worker.TestWorker.processTestClass(TestWorker.java:117)
    16:41:46.546 [DEBUG] [TestEventLogger]         at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    16:41:46.546 [DEBUG] [TestEventLogger]         at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    16:41:46.546 [DEBUG] [TestEventLogger]         at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    16:41:46.546 [DEBUG] [TestEventLogger]         at java.lang.reflect.Method.invoke(Method.java:498)
    16:41:46.547 [DEBUG] [TestEventLogger]         at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:35)
    16:41:46.547 [DEBUG] [TestEventLogger]         at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)
    16:41:46.547 [DEBUG] [TestEventLogger]         at org.gradle.internal.remote.internal.hub.MessageHubBackedObjectConnection$DispatchWrapper.dispatch(MessageHubBackedObjectConnection.java:155)
    16:41:46.547 [DEBUG] [TestEventLogger]         at org.gradle.internal.remote.internal.hub.MessageHubBackedObjectConnection$DispatchWrapper.dispatch(MessageHubBackedObjectConnection.java:137)
    16:41:46.547 [DEBUG] [TestEventLogger]         at org.gradle.internal.remote.internal.hub.MessageHub$Handler.run(MessageHub.java:404)
    16:41:46.547 [DEBUG] [TestEventLogger]         at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:63)
    16:41:46.547 [DEBUG] [TestEventLogger]         at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:46)
    16:41:46.547 [DEBUG] [TestEventLogger]         at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
    16:41:46.547 [DEBUG] [TestEventLogger]         at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    16:41:46.547 [DEBUG] [TestEventLogger]         at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:55)
    16:41:46.548 [DEBUG] [TestEventLogger]         at java.lang.Thread.run(Thread.java:748)
    16:41:46.548 [DEBUG] [TestEventLogger]
