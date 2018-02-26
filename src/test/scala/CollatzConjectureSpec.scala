import app.CollatzConjecture
import org.scalatest.{MustMatchers, WordSpec}

class CollatzConjectureSpec extends WordSpec with MustMatchers {

  "CollatzConjecture" must {

    "return 8 when given 20" in {
      CollatzConjecture(20) mustEqual 8
    }
  }
}
