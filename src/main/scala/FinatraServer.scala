import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.filters.CommonFilters
import com.twitter.finatra.http.routing.HttpRouter

/**
  * Created by aleksandr.baranov on 6/2/2017.
  */

object FinatraTestServerMain extends FinatraServer

class FinatraServer extends HttpServer {

    override val defaultFinatraHttpPort: String = ":8080"

    override def configureHttp(router: HttpRouter): Unit = {
        router
            .filter[CommonFilters]
            .add[FinatraTestController]
    }
}
