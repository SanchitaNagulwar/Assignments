
var n = prompt("Enter a number: "); 
var sum=0;

if (n > 0) { 
  for (var i = 1; i <= n; i++) { 
    if ((i % 3 == 0) || (i % 5 == 0)) 
       sum=sum+i
  } 
} 

//shows output 
document.write("The sum of mutliple of 3 & 5 till entered natural number  is: ", sum);