name := "scala-minecraft-bukkit"

version := "0.1"

scalaVersion := "2.10.0"

organization := "me.shadaj"

resolvers += "Bukkit releases" at "http://repo.bukkit.org/content/repositories/releases"

libraryDependencies += "org.bukkit" % "bukkit" % "1.4.7-R1.0"

publishTo := Some(Resolver.file("file", new File("/Users/shadaj/open-source/repos/releases")))