import org.specs._

class AppSpec extends Specification {
  
  "hello world" should {
    "have 11 characters" in {
      "hello world".size must_== 11
    }
  }
  
}
