class Mobile(var weight: Double, var size: Int, var Charge: Int, val color: String,val marka: String, val model: String, val country: String )
{
    var newMobile: Boolean = true
        get() {
            return weight > size
        }
        set(value) {
            if (value){
                print("Телефон новый")
            }
            else {
                print("Телефон бу")
            }
            field = value
        }

    var zariad: Boolean = true
        get() {
            return Charge != 0
        }
        set(value) {
            if (value){
                print("телефон заряжен")
            }
            else {
                print("телефон разряжен")
            }
            field = value
        }
    var ves: Boolean = true
        get() {
            return weight > size
        }
        set(value) {
            if (value){
                print("Телефон трудно держать в руке")
            }
            else {
                print("Телефон удобен")
            }
            field = value
        }

    var strana: Boolean = true
        get() {
            return country != "США"
        }
        set(value) {
            if (value){
                print("Телефон из другой страны")
            }
            else {
                print("Это телефон из Соединенных Штатов")
            }
            field = value
        }

    var polnyiz: Boolean = true
        get() {
            return Charge == 100
        }
        set(value) {
            if (value){
                print("Полный заряд")
            }
            else {
                print("требуется зарядить")
            }
            field = value
        }
}