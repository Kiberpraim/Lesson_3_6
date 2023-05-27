fun main(args: Array<String>) {
    fun calculator(value1: Int, sign: Char, value2: Int): Int? {
        var result: Int? = null
        when (sign) {
            '+' -> result = value1 + value2

            '-' -> result = value1 - value2

            '*' -> result = value1 * value2

            '/' -> if (value2 != 0) {
                result = value1 / value2
            }

            else -> println("Пока не можем выполнить данное действие.")
        }
        return result
    }
    println(calculator(5, '-', 0))

    var arrayName = arrayOf("Чынгыз", "Алексей", "Андрей", "Алинур", "Максим", "Бектур", "Тимур", "Настя", "Алим")
    var capsName = "АЛМАНБЕТ"
    var name = "Алманбет"
    var result = ""
    var f = false

    var i = 0
    while (i < name.length) {
        for (itName in arrayName) {
            var j = 0
            while (j < itName.length) {
                if (itName.get(j) == name.get(i) || itName.get(j) == capsName.get(i)) {
                    result += itName.get(j)
                    i++
                    if (name.length == i) {
                        break
                    }
                }
                j++
            }
            if (name.length == i) {
                break
            }
        }
    }
    println(result)
}