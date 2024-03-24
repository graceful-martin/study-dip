plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
//plugins {
//    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
//}
rootProject.name = "study-dip"
include("domain")
include("storage")
include("core")
