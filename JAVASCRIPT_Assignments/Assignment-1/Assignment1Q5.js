var numberOfYears = 0;
var year = 2022;

function leapYears() {
    while (numberOfYears < 20) { 
        if ((year % 4 === 0) && (!((year % 100===0) && (year % 400 !== 0)))) {
           
            document.write(year + "<br>");
            numberOfYears++;
            year++;
        } else {
            year++;
        }
    }       
}

document.write(leapYears());