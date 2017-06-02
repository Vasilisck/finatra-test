import com.twitter.finagle.http.Request
import com.twitter.finatra.http._

class FinatraTestController extends Controller {

    get("/") { request: Request =>
        s"$sumAllNatural"
    }


    def sumAllNatural: Int = {
        (1 to 999).filter(num => (num % 3 == 0) || (num % 5 == 0)).sum
    }
}

