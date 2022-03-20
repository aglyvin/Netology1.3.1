fun main() {
    val name = "Вася"
    val seconds = 36000
    val stringSeconds = agoToText(seconds)

    println("$name был в сети $stringSeconds ")
}
const val secondsInHour = 3600
const val secondsInDay = 86400

fun agoToText(sec: Int): String {

    return when {
        sec < 60 -> "только что"
        sec < secondsInHour -> getMinutes(sec) + " назад"
        sec < secondsInDay -> getHours(sec) + " назад"
        sec < secondsInDay * 2 -> "сегодня"
        sec < secondsInDay * 3 -> "вчера"
        else -> "давно"
    }
}

fun getMinutes(seconds: Int): String {
    val minutes = seconds / 60
    val rem = minutes % 10

    val res = when {
        rem == 1 -> "минуту"
        rem == 0 -> "минут"
        rem < 5 -> "минуты"
    else -> "минут"
    }
    return "$minutes $res"
}

fun getHours(seconds: Int): String {
    val hours = seconds / secondsInHour
    val rem = hours % 10
    val res = when {
        rem == 1 -> "час"
        rem == 0 -> "часов"
        rem < 5 -> "часа"
        else -> "часов"
    }
    return "$hours $res"
}

