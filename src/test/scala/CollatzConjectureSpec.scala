import app.CollatzConjecture
import org.scalatest.{MustMatchers, WordSpec}

class CollatzConjectureSpec extends WordSpec with MustMatchers {

  "CollatzConjecture" must {

    "return 1 when given 1" in {
      CollatzConjecture(1) mustEqual 1
    }

    "return 2 when given 2" in {
      CollatzConjecture(2) mustEqual 2
    }

    "return 8 when given 3" in {
      CollatzConjecture(3) mustEqual 8
    }
    "return 8 when given 20" in {
      CollatzConjecture(20) mustEqual 8
    }
  }
}
