# graalvm-cli

Prerequisites:
* `Latest version of GraalVM (currently 20.0.0)`

Steps:

1. `./mvnw clean install`

2. `native-image -H:ReflectionConfigurationFiles=config-dir/reflect-config.json -H:ResourceConfigurationFiles=config-dir/resource-config.json --allow-incomplete-classpath --no-fallback -H:+AddAllCharsets --enable-all-security-services -jar target/graal-cli-1.0.0-SNAPSHOT-jar-with-dependencies.jar graalvm-cli`

3. To run: `./graalvm-cli --help` and `./graalvm-cli status` should work fine.