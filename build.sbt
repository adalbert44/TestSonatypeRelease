import xerial.sbt.Sonatype._

name := "test-sonatype-release"

version := "0.0.1"

scalaVersion := "2.13.7"

organization := "io.github.adalbert44"
//sonatypeProfileName := "io.github.adalbert44"
licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
publishTo := sonatypePublishToBundle.value
sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
sonatypeCredentialHost:= "s01.oss.sonatype.org"
publishMavenStyle := true
sonatypeProjectHosting := Some(GitHubHosting("adalbert44", "TestSonatypeRelease", "adalbert.makarovych@gmail.com"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/adalbert44/TestSonatypeRelease"),
    "scm:git@github.com:adalbert44/TestSonatypeRelease.git"
  )
)