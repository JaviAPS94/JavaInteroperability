data class Customer (val id: Long, val name: String)

class CustomerDatabase() {
    val customer = listOf(Customer(1, "Alex"),
        Customer(2, "Javier"),
        Customer(3, "Jose"),
        Customer(4, "Riven")
    )

    @Throws(IllegalAccessException::class)
    fun addCustomer(c: Customer) {
        throw IllegalAccessException("You cant add new customer")
    }

    companion object {
        @JvmStatic
        fun helloWorld() {
            println("Hello world")
        }
    }
}