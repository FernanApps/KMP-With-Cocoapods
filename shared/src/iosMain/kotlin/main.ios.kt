import androidx.compose.ui.window.ComposeUIViewController
import cocoapods.ffmpegkit.FFmpegKitConfig
import kotlinx.cinterop.ExperimentalForeignApi

actual fun getPlatformName(): String  {
    val version = FFmpegKitConfig.getFFmpegVersion()
    return "iOS $version"
}

fun MainViewController() = ComposeUIViewController { App() }

