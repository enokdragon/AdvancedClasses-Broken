class Employee(var empName: String,  //name (string) , position (string) , salary (boolean), payRate (double) shift (int)
               var position: PositionTitle,
               var salary: Boolean,
               var payRate: Double,
               var shift: Int) {

    fun display() {
        println(empName.toString() + "\n" +
                "Employee Position:"+ position.name + "\n" +
                "Salary:" + salary + "\n" +
                "Payrate:" + payRate + "\n" +
                "Shift:" + shift)
    }

    fun calculate(hoursWorked: Double){
        var newPay: Double = 0.00
        var rate = payRate
        var unpaidHours = hoursWorked
        var overtime: Double = 0.00
        if(salary == false) {
            while (unpaidHours > 40) {
                overtime = overtime + rate * 1.50
                unpaidHours--
            }
        }
        var paycheck: Double = 0.00
        paycheck = overtime + rate * unpaidHours

        if(shift == 2){
            paycheck = paycheck * 1.05
        }
        else if(shift == 3){
            paycheck = paycheck * 1.1
        }
        println("$empName made $$paycheck this week at their position in " +
                "$position at a rate of $$payRate per hour.")
    }

    fun PrintPosition(pos: PositionTitle): String{
        when(pos){
            PositionTitle.ADMINISTRATION -> return "Administration"
            PositionTitle.PRODUCTION -> return "Production"
            PositionTitle.SALES -> return "Sales"
            PositionTitle.MAINTENANCE -> return "Maintenance"
            PositionTitle.TECHNICAL -> return "Technical"
            PositionTitle.SECRETARIAL -> return "Secretarial"
        }
    }

//    enum class PositionTitle(name: String) {
//        ADMINISTRATION("a"),
//        PRODUCTION("b"),
//        SALES("c"),
//        MAINTENANCE("d"),
//        TECHNICAL("e"),
//        SECRETARIAL("f");
//    }

}
