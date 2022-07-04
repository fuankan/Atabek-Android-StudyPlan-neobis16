package kg.fkapps.tourguide

data class Item(
    val id: Long,
    val photo: String,
    val name: String,
    val description: String,
    val phone: String,
    val address: String,
    val coordinates: String
)
