name := "$name;format="norm"$"
description := """$purpose$"""
organization := "$organization$"
organizationName := "$organizationName$"
licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

scalaVersion := "$scalaVersion$"

sbtPlugin := true
publishMavenStyle := false

libraryDependencies += "com.lihaoyi" %% "utest" % "$uTestVersion$" % Test
testFrameworks += new TestFramework("utest.runner.Framework")

bintrayOrganization := Some("$organizationName;format="lower"$")
bintrayPackageLabels := Seq("sbt", "plugin")

initialCommands in console := "import $package$._"

enablePlugins(ScriptedPlugin)
scriptedLaunchOpts ++= Seq(
  "-Xmx1024M",
  "-Dplugin.version=" + version.value
)
