import sbt._
import Keys._
object Build extends sbt.Build{
  val sharedSettings = Seq(
    organization := "com.lihaoyi.utest",

    // Sonatype
    publishArtifact in Test := false,
    publishTo <<= version { (v: String) =>
      Some("releases"  at "https://oss.sonatype.org/service/local/staging/deploy/maven2")
    },

    pomExtra := (
      <url>https://github.com/lihaoyi/utest</url>
        <licenses>
          <license>
            <name>MIT license</name>
            <url>http://www.opensource.org/licenses/mit-license.php</url>
          </license>
        </licenses>
        <scm>
          <url>git://github.com/lihaoyi/utest.git</url>
          <connection>scm:git://github.com/lihaoyi/utest.git</connection>
        </scm>
        <developers>
          <developer>
            <id>lihaoyi</id>
            <name>Li Haoyi</name>
            <url>https://github.com/lihaoyi</url>
          </developer>
        </developers>
      )
  )
}
