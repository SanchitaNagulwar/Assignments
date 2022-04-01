
var n = prompt("Enter a number: "); 
function findParity(x) {
    let y = x ^ (x >> 1);
    y = y ^ (y >> 2);
    y = y ^ (y >> 4);
    y = y ^ (y >> 8);
    y = y ^ (y >> 16);
 

    if (y & 1)
        return 1;
    return 0;
}
  
(findParity(n) == 0) ? document.write("Even Parity") : document.write("Odd Parity");
