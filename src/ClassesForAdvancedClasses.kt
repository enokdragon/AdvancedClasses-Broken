class Employee(var empName: String,  //name (string) , position (string) , salary (boolean), payRate (double) shift (int)
               var position: String,
               var salary: Boolean,
               var payRate: Double,
               var shift: Int) {

    fun display() {
        println(empName.toString() + "\n" +
                "Employee Position:"+ PositionTitle(position)+ "\n" +
                "Salary:" + salary + "\n" +
                "Payrate:" + payRate + "\n" +
                "Shift:" + shift)
    }

    fun calculate(hoursWorked: Double){
        var newPay = Double
        var rate = payRate
        var unpaidHours = hoursWorked
        var overtime = Double
        if(salary == false) {
            while (unpaidHours > 40) {
                overtime = overtime + rate * 1.5
                unpaidHours--
            }
        }
        var paycheck = Double
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
}
enum class PositionTitle{
    ADMINISTRATION,
    PRODUCTION,
    SALES,
    MAINTENANCE,
    TECHNICAL,
    SECRETARIAL;
}

//fun PrintPosition(pos: PositionTitle): String{
  //  when(pos){
    //    PositionTitle.ADMINISTRATION -> return "Administration"
      //  PositionTitle.PRODUCTION -> return "Production"
        //PositionTitle.SALES -> return "Sales"
   //     PositionTitle.MAINTENANCE -> return "Maintenance"
     //   PositionTitle.TECHNICAL -> return "Technical"
       // PositionTitle.SECRETARIAL -> return "Secretarial"
   // }
//}