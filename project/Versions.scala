object Versions {
  val jdkVersion = scala.util.Properties.isJavaAtLeast("1.8")
  lazy val typeSafeConfig = if(jdkVersion) "1.3.0" else "1.2.1"
  lazy val metrics = "2.2.0"
  lazy val jodaTime = "2.9.3"
  lazy val jodaConvert = "1.8.1"
  lazy val akka = "2.3.15"
  lazy val spray = "1.3.3"
  lazy val sprayJson = "1.3.2"
  lazy val spark = "1.6.2"
  lazy val mesos = "0.25.0-0.2.70.ubuntu1404"
  lazy val netty =  "4.0.29.Final"
  lazy val slick = "3.1.1"
  lazy val h2 = "1.3.176"
  lazy val commons = "1.4"
  lazy val flyway = "3.2.1"
  lazy val logback = "1.0.7"
  lazy val scalaTest = "2.2.6"
  lazy val scalatic = "2.2.6"
  lazy val shiro = "1.2.4"
}
