import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.text.NumberFormat

val log: Logger = LoggerFactory.getLogger("product")

@JvmOverloads
fun addProduct(name: String, price: Double = 0.0, desc: String? = null) =
    "add product with $name ${desc ?: "None"} and ${NumberFormat.getCurrencyInstance().format(price)}"

class Product @JvmOverloads constructor(val name: String, val price: Double = 0.0, val desc: String? = null)