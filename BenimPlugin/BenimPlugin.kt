import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class BenimPlugin : Plugin() {
    override fun load() {
        registerMainAPI(BenimProvider())
    }
}
