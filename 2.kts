fun main(){

    val Mobile1 = Mobile(1238.2,  1100, 100, "Black", "ipad", "2018 pro", "США" )
    val Mobile2 = Mobile(200.0, 440, 24, "White", "Samsung", "A51", "Корея" )
    val Mobile3 = Mobile(250.0, 400, 0, "Blue", "Honor", "8x", "Китай" )


    print("Заряд: ")
    println(Mobile1.Charge)
    print("Цвет: ")
    println(Mobile1.color)
    print("Марка: ")
    println(Mobile1.marka)
    print("Модель: ")
    println(Mobile1.model)
    print("диагональ: ")
    println(Mobile1.size)
    print("Вес: ")
    println(Mobile1.weight)
    print("Страна изготовитель: ")
    println(Mobile1.country)

    Mobile1.newMobile = false
    println()
    Mobile1.strana = false
    println()
    Mobile1.zariad = true
    println()
    Mobile1.ves = false
    println()
    Mobile1.polnyiz = true
    println("\n")


    print("Вес: ")
    println(Mobile2.weight)
    print("Размер: ")
    println(Mobile2.size)
    print("Заряд: ")
    println(Mobile2.Charge)
    print("Цвет: ")
    println(Mobile2.color)
    print("Марка: ")
    println(Mobile2.marka)
    print("Модель: ")
    println(Mobile2.model)
    print("Страна изготовитель: ")
    println(Mobile2.country)

    Mobile2.newMobile = true
    println()
    Mobile2.strana = true
    println()
    Mobile2.zariad = true
    println()
    Mobile2.ves = false
    println()
    Mobile2.polnyiz = false
    println("\n")


    print("Вес: ")
    println(Mobile3.weight)
    print("Размер: ")
    println(Mobile3.size)
    print("Заряд: ")
    println(Mobile3.Charge)
    print("Цвет: ")
    println(Mobile3.color)
    print("Марка: ")
    println(Mobile3.marka)
    print("Модель: ")
    println(Mobile3.model)
    print("Страна изготовитель: ")
    println(Mobile3.country)

    Mobile3.newMobile = true
    println()
    Mobile3.strana = true
    println()
    Mobile3.zariad = false
    println()
    Mobile3.ves = false
    println()
    Mobile3.polnyiz = false
}