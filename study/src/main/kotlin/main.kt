import org.apache.velocity.VelocityContext
import org.apache.velocity.app.VelocityEngine
import org.apache.velocity.runtime.RuntimeConstants
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader
import java.io.StringWriter
import java.util.Properties

fun main() {
    // 初始化 VelocityEngine
    val velocityEngine = VelocityEngine().apply {
        val properties = Properties()
        properties.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath")
        properties.setProperty("classpath.resource.loader.class", ClasspathResourceLoader::class.java.name)
        init(properties)
    }
    // 创建上下文并设置变量
    val context = VelocityContext().apply {
        put("name", "HelloWorld")
    }
    // 生成输出
    val writer = StringWriter()
    velocityEngine.evaluate(context, writer, "", "\${name}")
    println(writer.toString())
}

