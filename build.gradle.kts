import org.gradle.api.tasks.wrapper.Wrapper.DistributionType.BIN

tasks.wrapper {
    gradleVersion = "7.1.1"
    distributionType = BIN
}
