@REM Step 1: point JAVA_HOME to a GraalVM JDK w/ Native Image
@REM jdk x64 graalvm-17

@REM Step 2: make sure everything is up-to-date
call ant compile-native compile-tests

@REM Step 3: build the native image
call "%JAVA_HOME%\bin\native-image" @config/cli/classpath.win.args %1 --verbose --no-fallback