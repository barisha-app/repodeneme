import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class BenimProvider : MainAPI() {
    override var name = "BenimPlugin"
    override var mainUrl = "https://example.com"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)
}
